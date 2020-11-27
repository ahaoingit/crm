package com.brainyi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNull() {
            addCriterion("m_type is null");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNotNull() {
            addCriterion("m_type is not null");
            return (Criteria) this;
        }

        public Criteria andMTypeEqualTo(Byte value) {
            addCriterion("m_type =", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotEqualTo(Byte value) {
            addCriterion("m_type <>", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThan(Byte value) {
            addCriterion("m_type >", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("m_type >=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThan(Byte value) {
            addCriterion("m_type <", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThanOrEqualTo(Byte value) {
            addCriterion("m_type <=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeIn(List<Byte> values) {
            addCriterion("m_type in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotIn(List<Byte> values) {
            addCriterion("m_type not in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeBetween(Byte value1, Byte value2) {
            addCriterion("m_type between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("m_type not between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMContentIsNull() {
            addCriterion("m_content is null");
            return (Criteria) this;
        }

        public Criteria andMContentIsNotNull() {
            addCriterion("m_content is not null");
            return (Criteria) this;
        }

        public Criteria andMContentEqualTo(String value) {
            addCriterion("m_content =", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotEqualTo(String value) {
            addCriterion("m_content <>", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentGreaterThan(String value) {
            addCriterion("m_content >", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentGreaterThanOrEqualTo(String value) {
            addCriterion("m_content >=", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLessThan(String value) {
            addCriterion("m_content <", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLessThanOrEqualTo(String value) {
            addCriterion("m_content <=", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLike(String value) {
            addCriterion("m_content like", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotLike(String value) {
            addCriterion("m_content not like", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentIn(List<String> values) {
            addCriterion("m_content in", values, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotIn(List<String> values) {
            addCriterion("m_content not in", values, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentBetween(String value1, String value2) {
            addCriterion("m_content between", value1, value2, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotBetween(String value1, String value2) {
            addCriterion("m_content not between", value1, value2, "mContent");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNull() {
            addCriterion("m_time is null");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNotNull() {
            addCriterion("m_time is not null");
            return (Criteria) this;
        }

        public Criteria andMTimeEqualTo(Date value) {
            addCriterionForJDBCDate("m_time =", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("m_time <>", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("m_time >", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("m_time >=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThan(Date value) {
            addCriterionForJDBCDate("m_time <", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("m_time <=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIn(List<Date> values) {
            addCriterionForJDBCDate("m_time in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("m_time not in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("m_time between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("m_time not between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagIsNull() {
            addCriterion("m_delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagIsNotNull() {
            addCriterion("m_delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagEqualTo(Byte value) {
            addCriterion("m_delete_flag =", value, "mDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagNotEqualTo(Byte value) {
            addCriterion("m_delete_flag <>", value, "mDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagGreaterThan(Byte value) {
            addCriterion("m_delete_flag >", value, "mDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("m_delete_flag >=", value, "mDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagLessThan(Byte value) {
            addCriterion("m_delete_flag <", value, "mDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("m_delete_flag <=", value, "mDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagIn(List<Byte> values) {
            addCriterion("m_delete_flag in", values, "mDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagNotIn(List<Byte> values) {
            addCriterion("m_delete_flag not in", values, "mDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagBetween(Byte value1, Byte value2) {
            addCriterion("m_delete_flag between", value1, value2, "mDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andMDeleteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("m_delete_flag not between", value1, value2, "mDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdIsNull() {
            addCriterion("sysusersys_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdIsNotNull() {
            addCriterion("sysusersys_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdEqualTo(Integer value) {
            addCriterion("sysusersys_user_id =", value, "sysusersysUserId");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdNotEqualTo(Integer value) {
            addCriterion("sysusersys_user_id <>", value, "sysusersysUserId");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdGreaterThan(Integer value) {
            addCriterion("sysusersys_user_id >", value, "sysusersysUserId");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysusersys_user_id >=", value, "sysusersysUserId");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdLessThan(Integer value) {
            addCriterion("sysusersys_user_id <", value, "sysusersysUserId");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("sysusersys_user_id <=", value, "sysusersysUserId");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdIn(List<Integer> values) {
            addCriterion("sysusersys_user_id in", values, "sysusersysUserId");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdNotIn(List<Integer> values) {
            addCriterion("sysusersys_user_id not in", values, "sysusersysUserId");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdBetween(Integer value1, Integer value2) {
            addCriterion("sysusersys_user_id between", value1, value2, "sysusersysUserId");
            return (Criteria) this;
        }

        public Criteria andSysusersysUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sysusersys_user_id not between", value1, value2, "sysusersysUserId");
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