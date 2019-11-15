/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.project.tables;


import com.tencent.devops.model.project.DevopsProject;
import com.tencent.devops.model.project.Keys;
import com.tencent.devops.model.project.tables.records.TFavoriteRecord;

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
public class TFavorite extends TableImpl<TFavoriteRecord> {

    private static final long serialVersionUID = 643879928;

    /**
     * The reference instance of <code>devops_project.t_favorite</code>
     */
    public static final TFavorite T_FAVORITE = new TFavorite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TFavoriteRecord> getRecordType() {
        return TFavoriteRecord.class;
    }

    /**
     * The column <code>devops_project.t_favorite.id</code>. 主键id
     */
    public final TableField<TFavoriteRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键id");

    /**
     * The column <code>devops_project.t_favorite.service_id</code>. 服务id
     */
    public final TableField<TFavoriteRecord, Long> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.BIGINT, this, "服务id");

    /**
     * The column <code>devops_project.t_favorite.username</code>. 用户
     */
    public final TableField<TFavoriteRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "用户");

    /**
     * Create a <code>devops_project.t_favorite</code> table reference
     */
    public TFavorite() {
        this("t_favorite", null);
    }

    /**
     * Create an aliased <code>devops_project.t_favorite</code> table reference
     */
    public TFavorite(String alias) {
        this(alias, T_FAVORITE);
    }

    private TFavorite(String alias, Table<TFavoriteRecord> aliased) {
        this(alias, aliased, null);
    }

    private TFavorite(String alias, Table<TFavoriteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsProject.DEVOPS_PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TFavoriteRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_FAVORITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TFavoriteRecord> getPrimaryKey() {
        return Keys.KEY_T_FAVORITE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TFavoriteRecord>> getKeys() {
        return Arrays.<UniqueKey<TFavoriteRecord>>asList(Keys.KEY_T_FAVORITE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFavorite as(String alias) {
        return new TFavorite(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TFavorite rename(String name) {
        return new TFavorite(name, null);
    }
}