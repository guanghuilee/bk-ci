/*
 * Tencent is pleased to support the open source community by making BK-CI 蓝鲸持续集成平台 available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * BK-CI 蓝鲸持续集成平台 is licensed under the MIT license.
 *
 * A copy of the MIT License is included in this file.
 *
 *
 * Terms of the MIT License:
 * ---------------------------------------------------
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.tencent.devops.process.engine.control

import com.tencent.devops.common.event.dispatcher.pipeline.PipelineEventDispatcher
import com.tencent.devops.common.event.enums.ActionType
import com.tencent.devops.common.pipeline.enums.BuildStatus
import com.tencent.devops.common.pipeline.enums.EnvControlTaskType
import com.tencent.devops.common.pipeline.enums.StageRunCondition
import com.tencent.devops.process.engine.common.BS_CONTAINER_END_SOURCE_PREIX
import com.tencent.devops.process.engine.common.BS_MANUAL_START_STAGE
import com.tencent.devops.process.engine.pojo.PipelineBuildContainer
import com.tencent.devops.process.engine.pojo.PipelineBuildStage
import com.tencent.devops.process.engine.pojo.event.PipelineBuildCancelEvent
import com.tencent.devops.process.engine.pojo.event.PipelineBuildFinishEvent
import com.tencent.devops.process.engine.pojo.event.PipelineBuildStageEvent
import com.tencent.devops.process.engine.service.PipelineBuildDetailService
import com.tencent.devops.process.engine.service.PipelineRuntimeService
import com.tencent.devops.process.engine.service.PipelineStageService
import com.tencent.devops.process.pojo.mq.PipelineBuildContainerEvent
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime

/**
 *  步骤控制器
 * @version 1.0
 */
@Service
class StageControl @Autowired constructor(
    private val pipelineEventDispatcher: PipelineEventDispatcher,
    private val pipelineRuntimeService: PipelineRuntimeService,
    private val pipelineBuildDetailService: PipelineBuildDetailService,
    private val pipelineStageService: PipelineStageService
) {

    private val logger = LoggerFactory.getLogger(javaClass)!!

    fun handle(event: PipelineBuildStageEvent) {
        with(event) {

            val buildInfo = pipelineRuntimeService.getBuildInfo(buildId)
                ?: run {
                    logger.info("[$buildId]|STAGE_$actionType| have not build detail!")
                    return
                }

            // 当前构建整体的状态，可能是运行中，也可能已经失败
            // 已经结束的构建，不再受理，抛弃消息
            if (BuildStatus.isFinish(buildInfo.status)) {
                logger.info("[$buildId]|[${buildInfo.status}]|STAGE_REPEAT_EVENT|event=$event")
                return
            }

            val stages = pipelineStageService.listStages(buildId)

            val stagesWithId = stages.filter { it.stageId == stageId }

            val stage = if (stagesWithId.isNotEmpty()) {
                stagesWithId.first()
            } else {
                logger.warn("[$buildId]|[${buildInfo.status}]|bad stage|stage=$stageId")
                return
            }

            val variables = pipelineRuntimeService.getAllVariable(buildId)

            val allContainers = pipelineRuntimeService.listContainers(buildId)

            val containerList = allContainers.filter { it.stageId == stageId }

            var buildStatus: BuildStatus = BuildStatus.SUCCEED

            val needPause = stage.controlOption?.stageControlOption?.manualTrigger == true && source != BS_MANUAL_START_STAGE

            val fastKill = stage.controlOption?.fastKill == true && source == "$BS_CONTAINER_END_SOURCE_PREIX${BuildStatus.FAILED}"

            logger.info("[$buildId]|[${buildInfo.status}]|STAGE_EVENT|event=$event|stage=$stage|needPause=$needPause|fastKill=$fastKill")

            // [终止事件]或[满足FastKill]或[等待审核超时] 直接结束流水线，不需要判断各个Stage的状态，可直接停止
            if (ActionType.isTerminate(actionType) || fastKill) {
                logger.info("[$buildId]|[${buildInfo.status}]|STAGE_TERMINATE|stageId=$stageId")

                buildStatus = BuildStatus.TERMINATE
                stages.forEach { s ->
                    pipelineStageService.updateStageStatus(buildId, s.stageId, buildStatus)
                }
                allContainers.forEach { c ->
                    if (BuildStatus.isRunning(c.status))
                        pipelineRuntimeService.updateContainerStatus(
                            buildId = buildId,
                            stageId = c.stageId,
                            containerId = c.containerId,
                            endTime = LocalDateTime.now(),
                            buildStatus = buildStatus
                        )
                }

                // 如果是因fastKill强制终止，流水线状态标记为失败
                if (fastKill) buildStatus = BuildStatus.FAILED

                // 如果是因审核超时终止构建，流水线状态
                pipelineBuildDetailService.updateStageStatus(buildId, stageId, buildStatus)
                return sendTerminateEvent(javaClass.simpleName, buildStatus)
            }

            // 仅在初次进入Stage时进行跳过判断
            if (BuildStatus.isReadyToRun(stage.status)) {
                logger.info("[$buildId]|[${buildInfo.status}]|STAGE_START|stage=$stage|action=$actionType")

                if (checkIfAllSkip(buildId, stage, containerList, variables)) {
                    // 执行条件不满足或未启用该Stage
                    logger.info("[$buildId]|[${buildInfo.status}]|STAGE_SKIP|stage=$stageId|action=$actionType")

                    pipelineStageService.updateStageStatus(buildId, stageId, BuildStatus.SKIP)
                    pipelineBuildDetailService.stageSkip(buildId, stageId)

                    actionType = ActionType.SKIP
                } else if (needPause) {
                    // 进入暂停状态等待手动触发
                    logger.info("[$buildId]|[${buildInfo.status}]|STAGE_PAUSE|stage=$stageId|action=$actionType")

                    pipelineStageService.updateStageStatus(buildId, stageId, BuildStatus.PAUSE)
                    pipelineBuildDetailService.stagePause(pipelineId, buildId, stageId)

                    return
                }
            }

            run outer@{
                stages.forEachIndexed { index, s ->
                    if (stageId == s.stageId) {
                        // 执行成功则结束本次事件处理，否则要尝试下一stage
                        buildStatus = s.judgeStageContainer(allContainers, actionType, userId)

                        logger.info("[$buildId]|[${buildInfo.status}]|STAGE_DONE|stageId=${s.stageId}|status=$buildStatus|action=$actionType|stages=$stages|index=$index")

                        // 如果当前Stage[还未结束]或者[执行失败]或[已经是最后一个]，则不尝试下一Stage
                        if (BuildStatus.isRunning(buildStatus) || BuildStatus.isFailure(buildStatus) || index == stages.size - 1) {
                            return@outer
                        }
                        // 直接发送执行下一个Stage的消息
                        return sendStartStageEvent("next_stage", stages[index + 1].stageId)
                    }
                }
            }
            if (BuildStatus.isFinish(buildStatus)) { // 构建状态结束了
                logger.info("[$buildId]|[${buildInfo.status}]|STAGE_FINALLY|stageId=$stageId|status=$buildStatus|action=$actionType")
                // 如果最后一个stage被跳过，流水线最终设为成功
                if (buildStatus == BuildStatus.SKIP) {
                    buildStatus = BuildStatus.SUCCEED
                }
                pipelineBuildDetailService.updateStageStatus(
                    buildId = buildId,
                    stageId = stageId,
                    buildStatus = buildStatus
                )
                sendFinishEvent("FINALLY", buildStatus)
            }
        }
        return
    }

    /**
     * 判断当前Stage具备下发消息的场景并下发Container消息
     * @param allContainers 所有Job对象
     * @param actionType 事件指令
     * @param userId 执行者
     * @return 返回true表示已经下发，如下发失败则返回false
     */
    private fun PipelineBuildStage.judgeStageContainer(
        allContainers: Collection<PipelineBuildContainer>,
        actionType: ActionType,
        userId: String
    ): BuildStatus {

        var buildStatus = status
        var newActionType = actionType
        // 针对刚启动的Stage
        if (BuildStatus.isReadyToRun(status)) {
            if (actionType == ActionType.REFRESH) { // 对未启动的Stage要变成开始指令
                newActionType = ActionType.START
            }
            // 要启动Stage，初始化状态
            if (ActionType.isStart(newActionType)) {
                buildStatus = BuildStatus.RUNNING
                pipelineStageService.updateStageStatus(buildId, stageId, buildStatus)
                pipelineBuildDetailService.updateStageStatus(buildId, stageId, buildStatus)
                logger.info("[$buildId]|STAGE_INIT|stageId=$stageId|action=$newActionType")
            }
            // 若为终止命令，直接设置为取消
            else if (ActionType.isEnd(newActionType)) {
                buildStatus = BuildStatus.CANCELED
                val now = LocalDateTime.now()
                pipelineStageService.updateStageStatus(
                    buildId = buildId,
                    stageId = stageId,
                    buildStatus = buildStatus
                )
                logger.info("[$buildId]|STAGE_$actionType|stageId=$stageId|action=$newActionType")
                return buildStatus
            } else if (actionType == ActionType.SKIP) {
                buildStatus = BuildStatus.SKIP
                val now = LocalDateTime.now()
                pipelineStageService.updateStageStatus(
                    buildId = buildId,
                    stageId = stageId,
                    buildStatus = buildStatus
                )
                logger.info("[$buildId]|STAGE_$actionType|stageId=$stageId|action=$newActionType")
                return buildStatus
            }
        } else if (status == BuildStatus.PAUSE && ActionType.isEnd(newActionType)) {
            buildStatus = BuildStatus.STAGE_SUCCESS
            val now = LocalDateTime.now()
            pipelineStageService.updateStageStatus(
                buildId = buildId,
                stageId = stageId,
                buildStatus = buildStatus
            )
            logger.info("[$buildId]|STAGE_$actionType|stageId=$stageId|action=$newActionType")
            return buildStatus
        }

        var finishContainers = 0
        var failureContainers = 0
        val containers = mutableListOf<PipelineBuildContainer>()
        allContainers.forEach { c ->
            if (c.stageId == stageId) {
                containers.add(c)
                if (BuildStatus.isFinish(c.status)) {
                    finishContainers++
                }
                if (BuildStatus.isFailure(c.status)) {
                    failureContainers++
                }
            }
        }

        if (finishContainers < containers.size) { // 还有未执行完的任务,继续下发其他构建容器
            sendContainerEvent(containers, newActionType, userId)
        } else if (finishContainers == containers.size) { // 全部执行完的
            buildStatus = if (failureContainers == 0) {
                BuildStatus.SUCCEED
            } else {
                BuildStatus.FAILED
            }
            pipelineStageService.updateStageStatus(buildId, stageId, buildStatus)
            pipelineBuildDetailService.updateStageStatus(buildId, stageId, buildStatus)
            logger.info("[$buildId]|STAGE_CONTAINER_FINISH|stageId=$stageId|status=$buildStatus|action=$actionType")
        }
        return buildStatus
    }

    fun checkIfAllSkip(
        buildId: String,
        stage: PipelineBuildStage,
        containerList: Collection<PipelineBuildContainer>,
        variables: Map<String, Any>
    ): Boolean {

        val stageId = stage.stageId
        val pipelinebuildStageControlOption = stage.controlOption ?: return false
        val stageControlOption = pipelinebuildStageControlOption.stageControlOption

        var skip = !stageControlOption.enable
        if (skip) {
            logger.info("[$buildId]|STAGE_DISABLE|stageId=$stageId|enable=false")
            return skip
        }

        if (stageControlOption.runCondition == StageRunCondition.CUSTOM_VARIABLE_MATCH_NOT_RUN ||
            stageControlOption.runCondition == StageRunCondition.CUSTOM_VARIABLE_MATCH
        ) {
            val conditions = stageControlOption.customVariables ?: emptyList()
            skip = ControlUtils.checkStageSkipCondition(conditions, variables, buildId, stageControlOption.runCondition)
        }

        if (skip) {
            logger.info("[$buildId]|CONDITION_SKIP|stageId=$stageId|conditions=$stageControlOption")
            return skip
        }

        skip = true
        run manualSkip@{
            containerList.forEach nextContainer@{ container ->
                // 触发容器不参与判断
                if (container.containerType == "trigger") {
                    return@nextContainer
                }
                val containerTaskList = pipelineRuntimeService.listContainerBuildTasks(buildId, container.containerId)
                if (container.status != BuildStatus.SKIP) { // 没有指定跳过
                    if (container.controlOption?.jobControlOption?.enable != false) { // Job是启用的，则不跳过
                        containerTaskList.forEach nextTask@{ task ->
                            // 环境控制类的任务不参与判断
                            if (task.taskType == EnvControlTaskType.NORMAL.name || task.taskType == EnvControlTaskType.VM.name) {
                                return@nextTask
                            }
                            if (task.status != BuildStatus.SKIP) { // 没有指定跳过
                                if (ControlUtils.isEnable(task.additionalOptions)) { // 插件是启用的，则不跳过
                                    skip = false
                                    return@manualSkip
                                }
                            }
                        }
                    }
                }
            }
        }

        if (skip) {
            logger.info("[$buildId]|STAGE_MANUAL_SKIP|stageId=$stageId|skipped")
        }

        return skip
    }

    private fun PipelineBuildStageEvent.sendTerminateEvent(source: String, buildStatus: BuildStatus) {
        pipelineEventDispatcher.dispatch(
            PipelineBuildCancelEvent(
                source = source,
                projectId = projectId,
                pipelineId = pipelineId,
                userId = userId,
                buildId = buildId,
                status = buildStatus
            )
        )
    }

    private fun PipelineBuildStageEvent.sendFinishEvent(source: String, buildStatus: BuildStatus) {
        pipelineEventDispatcher.dispatch(
            PipelineBuildFinishEvent(
                source = source,
                projectId = projectId,
                pipelineId = pipelineId,
                userId = userId,
                buildId = buildId,
                status = buildStatus
            )
        )
    }

    /**
     * 下发容器构建事件
     * @param containers 当前container对象列表
     * @param actionType 事件指令
     * @param userId 执行者
     * @return 返回true表示已经下发，如下发失败则返回false
     */
    private fun PipelineBuildStage.sendContainerEvent(
        containers: Collection<PipelineBuildContainer>,
        actionType: ActionType,
        userId: String
    ) {
        // 同一Stage下的多个Container是并行
        containers.forEach nextContainer@{ container ->
            val containerStatus = container.status
            val containerId = container.containerId
            logger.info("[$buildId]|stage=$stageId|container=$containerId|status=$containerStatus")
            if (BuildStatus.isFinish(containerStatus)) {
                return@nextContainer // 已经执行完毕的直接跳过
            } else if (BuildStatus.isReadyToRun(containerStatus) && !ActionType.isStart(actionType)) {
                return@nextContainer // 失败或可重试的容器，如果不是重试动作，则跳过
            } else if (BuildStatus.isRunning(containerStatus) && !ActionType.isTerminate(actionType)) {
                return@nextContainer // 已经在运行中的, 只接受强制终止
            }

            container.sendBuildContainerEvent(actionType, userId)
            logger.info("[$buildId]|STAGE_CONTAINER_$actionType|stage=$stageId|container=$containerId")
        }
    }

    private fun PipelineBuildContainer.sendBuildContainerEvent(actionType: ActionType, userId: String) {
        // 通知容器构建消息
        pipelineEventDispatcher.dispatch(
            PipelineBuildContainerEvent(
                source = "start_container",
                projectId = projectId,
                pipelineId = pipelineId,
                userId = userId,
                buildId = buildId,
                stageId = stageId,
                containerType = containerType,
                containerId = containerId,
                actionType = actionType
            )
        )
    }

    private fun PipelineBuildStageEvent.sendStartStageEvent(source: String, stageId: String) {
        pipelineEventDispatcher.dispatch(
            PipelineBuildStageEvent(
                source = source,
                projectId = projectId,
                pipelineId = pipelineId,
                userId = userId,
                buildId = buildId,
                stageId = stageId,
                actionType = ActionType.START
            )
        )
    }

    private fun PipelineBuildStageEvent.sendStageSuccessEvent(stageId: String) {
        pipelineEventDispatcher.dispatch(
            PipelineBuildFinishEvent(
                source = "stage_success_$stageId",
                projectId = projectId,
                pipelineId = pipelineId,
                userId = userId,
                buildId = buildId,
                status = BuildStatus.STAGE_SUCCESS
            )
        )
    }
}
