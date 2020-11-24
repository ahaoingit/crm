package com.brianyi.domain;

import java.util.ArrayList;
import java.util.List;

public class SysFrontendMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFrontendMenuExample() {
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

        public Criteria andFrontedMenuIdIsNull() {
            addCriterion("fronted_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdIsNotNull() {
            addCriterion("fronted_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdEqualTo(String value) {
            addCriterion("fronted_menu_id =", value, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdNotEqualTo(String value) {
            addCriterion("fronted_menu_id <>", value, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdGreaterThan(String value) {
            addCriterion("fronted_menu_id >", value, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("fronted_menu_id >=", value, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdLessThan(String value) {
            addCriterion("fronted_menu_id <", value, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdLessThanOrEqualTo(String value) {
            addCriterion("fronted_menu_id <=", value, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdLike(String value) {
            addCriterion("fronted_menu_id like", value, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdNotLike(String value) {
            addCriterion("fronted_menu_id not like", value, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdIn(List<String> values) {
            addCriterion("fronted_menu_id in", values, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdNotIn(List<String> values) {
            addCriterion("fronted_menu_id not in", values, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdBetween(String value1, String value2) {
            addCriterion("fronted_menu_id between", value1, value2, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuIdNotBetween(String value1, String value2) {
            addCriterion("fronted_menu_id not between", value1, value2, "frontedMenuId");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameIsNull() {
            addCriterion("frontend_menu_name is null");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameIsNotNull() {
            addCriterion("frontend_menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameEqualTo(String value) {
            addCriterion("frontend_menu_name =", value, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameNotEqualTo(String value) {
            addCriterion("frontend_menu_name <>", value, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameGreaterThan(String value) {
            addCriterion("frontend_menu_name >", value, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("frontend_menu_name >=", value, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameLessThan(String value) {
            addCriterion("frontend_menu_name <", value, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameLessThanOrEqualTo(String value) {
            addCriterion("frontend_menu_name <=", value, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameLike(String value) {
            addCriterion("frontend_menu_name like", value, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameNotLike(String value) {
            addCriterion("frontend_menu_name not like", value, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameIn(List<String> values) {
            addCriterion("frontend_menu_name in", values, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameNotIn(List<String> values) {
            addCriterion("frontend_menu_name not in", values, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameBetween(String value1, String value2) {
            addCriterion("frontend_menu_name between", value1, value2, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuNameNotBetween(String value1, String value2) {
            addCriterion("frontend_menu_name not between", value1, value2, "frontendMenuName");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlIsNull() {
            addCriterion("frontend_menu_url is null");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlIsNotNull() {
            addCriterion("frontend_menu_url is not null");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlEqualTo(String value) {
            addCriterion("frontend_menu_url =", value, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlNotEqualTo(String value) {
            addCriterion("frontend_menu_url <>", value, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlGreaterThan(String value) {
            addCriterion("frontend_menu_url >", value, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("frontend_menu_url >=", value, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlLessThan(String value) {
            addCriterion("frontend_menu_url <", value, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("frontend_menu_url <=", value, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlLike(String value) {
            addCriterion("frontend_menu_url like", value, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlNotLike(String value) {
            addCriterion("frontend_menu_url not like", value, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlIn(List<String> values) {
            addCriterion("frontend_menu_url in", values, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlNotIn(List<String> values) {
            addCriterion("frontend_menu_url not in", values, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlBetween(String value1, String value2) {
            addCriterion("frontend_menu_url between", value1, value2, "frontendMenuUrl");
            return (Criteria) this;
        }

        public Criteria andFrontendMenuUrlNotBetween(String value1, String value2) {
            addCriterion("frontend_menu_url not between", value1, value2, "frontendMenuUrl");
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

        public Criteria andFrontedMenuSortIsNull() {
            addCriterion("fronted_menu_sort is null");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortIsNotNull() {
            addCriterion("fronted_menu_sort is not null");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortEqualTo(Integer value) {
            addCriterion("fronted_menu_sort =", value, "frontedMenuSort");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortNotEqualTo(Integer value) {
            addCriterion("fronted_menu_sort <>", value, "frontedMenuSort");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortGreaterThan(Integer value) {
            addCriterion("fronted_menu_sort >", value, "frontedMenuSort");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("fronted_menu_sort >=", value, "frontedMenuSort");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortLessThan(Integer value) {
            addCriterion("fronted_menu_sort <", value, "frontedMenuSort");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortLessThanOrEqualTo(Integer value) {
            addCriterion("fronted_menu_sort <=", value, "frontedMenuSort");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortIn(List<Integer> values) {
            addCriterion("fronted_menu_sort in", values, "frontedMenuSort");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortNotIn(List<Integer> values) {
            addCriterion("fronted_menu_sort not in", values, "frontedMenuSort");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortBetween(Integer value1, Integer value2) {
            addCriterion("fronted_menu_sort between", value1, value2, "frontedMenuSort");
            return (Criteria) this;
        }

        public Criteria andFrontedMenuSortNotBetween(Integer value1, Integer value2) {
            addCriterion("fronted_menu_sort not between", value1, value2, "frontedMenuSort");
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