package com.ls.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ExperienceDetailInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExperienceDetailInfoExample() {
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

        public Criteria andExperienceIdIsNull() {
            addCriterion("experience_id is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIdIsNotNull() {
            addCriterion("experience_id is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceIdEqualTo(Integer value) {
            addCriterion("experience_id =", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdNotEqualTo(Integer value) {
            addCriterion("experience_id <>", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdGreaterThan(Integer value) {
            addCriterion("experience_id >", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_id >=", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdLessThan(Integer value) {
            addCriterion("experience_id <", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdLessThanOrEqualTo(Integer value) {
            addCriterion("experience_id <=", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdIn(List<Integer> values) {
            addCriterion("experience_id in", values, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdNotIn(List<Integer> values) {
            addCriterion("experience_id not in", values, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdBetween(Integer value1, Integer value2) {
            addCriterion("experience_id between", value1, value2, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_id not between", value1, value2, "experienceId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleIsNull() {
            addCriterion("experience_subtitle is null");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleIsNotNull() {
            addCriterion("experience_subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleEqualTo(String value) {
            addCriterion("experience_subtitle =", value, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleNotEqualTo(String value) {
            addCriterion("experience_subtitle <>", value, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleGreaterThan(String value) {
            addCriterion("experience_subtitle >", value, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("experience_subtitle >=", value, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleLessThan(String value) {
            addCriterion("experience_subtitle <", value, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleLessThanOrEqualTo(String value) {
            addCriterion("experience_subtitle <=", value, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleLike(String value) {
            addCriterion("experience_subtitle like", value, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleNotLike(String value) {
            addCriterion("experience_subtitle not like", value, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleIn(List<String> values) {
            addCriterion("experience_subtitle in", values, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleNotIn(List<String> values) {
            addCriterion("experience_subtitle not in", values, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleBetween(String value1, String value2) {
            addCriterion("experience_subtitle between", value1, value2, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubtitleNotBetween(String value1, String value2) {
            addCriterion("experience_subtitle not between", value1, value2, "experienceSubtitle");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentIsNull() {
            addCriterion("experience_subcontent is null");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentIsNotNull() {
            addCriterion("experience_subcontent is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentEqualTo(String value) {
            addCriterion("experience_subcontent =", value, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentNotEqualTo(String value) {
            addCriterion("experience_subcontent <>", value, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentGreaterThan(String value) {
            addCriterion("experience_subcontent >", value, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentGreaterThanOrEqualTo(String value) {
            addCriterion("experience_subcontent >=", value, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentLessThan(String value) {
            addCriterion("experience_subcontent <", value, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentLessThanOrEqualTo(String value) {
            addCriterion("experience_subcontent <=", value, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentLike(String value) {
            addCriterion("experience_subcontent like", value, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentNotLike(String value) {
            addCriterion("experience_subcontent not like", value, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentIn(List<String> values) {
            addCriterion("experience_subcontent in", values, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentNotIn(List<String> values) {
            addCriterion("experience_subcontent not in", values, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentBetween(String value1, String value2) {
            addCriterion("experience_subcontent between", value1, value2, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubcontentNotBetween(String value1, String value2) {
            addCriterion("experience_subcontent not between", value1, value2, "experienceSubcontent");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgIsNull() {
            addCriterion("experience_subimg is null");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgIsNotNull() {
            addCriterion("experience_subimg is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgEqualTo(String value) {
            addCriterion("experience_subimg =", value, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgNotEqualTo(String value) {
            addCriterion("experience_subimg <>", value, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgGreaterThan(String value) {
            addCriterion("experience_subimg >", value, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgGreaterThanOrEqualTo(String value) {
            addCriterion("experience_subimg >=", value, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgLessThan(String value) {
            addCriterion("experience_subimg <", value, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgLessThanOrEqualTo(String value) {
            addCriterion("experience_subimg <=", value, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgLike(String value) {
            addCriterion("experience_subimg like", value, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgNotLike(String value) {
            addCriterion("experience_subimg not like", value, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgIn(List<String> values) {
            addCriterion("experience_subimg in", values, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgNotIn(List<String> values) {
            addCriterion("experience_subimg not in", values, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgBetween(String value1, String value2) {
            addCriterion("experience_subimg between", value1, value2, "experienceSubimg");
            return (Criteria) this;
        }

        public Criteria andExperienceSubimgNotBetween(String value1, String value2) {
            addCriterion("experience_subimg not between", value1, value2, "experienceSubimg");
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