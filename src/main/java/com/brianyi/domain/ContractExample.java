package com.brianyi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
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

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("contract_id like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("contract_id not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
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

        public Criteria andSignerIsNull() {
            addCriterion("signer is null");
            return (Criteria) this;
        }

        public Criteria andSignerIsNotNull() {
            addCriterion("signer is not null");
            return (Criteria) this;
        }

        public Criteria andSignerEqualTo(String value) {
            addCriterion("signer =", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotEqualTo(String value) {
            addCriterion("signer <>", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerGreaterThan(String value) {
            addCriterion("signer >", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerGreaterThanOrEqualTo(String value) {
            addCriterion("signer >=", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLessThan(String value) {
            addCriterion("signer <", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLessThanOrEqualTo(String value) {
            addCriterion("signer <=", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerLike(String value) {
            addCriterion("signer like", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotLike(String value) {
            addCriterion("signer not like", value, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerIn(List<String> values) {
            addCriterion("signer in", values, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotIn(List<String> values) {
            addCriterion("signer not in", values, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerBetween(String value1, String value2) {
            addCriterion("signer between", value1, value2, "signer");
            return (Criteria) this;
        }

        public Criteria andSignerNotBetween(String value1, String value2) {
            addCriterion("signer not between", value1, value2, "signer");
            return (Criteria) this;
        }

        public Criteria andContractDateIsNull() {
            addCriterion("contract_date is null");
            return (Criteria) this;
        }

        public Criteria andContractDateIsNotNull() {
            addCriterion("contract_date is not null");
            return (Criteria) this;
        }

        public Criteria andContractDateEqualTo(Date value) {
            addCriterionForJDBCDate("contract_date =", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("contract_date <>", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateGreaterThan(Date value) {
            addCriterionForJDBCDate("contract_date >", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contract_date >=", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateLessThan(Date value) {
            addCriterionForJDBCDate("contract_date <", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("contract_date <=", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateIn(List<Date> values) {
            addCriterionForJDBCDate("contract_date in", values, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("contract_date not in", values, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contract_date between", value1, value2, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("contract_date not between", value1, value2, "contractDate");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagIsNull() {
            addCriterion("invoicing_flag is null");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagIsNotNull() {
            addCriterion("invoicing_flag is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagEqualTo(Byte value) {
            addCriterion("invoicing_flag =", value, "invoicingFlag");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagNotEqualTo(Byte value) {
            addCriterion("invoicing_flag <>", value, "invoicingFlag");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagGreaterThan(Byte value) {
            addCriterion("invoicing_flag >", value, "invoicingFlag");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("invoicing_flag >=", value, "invoicingFlag");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagLessThan(Byte value) {
            addCriterion("invoicing_flag <", value, "invoicingFlag");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagLessThanOrEqualTo(Byte value) {
            addCriterion("invoicing_flag <=", value, "invoicingFlag");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagIn(List<Byte> values) {
            addCriterion("invoicing_flag in", values, "invoicingFlag");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagNotIn(List<Byte> values) {
            addCriterion("invoicing_flag not in", values, "invoicingFlag");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagBetween(Byte value1, Byte value2) {
            addCriterion("invoicing_flag between", value1, value2, "invoicingFlag");
            return (Criteria) this;
        }

        public Criteria andInvoicingFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("invoicing_flag not between", value1, value2, "invoicingFlag");
            return (Criteria) this;
        }

        public Criteria andOrderClerckIsNull() {
            addCriterion("order_clerck is null");
            return (Criteria) this;
        }

        public Criteria andOrderClerckIsNotNull() {
            addCriterion("order_clerck is not null");
            return (Criteria) this;
        }

        public Criteria andOrderClerckEqualTo(String value) {
            addCriterion("order_clerck =", value, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckNotEqualTo(String value) {
            addCriterion("order_clerck <>", value, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckGreaterThan(String value) {
            addCriterion("order_clerck >", value, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckGreaterThanOrEqualTo(String value) {
            addCriterion("order_clerck >=", value, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckLessThan(String value) {
            addCriterion("order_clerck <", value, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckLessThanOrEqualTo(String value) {
            addCriterion("order_clerck <=", value, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckLike(String value) {
            addCriterion("order_clerck like", value, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckNotLike(String value) {
            addCriterion("order_clerck not like", value, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckIn(List<String> values) {
            addCriterion("order_clerck in", values, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckNotIn(List<String> values) {
            addCriterion("order_clerck not in", values, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckBetween(String value1, String value2) {
            addCriterion("order_clerck between", value1, value2, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andOrderClerckNotBetween(String value1, String value2) {
            addCriterion("order_clerck not between", value1, value2, "orderClerck");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlIsNull() {
            addCriterion("contract_attachment_url is null");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlIsNotNull() {
            addCriterion("contract_attachment_url is not null");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlEqualTo(Integer value) {
            addCriterion("contract_attachment_url =", value, "contractAttachmentUrl");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlNotEqualTo(Integer value) {
            addCriterion("contract_attachment_url <>", value, "contractAttachmentUrl");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlGreaterThan(Integer value) {
            addCriterion("contract_attachment_url >", value, "contractAttachmentUrl");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_attachment_url >=", value, "contractAttachmentUrl");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlLessThan(Integer value) {
            addCriterion("contract_attachment_url <", value, "contractAttachmentUrl");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlLessThanOrEqualTo(Integer value) {
            addCriterion("contract_attachment_url <=", value, "contractAttachmentUrl");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlIn(List<Integer> values) {
            addCriterion("contract_attachment_url in", values, "contractAttachmentUrl");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlNotIn(List<Integer> values) {
            addCriterion("contract_attachment_url not in", values, "contractAttachmentUrl");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlBetween(Integer value1, Integer value2) {
            addCriterion("contract_attachment_url between", value1, value2, "contractAttachmentUrl");
            return (Criteria) this;
        }

        public Criteria andContractAttachmentUrlNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_attachment_url not between", value1, value2, "contractAttachmentUrl");
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