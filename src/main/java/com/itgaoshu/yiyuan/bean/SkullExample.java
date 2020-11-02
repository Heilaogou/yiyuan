package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.List;

public class SkullExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkullExample() {
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

        public Criteria andSkullnameIsNull() {
            addCriterion("skullName is null");
            return (Criteria) this;
        }

        public Criteria andSkullnameIsNotNull() {
            addCriterion("skullName is not null");
            return (Criteria) this;
        }

        public Criteria andSkullnameEqualTo(String value) {
            addCriterion("skullName =", value, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameNotEqualTo(String value) {
            addCriterion("skullName <>", value, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameGreaterThan(String value) {
            addCriterion("skullName >", value, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameGreaterThanOrEqualTo(String value) {
            addCriterion("skullName >=", value, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameLessThan(String value) {
            addCriterion("skullName <", value, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameLessThanOrEqualTo(String value) {
            addCriterion("skullName <=", value, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameLike(String value) {
            addCriterion("skullName like", value, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameNotLike(String value) {
            addCriterion("skullName not like", value, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameIn(List<String> values) {
            addCriterion("skullName in", values, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameNotIn(List<String> values) {
            addCriterion("skullName not in", values, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameBetween(String value1, String value2) {
            addCriterion("skullName between", value1, value2, "skullname");
            return (Criteria) this;
        }

        public Criteria andSkullnameNotBetween(String value1, String value2) {
            addCriterion("skullName not between", value1, value2, "skullname");
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