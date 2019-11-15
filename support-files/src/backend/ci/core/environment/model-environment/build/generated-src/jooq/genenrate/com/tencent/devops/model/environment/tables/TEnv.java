/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.environment.tables;


import com.tencent.devops.model.environment.DevopsEnvironment;
import com.tencent.devops.model.environment.Keys;
import com.tencent.devops.model.environment.tables.records.TEnvRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TEnv extends TableImpl<TEnvRecord> {

    private static final long serialVersionUID = 824905268;

    /**
     * The reference instance of <code>devops_environment.T_ENV</code>
     */
    public static final TEnv T_ENV = new TEnv();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TEnvRecord> getRecordType() {
        return TEnvRecord.class;
    }

    /**
     * The column <code>devops_environment.T_ENV.ENV_ID</code>. ID
     */
    public final TableField<TEnvRecord, Long> ENV_ID = createField("ENV_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "ID");

    /**
     * The column <code>devops_environment.T_ENV.PROJECT_ID</code>. 项目ID
     */
    public final TableField<TEnvRecord, String> PROJECT_ID = createField("PROJECT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "项目ID");

    /**
     * The column <code>devops_environment.T_ENV.ENV_NAME</code>. 名称
     */
    public final TableField<TEnvRecord, String> ENV_NAME = createField("ENV_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "名称");

    /**
     * The column <code>devops_environment.T_ENV.ENV_DESC</code>. 描述
     */
    public final TableField<TEnvRecord, String> ENV_DESC = createField("ENV_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "描述");

    /**
     * The column <code>devops_environment.T_ENV.ENV_TYPE</code>. 环境类型
     */
    public final TableField<TEnvRecord, String> ENV_TYPE = createField("ENV_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "环境类型");

    /**
     * The column <code>devops_environment.T_ENV.ENV_VARS</code>. 环境变量
     */
    public final TableField<TEnvRecord, String> ENV_VARS = createField("ENV_VARS", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "环境变量");

    /**
     * The column <code>devops_environment.T_ENV.CREATED_USER</code>.
     */
    public final TableField<TEnvRecord, String> CREATED_USER = createField("CREATED_USER", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_environment.T_ENV.UPDATED_USER</code>.
     */
    public final TableField<TEnvRecord, String> UPDATED_USER = createField("UPDATED_USER", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_environment.T_ENV.CREATED_TIME</code>.
     */
    public final TableField<TEnvRecord, LocalDateTime> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>devops_environment.T_ENV.UPDATED_TIME</code>.
     */
    public final TableField<TEnvRecord, LocalDateTime> UPDATED_TIME = createField("UPDATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>devops_environment.T_ENV.IS_DELETED</code>.
     */
    public final TableField<TEnvRecord, Boolean> IS_DELETED = createField("IS_DELETED", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * Create a <code>devops_environment.T_ENV</code> table reference
     */
    public TEnv() {
        this("T_ENV", null);
    }

    /**
     * Create an aliased <code>devops_environment.T_ENV</code> table reference
     */
    public TEnv(String alias) {
        this(alias, T_ENV);
    }

    private TEnv(String alias, Table<TEnvRecord> aliased) {
        this(alias, aliased, null);
    }

    private TEnv(String alias, Table<TEnvRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsEnvironment.DEVOPS_ENVIRONMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TEnvRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_ENV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TEnvRecord> getPrimaryKey() {
        return Keys.KEY_T_ENV_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TEnvRecord>> getKeys() {
        return Arrays.<UniqueKey<TEnvRecord>>asList(Keys.KEY_T_ENV_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TEnv as(String alias) {
        return new TEnv(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TEnv rename(String name) {
        return new TEnv(name, null);
    }
}
