package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.List;

public class PaibanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaibanExample() {
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

        public Criteria andPaiidIsNull() {
            addCriterion("paiId is null");
            return (Criteria) this;
        }

        public Criteria andPaiidIsNotNull() {
            addCriterion("paiId is not null");
            return (Criteria) this;
        }

        public Criteria andPaiidEqualTo(Integer value) {
            addCriterion("paiId =", value, "paiid");
            return (Criteria) this;
        }

        public Criteria andPaiidNotEqualTo(Integer value) {
            addCriterion("paiId <>", value, "paiid");
            return (Criteria) this;
        }

        public Criteria andPaiidGreaterThan(Integer value) {
            addCriterion("paiId >", value, "paiid");
            return (Criteria) this;
        }

        public Criteria andPaiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paiId >=", value, "paiid");
            return (Criteria) this;
        }

        public Criteria andPaiidLessThan(Integer value) {
            addCriterion("paiId <", value, "paiid");
            return (Criteria) this;
        }

        public Criteria andPaiidLessThanOrEqualTo(Integer value) {
            addCriterion("paiId <=", value, "paiid");
            return (Criteria) this;
        }

        public Criteria andPaiidIn(List<Integer> values) {
            addCriterion("paiId in", values, "paiid");
            return (Criteria) this;
        }

        public Criteria andPaiidNotIn(List<Integer> values) {
            addCriterion("paiId not in", values, "paiid");
            return (Criteria) this;
        }

        public Criteria andPaiidBetween(Integer value1, Integer value2) {
            addCriterion("paiId between", value1, value2, "paiid");
            return (Criteria) this;
        }

        public Criteria andPaiidNotBetween(Integer value1, Integer value2) {
            addCriterion("paiId not between", value1, value2, "paiid");
            return (Criteria) this;
        }

        public Criteria andOneIsNull() {
            addCriterion("one is null");
            return (Criteria) this;
        }

        public Criteria andOneIsNotNull() {
            addCriterion("one is not null");
            return (Criteria) this;
        }

        public Criteria andOneEqualTo(String value) {
            addCriterion("one =", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneNotEqualTo(String value) {
            addCriterion("one <>", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneGreaterThan(String value) {
            addCriterion("one >", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneGreaterThanOrEqualTo(String value) {
            addCriterion("one >=", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneLessThan(String value) {
            addCriterion("one <", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneLessThanOrEqualTo(String value) {
            addCriterion("one <=", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneLike(String value) {
            addCriterion("one like", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneNotLike(String value) {
            addCriterion("one not like", value, "one");
            return (Criteria) this;
        }

        public Criteria andOneIn(List<String> values) {
            addCriterion("one in", values, "one");
            return (Criteria) this;
        }

        public Criteria andOneNotIn(List<String> values) {
            addCriterion("one not in", values, "one");
            return (Criteria) this;
        }

        public Criteria andOneBetween(String value1, String value2) {
            addCriterion("one between", value1, value2, "one");
            return (Criteria) this;
        }

        public Criteria andOneNotBetween(String value1, String value2) {
            addCriterion("one not between", value1, value2, "one");
            return (Criteria) this;
        }

        public Criteria andTwoIsNull() {
            addCriterion("two is null");
            return (Criteria) this;
        }

        public Criteria andTwoIsNotNull() {
            addCriterion("two is not null");
            return (Criteria) this;
        }

        public Criteria andTwoEqualTo(String value) {
            addCriterion("two =", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoNotEqualTo(String value) {
            addCriterion("two <>", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoGreaterThan(String value) {
            addCriterion("two >", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoGreaterThanOrEqualTo(String value) {
            addCriterion("two >=", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoLessThan(String value) {
            addCriterion("two <", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoLessThanOrEqualTo(String value) {
            addCriterion("two <=", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoLike(String value) {
            addCriterion("two like", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoNotLike(String value) {
            addCriterion("two not like", value, "two");
            return (Criteria) this;
        }

        public Criteria andTwoIn(List<String> values) {
            addCriterion("two in", values, "two");
            return (Criteria) this;
        }

        public Criteria andTwoNotIn(List<String> values) {
            addCriterion("two not in", values, "two");
            return (Criteria) this;
        }

        public Criteria andTwoBetween(String value1, String value2) {
            addCriterion("two between", value1, value2, "two");
            return (Criteria) this;
        }

        public Criteria andTwoNotBetween(String value1, String value2) {
            addCriterion("two not between", value1, value2, "two");
            return (Criteria) this;
        }

        public Criteria andThreeIsNull() {
            addCriterion("three is null");
            return (Criteria) this;
        }

        public Criteria andThreeIsNotNull() {
            addCriterion("three is not null");
            return (Criteria) this;
        }

        public Criteria andThreeEqualTo(String value) {
            addCriterion("three =", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotEqualTo(String value) {
            addCriterion("three <>", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeGreaterThan(String value) {
            addCriterion("three >", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeGreaterThanOrEqualTo(String value) {
            addCriterion("three >=", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeLessThan(String value) {
            addCriterion("three <", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeLessThanOrEqualTo(String value) {
            addCriterion("three <=", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeLike(String value) {
            addCriterion("three like", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotLike(String value) {
            addCriterion("three not like", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeIn(List<String> values) {
            addCriterion("three in", values, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotIn(List<String> values) {
            addCriterion("three not in", values, "three");
            return (Criteria) this;
        }

        public Criteria andThreeBetween(String value1, String value2) {
            addCriterion("three between", value1, value2, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotBetween(String value1, String value2) {
            addCriterion("three not between", value1, value2, "three");
            return (Criteria) this;
        }

        public Criteria andFourIsNull() {
            addCriterion("four is null");
            return (Criteria) this;
        }

        public Criteria andFourIsNotNull() {
            addCriterion("four is not null");
            return (Criteria) this;
        }

        public Criteria andFourEqualTo(String value) {
            addCriterion("four =", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourNotEqualTo(String value) {
            addCriterion("four <>", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourGreaterThan(String value) {
            addCriterion("four >", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourGreaterThanOrEqualTo(String value) {
            addCriterion("four >=", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourLessThan(String value) {
            addCriterion("four <", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourLessThanOrEqualTo(String value) {
            addCriterion("four <=", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourLike(String value) {
            addCriterion("four like", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourNotLike(String value) {
            addCriterion("four not like", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourIn(List<String> values) {
            addCriterion("four in", values, "four");
            return (Criteria) this;
        }

        public Criteria andFourNotIn(List<String> values) {
            addCriterion("four not in", values, "four");
            return (Criteria) this;
        }

        public Criteria andFourBetween(String value1, String value2) {
            addCriterion("four between", value1, value2, "four");
            return (Criteria) this;
        }

        public Criteria andFourNotBetween(String value1, String value2) {
            addCriterion("four not between", value1, value2, "four");
            return (Criteria) this;
        }

        public Criteria andFiveIsNull() {
            addCriterion("five is null");
            return (Criteria) this;
        }

        public Criteria andFiveIsNotNull() {
            addCriterion("five is not null");
            return (Criteria) this;
        }

        public Criteria andFiveEqualTo(String value) {
            addCriterion("five =", value, "five");
            return (Criteria) this;
        }

        public Criteria andFiveNotEqualTo(String value) {
            addCriterion("five <>", value, "five");
            return (Criteria) this;
        }

        public Criteria andFiveGreaterThan(String value) {
            addCriterion("five >", value, "five");
            return (Criteria) this;
        }

        public Criteria andFiveGreaterThanOrEqualTo(String value) {
            addCriterion("five >=", value, "five");
            return (Criteria) this;
        }

        public Criteria andFiveLessThan(String value) {
            addCriterion("five <", value, "five");
            return (Criteria) this;
        }

        public Criteria andFiveLessThanOrEqualTo(String value) {
            addCriterion("five <=", value, "five");
            return (Criteria) this;
        }

        public Criteria andFiveLike(String value) {
            addCriterion("five like", value, "five");
            return (Criteria) this;
        }

        public Criteria andFiveNotLike(String value) {
            addCriterion("five not like", value, "five");
            return (Criteria) this;
        }

        public Criteria andFiveIn(List<String> values) {
            addCriterion("five in", values, "five");
            return (Criteria) this;
        }

        public Criteria andFiveNotIn(List<String> values) {
            addCriterion("five not in", values, "five");
            return (Criteria) this;
        }

        public Criteria andFiveBetween(String value1, String value2) {
            addCriterion("five between", value1, value2, "five");
            return (Criteria) this;
        }

        public Criteria andFiveNotBetween(String value1, String value2) {
            addCriterion("five not between", value1, value2, "five");
            return (Criteria) this;
        }

        public Criteria andSixIsNull() {
            addCriterion("six is null");
            return (Criteria) this;
        }

        public Criteria andSixIsNotNull() {
            addCriterion("six is not null");
            return (Criteria) this;
        }

        public Criteria andSixEqualTo(String value) {
            addCriterion("six =", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotEqualTo(String value) {
            addCriterion("six <>", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixGreaterThan(String value) {
            addCriterion("six >", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixGreaterThanOrEqualTo(String value) {
            addCriterion("six >=", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLessThan(String value) {
            addCriterion("six <", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLessThanOrEqualTo(String value) {
            addCriterion("six <=", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixLike(String value) {
            addCriterion("six like", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotLike(String value) {
            addCriterion("six not like", value, "six");
            return (Criteria) this;
        }

        public Criteria andSixIn(List<String> values) {
            addCriterion("six in", values, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotIn(List<String> values) {
            addCriterion("six not in", values, "six");
            return (Criteria) this;
        }

        public Criteria andSixBetween(String value1, String value2) {
            addCriterion("six between", value1, value2, "six");
            return (Criteria) this;
        }

        public Criteria andSixNotBetween(String value1, String value2) {
            addCriterion("six not between", value1, value2, "six");
            return (Criteria) this;
        }

        public Criteria andSevenIsNull() {
            addCriterion("seven is null");
            return (Criteria) this;
        }

        public Criteria andSevenIsNotNull() {
            addCriterion("seven is not null");
            return (Criteria) this;
        }

        public Criteria andSevenEqualTo(String value) {
            addCriterion("seven =", value, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenNotEqualTo(String value) {
            addCriterion("seven <>", value, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenGreaterThan(String value) {
            addCriterion("seven >", value, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenGreaterThanOrEqualTo(String value) {
            addCriterion("seven >=", value, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenLessThan(String value) {
            addCriterion("seven <", value, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenLessThanOrEqualTo(String value) {
            addCriterion("seven <=", value, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenLike(String value) {
            addCriterion("seven like", value, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenNotLike(String value) {
            addCriterion("seven not like", value, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenIn(List<String> values) {
            addCriterion("seven in", values, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenNotIn(List<String> values) {
            addCriterion("seven not in", values, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenBetween(String value1, String value2) {
            addCriterion("seven between", value1, value2, "seven");
            return (Criteria) this;
        }

        public Criteria andSevenNotBetween(String value1, String value2) {
            addCriterion("seven not between", value1, value2, "seven");
            return (Criteria) this;
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