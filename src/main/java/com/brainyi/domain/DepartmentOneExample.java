package com.brainyi.domain;

import java.util.ArrayList;
import java.util.List;

public class DepartmentOneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentOneExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDRankIsNull() {
            addCriterion("d_rank is null");
            return (Criteria) this;
        }

        public Criteria andDRankIsNotNull() {
            addCriterion("d_rank is not null");
            return (Criteria) this;
        }

        public Criteria andDRankEqualTo(Boolean value) {
            addCriterion("d_rank =", value, "dRank");
            return (Criteria) this;
        }

        public Criteria andDRankNotEqualTo(Boolean value) {
            addCriterion("d_rank <>", value, "dRank");
            return (Criteria) this;
        }

        public Criteria andDRankGreaterThan(Boolean value) {
            addCriterion("d_rank >", value, "dRank");
            return (Criteria) this;
        }

        public Criteria andDRankGreaterThanOrEqualTo(Boolean value) {
            addCriterion("d_rank >=", value, "dRank");
            return (Criteria) this;
        }

        public Criteria andDRankLessThan(Boolean value) {
            addCriterion("d_rank <", value, "dRank");
            return (Criteria) this;
        }

        public Criteria andDRankLessThanOrEqualTo(Boolean value) {
            addCriterion("d_rank <=", value, "dRank");
            return (Criteria) this;
        }

        public Criteria andDRankIn(List<Boolean> values) {
            addCriterion("d_rank in", values, "dRank");
            return (Criteria) this;
        }

        public Criteria andDRankNotIn(List<Boolean> values) {
            addCriterion("d_rank not in", values, "dRank");
            return (Criteria) this;
        }

        public Criteria andDRankBetween(Boolean value1, Boolean value2) {
            addCriterion("d_rank between", value1, value2, "dRank");
            return (Criteria) this;
        }

        public Criteria andDRankNotBetween(Boolean value1, Boolean value2) {
            addCriterion("d_rank not between", value1, value2, "dRank");
            return (Criteria) this;
        }

        public Criteria andDParentIdIsNull() {
            addCriterion("d_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andDParentIdIsNotNull() {
            addCriterion("d_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andDParentIdEqualTo(Integer value) {
            addCriterion("d_parent_id =", value, "dParentId");
            return (Criteria) this;
        }

        public Criteria andDParentIdNotEqualTo(Integer value) {
            addCriterion("d_parent_id <>", value, "dParentId");
            return (Criteria) this;
        }

        public Criteria andDParentIdGreaterThan(Integer value) {
            addCriterion("d_parent_id >", value, "dParentId");
            return (Criteria) this;
        }

        public Criteria andDParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_parent_id >=", value, "dParentId");
            return (Criteria) this;
        }

        public Criteria andDParentIdLessThan(Integer value) {
            addCriterion("d_parent_id <", value, "dParentId");
            return (Criteria) this;
        }

        public Criteria andDParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_parent_id <=", value, "dParentId");
            return (Criteria) this;
        }

        public Criteria andDParentIdIn(List<Integer> values) {
            addCriterion("d_parent_id in", values, "dParentId");
            return (Criteria) this;
        }

        public Criteria andDParentIdNotIn(List<Integer> values) {
            addCriterion("d_parent_id not in", values, "dParentId");
            return (Criteria) this;
        }

        public Criteria andDParentIdBetween(Integer value1, Integer value2) {
            addCriterion("d_parent_id between", value1, value2, "dParentId");
            return (Criteria) this;
        }

        public Criteria andDParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_parent_id not between", value1, value2, "dParentId");
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