/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.environment.tables;


import com.tencent.devops.model.environment.DevopsEnvironment;
import com.tencent.devops.model.environment.Keys;
import com.tencent.devops.model.environment.tables.records.TProjectConfigRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TProjectConfig extends TableImpl<TProjectConfigRecord> {

    private static final long serialVersionUID = -268578146;

    /**
     * The reference instance of <code>devops_environment.T_PROJECT_CONFIG</code>
     */
    public static final TProjectConfig T_PROJECT_CONFIG = new TProjectConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TProjectConfigRecord> getRecordType() {
        return TProjectConfigRecord.class;
    }

    /**
     * The column <code>devops_environment.T_PROJECT_CONFIG.PROJECT_ID</code>. 项目ID
     */
    public final TableField<TProjectConfigRecord, String> PROJECT_ID = createField("PROJECT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "项目ID");

    /**
     * The column <code>devops_environment.T_PROJECT_CONFIG.UPDATED_USER</code>.
     */
    public final TableField<TProjectConfigRecord, String> UPDATED_USER = createField("UPDATED_USER", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_environment.T_PROJECT_CONFIG.UPDATED_TIME</code>.
     */
    public final TableField<TProjectConfigRecord, LocalDateTime> UPDATED_TIME = createField("UPDATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>devops_environment.T_PROJECT_CONFIG.BCSVM_ENALBED</code>.
     */
    public final TableField<TProjectConfigRecord, Boolean> BCSVM_ENALBED = createField("BCSVM_ENALBED", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>devops_environment.T_PROJECT_CONFIG.BCSVM_QUOTA</code>.
     */
    public final TableField<TProjectConfigRecord, Integer> BCSVM_QUOTA = createField("BCSVM_QUOTA", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>devops_environment.T_PROJECT_CONFIG.IMPORT_QUOTA</code>. 导入节点数配额
     */
    public final TableField<TProjectConfigRecord, Integer> IMPORT_QUOTA = createField("IMPORT_QUOTA", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("30", org.jooq.impl.SQLDataType.INTEGER)), this, "导入节点数配额");

    /**
     * The column <code>devops_environment.T_PROJECT_CONFIG.DEV_CLOUD_ENALBED</code>.
     */
    public final TableField<TProjectConfigRecord, Boolean> DEV_CLOUD_ENALBED = createField("DEV_CLOUD_ENALBED", org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>devops_environment.T_PROJECT_CONFIG.DEV_CLOUD_QUOTA</code>.
     */
    public final TableField<TProjectConfigRecord, Integer> DEV_CLOUD_QUOTA = createField("DEV_CLOUD_QUOTA", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>devops_environment.T_PROJECT_CONFIG</code> table reference
     */
    public TProjectConfig() {
        this("T_PROJECT_CONFIG", null);
    }

    /**
     * Create an aliased <code>devops_environment.T_PROJECT_CONFIG</code> table reference
     */
    public TProjectConfig(String alias) {
        this(alias, T_PROJECT_CONFIG);
    }

    private TProjectConfig(String alias, Table<TProjectConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private TProjectConfig(String alias, Table<TProjectConfigRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TProjectConfigRecord> getPrimaryKey() {
        return Keys.KEY_T_PROJECT_CONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TProjectConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<TProjectConfigRecord>>asList(Keys.KEY_T_PROJECT_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectConfig as(String alias) {
        return new TProjectConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TProjectConfig rename(String name) {
        return new TProjectConfig(name, null);
    }
}
