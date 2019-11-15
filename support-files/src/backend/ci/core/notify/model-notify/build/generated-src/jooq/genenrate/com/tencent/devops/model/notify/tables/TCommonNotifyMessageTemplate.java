/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.notify.tables;


import com.tencent.devops.model.notify.DevopsNotify;
import com.tencent.devops.model.notify.Keys;
import com.tencent.devops.model.notify.tables.records.TCommonNotifyMessageTemplateRecord;

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
public class TCommonNotifyMessageTemplate extends TableImpl<TCommonNotifyMessageTemplateRecord> {

    private static final long serialVersionUID = 1281193953;

    /**
     * The reference instance of <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE</code>
     */
    public static final TCommonNotifyMessageTemplate T_COMMON_NOTIFY_MESSAGE_TEMPLATE = new TCommonNotifyMessageTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCommonNotifyMessageTemplateRecord> getRecordType() {
        return TCommonNotifyMessageTemplateRecord.class;
    }

    /**
     * The column <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.ID</code>.
     */
    public final TableField<TCommonNotifyMessageTemplateRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.TEMPLATE_CODE</code>.
     */
    public final TableField<TCommonNotifyMessageTemplateRecord, String> TEMPLATE_CODE = createField("TEMPLATE_CODE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.TEMPLATE_NAME</code>.
     */
    public final TableField<TCommonNotifyMessageTemplateRecord, String> TEMPLATE_NAME = createField("TEMPLATE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.NOTIFY_TYPE_SCOPE</code>.
     */
    public final TableField<TCommonNotifyMessageTemplateRecord, String> NOTIFY_TYPE_SCOPE = createField("NOTIFY_TYPE_SCOPE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.PRIORITY</code>.
     */
    public final TableField<TCommonNotifyMessageTemplateRecord, Byte> PRIORITY = createField("PRIORITY", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE.SOURCE</code>.
     */
    public final TableField<TCommonNotifyMessageTemplateRecord, Byte> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE</code> table reference
     */
    public TCommonNotifyMessageTemplate() {
        this("T_COMMON_NOTIFY_MESSAGE_TEMPLATE", null);
    }

    /**
     * Create an aliased <code>devops_notify.T_COMMON_NOTIFY_MESSAGE_TEMPLATE</code> table reference
     */
    public TCommonNotifyMessageTemplate(String alias) {
        this(alias, T_COMMON_NOTIFY_MESSAGE_TEMPLATE);
    }

    private TCommonNotifyMessageTemplate(String alias, Table<TCommonNotifyMessageTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCommonNotifyMessageTemplate(String alias, Table<TCommonNotifyMessageTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsNotify.DEVOPS_NOTIFY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCommonNotifyMessageTemplateRecord> getPrimaryKey() {
        return Keys.KEY_T_COMMON_NOTIFY_MESSAGE_TEMPLATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCommonNotifyMessageTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<TCommonNotifyMessageTemplateRecord>>asList(Keys.KEY_T_COMMON_NOTIFY_MESSAGE_TEMPLATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCommonNotifyMessageTemplate as(String alias) {
        return new TCommonNotifyMessageTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCommonNotifyMessageTemplate rename(String name) {
        return new TCommonNotifyMessageTemplate(name, null);
    }
}
