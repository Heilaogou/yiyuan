package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.List;

public class BedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BedExample() {
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

        public Criteria andBedidIsNull() {
            addCriterion("bedId is null");
            return (Criteria) this;
        }

        public Criteria andBedidIsNotNull() {
            addCriterion("bedId is not null");
            return (Criteria) this;
        }

        public Criteria andBedidEqualTo(Integer value) {
            addCriterion("bedId =", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidNotEqualTo(Integer value) {
            addCriterion("bedId <>", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidGreaterThan(Integer value) {
            addCriterion("bedId >", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bedId >=", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidLessThan(Integer value) {
            addCriterion("bedId <", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidLessThanOrEqualTo(Integer value) {
            addCriterion("bedId <=", value, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidIn(List<Integer> values) {
            addCriterion("bedId in", values, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidNotIn(List<Integer> values) {
            addCriterion("bedId not in", values, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidBetween(Integer value1, Integer value2) {
            addCriterion("bedId between", value1, value2, "bedid");
            return (Criteria) this;
        }

        public Criteria andBedidNotBetween(Integer value1, Integer value2) {
            addCriterion("bedId not between", value1, value2, "bedid");
            return (Criteria) this;
        }

        public Criteria andBednameIsNull() {
            addCriterion("bedname is null");
            return (Criteria) this;
        }

        public Criteria andBednameIsNotNull() {
            addCriterion("bedname is not null");
            return (Criteria) this;
        }

        public Criteria andBednameEqualTo(String value) {
            addCriterion("bedname =", value, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameNotEqualTo(String value) {
            addCriterion("bedname <>", value, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameGreaterThan(String value) {
            addCriterion("bedname >", value, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameGreaterThanOrEqualTo(String value) {
            addCriterion("bedname >=", value, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameLessThan(String value) {
            addCriterion("bedname <", value, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameLessThanOrEqualTo(String value) {
            addCriterion("bedname <=", value, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameLike(String value) {
            addCriterion("bedname like", value, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameNotLike(String value) {
            addCriterion("bedname not like", value, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameIn(List<String> values) {
            addCriterion("bedname in", values, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameNotIn(List<String> values) {
            addCriterion("bedname not in", values, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameBetween(String value1, String value2) {
            addCriterion("bedname between", value1, value2, "bedname");
            return (Criteria) this;
        }

        public Criteria andBednameNotBetween(String value1, String value2) {
            addCriterion("bedname not between", value1, value2, "bedname");
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

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("Price not between", value1, value2, "price");
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