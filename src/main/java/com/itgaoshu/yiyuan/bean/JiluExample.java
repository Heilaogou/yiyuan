package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JiluExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiluExample() {
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

        public Criteria andJiluidIsNull() {
            addCriterion("jiluid is null");
            return (Criteria) this;
        }

        public Criteria andJiluidIsNotNull() {
            addCriterion("jiluid is not null");
            return (Criteria) this;
        }

        public Criteria andJiluidEqualTo(Integer value) {
            addCriterion("jiluid =", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidNotEqualTo(Integer value) {
            addCriterion("jiluid <>", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidGreaterThan(Integer value) {
            addCriterion("jiluid >", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiluid >=", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidLessThan(Integer value) {
            addCriterion("jiluid <", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidLessThanOrEqualTo(Integer value) {
            addCriterion("jiluid <=", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidIn(List<Integer> values) {
            addCriterion("jiluid in", values, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidNotIn(List<Integer> values) {
            addCriterion("jiluid not in", values, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidBetween(Integer value1, Integer value2) {
            addCriterion("jiluid between", value1, value2, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidNotBetween(Integer value1, Integer value2) {
            addCriterion("jiluid not between", value1, value2, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJilunameIsNull() {
            addCriterion("jiluname is null");
            return (Criteria) this;
        }

        public Criteria andJilunameIsNotNull() {
            addCriterion("jiluname is not null");
            return (Criteria) this;
        }

        public Criteria andJilunameEqualTo(String value) {
            addCriterion("jiluname =", value, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameNotEqualTo(String value) {
            addCriterion("jiluname <>", value, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameGreaterThan(String value) {
            addCriterion("jiluname >", value, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameGreaterThanOrEqualTo(String value) {
            addCriterion("jiluname >=", value, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameLessThan(String value) {
            addCriterion("jiluname <", value, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameLessThanOrEqualTo(String value) {
            addCriterion("jiluname <=", value, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameLike(String value) {
            addCriterion("jiluname like", value, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameNotLike(String value) {
            addCriterion("jiluname not like", value, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameIn(List<String> values) {
            addCriterion("jiluname in", values, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameNotIn(List<String> values) {
            addCriterion("jiluname not in", values, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameBetween(String value1, String value2) {
            addCriterion("jiluname between", value1, value2, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilunameNotBetween(String value1, String value2) {
            addCriterion("jiluname not between", value1, value2, "jiluname");
            return (Criteria) this;
        }

        public Criteria andJilutimeIsNull() {
            addCriterion("jilutime is null");
            return (Criteria) this;
        }

        public Criteria andJilutimeIsNotNull() {
            addCriterion("jilutime is not null");
            return (Criteria) this;
        }

        public Criteria andJilutimeEqualTo(Date value) {
            addCriterion("jilutime =", value, "jilutime");
            return (Criteria) this;
        }

        public Criteria andJilutimeNotEqualTo(Date value) {
            addCriterion("jilutime <>", value, "jilutime");
            return (Criteria) this;
        }

        public Criteria andJilutimeGreaterThan(Date value) {
            addCriterion("jilutime >", value, "jilutime");
            return (Criteria) this;
        }

        public Criteria andJilutimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jilutime >=", value, "jilutime");
            return (Criteria) this;
        }

        public Criteria andJilutimeLessThan(Date value) {
            addCriterion("jilutime <", value, "jilutime");
            return (Criteria) this;
        }

        public Criteria andJilutimeLessThanOrEqualTo(Date value) {
            addCriterion("jilutime <=", value, "jilutime");
            return (Criteria) this;
        }

        public Criteria andJilutimeIn(List<Date> values) {
            addCriterion("jilutime in", values, "jilutime");
            return (Criteria) this;
        }

        public Criteria andJilutimeNotIn(List<Date> values) {
            addCriterion("jilutime not in", values, "jilutime");
            return (Criteria) this;
        }

        public Criteria andJilutimeBetween(Date value1, Date value2) {
            addCriterion("jilutime between", value1, value2, "jilutime");
            return (Criteria) this;
        }

        public Criteria andJilutimeNotBetween(Date value1, Date value2) {
            addCriterion("jilutime not between", value1, value2, "jilutime");
            return (Criteria) this;
        }

        public Criteria andJilutypeIsNull() {
            addCriterion("jilutype is null");
            return (Criteria) this;
        }

        public Criteria andJilutypeIsNotNull() {
            addCriterion("jilutype is not null");
            return (Criteria) this;
        }

        public Criteria andJilutypeEqualTo(String value) {
            addCriterion("jilutype =", value, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeNotEqualTo(String value) {
            addCriterion("jilutype <>", value, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeGreaterThan(String value) {
            addCriterion("jilutype >", value, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeGreaterThanOrEqualTo(String value) {
            addCriterion("jilutype >=", value, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeLessThan(String value) {
            addCriterion("jilutype <", value, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeLessThanOrEqualTo(String value) {
            addCriterion("jilutype <=", value, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeLike(String value) {
            addCriterion("jilutype like", value, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeNotLike(String value) {
            addCriterion("jilutype not like", value, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeIn(List<String> values) {
            addCriterion("jilutype in", values, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeNotIn(List<String> values) {
            addCriterion("jilutype not in", values, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeBetween(String value1, String value2) {
            addCriterion("jilutype between", value1, value2, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilutypeNotBetween(String value1, String value2) {
            addCriterion("jilutype not between", value1, value2, "jilutype");
            return (Criteria) this;
        }

        public Criteria andJilupeopleIsNull() {
            addCriterion("jilupeople is null");
            return (Criteria) this;
        }

        public Criteria andJilupeopleIsNotNull() {
            addCriterion("jilupeople is not null");
            return (Criteria) this;
        }

        public Criteria andJilupeopleEqualTo(String value) {
            addCriterion("jilupeople =", value, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleNotEqualTo(String value) {
            addCriterion("jilupeople <>", value, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleGreaterThan(String value) {
            addCriterion("jilupeople >", value, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleGreaterThanOrEqualTo(String value) {
            addCriterion("jilupeople >=", value, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleLessThan(String value) {
            addCriterion("jilupeople <", value, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleLessThanOrEqualTo(String value) {
            addCriterion("jilupeople <=", value, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleLike(String value) {
            addCriterion("jilupeople like", value, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleNotLike(String value) {
            addCriterion("jilupeople not like", value, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleIn(List<String> values) {
            addCriterion("jilupeople in", values, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleNotIn(List<String> values) {
            addCriterion("jilupeople not in", values, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleBetween(String value1, String value2) {
            addCriterion("jilupeople between", value1, value2, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilupeopleNotBetween(String value1, String value2) {
            addCriterion("jilupeople not between", value1, value2, "jilupeople");
            return (Criteria) this;
        }

        public Criteria andJilunumberIsNull() {
            addCriterion("jilunumber is null");
            return (Criteria) this;
        }

        public Criteria andJilunumberIsNotNull() {
            addCriterion("jilunumber is not null");
            return (Criteria) this;
        }

        public Criteria andJilunumberEqualTo(Integer value) {
            addCriterion("jilunumber =", value, "jilunumber");
            return (Criteria) this;
        }

        public Criteria andJilunumberNotEqualTo(Integer value) {
            addCriterion("jilunumber <>", value, "jilunumber");
            return (Criteria) this;
        }

        public Criteria andJilunumberGreaterThan(Integer value) {
            addCriterion("jilunumber >", value, "jilunumber");
            return (Criteria) this;
        }

        public Criteria andJilunumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("jilunumber >=", value, "jilunumber");
            return (Criteria) this;
        }

        public Criteria andJilunumberLessThan(Integer value) {
            addCriterion("jilunumber <", value, "jilunumber");
            return (Criteria) this;
        }

        public Criteria andJilunumberLessThanOrEqualTo(Integer value) {
            addCriterion("jilunumber <=", value, "jilunumber");
            return (Criteria) this;
        }

        public Criteria andJilunumberIn(List<Integer> values) {
            addCriterion("jilunumber in", values, "jilunumber");
            return (Criteria) this;
        }

        public Criteria andJilunumberNotIn(List<Integer> values) {
            addCriterion("jilunumber not in", values, "jilunumber");
            return (Criteria) this;
        }

        public Criteria andJilunumberBetween(Integer value1, Integer value2) {
            addCriterion("jilunumber between", value1, value2, "jilunumber");
            return (Criteria) this;
        }

        public Criteria andJilunumberNotBetween(Integer value1, Integer value2) {
            addCriterion("jilunumber not between", value1, value2, "jilunumber");
            return (Criteria) this;
        }

        public Criteria andJilupihaoIsNull() {
            addCriterion("jilupihao is null");
            return (Criteria) this;
        }

        public Criteria andJilupihaoIsNotNull() {
            addCriterion("jilupihao is not null");
            return (Criteria) this;
        }

        public Criteria andJilupihaoEqualTo(String value) {
            addCriterion("jilupihao =", value, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoNotEqualTo(String value) {
            addCriterion("jilupihao <>", value, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoGreaterThan(String value) {
            addCriterion("jilupihao >", value, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoGreaterThanOrEqualTo(String value) {
            addCriterion("jilupihao >=", value, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoLessThan(String value) {
            addCriterion("jilupihao <", value, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoLessThanOrEqualTo(String value) {
            addCriterion("jilupihao <=", value, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoLike(String value) {
            addCriterion("jilupihao like", value, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoNotLike(String value) {
            addCriterion("jilupihao not like", value, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoIn(List<String> values) {
            addCriterion("jilupihao in", values, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoNotIn(List<String> values) {
            addCriterion("jilupihao not in", values, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoBetween(String value1, String value2) {
            addCriterion("jilupihao between", value1, value2, "jilupihao");
            return (Criteria) this;
        }

        public Criteria andJilupihaoNotBetween(String value1, String value2) {
            addCriterion("jilupihao not between", value1, value2, "jilupihao");
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