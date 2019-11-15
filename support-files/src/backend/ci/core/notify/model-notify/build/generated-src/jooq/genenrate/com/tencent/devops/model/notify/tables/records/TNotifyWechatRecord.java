/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.notify.tables.records;


import com.tencent.devops.model.notify.tables.TNotifyWechat;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TNotifyWechatRecord extends UpdatableRecordImpl<TNotifyWechatRecord> implements Record16<String, Boolean, String, String, String, String, Integer, Integer, String, LocalDateTime, LocalDateTime, String, Integer, String, String, Integer> {

    private static final long serialVersionUID = -1710431600;

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.ID</code>. 微信通知ID
     */
    public TNotifyWechatRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.ID</code>. 微信通知ID
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.SUCCESS</code>. 是否成功
     */
    public TNotifyWechatRecord setSuccess(Boolean value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.SUCCESS</code>. 是否成功
     */
    public Boolean getSuccess() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.SOURCE</code>. 通知来源
     */
    public TNotifyWechatRecord setSource(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.SOURCE</code>. 通知来源
     */
    public String getSource() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.SENDER</code>. 通知发送者
     */
    public TNotifyWechatRecord setSender(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.SENDER</code>. 通知发送者
     */
    public String getSender() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.RECEIVERS</code>. 通知接收者
     */
    public TNotifyWechatRecord setReceivers(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.RECEIVERS</code>. 通知接收者
     */
    public String getReceivers() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.BODY</code>. 通知内容
     */
    public TNotifyWechatRecord setBody(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.BODY</code>. 通知内容
     */
    public String getBody() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.PRIORITY</code>. 优先级
     */
    public TNotifyWechatRecord setPriority(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.PRIORITY</code>. 优先级
     */
    public Integer getPriority() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.RETRY_COUNT</code>. 重试次数
     */
    public TNotifyWechatRecord setRetryCount(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.RETRY_COUNT</code>. 重试次数
     */
    public Integer getRetryCount() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.LAST_ERROR</code>. 最后错误内容
     */
    public TNotifyWechatRecord setLastError(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.LAST_ERROR</code>. 最后错误内容
     */
    public String getLastError() {
        return (String) get(8);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.CREATED_TIME</code>. 记录创建时间
     */
    public TNotifyWechatRecord setCreatedTime(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.CREATED_TIME</code>. 记录创建时间
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.UPDATED_TIME</code>. 记录更新时间
     */
    public TNotifyWechatRecord setUpdatedTime(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.UPDATED_TIME</code>. 记录更新时间
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.CONTENT_MD5</code>.
     */
    public TNotifyWechatRecord setContentMd5(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.CONTENT_MD5</code>.
     */
    public String getContentMd5() {
        return (String) get(11);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.FREQUENCY_LIMIT</code>.
     */
    public TNotifyWechatRecord setFrequencyLimit(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.FREQUENCY_LIMIT</code>.
     */
    public Integer getFrequencyLimit() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.TOF_SYS_ID</code>.
     */
    public TNotifyWechatRecord setTofSysId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.TOF_SYS_ID</code>.
     */
    public String getTofSysId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.FROM_SYS_ID</code>.
     */
    public TNotifyWechatRecord setFromSysId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.FROM_SYS_ID</code>.
     */
    public String getFromSysId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>devops_notify.T_NOTIFY_WECHAT.DelaySeconds</code>. 延迟发送的时间，秒
     */
    public TNotifyWechatRecord setDelayseconds(Integer value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>devops_notify.T_NOTIFY_WECHAT.DelaySeconds</code>. 延迟发送的时间，秒
     */
    public Integer getDelayseconds() {
        return (Integer) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, Boolean, String, String, String, String, Integer, Integer, String, LocalDateTime, LocalDateTime, String, Integer, String, String, Integer> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, Boolean, String, String, String, String, Integer, Integer, String, LocalDateTime, LocalDateTime, String, Integer, String, String, Integer> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TNotifyWechat.T_NOTIFY_WECHAT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return TNotifyWechat.T_NOTIFY_WECHAT.SUCCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TNotifyWechat.T_NOTIFY_WECHAT.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TNotifyWechat.T_NOTIFY_WECHAT.SENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TNotifyWechat.T_NOTIFY_WECHAT.RECEIVERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TNotifyWechat.T_NOTIFY_WECHAT.BODY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TNotifyWechat.T_NOTIFY_WECHAT.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TNotifyWechat.T_NOTIFY_WECHAT.RETRY_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TNotifyWechat.T_NOTIFY_WECHAT.LAST_ERROR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field10() {
        return TNotifyWechat.T_NOTIFY_WECHAT.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field11() {
        return TNotifyWechat.T_NOTIFY_WECHAT.UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TNotifyWechat.T_NOTIFY_WECHAT.CONTENT_MD5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return TNotifyWechat.T_NOTIFY_WECHAT.FREQUENCY_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TNotifyWechat.T_NOTIFY_WECHAT.TOF_SYS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return TNotifyWechat.T_NOTIFY_WECHAT.FROM_SYS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return TNotifyWechat.T_NOTIFY_WECHAT.DELAYSECONDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getSuccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getReceivers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBody();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getRetryCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLastError();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value10() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value11() {
        return getUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getContentMd5();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getFrequencyLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getTofSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getFromSysId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getDelayseconds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value2(Boolean value) {
        setSuccess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value3(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value4(String value) {
        setSender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value5(String value) {
        setReceivers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value6(String value) {
        setBody(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value7(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value8(Integer value) {
        setRetryCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value9(String value) {
        setLastError(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value10(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value11(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value12(String value) {
        setContentMd5(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value13(Integer value) {
        setFrequencyLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value14(String value) {
        setTofSysId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value15(String value) {
        setFromSysId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord value16(Integer value) {
        setDelayseconds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNotifyWechatRecord values(String value1, Boolean value2, String value3, String value4, String value5, String value6, Integer value7, Integer value8, String value9, LocalDateTime value10, LocalDateTime value11, String value12, Integer value13, String value14, String value15, Integer value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TNotifyWechatRecord
     */
    public TNotifyWechatRecord() {
        super(TNotifyWechat.T_NOTIFY_WECHAT);
    }

    /**
     * Create a detached, initialised TNotifyWechatRecord
     */
    public TNotifyWechatRecord(String id, Boolean success, String source, String sender, String receivers, String body, Integer priority, Integer retryCount, String lastError, LocalDateTime createdTime, LocalDateTime updatedTime, String contentMd5, Integer frequencyLimit, String tofSysId, String fromSysId, Integer delayseconds) {
        super(TNotifyWechat.T_NOTIFY_WECHAT);

        set(0, id);
        set(1, success);
        set(2, source);
        set(3, sender);
        set(4, receivers);
        set(5, body);
        set(6, priority);
        set(7, retryCount);
        set(8, lastError);
        set(9, createdTime);
        set(10, updatedTime);
        set(11, contentMd5);
        set(12, frequencyLimit);
        set(13, tofSysId);
        set(14, fromSysId);
        set(15, delayseconds);
    }
}
