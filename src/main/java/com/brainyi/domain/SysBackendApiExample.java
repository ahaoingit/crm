package com.brainyi.domain;

import java.util.ArrayList;
import java.util.List;

public class SysBackendApiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBackendApiExample() {
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

        public Criteria andBackendApiIdIsNull() {
            addCriterion("backend_api_id is null");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdIsNotNull() {
            addCriterion("backend_api_id is not null");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdEqualTo(String value) {
            addCriterion("backend_api_id =", value, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdNotEqualTo(String value) {
            addCriterion("backend_api_id <>", value, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdGreaterThan(String value) {
            addCriterion("backend_api_id >", value, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdGreaterThanOrEqualTo(String value) {
            addCriterion("backend_api_id >=", value, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdLessThan(String value) {
            addCriterion("backend_api_id <", value, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdLessThanOrEqualTo(String value) {
            addCriterion("backend_api_id <=", value, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdLike(String value) {
            addCriterion("backend_api_id like", value, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdNotLike(String value) {
            addCriterion("backend_api_id not like", value, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdIn(List<String> values) {
            addCriterion("backend_api_id in", values, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdNotIn(List<String> values) {
            addCriterion("backend_api_id not in", values, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdBetween(String value1, String value2) {
            addCriterion("backend_api_id between", value1, value2, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiIdNotBetween(String value1, String value2) {
            addCriterion("backend_api_id not between", value1, value2, "backendApiId");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameIsNull() {
            addCriterion("backend_api_name is null");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameIsNotNull() {
            addCriterion("backend_api_name is not null");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameEqualTo(String value) {
            addCriterion("backend_api_name =", value, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameNotEqualTo(String value) {
            addCriterion("backend_api_name <>", value, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameGreaterThan(String value) {
            addCriterion("backend_api_name >", value, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameGreaterThanOrEqualTo(String value) {
            addCriterion("backend_api_name >=", value, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameLessThan(String value) {
            addCriterion("backend_api_name <", value, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameLessThanOrEqualTo(String value) {
            addCriterion("backend_api_name <=", value, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameLike(String value) {
            addCriterion("backend_api_name like", value, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameNotLike(String value) {
            addCriterion("backend_api_name not like", value, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameIn(List<String> values) {
            addCriterion("backend_api_name in", values, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameNotIn(List<String> values) {
            addCriterion("backend_api_name not in", values, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameBetween(String value1, String value2) {
            addCriterion("backend_api_name between", value1, value2, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiNameNotBetween(String value1, String value2) {
            addCriterion("backend_api_name not between", value1, value2, "backendApiName");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodIsNull() {
            addCriterion("backend_api_method is null");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodIsNotNull() {
            addCriterion("backend_api_method is not null");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodEqualTo(String value) {
            addCriterion("backend_api_method =", value, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodNotEqualTo(String value) {
            addCriterion("backend_api_method <>", value, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodGreaterThan(String value) {
            addCriterion("backend_api_method >", value, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodGreaterThanOrEqualTo(String value) {
            addCriterion("backend_api_method >=", value, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodLessThan(String value) {
            addCriterion("backend_api_method <", value, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodLessThanOrEqualTo(String value) {
            addCriterion("backend_api_method <=", value, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodLike(String value) {
            addCriterion("backend_api_method like", value, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodNotLike(String value) {
            addCriterion("backend_api_method not like", value, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodIn(List<String> values) {
            addCriterion("backend_api_method in", values, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodNotIn(List<String> values) {
            addCriterion("backend_api_method not in", values, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodBetween(String value1, String value2) {
            addCriterion("backend_api_method between", value1, value2, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiMethodNotBetween(String value1, String value2) {
            addCriterion("backend_api_method not between", value1, value2, "backendApiMethod");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlIsNull() {
            addCriterion("backend_api_url is null");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlIsNotNull() {
            addCriterion("backend_api_url is not null");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlEqualTo(String value) {
            addCriterion("backend_api_url =", value, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlNotEqualTo(String value) {
            addCriterion("backend_api_url <>", value, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlGreaterThan(String value) {
            addCriterion("backend_api_url >", value, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlGreaterThanOrEqualTo(String value) {
            addCriterion("backend_api_url >=", value, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlLessThan(String value) {
            addCriterion("backend_api_url <", value, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlLessThanOrEqualTo(String value) {
            addCriterion("backend_api_url <=", value, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlLike(String value) {
            addCriterion("backend_api_url like", value, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlNotLike(String value) {
            addCriterion("backend_api_url not like", value, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlIn(List<String> values) {
            addCriterion("backend_api_url in", values, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlNotIn(List<String> values) {
            addCriterion("backend_api_url not in", values, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlBetween(String value1, String value2) {
            addCriterion("backend_api_url between", value1, value2, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andBackendApiUrlNotBetween(String value1, String value2) {
            addCriterion("backend_api_url not between", value1, value2, "backendApiUrl");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortIsNull() {
            addCriterion("backend_api_sort is null");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortIsNotNull() {
            addCriterion("backend_api_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortEqualTo(Integer value) {
            addCriterion("backend_api_sort =", value, "backendApiSort");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortNotEqualTo(Integer value) {
            addCriterion("backend_api_sort <>", value, "backendApiSort");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortGreaterThan(Integer value) {
            addCriterion("backend_api_sort >", value, "backendApiSort");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("backend_api_sort >=", value, "backendApiSort");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortLessThan(Integer value) {
            addCriterion("backend_api_sort <", value, "backendApiSort");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortLessThanOrEqualTo(Integer value) {
            addCriterion("backend_api_sort <=", value, "backendApiSort");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortIn(List<Integer> values) {
            addCriterion("backend_api_sort in", values, "backendApiSort");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortNotIn(List<Integer> values) {
            addCriterion("backend_api_sort not in", values, "backendApiSort");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortBetween(Integer value1, Integer value2) {
            addCriterion("backend_api_sort between", value1, value2, "backendApiSort");
            return (Criteria) this;
        }

        public Criteria andBackendApiSortNotBetween(Integer value1, Integer value2) {
            addCriterion("backend_api_sort not between", value1, value2, "backendApiSort");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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