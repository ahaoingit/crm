package com.brainyi.domain;

import java.util.ArrayList;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBNameIsNull() {
            addCriterion("b_name is null");
            return (Criteria) this;
        }

        public Criteria andBNameIsNotNull() {
            addCriterion("b_name is not null");
            return (Criteria) this;
        }

        public Criteria andBNameEqualTo(String value) {
            addCriterion("b_name =", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotEqualTo(String value) {
            addCriterion("b_name <>", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThan(String value) {
            addCriterion("b_name >", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThanOrEqualTo(String value) {
            addCriterion("b_name >=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThan(String value) {
            addCriterion("b_name <", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThanOrEqualTo(String value) {
            addCriterion("b_name <=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLike(String value) {
            addCriterion("b_name like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotLike(String value) {
            addCriterion("b_name not like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameIn(List<String> values) {
            addCriterion("b_name in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotIn(List<String> values) {
            addCriterion("b_name not in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameBetween(String value1, String value2) {
            addCriterion("b_name between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotBetween(String value1, String value2) {
            addCriterion("b_name not between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNull() {
            addCriterion("contacts_name is null");
            return (Criteria) this;
        }

        public Criteria andContactsNameIsNotNull() {
            addCriterion("contacts_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactsNameEqualTo(String value) {
            addCriterion("contacts_name =", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotEqualTo(String value) {
            addCriterion("contacts_name <>", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThan(String value) {
            addCriterion("contacts_name >", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_name >=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThan(String value) {
            addCriterion("contacts_name <", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLessThanOrEqualTo(String value) {
            addCriterion("contacts_name <=", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameLike(String value) {
            addCriterion("contacts_name like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotLike(String value) {
            addCriterion("contacts_name not like", value, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameIn(List<String> values) {
            addCriterion("contacts_name in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotIn(List<String> values) {
            addCriterion("contacts_name not in", values, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameBetween(String value1, String value2) {
            addCriterion("contacts_name between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andContactsNameNotBetween(String value1, String value2) {
            addCriterion("contacts_name not between", value1, value2, "contactsName");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Byte value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Byte value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Byte value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Byte value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Byte value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Byte> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Byte> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Byte value1, Byte value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andBStageIsNull() {
            addCriterion("b_stage is null");
            return (Criteria) this;
        }

        public Criteria andBStageIsNotNull() {
            addCriterion("b_stage is not null");
            return (Criteria) this;
        }

        public Criteria andBStageEqualTo(Byte value) {
            addCriterion("b_stage =", value, "bStage");
            return (Criteria) this;
        }

        public Criteria andBStageNotEqualTo(Byte value) {
            addCriterion("b_stage <>", value, "bStage");
            return (Criteria) this;
        }

        public Criteria andBStageGreaterThan(Byte value) {
            addCriterion("b_stage >", value, "bStage");
            return (Criteria) this;
        }

        public Criteria andBStageGreaterThanOrEqualTo(Byte value) {
            addCriterion("b_stage >=", value, "bStage");
            return (Criteria) this;
        }

        public Criteria andBStageLessThan(Byte value) {
            addCriterion("b_stage <", value, "bStage");
            return (Criteria) this;
        }

        public Criteria andBStageLessThanOrEqualTo(Byte value) {
            addCriterion("b_stage <=", value, "bStage");
            return (Criteria) this;
        }

        public Criteria andBStageIn(List<Byte> values) {
            addCriterion("b_stage in", values, "bStage");
            return (Criteria) this;
        }

        public Criteria andBStageNotIn(List<Byte> values) {
            addCriterion("b_stage not in", values, "bStage");
            return (Criteria) this;
        }

        public Criteria andBStageBetween(Byte value1, Byte value2) {
            addCriterion("b_stage between", value1, value2, "bStage");
            return (Criteria) this;
        }

        public Criteria andBStageNotBetween(Byte value1, Byte value2) {
            addCriterion("b_stage not between", value1, value2, "bStage");
            return (Criteria) this;
        }

        public Criteria andBSourceIsNull() {
            addCriterion("b_source is null");
            return (Criteria) this;
        }

        public Criteria andBSourceIsNotNull() {
            addCriterion("b_source is not null");
            return (Criteria) this;
        }

        public Criteria andBSourceEqualTo(Byte value) {
            addCriterion("b_source =", value, "bSource");
            return (Criteria) this;
        }

        public Criteria andBSourceNotEqualTo(Byte value) {
            addCriterion("b_source <>", value, "bSource");
            return (Criteria) this;
        }

        public Criteria andBSourceGreaterThan(Byte value) {
            addCriterion("b_source >", value, "bSource");
            return (Criteria) this;
        }

        public Criteria andBSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("b_source >=", value, "bSource");
            return (Criteria) this;
        }

        public Criteria andBSourceLessThan(Byte value) {
            addCriterion("b_source <", value, "bSource");
            return (Criteria) this;
        }

        public Criteria andBSourceLessThanOrEqualTo(Byte value) {
            addCriterion("b_source <=", value, "bSource");
            return (Criteria) this;
        }

        public Criteria andBSourceIn(List<Byte> values) {
            addCriterion("b_source in", values, "bSource");
            return (Criteria) this;
        }

        public Criteria andBSourceNotIn(List<Byte> values) {
            addCriterion("b_source not in", values, "bSource");
            return (Criteria) this;
        }

        public Criteria andBSourceBetween(Byte value1, Byte value2) {
            addCriterion("b_source between", value1, value2, "bSource");
            return (Criteria) this;
        }

        public Criteria andBSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("b_source not between", value1, value2, "bSource");
            return (Criteria) this;
        }

        public Criteria andClientcidIsNull() {
            addCriterion("clientcid is null");
            return (Criteria) this;
        }

        public Criteria andClientcidIsNotNull() {
            addCriterion("clientcid is not null");
            return (Criteria) this;
        }

        public Criteria andClientcidEqualTo(Integer value) {
            addCriterion("clientcid =", value, "clientcid");
            return (Criteria) this;
        }

        public Criteria andClientcidNotEqualTo(Integer value) {
            addCriterion("clientcid <>", value, "clientcid");
            return (Criteria) this;
        }

        public Criteria andClientcidGreaterThan(Integer value) {
            addCriterion("clientcid >", value, "clientcid");
            return (Criteria) this;
        }

        public Criteria andClientcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientcid >=", value, "clientcid");
            return (Criteria) this;
        }

        public Criteria andClientcidLessThan(Integer value) {
            addCriterion("clientcid <", value, "clientcid");
            return (Criteria) this;
        }

        public Criteria andClientcidLessThanOrEqualTo(Integer value) {
            addCriterion("clientcid <=", value, "clientcid");
            return (Criteria) this;
        }

        public Criteria andClientcidIn(List<Integer> values) {
            addCriterion("clientcid in", values, "clientcid");
            return (Criteria) this;
        }

        public Criteria andClientcidNotIn(List<Integer> values) {
            addCriterion("clientcid not in", values, "clientcid");
            return (Criteria) this;
        }

        public Criteria andClientcidBetween(Integer value1, Integer value2) {
            addCriterion("clientcid between", value1, value2, "clientcid");
            return (Criteria) this;
        }

        public Criteria andClientcidNotBetween(Integer value1, Integer value2) {
            addCriterion("clientcid not between", value1, value2, "clientcid");
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