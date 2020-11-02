package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andReportidIsNull() {
            addCriterion("reportId is null");
            return (Criteria) this;
        }

        public Criteria andReportidIsNotNull() {
            addCriterion("reportId is not null");
            return (Criteria) this;
        }

        public Criteria andReportidEqualTo(Integer value) {
            addCriterion("reportId =", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotEqualTo(Integer value) {
            addCriterion("reportId <>", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThan(Integer value) {
            addCriterion("reportId >", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reportId >=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThan(Integer value) {
            addCriterion("reportId <", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThanOrEqualTo(Integer value) {
            addCriterion("reportId <=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidIn(List<Integer> values) {
            addCriterion("reportId in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotIn(List<Integer> values) {
            addCriterion("reportId not in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidBetween(Integer value1, Integer value2) {
            addCriterion("reportId between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotBetween(Integer value1, Integer value2) {
            addCriterion("reportId not between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportnameIsNull() {
            addCriterion("reportName is null");
            return (Criteria) this;
        }

        public Criteria andReportnameIsNotNull() {
            addCriterion("reportName is not null");
            return (Criteria) this;
        }

        public Criteria andReportnameEqualTo(String value) {
            addCriterion("reportName =", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotEqualTo(String value) {
            addCriterion("reportName <>", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameGreaterThan(String value) {
            addCriterion("reportName >", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameGreaterThanOrEqualTo(String value) {
            addCriterion("reportName >=", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLessThan(String value) {
            addCriterion("reportName <", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLessThanOrEqualTo(String value) {
            addCriterion("reportName <=", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameLike(String value) {
            addCriterion("reportName like", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotLike(String value) {
            addCriterion("reportName not like", value, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameIn(List<String> values) {
            addCriterion("reportName in", values, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotIn(List<String> values) {
            addCriterion("reportName not in", values, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameBetween(String value1, String value2) {
            addCriterion("reportName between", value1, value2, "reportname");
            return (Criteria) this;
        }

        public Criteria andReportnameNotBetween(String value1, String value2) {
            addCriterion("reportName not between", value1, value2, "reportname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(Integer value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(Integer value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(Integer value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(Integer value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<Integer> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<Integer> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNull() {
            addCriterion("doctor is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIsNotNull() {
            addCriterion("doctor is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorEqualTo(Integer value) {
            addCriterion("doctor =", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotEqualTo(Integer value) {
            addCriterion("doctor <>", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThan(Integer value) {
            addCriterion("doctor >", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor >=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThan(Integer value) {
            addCriterion("doctor <", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorLessThanOrEqualTo(Integer value) {
            addCriterion("doctor <=", value, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorIn(List<Integer> values) {
            addCriterion("doctor in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotIn(List<Integer> values) {
            addCriterion("doctor not in", values, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorBetween(Integer value1, Integer value2) {
            addCriterion("doctor between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andDoctorNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor not between", value1, value2, "doctor");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNull() {
            addCriterion("reportType is null");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNotNull() {
            addCriterion("reportType is not null");
            return (Criteria) this;
        }

        public Criteria andReporttypeEqualTo(Integer value) {
            addCriterion("reportType =", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotEqualTo(Integer value) {
            addCriterion("reportType <>", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThan(Integer value) {
            addCriterion("reportType >", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reportType >=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThan(Integer value) {
            addCriterion("reportType <", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThanOrEqualTo(Integer value) {
            addCriterion("reportType <=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeIn(List<Integer> values) {
            addCriterion("reportType in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotIn(List<Integer> values) {
            addCriterion("reportType not in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeBetween(Integer value1, Integer value2) {
            addCriterion("reportType between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("reportType not between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andUsersIsNull() {
            addCriterion("users is null");
            return (Criteria) this;
        }

        public Criteria andUsersIsNotNull() {
            addCriterion("users is not null");
            return (Criteria) this;
        }

        public Criteria andUsersEqualTo(String value) {
            addCriterion("users =", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotEqualTo(String value) {
            addCriterion("users <>", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersGreaterThan(String value) {
            addCriterion("users >", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersGreaterThanOrEqualTo(String value) {
            addCriterion("users >=", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersLessThan(String value) {
            addCriterion("users <", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersLessThanOrEqualTo(String value) {
            addCriterion("users <=", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersLike(String value) {
            addCriterion("users like", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotLike(String value) {
            addCriterion("users not like", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersIn(List<String> values) {
            addCriterion("users in", values, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotIn(List<String> values) {
            addCriterion("users not in", values, "users");
            return (Criteria) this;
        }

        public Criteria andUsersBetween(String value1, String value2) {
            addCriterion("users between", value1, value2, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotBetween(String value1, String value2) {
            addCriterion("users not between", value1, value2, "users");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("carid is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carid is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(String value) {
            addCriterion("carid =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(String value) {
            addCriterion("carid <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(String value) {
            addCriterion("carid >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(String value) {
            addCriterion("carid >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(String value) {
            addCriterion("carid <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(String value) {
            addCriterion("carid <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLike(String value) {
            addCriterion("carid like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotLike(String value) {
            addCriterion("carid not like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<String> values) {
            addCriterion("carid in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<String> values) {
            addCriterion("carid not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(String value1, String value2) {
            addCriterion("carid between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(String value1, String value2) {
            addCriterion("carid not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andZhuanIsNull() {
            addCriterion("zhuan is null");
            return (Criteria) this;
        }

        public Criteria andZhuanIsNotNull() {
            addCriterion("zhuan is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanEqualTo(String value) {
            addCriterion("zhuan =", value, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanNotEqualTo(String value) {
            addCriterion("zhuan <>", value, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanGreaterThan(String value) {
            addCriterion("zhuan >", value, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanGreaterThanOrEqualTo(String value) {
            addCriterion("zhuan >=", value, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanLessThan(String value) {
            addCriterion("zhuan <", value, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanLessThanOrEqualTo(String value) {
            addCriterion("zhuan <=", value, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanLike(String value) {
            addCriterion("zhuan like", value, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanNotLike(String value) {
            addCriterion("zhuan not like", value, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanIn(List<String> values) {
            addCriterion("zhuan in", values, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanNotIn(List<String> values) {
            addCriterion("zhuan not in", values, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanBetween(String value1, String value2) {
            addCriterion("zhuan between", value1, value2, "zhuan");
            return (Criteria) this;
        }

        public Criteria andZhuanNotBetween(String value1, String value2) {
            addCriterion("zhuan not between", value1, value2, "zhuan");
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