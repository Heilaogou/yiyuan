package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.List;

public class CaigouExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaigouExample() {
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

        public Criteria andCaigouidIsNull() {
            addCriterion("caigouid is null");
            return (Criteria) this;
        }

        public Criteria andCaigouidIsNotNull() {
            addCriterion("caigouid is not null");
            return (Criteria) this;
        }

        public Criteria andCaigouidEqualTo(Integer value) {
            addCriterion("caigouid =", value, "caigouid");
            return (Criteria) this;
        }

        public Criteria andCaigouidNotEqualTo(Integer value) {
            addCriterion("caigouid <>", value, "caigouid");
            return (Criteria) this;
        }

        public Criteria andCaigouidGreaterThan(Integer value) {
            addCriterion("caigouid >", value, "caigouid");
            return (Criteria) this;
        }

        public Criteria andCaigouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("caigouid >=", value, "caigouid");
            return (Criteria) this;
        }

        public Criteria andCaigouidLessThan(Integer value) {
            addCriterion("caigouid <", value, "caigouid");
            return (Criteria) this;
        }

        public Criteria andCaigouidLessThanOrEqualTo(Integer value) {
            addCriterion("caigouid <=", value, "caigouid");
            return (Criteria) this;
        }

        public Criteria andCaigouidIn(List<Integer> values) {
            addCriterion("caigouid in", values, "caigouid");
            return (Criteria) this;
        }

        public Criteria andCaigouidNotIn(List<Integer> values) {
            addCriterion("caigouid not in", values, "caigouid");
            return (Criteria) this;
        }

        public Criteria andCaigouidBetween(Integer value1, Integer value2) {
            addCriterion("caigouid between", value1, value2, "caigouid");
            return (Criteria) this;
        }

        public Criteria andCaigouidNotBetween(Integer value1, Integer value2) {
            addCriterion("caigouid not between", value1, value2, "caigouid");
            return (Criteria) this;
        }

        public Criteria andCaigounameIsNull() {
            addCriterion("caigouname is null");
            return (Criteria) this;
        }

        public Criteria andCaigounameIsNotNull() {
            addCriterion("caigouname is not null");
            return (Criteria) this;
        }

        public Criteria andCaigounameEqualTo(String value) {
            addCriterion("caigouname =", value, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameNotEqualTo(String value) {
            addCriterion("caigouname <>", value, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameGreaterThan(String value) {
            addCriterion("caigouname >", value, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameGreaterThanOrEqualTo(String value) {
            addCriterion("caigouname >=", value, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameLessThan(String value) {
            addCriterion("caigouname <", value, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameLessThanOrEqualTo(String value) {
            addCriterion("caigouname <=", value, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameLike(String value) {
            addCriterion("caigouname like", value, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameNotLike(String value) {
            addCriterion("caigouname not like", value, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameIn(List<String> values) {
            addCriterion("caigouname in", values, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameNotIn(List<String> values) {
            addCriterion("caigouname not in", values, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameBetween(String value1, String value2) {
            addCriterion("caigouname between", value1, value2, "caigouname");
            return (Criteria) this;
        }

        public Criteria andCaigounameNotBetween(String value1, String value2) {
            addCriterion("caigouname not between", value1, value2, "caigouname");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangIsNull() {
            addCriterion("gonghuoshang is null");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangIsNotNull() {
            addCriterion("gonghuoshang is not null");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangEqualTo(String value) {
            addCriterion("gonghuoshang =", value, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangNotEqualTo(String value) {
            addCriterion("gonghuoshang <>", value, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangGreaterThan(String value) {
            addCriterion("gonghuoshang >", value, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangGreaterThanOrEqualTo(String value) {
            addCriterion("gonghuoshang >=", value, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangLessThan(String value) {
            addCriterion("gonghuoshang <", value, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangLessThanOrEqualTo(String value) {
            addCriterion("gonghuoshang <=", value, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangLike(String value) {
            addCriterion("gonghuoshang like", value, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangNotLike(String value) {
            addCriterion("gonghuoshang not like", value, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangIn(List<String> values) {
            addCriterion("gonghuoshang in", values, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangNotIn(List<String> values) {
            addCriterion("gonghuoshang not in", values, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangBetween(String value1, String value2) {
            addCriterion("gonghuoshang between", value1, value2, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andGonghuoshangNotBetween(String value1, String value2) {
            addCriterion("gonghuoshang not between", value1, value2, "gonghuoshang");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNull() {
            addCriterion("danwei is null");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNotNull() {
            addCriterion("danwei is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiEqualTo(String value) {
            addCriterion("danwei =", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotEqualTo(String value) {
            addCriterion("danwei <>", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThan(String value) {
            addCriterion("danwei >", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThanOrEqualTo(String value) {
            addCriterion("danwei >=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThan(String value) {
            addCriterion("danwei <", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThanOrEqualTo(String value) {
            addCriterion("danwei <=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLike(String value) {
            addCriterion("danwei like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotLike(String value) {
            addCriterion("danwei not like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiIn(List<String> values) {
            addCriterion("danwei in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotIn(List<String> values) {
            addCriterion("danwei not in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiBetween(String value1, String value2) {
            addCriterion("danwei between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotBetween(String value1, String value2) {
            addCriterion("danwei not between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andCandiIsNull() {
            addCriterion("candi is null");
            return (Criteria) this;
        }

        public Criteria andCandiIsNotNull() {
            addCriterion("candi is not null");
            return (Criteria) this;
        }

        public Criteria andCandiEqualTo(String value) {
            addCriterion("candi =", value, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiNotEqualTo(String value) {
            addCriterion("candi <>", value, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiGreaterThan(String value) {
            addCriterion("candi >", value, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiGreaterThanOrEqualTo(String value) {
            addCriterion("candi >=", value, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiLessThan(String value) {
            addCriterion("candi <", value, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiLessThanOrEqualTo(String value) {
            addCriterion("candi <=", value, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiLike(String value) {
            addCriterion("candi like", value, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiNotLike(String value) {
            addCriterion("candi not like", value, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiIn(List<String> values) {
            addCriterion("candi in", values, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiNotIn(List<String> values) {
            addCriterion("candi not in", values, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiBetween(String value1, String value2) {
            addCriterion("candi between", value1, value2, "candi");
            return (Criteria) this;
        }

        public Criteria andCandiNotBetween(String value1, String value2) {
            addCriterion("candi not between", value1, value2, "candi");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNull() {
            addCriterion("leixing is null");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNotNull() {
            addCriterion("leixing is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingEqualTo(String value) {
            addCriterion("leixing =", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotEqualTo(String value) {
            addCriterion("leixing <>", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThan(String value) {
            addCriterion("leixing >", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThanOrEqualTo(String value) {
            addCriterion("leixing >=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThan(String value) {
            addCriterion("leixing <", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThanOrEqualTo(String value) {
            addCriterion("leixing <=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLike(String value) {
            addCriterion("leixing like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotLike(String value) {
            addCriterion("leixing not like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingIn(List<String> values) {
            addCriterion("leixing in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotIn(List<String> values) {
            addCriterion("leixing not in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingBetween(String value1, String value2) {
            addCriterion("leixing between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotBetween(String value1, String value2) {
            addCriterion("leixing not between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andShuliangIsNull() {
            addCriterion("shuliang is null");
            return (Criteria) this;
        }

        public Criteria andShuliangIsNotNull() {
            addCriterion("shuliang is not null");
            return (Criteria) this;
        }

        public Criteria andShuliangEqualTo(Integer value) {
            addCriterion("shuliang =", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotEqualTo(Integer value) {
            addCriterion("shuliang <>", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangGreaterThan(Integer value) {
            addCriterion("shuliang >", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuliang >=", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLessThan(Integer value) {
            addCriterion("shuliang <", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangLessThanOrEqualTo(Integer value) {
            addCriterion("shuliang <=", value, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangIn(List<Integer> values) {
            addCriterion("shuliang in", values, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotIn(List<Integer> values) {
            addCriterion("shuliang not in", values, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangBetween(Integer value1, Integer value2) {
            addCriterion("shuliang between", value1, value2, "shuliang");
            return (Criteria) this;
        }

        public Criteria andShuliangNotBetween(Integer value1, Integer value2) {
            addCriterion("shuliang not between", value1, value2, "shuliang");
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