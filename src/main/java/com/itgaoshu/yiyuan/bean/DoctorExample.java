package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDoctoridIsNull() {
            addCriterion("doctorId is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("doctorId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(Integer value) {
            addCriterion("doctorId =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(Integer value) {
            addCriterion("doctorId <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(Integer value) {
            addCriterion("doctorId >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorId >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(Integer value) {
            addCriterion("doctorId <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("doctorId <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<Integer> values) {
            addCriterion("doctorId in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<Integer> values) {
            addCriterion("doctorId not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(Integer value1, Integer value2) {
            addCriterion("doctorId between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorId not between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctornameIsNull() {
            addCriterion("doctorName is null");
            return (Criteria) this;
        }

        public Criteria andDoctornameIsNotNull() {
            addCriterion("doctorName is not null");
            return (Criteria) this;
        }

        public Criteria andDoctornameEqualTo(String value) {
            addCriterion("doctorName =", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotEqualTo(String value) {
            addCriterion("doctorName <>", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameGreaterThan(String value) {
            addCriterion("doctorName >", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameGreaterThanOrEqualTo(String value) {
            addCriterion("doctorName >=", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLessThan(String value) {
            addCriterion("doctorName <", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLessThanOrEqualTo(String value) {
            addCriterion("doctorName <=", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLike(String value) {
            addCriterion("doctorName like", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotLike(String value) {
            addCriterion("doctorName not like", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameIn(List<String> values) {
            addCriterion("doctorName in", values, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotIn(List<String> values) {
            addCriterion("doctorName not in", values, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameBetween(String value1, String value2) {
            addCriterion("doctorName between", value1, value2, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotBetween(String value1, String value2) {
            addCriterion("doctorName not between", value1, value2, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andRegisteredidIsNull() {
            addCriterion("registeredId is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredidIsNotNull() {
            addCriterion("registeredId is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredidEqualTo(Integer value) {
            addCriterion("registeredId =", value, "registeredid");
            return (Criteria) this;
        }

        public Criteria andRegisteredidNotEqualTo(Integer value) {
            addCriterion("registeredId <>", value, "registeredid");
            return (Criteria) this;
        }

        public Criteria andRegisteredidGreaterThan(Integer value) {
            addCriterion("registeredId >", value, "registeredid");
            return (Criteria) this;
        }

        public Criteria andRegisteredidGreaterThanOrEqualTo(Integer value) {
            addCriterion("registeredId >=", value, "registeredid");
            return (Criteria) this;
        }

        public Criteria andRegisteredidLessThan(Integer value) {
            addCriterion("registeredId <", value, "registeredid");
            return (Criteria) this;
        }

        public Criteria andRegisteredidLessThanOrEqualTo(Integer value) {
            addCriterion("registeredId <=", value, "registeredid");
            return (Criteria) this;
        }

        public Criteria andRegisteredidIn(List<Integer> values) {
            addCriterion("registeredId in", values, "registeredid");
            return (Criteria) this;
        }

        public Criteria andRegisteredidNotIn(List<Integer> values) {
            addCriterion("registeredId not in", values, "registeredid");
            return (Criteria) this;
        }

        public Criteria andRegisteredidBetween(Integer value1, Integer value2) {
            addCriterion("registeredId between", value1, value2, "registeredid");
            return (Criteria) this;
        }

        public Criteria andRegisteredidNotBetween(Integer value1, Integer value2) {
            addCriterion("registeredId not between", value1, value2, "registeredid");
            return (Criteria) this;
        }

        public Criteria andDstateIsNull() {
            addCriterion("dstate is null");
            return (Criteria) this;
        }

        public Criteria andDstateIsNotNull() {
            addCriterion("dstate is not null");
            return (Criteria) this;
        }

        public Criteria andDstateEqualTo(Integer value) {
            addCriterion("dstate =", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotEqualTo(Integer value) {
            addCriterion("dstate <>", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateGreaterThan(Integer value) {
            addCriterion("dstate >", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("dstate >=", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateLessThan(Integer value) {
            addCriterion("dstate <", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateLessThanOrEqualTo(Integer value) {
            addCriterion("dstate <=", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateIn(List<Integer> values) {
            addCriterion("dstate in", values, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotIn(List<Integer> values) {
            addCriterion("dstate not in", values, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateBetween(Integer value1, Integer value2) {
            addCriterion("dstate between", value1, value2, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotBetween(Integer value1, Integer value2) {
            addCriterion("dstate not between", value1, value2, "dstate");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeIsNull() {
            addCriterion("amStartTime is null");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeIsNotNull() {
            addCriterion("amStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeEqualTo(String value) {
            addCriterion("amStartTime =", value, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeNotEqualTo(String value) {
            addCriterion("amStartTime <>", value, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeGreaterThan(String value) {
            addCriterion("amStartTime >", value, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("amStartTime >=", value, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeLessThan(String value) {
            addCriterion("amStartTime <", value, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeLessThanOrEqualTo(String value) {
            addCriterion("amStartTime <=", value, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeLike(String value) {
            addCriterion("amStartTime like", value, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeNotLike(String value) {
            addCriterion("amStartTime not like", value, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeIn(List<String> values) {
            addCriterion("amStartTime in", values, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeNotIn(List<String> values) {
            addCriterion("amStartTime not in", values, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeBetween(String value1, String value2) {
            addCriterion("amStartTime between", value1, value2, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmstarttimeNotBetween(String value1, String value2) {
            addCriterion("amStartTime not between", value1, value2, "amstarttime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeIsNull() {
            addCriterion("amEndTime is null");
            return (Criteria) this;
        }

        public Criteria andAmendtimeIsNotNull() {
            addCriterion("amEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andAmendtimeEqualTo(String value) {
            addCriterion("amEndTime =", value, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeNotEqualTo(String value) {
            addCriterion("amEndTime <>", value, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeGreaterThan(String value) {
            addCriterion("amEndTime >", value, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("amEndTime >=", value, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeLessThan(String value) {
            addCriterion("amEndTime <", value, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeLessThanOrEqualTo(String value) {
            addCriterion("amEndTime <=", value, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeLike(String value) {
            addCriterion("amEndTime like", value, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeNotLike(String value) {
            addCriterion("amEndTime not like", value, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeIn(List<String> values) {
            addCriterion("amEndTime in", values, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeNotIn(List<String> values) {
            addCriterion("amEndTime not in", values, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeBetween(String value1, String value2) {
            addCriterion("amEndTime between", value1, value2, "amendtime");
            return (Criteria) this;
        }

        public Criteria andAmendtimeNotBetween(String value1, String value2) {
            addCriterion("amEndTime not between", value1, value2, "amendtime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeIsNull() {
            addCriterion("pmStartTime is null");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeIsNotNull() {
            addCriterion("pmStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeEqualTo(String value) {
            addCriterion("pmStartTime =", value, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeNotEqualTo(String value) {
            addCriterion("pmStartTime <>", value, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeGreaterThan(String value) {
            addCriterion("pmStartTime >", value, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("pmStartTime >=", value, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeLessThan(String value) {
            addCriterion("pmStartTime <", value, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeLessThanOrEqualTo(String value) {
            addCriterion("pmStartTime <=", value, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeLike(String value) {
            addCriterion("pmStartTime like", value, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeNotLike(String value) {
            addCriterion("pmStartTime not like", value, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeIn(List<String> values) {
            addCriterion("pmStartTime in", values, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeNotIn(List<String> values) {
            addCriterion("pmStartTime not in", values, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeBetween(String value1, String value2) {
            addCriterion("pmStartTime between", value1, value2, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmstarttimeNotBetween(String value1, String value2) {
            addCriterion("pmStartTime not between", value1, value2, "pmstarttime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeIsNull() {
            addCriterion("pmEndTime is null");
            return (Criteria) this;
        }

        public Criteria andPmendtimeIsNotNull() {
            addCriterion("pmEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andPmendtimeEqualTo(String value) {
            addCriterion("pmEndTime =", value, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeNotEqualTo(String value) {
            addCriterion("pmEndTime <>", value, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeGreaterThan(String value) {
            addCriterion("pmEndTime >", value, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("pmEndTime >=", value, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeLessThan(String value) {
            addCriterion("pmEndTime <", value, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeLessThanOrEqualTo(String value) {
            addCriterion("pmEndTime <=", value, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeLike(String value) {
            addCriterion("pmEndTime like", value, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeNotLike(String value) {
            addCriterion("pmEndTime not like", value, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeIn(List<String> values) {
            addCriterion("pmEndTime in", values, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeNotIn(List<String> values) {
            addCriterion("pmEndTime not in", values, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeBetween(String value1, String value2) {
            addCriterion("pmEndTime between", value1, value2, "pmendtime");
            return (Criteria) this;
        }

        public Criteria andPmendtimeNotBetween(String value1, String value2) {
            addCriterion("pmEndTime not between", value1, value2, "pmendtime");
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