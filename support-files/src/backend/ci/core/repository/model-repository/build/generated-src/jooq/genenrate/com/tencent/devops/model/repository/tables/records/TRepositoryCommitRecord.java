/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.repository.tables.records;


import com.tencent.devops.model.repository.tables.TRepositoryCommit;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRepositoryCommitRecord extends UpdatableRecordImpl<TRepositoryCommitRecord> implements Record11<Long, String, String, Long, Short, String, String, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 942134280;

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.ID</code>.
     */
    public TRepositoryCommitRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.BUILD_ID</code>.
     */
    public TRepositoryCommitRecord setBuildId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.BUILD_ID</code>.
     */
    public String getBuildId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.PIPELINE_ID</code>.
     */
    public TRepositoryCommitRecord setPipelineId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.PIPELINE_ID</code>.
     */
    public String getPipelineId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.REPO_ID</code>.
     */
    public TRepositoryCommitRecord setRepoId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.REPO_ID</code>.
     */
    public Long getRepoId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.TYPE</code>. 1-svn, 2-git, 3-gitlab
     */
    public TRepositoryCommitRecord setType(Short value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.TYPE</code>. 1-svn, 2-git, 3-gitlab
     */
    public Short getType() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.COMMIT</code>.
     */
    public TRepositoryCommitRecord setCommit(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.COMMIT</code>.
     */
    public String getCommit() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.COMMITTER</code>.
     */
    public TRepositoryCommitRecord setCommitter(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.COMMITTER</code>.
     */
    public String getCommitter() {
        return (String) get(6);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.COMMIT_TIME</code>.
     */
    public TRepositoryCommitRecord setCommitTime(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.COMMIT_TIME</code>.
     */
    public LocalDateTime getCommitTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.COMMENT</code>.
     */
    public TRepositoryCommitRecord setComment(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.COMMENT</code>.
     */
    public String getComment() {
        return (String) get(8);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.ELEMENT_ID</code>.
     */
    public TRepositoryCommitRecord setElementId(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.ELEMENT_ID</code>.
     */
    public String getElementId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>devops_repository.T_REPOSITORY_COMMIT.REPO_NAME</code>.
     */
    public TRepositoryCommitRecord setRepoName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>devops_repository.T_REPOSITORY_COMMIT.REPO_NAME</code>.
     */
    public String getRepoName() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, Long, Short, String, String, LocalDateTime, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, String, Long, Short, String, String, LocalDateTime, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.BUILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.PIPELINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.REPO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.COMMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.COMMITTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.COMMIT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.ELEMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TRepositoryCommit.T_REPOSITORY_COMMIT.REPO_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getBuildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPipelineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getRepoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCommit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCommitter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getCommitTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getElementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRepoName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value2(String value) {
        setBuildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value3(String value) {
        setPipelineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value4(Long value) {
        setRepoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value5(Short value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value6(String value) {
        setCommit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value7(String value) {
        setCommitter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value8(LocalDateTime value) {
        setCommitTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value9(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value10(String value) {
        setElementId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord value11(String value) {
        setRepoName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRepositoryCommitRecord values(Long value1, String value2, String value3, Long value4, Short value5, String value6, String value7, LocalDateTime value8, String value9, String value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRepositoryCommitRecord
     */
    public TRepositoryCommitRecord() {
        super(TRepositoryCommit.T_REPOSITORY_COMMIT);
    }

    /**
     * Create a detached, initialised TRepositoryCommitRecord
     */
    public TRepositoryCommitRecord(Long id, String buildId, String pipelineId, Long repoId, Short type, String commit, String committer, LocalDateTime commitTime, String comment, String elementId, String repoName) {
        super(TRepositoryCommit.T_REPOSITORY_COMMIT);

        set(0, id);
        set(1, buildId);
        set(2, pipelineId);
        set(3, repoId);
        set(4, type);
        set(5, commit);
        set(6, committer);
        set(7, commitTime);
        set(8, comment);
        set(9, elementId);
        set(10, repoName);
    }
}
