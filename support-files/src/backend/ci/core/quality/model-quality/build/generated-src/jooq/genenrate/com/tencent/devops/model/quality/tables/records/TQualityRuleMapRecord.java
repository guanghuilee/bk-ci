/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.quality.tables.records;


import com.tencent.devops.model.quality.tables.TQualityRuleMap;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TQualityRuleMapRecord extends UpdatableRecordImpl<TQualityRuleMapRecord> implements Record5<Long, Long, String, String, String> {

    private static final long serialVersionUID = 793490393;

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_MAP.ID</code>.
     */
    public TQualityRuleMapRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_MAP.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_MAP.RULE_ID</code>.
     */
    public TQualityRuleMapRecord setRuleId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_MAP.RULE_ID</code>.
     */
    public Long getRuleId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_MAP.INDICATOR_IDS</code>.
     */
    public TQualityRuleMapRecord setIndicatorIds(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_MAP.INDICATOR_IDS</code>.
     */
    public String getIndicatorIds() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_MAP.INDICATOR_OPERATIONS</code>.
     */
    public TQualityRuleMapRecord setIndicatorOperations(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_MAP.INDICATOR_OPERATIONS</code>.
     */
    public String getIndicatorOperations() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_RULE_MAP.INDICATOR_THRESHOLDS</code>.
     */
    public TQualityRuleMapRecord setIndicatorThresholds(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_RULE_MAP.INDICATOR_THRESHOLDS</code>.
     */
    public String getIndicatorThresholds() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TQualityRuleMap.T_QUALITY_RULE_MAP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TQualityRuleMap.T_QUALITY_RULE_MAP.RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TQualityRuleMap.T_QUALITY_RULE_MAP.INDICATOR_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TQualityRuleMap.T_QUALITY_RULE_MAP.INDICATOR_OPERATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TQualityRuleMap.T_QUALITY_RULE_MAP.INDICATOR_THRESHOLDS;
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
    public Long value2() {
        return getRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIndicatorIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIndicatorOperations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIndicatorThresholds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleMapRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleMapRecord value2(Long value) {
        setRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleMapRecord value3(String value) {
        setIndicatorIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleMapRecord value4(String value) {
        setIndicatorOperations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleMapRecord value5(String value) {
        setIndicatorThresholds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityRuleMapRecord values(Long value1, Long value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TQualityRuleMapRecord
     */
    public TQualityRuleMapRecord() {
        super(TQualityRuleMap.T_QUALITY_RULE_MAP);
    }

    /**
     * Create a detached, initialised TQualityRuleMapRecord
     */
    public TQualityRuleMapRecord(Long id, Long ruleId, String indicatorIds, String indicatorOperations, String indicatorThresholds) {
        super(TQualityRuleMap.T_QUALITY_RULE_MAP);

        set(0, id);
        set(1, ruleId);
        set(2, indicatorIds);
        set(3, indicatorOperations);
        set(4, indicatorThresholds);
    }
}
