package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.List;

public class BaoqueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaoqueExample() {
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

        public Criteria andBaoqueidIsNull() {
            addCriterion("baoqueid is null");
            return (Criteria) this;
        }

        public Criteria andBaoqueidIsNotNull() {
            addCriterion("baoqueid is not null");
            return (Criteria) this;
        }

        public Criteria andBaoqueidEqualTo(Integer value) {
            addCriterion("baoqueid =", value, "baoqueid");
            return (Criteria) this;
        }

        public Criteria andBaoqueidNotEqualTo(Integer value) {
            addCriterion("baoqueid <>", value, "baoqueid");
            return (Criteria) this;
        }

        public Criteria andBaoqueidGreaterThan(Integer value) {
            addCriterion("baoqueid >", value, "baoqueid");
            return (Criteria) this;
        }

        public Criteria andBaoqueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("baoqueid >=", value, "baoqueid");
            return (Criteria) this;
        }

        public Criteria andBaoqueidLessThan(Integer value) {
            addCriterion("baoqueid <", value, "baoqueid");
            return (Criteria) this;
        }

        public Criteria andBaoqueidLessThanOrEqualTo(Integer value) {
            addCriterion("baoqueid <=", value, "baoqueid");
            return (Criteria) this;
        }

        public Criteria andBaoqueidIn(List<Integer> values) {
            addCriterion("baoqueid in", values, "baoqueid");
            return (Criteria) this;
        }

        public Criteria andBaoqueidNotIn(List<Integer> values) {
            addCriterion("baoqueid not in", values, "baoqueid");
            return (Criteria) this;
        }

        public Criteria andBaoqueidBetween(Integer value1, Integer value2) {
            addCriterion("baoqueid between", value1, value2, "baoqueid");
            return (Criteria) this;
        }

        public Criteria andBaoqueidNotBetween(Integer value1, Integer value2) {
            addCriterion("baoqueid not between", value1, value2, "baoqueid");
            return (Criteria) this;
        }

        public Criteria andBaoquenameIsNull() {
            addCriterion("baoqueName is null");
            return (Criteria) this;
        }

        public Criteria andBaoquenameIsNotNull() {
            addCriterion("baoqueName is not null");
            return (Criteria) this;
        }

        public Criteria andBaoquenameEqualTo(String value) {
            addCriterion("baoqueName =", value, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameNotEqualTo(String value) {
            addCriterion("baoqueName <>", value, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameGreaterThan(String value) {
            addCriterion("baoqueName >", value, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameGreaterThanOrEqualTo(String value) {
            addCriterion("baoqueName >=", value, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameLessThan(String value) {
            addCriterion("baoqueName <", value, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameLessThanOrEqualTo(String value) {
            addCriterion("baoqueName <=", value, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameLike(String value) {
            addCriterion("baoqueName like", value, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameNotLike(String value) {
            addCriterion("baoqueName not like", value, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameIn(List<String> values) {
            addCriterion("baoqueName in", values, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameNotIn(List<String> values) {
            addCriterion("baoqueName not in", values, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameBetween(String value1, String value2) {
            addCriterion("baoqueName between", value1, value2, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenameNotBetween(String value1, String value2) {
            addCriterion("baoqueName not between", value1, value2, "baoquename");
            return (Criteria) this;
        }

        public Criteria andBaoquenumIsNull() {
            addCriterion("baoqueNum is null");
            return (Criteria) this;
        }

        public Criteria andBaoquenumIsNotNull() {
            addCriterion("baoqueNum is not null");
            return (Criteria) this;
        }

        public Criteria andBaoquenumEqualTo(Integer value) {
            addCriterion("baoqueNum =", value, "baoquenum");
            return (Criteria) this;
        }

        public Criteria andBaoquenumNotEqualTo(Integer value) {
            addCriterion("baoqueNum <>", value, "baoquenum");
            return (Criteria) this;
        }

        public Criteria andBaoquenumGreaterThan(Integer value) {
            addCriterion("baoqueNum >", value, "baoquenum");
            return (Criteria) this;
        }

        public Criteria andBaoquenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("baoqueNum >=", value, "baoquenum");
            return (Criteria) this;
        }

        public Criteria andBaoquenumLessThan(Integer value) {
            addCriterion("baoqueNum <", value, "baoquenum");
            return (Criteria) this;
        }

        public Criteria andBaoquenumLessThanOrEqualTo(Integer value) {
            addCriterion("baoqueNum <=", value, "baoquenum");
            return (Criteria) this;
        }

        public Criteria andBaoquenumIn(List<Integer> values) {
            addCriterion("baoqueNum in", values, "baoquenum");
            return (Criteria) this;
        }

        public Criteria andBaoquenumNotIn(List<Integer> values) {
            addCriterion("baoqueNum not in", values, "baoquenum");
            return (Criteria) this;
        }

        public Criteria andBaoquenumBetween(Integer value1, Integer value2) {
            addCriterion("baoqueNum between", value1, value2, "baoquenum");
            return (Criteria) this;
        }

        public Criteria andBaoquenumNotBetween(Integer value1, Integer value2) {
            addCriterion("baoqueNum not between", value1, value2, "baoquenum");
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