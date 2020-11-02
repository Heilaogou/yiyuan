package com.itgaoshu.yiyuan.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CashierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CashierExample() {
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

        public Criteria andCashierIsNull() {
            addCriterion("cashier is null");
            return (Criteria) this;
        }

        public Criteria andCashierIsNotNull() {
            addCriterion("cashier is not null");
            return (Criteria) this;
        }

        public Criteria andCashierEqualTo(Integer value) {
            addCriterion("cashier =", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotEqualTo(Integer value) {
            addCriterion("cashier <>", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierGreaterThan(Integer value) {
            addCriterion("cashier >", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierGreaterThanOrEqualTo(Integer value) {
            addCriterion("cashier >=", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLessThan(Integer value) {
            addCriterion("cashier <", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierLessThanOrEqualTo(Integer value) {
            addCriterion("cashier <=", value, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierIn(List<Integer> values) {
            addCriterion("cashier in", values, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotIn(List<Integer> values) {
            addCriterion("cashier not in", values, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierBetween(Integer value1, Integer value2) {
            addCriterion("cashier between", value1, value2, "cashier");
            return (Criteria) this;
        }

        public Criteria andCashierNotBetween(Integer value1, Integer value2) {
            addCriterion("cashier not between", value1, value2, "cashier");
            return (Criteria) this;
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

        public Criteria andDurgnameIsNull() {
            addCriterion("durgname is null");
            return (Criteria) this;
        }

        public Criteria andDurgnameIsNotNull() {
            addCriterion("durgname is not null");
            return (Criteria) this;
        }

        public Criteria andDurgnameEqualTo(String value) {
            addCriterion("durgname =", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotEqualTo(String value) {
            addCriterion("durgname <>", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameGreaterThan(String value) {
            addCriterion("durgname >", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameGreaterThanOrEqualTo(String value) {
            addCriterion("durgname >=", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameLessThan(String value) {
            addCriterion("durgname <", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameLessThanOrEqualTo(String value) {
            addCriterion("durgname <=", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameLike(String value) {
            addCriterion("durgname like", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotLike(String value) {
            addCriterion("durgname not like", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameIn(List<String> values) {
            addCriterion("durgname in", values, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotIn(List<String> values) {
            addCriterion("durgname not in", values, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameBetween(String value1, String value2) {
            addCriterion("durgname between", value1, value2, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotBetween(String value1, String value2) {
            addCriterion("durgname not between", value1, value2, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnumIsNull() {
            addCriterion("durgnum is null");
            return (Criteria) this;
        }

        public Criteria andDurgnumIsNotNull() {
            addCriterion("durgnum is not null");
            return (Criteria) this;
        }

        public Criteria andDurgnumEqualTo(Integer value) {
            addCriterion("durgnum =", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumNotEqualTo(Integer value) {
            addCriterion("durgnum <>", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumGreaterThan(Integer value) {
            addCriterion("durgnum >", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("durgnum >=", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumLessThan(Integer value) {
            addCriterion("durgnum <", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumLessThanOrEqualTo(Integer value) {
            addCriterion("durgnum <=", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumIn(List<Integer> values) {
            addCriterion("durgnum in", values, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumNotIn(List<Integer> values) {
            addCriterion("durgnum not in", values, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumBetween(Integer value1, Integer value2) {
            addCriterion("durgnum between", value1, value2, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumNotBetween(Integer value1, Integer value2) {
            addCriterion("durgnum not between", value1, value2, "durgnum");
            return (Criteria) this;
        }

        public Criteria andRepicepriceIsNull() {
            addCriterion("repiceprice is null");
            return (Criteria) this;
        }

        public Criteria andRepicepriceIsNotNull() {
            addCriterion("repiceprice is not null");
            return (Criteria) this;
        }

        public Criteria andRepicepriceEqualTo(Double value) {
            addCriterion("repiceprice =", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceNotEqualTo(Double value) {
            addCriterion("repiceprice <>", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceGreaterThan(Double value) {
            addCriterion("repiceprice >", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("repiceprice >=", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceLessThan(Double value) {
            addCriterion("repiceprice <", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceLessThanOrEqualTo(Double value) {
            addCriterion("repiceprice <=", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceIn(List<Double> values) {
            addCriterion("repiceprice in", values, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceNotIn(List<Double> values) {
            addCriterion("repiceprice not in", values, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceBetween(Double value1, Double value2) {
            addCriterion("repiceprice between", value1, value2, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceNotBetween(Double value1, Double value2) {
            addCriterion("repiceprice not between", value1, value2, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicetotalIsNull() {
            addCriterion("repicetotal is null");
            return (Criteria) this;
        }

        public Criteria andRepicetotalIsNotNull() {
            addCriterion("repicetotal is not null");
            return (Criteria) this;
        }

        public Criteria andRepicetotalEqualTo(Double value) {
            addCriterion("repicetotal =", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalNotEqualTo(Double value) {
            addCriterion("repicetotal <>", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalGreaterThan(Double value) {
            addCriterion("repicetotal >", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalGreaterThanOrEqualTo(Double value) {
            addCriterion("repicetotal >=", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalLessThan(Double value) {
            addCriterion("repicetotal <", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalLessThanOrEqualTo(Double value) {
            addCriterion("repicetotal <=", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalIn(List<Double> values) {
            addCriterion("repicetotal in", values, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalNotIn(List<Double> values) {
            addCriterion("repicetotal not in", values, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalBetween(Double value1, Double value2) {
            addCriterion("repicetotal between", value1, value2, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalNotBetween(Double value1, Double value2) {
            addCriterion("repicetotal not between", value1, value2, "repicetotal");
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

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterionForJDBCDate("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andOstateIsNull() {
            addCriterion("ostate is null");
            return (Criteria) this;
        }

        public Criteria andOstateIsNotNull() {
            addCriterion("ostate is not null");
            return (Criteria) this;
        }

        public Criteria andOstateEqualTo(Integer value) {
            addCriterion("ostate =", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotEqualTo(Integer value) {
            addCriterion("ostate <>", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateGreaterThan(Integer value) {
            addCriterion("ostate >", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ostate >=", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateLessThan(Integer value) {
            addCriterion("ostate <", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateLessThanOrEqualTo(Integer value) {
            addCriterion("ostate <=", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateIn(List<Integer> values) {
            addCriterion("ostate in", values, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotIn(List<Integer> values) {
            addCriterion("ostate not in", values, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateBetween(Integer value1, Integer value2) {
            addCriterion("ostate between", value1, value2, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ostate not between", value1, value2, "ostate");
            return (Criteria) this;
        }

        public Criteria andJieIsNull() {
            addCriterion("jie is null");
            return (Criteria) this;
        }

        public Criteria andJieIsNotNull() {
            addCriterion("jie is not null");
            return (Criteria) this;
        }

        public Criteria andJieEqualTo(String value) {
            addCriterion("jie =", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieNotEqualTo(String value) {
            addCriterion("jie <>", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieGreaterThan(String value) {
            addCriterion("jie >", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieGreaterThanOrEqualTo(String value) {
            addCriterion("jie >=", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieLessThan(String value) {
            addCriterion("jie <", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieLessThanOrEqualTo(String value) {
            addCriterion("jie <=", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieLike(String value) {
            addCriterion("jie like", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieNotLike(String value) {
            addCriterion("jie not like", value, "jie");
            return (Criteria) this;
        }

        public Criteria andJieIn(List<String> values) {
            addCriterion("jie in", values, "jie");
            return (Criteria) this;
        }

        public Criteria andJieNotIn(List<String> values) {
            addCriterion("jie not in", values, "jie");
            return (Criteria) this;
        }

        public Criteria andJieBetween(String value1, String value2) {
            addCriterion("jie between", value1, value2, "jie");
            return (Criteria) this;
        }

        public Criteria andJieNotBetween(String value1, String value2) {
            addCriterion("jie not between", value1, value2, "jie");
            return (Criteria) this;
        }

        public Criteria andMstateIsNull() {
            addCriterion("mstate is null");
            return (Criteria) this;
        }

        public Criteria andMstateIsNotNull() {
            addCriterion("mstate is not null");
            return (Criteria) this;
        }

        public Criteria andMstateEqualTo(Integer value) {
            addCriterion("mstate =", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotEqualTo(Integer value) {
            addCriterion("mstate <>", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThan(Integer value) {
            addCriterion("mstate >", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("mstate >=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThan(Integer value) {
            addCriterion("mstate <", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateLessThanOrEqualTo(Integer value) {
            addCriterion("mstate <=", value, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateIn(List<Integer> values) {
            addCriterion("mstate in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotIn(List<Integer> values) {
            addCriterion("mstate not in", values, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateBetween(Integer value1, Integer value2) {
            addCriterion("mstate between", value1, value2, "mstate");
            return (Criteria) this;
        }

        public Criteria andMstateNotBetween(Integer value1, Integer value2) {
            addCriterion("mstate not between", value1, value2, "mstate");
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