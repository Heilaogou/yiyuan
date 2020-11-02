package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PharmacyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PharmacyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPharmacyidIsNull() {
            addCriterion("pharmacyId is null");
            return (Criteria) this;
        }

        public Criteria andPharmacyidIsNotNull() {
            addCriterion("pharmacyId is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacyidEqualTo(Integer value) {
            addCriterion("pharmacyId =", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidNotEqualTo(Integer value) {
            addCriterion("pharmacyId <>", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidGreaterThan(Integer value) {
            addCriterion("pharmacyId >", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pharmacyId >=", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidLessThan(Integer value) {
            addCriterion("pharmacyId <", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidLessThanOrEqualTo(Integer value) {
            addCriterion("pharmacyId <=", value, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidIn(List<Integer> values) {
            addCriterion("pharmacyId in", values, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidNotIn(List<Integer> values) {
            addCriterion("pharmacyId not in", values, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidBetween(Integer value1, Integer value2) {
            addCriterion("pharmacyId between", value1, value2, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacyidNotBetween(Integer value1, Integer value2) {
            addCriterion("pharmacyId not between", value1, value2, "pharmacyid");
            return (Criteria) this;
        }

        public Criteria andPharmacynameIsNull() {
            addCriterion("pharmacyName is null");
            return (Criteria) this;
        }

        public Criteria andPharmacynameIsNotNull() {
            addCriterion("pharmacyName is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacynameEqualTo(String value) {
            addCriterion("pharmacyName =", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameNotEqualTo(String value) {
            addCriterion("pharmacyName <>", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameGreaterThan(String value) {
            addCriterion("pharmacyName >", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameGreaterThanOrEqualTo(String value) {
            addCriterion("pharmacyName >=", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameLessThan(String value) {
            addCriterion("pharmacyName <", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameLessThanOrEqualTo(String value) {
            addCriterion("pharmacyName <=", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameLike(String value) {
            addCriterion("pharmacyName like", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameNotLike(String value) {
            addCriterion("pharmacyName not like", value, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameIn(List<String> values) {
            addCriterion("pharmacyName in", values, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameNotIn(List<String> values) {
            addCriterion("pharmacyName not in", values, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameBetween(String value1, String value2) {
            addCriterion("pharmacyName between", value1, value2, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andPharmacynameNotBetween(String value1, String value2) {
            addCriterion("pharmacyName not between", value1, value2, "pharmacyname");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidIsNull() {
            addCriterion("drugstoreId is null");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidIsNotNull() {
            addCriterion("drugstoreId is not null");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidEqualTo(Integer value) {
            addCriterion("drugstoreId =", value, "drugstoreid");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidNotEqualTo(Integer value) {
            addCriterion("drugstoreId <>", value, "drugstoreid");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidGreaterThan(Integer value) {
            addCriterion("drugstoreId >", value, "drugstoreid");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugstoreId >=", value, "drugstoreid");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidLessThan(Integer value) {
            addCriterion("drugstoreId <", value, "drugstoreid");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidLessThanOrEqualTo(Integer value) {
            addCriterion("drugstoreId <=", value, "drugstoreid");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidIn(List<Integer> values) {
            addCriterion("drugstoreId in", values, "drugstoreid");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidNotIn(List<Integer> values) {
            addCriterion("drugstoreId not in", values, "drugstoreid");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidBetween(Integer value1, Integer value2) {
            addCriterion("drugstoreId between", value1, value2, "drugstoreid");
            return (Criteria) this;
        }

        public Criteria andDrugstoreidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugstoreId not between", value1, value2, "drugstoreid");
            return (Criteria) this;
        }

        public Criteria andSkullidIsNull() {
            addCriterion("skullId is null");
            return (Criteria) this;
        }

        public Criteria andSkullidIsNotNull() {
            addCriterion("skullId is not null");
            return (Criteria) this;
        }

        public Criteria andSkullidEqualTo(Integer value) {
            addCriterion("skullId =", value, "skullid");
            return (Criteria) this;
        }

        public Criteria andSkullidNotEqualTo(Integer value) {
            addCriterion("skullId <>", value, "skullid");
            return (Criteria) this;
        }

        public Criteria andSkullidGreaterThan(Integer value) {
            addCriterion("skullId >", value, "skullid");
            return (Criteria) this;
        }

        public Criteria andSkullidGreaterThanOrEqualTo(Integer value) {
            addCriterion("skullId >=", value, "skullid");
            return (Criteria) this;
        }

        public Criteria andSkullidLessThan(Integer value) {
            addCriterion("skullId <", value, "skullid");
            return (Criteria) this;
        }

        public Criteria andSkullidLessThanOrEqualTo(Integer value) {
            addCriterion("skullId <=", value, "skullid");
            return (Criteria) this;
        }

        public Criteria andSkullidIn(List<Integer> values) {
            addCriterion("skullId in", values, "skullid");
            return (Criteria) this;
        }

        public Criteria andSkullidNotIn(List<Integer> values) {
            addCriterion("skullId not in", values, "skullid");
            return (Criteria) this;
        }

        public Criteria andSkullidBetween(Integer value1, Integer value2) {
            addCriterion("skullId between", value1, value2, "skullid");
            return (Criteria) this;
        }

        public Criteria andSkullidNotBetween(Integer value1, Integer value2) {
            addCriterion("skullId not between", value1, value2, "skullid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNull() {
            addCriterion("warehouseId is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("warehouseId is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(Integer value) {
            addCriterion("warehouseId =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(Integer value) {
            addCriterion("warehouseId <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(Integer value) {
            addCriterion("warehouseId >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouseId >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(Integer value) {
            addCriterion("warehouseId <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(Integer value) {
            addCriterion("warehouseId <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<Integer> values) {
            addCriterion("warehouseId in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<Integer> values) {
            addCriterion("warehouseId not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(Integer value1, Integer value2) {
            addCriterion("warehouseId between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouseId not between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Integer value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Integer value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Integer value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Integer value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Integer value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Integer> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Integer> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Integer value1, Integer value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNull() {
            addCriterion("sellingPrice is null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIsNotNull() {
            addCriterion("sellingPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSellingpriceEqualTo(Double value) {
            addCriterion("sellingPrice =", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotEqualTo(Double value) {
            addCriterion("sellingPrice <>", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThan(Double value) {
            addCriterion("sellingPrice >", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("sellingPrice >=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThan(Double value) {
            addCriterion("sellingPrice <", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceLessThanOrEqualTo(Double value) {
            addCriterion("sellingPrice <=", value, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceIn(List<Double> values) {
            addCriterion("sellingPrice in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotIn(List<Double> values) {
            addCriterion("sellingPrice not in", values, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceBetween(Double value1, Double value2) {
            addCriterion("sellingPrice between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andSellingpriceNotBetween(Double value1, Double value2) {
            addCriterion("sellingPrice not between", value1, value2, "sellingprice");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNull() {
            addCriterion("produceDate is null");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNotNull() {
            addCriterion("produceDate is not null");
            return (Criteria) this;
        }

        public Criteria andProducedateEqualTo(Date value) {
            addCriterionForJDBCDate("produceDate =", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("produceDate <>", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThan(Date value) {
            addCriterionForJDBCDate("produceDate >", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("produceDate >=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThan(Date value) {
            addCriterionForJDBCDate("produceDate <", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("produceDate <=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateIn(List<Date> values) {
            addCriterionForJDBCDate("produceDate in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("produceDate not in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("produceDate between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("produceDate not between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andValiddateIsNull() {
            addCriterion("validDate is null");
            return (Criteria) this;
        }

        public Criteria andValiddateIsNotNull() {
            addCriterion("validDate is not null");
            return (Criteria) this;
        }

        public Criteria andValiddateEqualTo(Date value) {
            addCriterionForJDBCDate("validDate =", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("validDate <>", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateGreaterThan(Date value) {
            addCriterionForJDBCDate("validDate >", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validDate >=", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateLessThan(Date value) {
            addCriterionForJDBCDate("validDate <", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validDate <=", value, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateIn(List<Date> values) {
            addCriterionForJDBCDate("validDate in", values, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("validDate not in", values, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validDate between", value1, value2, "validdate");
            return (Criteria) this;
        }

        public Criteria andValiddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validDate not between", value1, value2, "validdate");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumIsNull() {
            addCriterion("drugstorenum is null");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumIsNotNull() {
            addCriterion("drugstorenum is not null");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumEqualTo(Integer value) {
            addCriterion("drugstorenum =", value, "drugstorenum");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumNotEqualTo(Integer value) {
            addCriterion("drugstorenum <>", value, "drugstorenum");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumGreaterThan(Integer value) {
            addCriterion("drugstorenum >", value, "drugstorenum");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugstorenum >=", value, "drugstorenum");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumLessThan(Integer value) {
            addCriterion("drugstorenum <", value, "drugstorenum");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumLessThanOrEqualTo(Integer value) {
            addCriterion("drugstorenum <=", value, "drugstorenum");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumIn(List<Integer> values) {
            addCriterion("drugstorenum in", values, "drugstorenum");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumNotIn(List<Integer> values) {
            addCriterion("drugstorenum not in", values, "drugstorenum");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumBetween(Integer value1, Integer value2) {
            addCriterion("drugstorenum between", value1, value2, "drugstorenum");
            return (Criteria) this;
        }

        public Criteria andDrugstorenumNotBetween(Integer value1, Integer value2) {
            addCriterion("drugstorenum not between", value1, value2, "drugstorenum");
            return (Criteria) this;
        }

        public Criteria andSkullbatchIsNull() {
            addCriterion("skullbatch is null");
            return (Criteria) this;
        }

        public Criteria andSkullbatchIsNotNull() {
            addCriterion("skullbatch is not null");
            return (Criteria) this;
        }

        public Criteria andSkullbatchEqualTo(String value) {
            addCriterion("skullbatch =", value, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchNotEqualTo(String value) {
            addCriterion("skullbatch <>", value, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchGreaterThan(String value) {
            addCriterion("skullbatch >", value, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchGreaterThanOrEqualTo(String value) {
            addCriterion("skullbatch >=", value, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchLessThan(String value) {
            addCriterion("skullbatch <", value, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchLessThanOrEqualTo(String value) {
            addCriterion("skullbatch <=", value, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchLike(String value) {
            addCriterion("skullbatch like", value, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchNotLike(String value) {
            addCriterion("skullbatch not like", value, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchIn(List<String> values) {
            addCriterion("skullbatch in", values, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchNotIn(List<String> values) {
            addCriterion("skullbatch not in", values, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchBetween(String value1, String value2) {
            addCriterion("skullbatch between", value1, value2, "skullbatch");
            return (Criteria) this;
        }

        public Criteria andSkullbatchNotBetween(String value1, String value2) {
            addCriterion("skullbatch not between", value1, value2, "skullbatch");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}