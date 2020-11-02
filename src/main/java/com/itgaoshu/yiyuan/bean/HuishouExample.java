package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.List;

public class HuishouExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HuishouExample() {
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

        public Criteria andHuishouidIsNull() {
            addCriterion("huishouid is null");
            return (Criteria) this;
        }

        public Criteria andHuishouidIsNotNull() {
            addCriterion("huishouid is not null");
            return (Criteria) this;
        }

        public Criteria andHuishouidEqualTo(Integer value) {
            addCriterion("huishouid =", value, "huishouid");
            return (Criteria) this;
        }

        public Criteria andHuishouidNotEqualTo(Integer value) {
            addCriterion("huishouid <>", value, "huishouid");
            return (Criteria) this;
        }

        public Criteria andHuishouidGreaterThan(Integer value) {
            addCriterion("huishouid >", value, "huishouid");
            return (Criteria) this;
        }

        public Criteria andHuishouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("huishouid >=", value, "huishouid");
            return (Criteria) this;
        }

        public Criteria andHuishouidLessThan(Integer value) {
            addCriterion("huishouid <", value, "huishouid");
            return (Criteria) this;
        }

        public Criteria andHuishouidLessThanOrEqualTo(Integer value) {
            addCriterion("huishouid <=", value, "huishouid");
            return (Criteria) this;
        }

        public Criteria andHuishouidIn(List<Integer> values) {
            addCriterion("huishouid in", values, "huishouid");
            return (Criteria) this;
        }

        public Criteria andHuishouidNotIn(List<Integer> values) {
            addCriterion("huishouid not in", values, "huishouid");
            return (Criteria) this;
        }

        public Criteria andHuishouidBetween(Integer value1, Integer value2) {
            addCriterion("huishouid between", value1, value2, "huishouid");
            return (Criteria) this;
        }

        public Criteria andHuishouidNotBetween(Integer value1, Integer value2) {
            addCriterion("huishouid not between", value1, value2, "huishouid");
            return (Criteria) this;
        }

        public Criteria andHuishounameIsNull() {
            addCriterion("huishouname is null");
            return (Criteria) this;
        }

        public Criteria andHuishounameIsNotNull() {
            addCriterion("huishouname is not null");
            return (Criteria) this;
        }

        public Criteria andHuishounameEqualTo(String value) {
            addCriterion("huishouname =", value, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameNotEqualTo(String value) {
            addCriterion("huishouname <>", value, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameGreaterThan(String value) {
            addCriterion("huishouname >", value, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameGreaterThanOrEqualTo(String value) {
            addCriterion("huishouname >=", value, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameLessThan(String value) {
            addCriterion("huishouname <", value, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameLessThanOrEqualTo(String value) {
            addCriterion("huishouname <=", value, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameLike(String value) {
            addCriterion("huishouname like", value, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameNotLike(String value) {
            addCriterion("huishouname not like", value, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameIn(List<String> values) {
            addCriterion("huishouname in", values, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameNotIn(List<String> values) {
            addCriterion("huishouname not in", values, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameBetween(String value1, String value2) {
            addCriterion("huishouname between", value1, value2, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounameNotBetween(String value1, String value2) {
            addCriterion("huishouname not between", value1, value2, "huishouname");
            return (Criteria) this;
        }

        public Criteria andHuishounumberIsNull() {
            addCriterion("huishounumber is null");
            return (Criteria) this;
        }

        public Criteria andHuishounumberIsNotNull() {
            addCriterion("huishounumber is not null");
            return (Criteria) this;
        }

        public Criteria andHuishounumberEqualTo(Integer value) {
            addCriterion("huishounumber =", value, "huishounumber");
            return (Criteria) this;
        }

        public Criteria andHuishounumberNotEqualTo(Integer value) {
            addCriterion("huishounumber <>", value, "huishounumber");
            return (Criteria) this;
        }

        public Criteria andHuishounumberGreaterThan(Integer value) {
            addCriterion("huishounumber >", value, "huishounumber");
            return (Criteria) this;
        }

        public Criteria andHuishounumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("huishounumber >=", value, "huishounumber");
            return (Criteria) this;
        }

        public Criteria andHuishounumberLessThan(Integer value) {
            addCriterion("huishounumber <", value, "huishounumber");
            return (Criteria) this;
        }

        public Criteria andHuishounumberLessThanOrEqualTo(Integer value) {
            addCriterion("huishounumber <=", value, "huishounumber");
            return (Criteria) this;
        }

        public Criteria andHuishounumberIn(List<Integer> values) {
            addCriterion("huishounumber in", values, "huishounumber");
            return (Criteria) this;
        }

        public Criteria andHuishounumberNotIn(List<Integer> values) {
            addCriterion("huishounumber not in", values, "huishounumber");
            return (Criteria) this;
        }

        public Criteria andHuishounumberBetween(Integer value1, Integer value2) {
            addCriterion("huishounumber between", value1, value2, "huishounumber");
            return (Criteria) this;
        }

        public Criteria andHuishounumberNotBetween(Integer value1, Integer value2) {
            addCriterion("huishounumber not between", value1, value2, "huishounumber");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoIsNull() {
            addCriterion("huishoupihao is null");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoIsNotNull() {
            addCriterion("huishoupihao is not null");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoEqualTo(String value) {
            addCriterion("huishoupihao =", value, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoNotEqualTo(String value) {
            addCriterion("huishoupihao <>", value, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoGreaterThan(String value) {
            addCriterion("huishoupihao >", value, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoGreaterThanOrEqualTo(String value) {
            addCriterion("huishoupihao >=", value, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoLessThan(String value) {
            addCriterion("huishoupihao <", value, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoLessThanOrEqualTo(String value) {
            addCriterion("huishoupihao <=", value, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoLike(String value) {
            addCriterion("huishoupihao like", value, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoNotLike(String value) {
            addCriterion("huishoupihao not like", value, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoIn(List<String> values) {
            addCriterion("huishoupihao in", values, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoNotIn(List<String> values) {
            addCriterion("huishoupihao not in", values, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoBetween(String value1, String value2) {
            addCriterion("huishoupihao between", value1, value2, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andHuishoupihaoNotBetween(String value1, String value2) {
            addCriterion("huishoupihao not between", value1, value2, "huishoupihao");
            return (Criteria) this;
        }

        public Criteria andJbrIsNull() {
            addCriterion("jbr is null");
            return (Criteria) this;
        }

        public Criteria andJbrIsNotNull() {
            addCriterion("jbr is not null");
            return (Criteria) this;
        }

        public Criteria andJbrEqualTo(String value) {
            addCriterion("jbr =", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotEqualTo(String value) {
            addCriterion("jbr <>", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrGreaterThan(String value) {
            addCriterion("jbr >", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrGreaterThanOrEqualTo(String value) {
            addCriterion("jbr >=", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLessThan(String value) {
            addCriterion("jbr <", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLessThanOrEqualTo(String value) {
            addCriterion("jbr <=", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrLike(String value) {
            addCriterion("jbr like", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotLike(String value) {
            addCriterion("jbr not like", value, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrIn(List<String> values) {
            addCriterion("jbr in", values, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotIn(List<String> values) {
            addCriterion("jbr not in", values, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrBetween(String value1, String value2) {
            addCriterion("jbr between", value1, value2, "jbr");
            return (Criteria) this;
        }

        public Criteria andJbrNotBetween(String value1, String value2) {
            addCriterion("jbr not between", value1, value2, "jbr");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
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