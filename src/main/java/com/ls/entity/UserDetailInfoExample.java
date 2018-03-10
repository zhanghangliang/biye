package com.ls.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserDetailInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDetailInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoto1IsNull() {
            addCriterion("photo1 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto1IsNotNull() {
            addCriterion("photo1 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto1EqualTo(String value) {
            addCriterion("photo1 =", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotEqualTo(String value) {
            addCriterion("photo1 <>", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1GreaterThan(String value) {
            addCriterion("photo1 >", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1GreaterThanOrEqualTo(String value) {
            addCriterion("photo1 >=", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1LessThan(String value) {
            addCriterion("photo1 <", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1LessThanOrEqualTo(String value) {
            addCriterion("photo1 <=", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1Like(String value) {
            addCriterion("photo1 like", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotLike(String value) {
            addCriterion("photo1 not like", value, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1In(List<String> values) {
            addCriterion("photo1 in", values, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotIn(List<String> values) {
            addCriterion("photo1 not in", values, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1Between(String value1, String value2) {
            addCriterion("photo1 between", value1, value2, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto1NotBetween(String value1, String value2) {
            addCriterion("photo1 not between", value1, value2, "photo1");
            return (Criteria) this;
        }

        public Criteria andPhoto2IsNull() {
            addCriterion("photo2 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto2IsNotNull() {
            addCriterion("photo2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto2EqualTo(String value) {
            addCriterion("photo2 =", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotEqualTo(String value) {
            addCriterion("photo2 <>", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2GreaterThan(String value) {
            addCriterion("photo2 >", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2GreaterThanOrEqualTo(String value) {
            addCriterion("photo2 >=", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2LessThan(String value) {
            addCriterion("photo2 <", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2LessThanOrEqualTo(String value) {
            addCriterion("photo2 <=", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2Like(String value) {
            addCriterion("photo2 like", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotLike(String value) {
            addCriterion("photo2 not like", value, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2In(List<String> values) {
            addCriterion("photo2 in", values, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotIn(List<String> values) {
            addCriterion("photo2 not in", values, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2Between(String value1, String value2) {
            addCriterion("photo2 between", value1, value2, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto2NotBetween(String value1, String value2) {
            addCriterion("photo2 not between", value1, value2, "photo2");
            return (Criteria) this;
        }

        public Criteria andPhoto3IsNull() {
            addCriterion("photo3 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto3IsNotNull() {
            addCriterion("photo3 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto3EqualTo(String value) {
            addCriterion("photo3 =", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotEqualTo(String value) {
            addCriterion("photo3 <>", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3GreaterThan(String value) {
            addCriterion("photo3 >", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3GreaterThanOrEqualTo(String value) {
            addCriterion("photo3 >=", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3LessThan(String value) {
            addCriterion("photo3 <", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3LessThanOrEqualTo(String value) {
            addCriterion("photo3 <=", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3Like(String value) {
            addCriterion("photo3 like", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotLike(String value) {
            addCriterion("photo3 not like", value, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3In(List<String> values) {
            addCriterion("photo3 in", values, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotIn(List<String> values) {
            addCriterion("photo3 not in", values, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3Between(String value1, String value2) {
            addCriterion("photo3 between", value1, value2, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto3NotBetween(String value1, String value2) {
            addCriterion("photo3 not between", value1, value2, "photo3");
            return (Criteria) this;
        }

        public Criteria andPhoto4IsNull() {
            addCriterion("photo4 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto4IsNotNull() {
            addCriterion("photo4 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto4EqualTo(String value) {
            addCriterion("photo4 =", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotEqualTo(String value) {
            addCriterion("photo4 <>", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4GreaterThan(String value) {
            addCriterion("photo4 >", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4GreaterThanOrEqualTo(String value) {
            addCriterion("photo4 >=", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4LessThan(String value) {
            addCriterion("photo4 <", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4LessThanOrEqualTo(String value) {
            addCriterion("photo4 <=", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4Like(String value) {
            addCriterion("photo4 like", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotLike(String value) {
            addCriterion("photo4 not like", value, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4In(List<String> values) {
            addCriterion("photo4 in", values, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotIn(List<String> values) {
            addCriterion("photo4 not in", values, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4Between(String value1, String value2) {
            addCriterion("photo4 between", value1, value2, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto4NotBetween(String value1, String value2) {
            addCriterion("photo4 not between", value1, value2, "photo4");
            return (Criteria) this;
        }

        public Criteria andPhoto5IsNull() {
            addCriterion("photo5 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto5IsNotNull() {
            addCriterion("photo5 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto5EqualTo(String value) {
            addCriterion("photo5 =", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotEqualTo(String value) {
            addCriterion("photo5 <>", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5GreaterThan(String value) {
            addCriterion("photo5 >", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5GreaterThanOrEqualTo(String value) {
            addCriterion("photo5 >=", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5LessThan(String value) {
            addCriterion("photo5 <", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5LessThanOrEqualTo(String value) {
            addCriterion("photo5 <=", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5Like(String value) {
            addCriterion("photo5 like", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotLike(String value) {
            addCriterion("photo5 not like", value, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5In(List<String> values) {
            addCriterion("photo5 in", values, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotIn(List<String> values) {
            addCriterion("photo5 not in", values, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5Between(String value1, String value2) {
            addCriterion("photo5 between", value1, value2, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto5NotBetween(String value1, String value2) {
            addCriterion("photo5 not between", value1, value2, "photo5");
            return (Criteria) this;
        }

        public Criteria andPhoto6IsNull() {
            addCriterion("photo6 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto6IsNotNull() {
            addCriterion("photo6 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto6EqualTo(String value) {
            addCriterion("photo6 =", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotEqualTo(String value) {
            addCriterion("photo6 <>", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6GreaterThan(String value) {
            addCriterion("photo6 >", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6GreaterThanOrEqualTo(String value) {
            addCriterion("photo6 >=", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6LessThan(String value) {
            addCriterion("photo6 <", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6LessThanOrEqualTo(String value) {
            addCriterion("photo6 <=", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6Like(String value) {
            addCriterion("photo6 like", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotLike(String value) {
            addCriterion("photo6 not like", value, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6In(List<String> values) {
            addCriterion("photo6 in", values, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotIn(List<String> values) {
            addCriterion("photo6 not in", values, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6Between(String value1, String value2) {
            addCriterion("photo6 between", value1, value2, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto6NotBetween(String value1, String value2) {
            addCriterion("photo6 not between", value1, value2, "photo6");
            return (Criteria) this;
        }

        public Criteria andPhoto7IsNull() {
            addCriterion("photo7 is null");
            return (Criteria) this;
        }

        public Criteria andPhoto7IsNotNull() {
            addCriterion("photo7 is not null");
            return (Criteria) this;
        }

        public Criteria andPhoto7EqualTo(String value) {
            addCriterion("photo7 =", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotEqualTo(String value) {
            addCriterion("photo7 <>", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7GreaterThan(String value) {
            addCriterion("photo7 >", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7GreaterThanOrEqualTo(String value) {
            addCriterion("photo7 >=", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7LessThan(String value) {
            addCriterion("photo7 <", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7LessThanOrEqualTo(String value) {
            addCriterion("photo7 <=", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7Like(String value) {
            addCriterion("photo7 like", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotLike(String value) {
            addCriterion("photo7 not like", value, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7In(List<String> values) {
            addCriterion("photo7 in", values, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotIn(List<String> values) {
            addCriterion("photo7 not in", values, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7Between(String value1, String value2) {
            addCriterion("photo7 between", value1, value2, "photo7");
            return (Criteria) this;
        }

        public Criteria andPhoto7NotBetween(String value1, String value2) {
            addCriterion("photo7 not between", value1, value2, "photo7");
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