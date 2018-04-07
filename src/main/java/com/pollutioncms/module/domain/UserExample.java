package com.pollutioncms.module.domain;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("CName is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("CName is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("CName =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("CName <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("CName >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("CName >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("CName <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("CName <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("CName like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("CName not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("CName in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("CName not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("CName between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("CName not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("EName is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("EName is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("EName =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("EName <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("EName >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("EName >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("EName <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("EName <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("EName like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("EName not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("EName in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("EName not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("EName between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("EName not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("Pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("Pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("Pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("Pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("Pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("Pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("Pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("Pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("Pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("Pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("Pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("Pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("Pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("LoginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("LoginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("LoginName =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("LoginName <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("LoginName >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("LoginName >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("LoginName <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("LoginName <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("LoginName like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("LoginName not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("LoginName in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("LoginName not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("LoginName between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("LoginName not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIsNull() {
            addCriterion("DateOfBirth is null");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIsNotNull() {
            addCriterion("DateOfBirth is not null");
            return (Criteria) this;
        }

        public Criteria andDateofbirthEqualTo(String value) {
            addCriterion("DateOfBirth =", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotEqualTo(String value) {
            addCriterion("DateOfBirth <>", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthGreaterThan(String value) {
            addCriterion("DateOfBirth >", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthGreaterThanOrEqualTo(String value) {
            addCriterion("DateOfBirth >=", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLessThan(String value) {
            addCriterion("DateOfBirth <", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLessThanOrEqualTo(String value) {
            addCriterion("DateOfBirth <=", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLike(String value) {
            addCriterion("DateOfBirth like", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotLike(String value) {
            addCriterion("DateOfBirth not like", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIn(List<String> values) {
            addCriterion("DateOfBirth in", values, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotIn(List<String> values) {
            addCriterion("DateOfBirth not in", values, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthBetween(String value1, String value2) {
            addCriterion("DateOfBirth between", value1, value2, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotBetween(String value1, String value2) {
            addCriterion("DateOfBirth not between", value1, value2, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNull() {
            addCriterion("Extension is null");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNotNull() {
            addCriterion("Extension is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionEqualTo(String value) {
            addCriterion("Extension =", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotEqualTo(String value) {
            addCriterion("Extension <>", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThan(String value) {
            addCriterion("Extension >", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("Extension >=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThan(String value) {
            addCriterion("Extension <", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThanOrEqualTo(String value) {
            addCriterion("Extension <=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLike(String value) {
            addCriterion("Extension like", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotLike(String value) {
            addCriterion("Extension not like", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionIn(List<String> values) {
            addCriterion("Extension in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotIn(List<String> values) {
            addCriterion("Extension not in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionBetween(String value1, String value2) {
            addCriterion("Extension between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotBetween(String value1, String value2) {
            addCriterion("Extension not between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNull() {
            addCriterion("PhotoUrl is null");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNotNull() {
            addCriterion("PhotoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPhotourlEqualTo(String value) {
            addCriterion("PhotoUrl =", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotEqualTo(String value) {
            addCriterion("PhotoUrl <>", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThan(String value) {
            addCriterion("PhotoUrl >", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThanOrEqualTo(String value) {
            addCriterion("PhotoUrl >=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThan(String value) {
            addCriterion("PhotoUrl <", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThanOrEqualTo(String value) {
            addCriterion("PhotoUrl <=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLike(String value) {
            addCriterion("PhotoUrl like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotLike(String value) {
            addCriterion("PhotoUrl not like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlIn(List<String> values) {
            addCriterion("PhotoUrl in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotIn(List<String> values) {
            addCriterion("PhotoUrl not in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlBetween(String value1, String value2) {
            addCriterion("PhotoUrl between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotBetween(String value1, String value2) {
            addCriterion("PhotoUrl not between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DeptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DeptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("DeptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("DeptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("DeptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("DeptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("DeptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("DeptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("DeptId like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("DeptId not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("DeptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("DeptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("DeptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("DeptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andNavigationidIsNull() {
            addCriterion("NavigationId is null");
            return (Criteria) this;
        }

        public Criteria andNavigationidIsNotNull() {
            addCriterion("NavigationId is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationidEqualTo(String value) {
            addCriterion("NavigationId =", value, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidNotEqualTo(String value) {
            addCriterion("NavigationId <>", value, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidGreaterThan(String value) {
            addCriterion("NavigationId >", value, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidGreaterThanOrEqualTo(String value) {
            addCriterion("NavigationId >=", value, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidLessThan(String value) {
            addCriterion("NavigationId <", value, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidLessThanOrEqualTo(String value) {
            addCriterion("NavigationId <=", value, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidLike(String value) {
            addCriterion("NavigationId like", value, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidNotLike(String value) {
            addCriterion("NavigationId not like", value, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidIn(List<String> values) {
            addCriterion("NavigationId in", values, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidNotIn(List<String> values) {
            addCriterion("NavigationId not in", values, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidBetween(String value1, String value2) {
            addCriterion("NavigationId between", value1, value2, "navigationid");
            return (Criteria) this;
        }

        public Criteria andNavigationidNotBetween(String value1, String value2) {
            addCriterion("NavigationId not between", value1, value2, "navigationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidIsNull() {
            addCriterion("ApplicationId is null");
            return (Criteria) this;
        }

        public Criteria andApplicationidIsNotNull() {
            addCriterion("ApplicationId is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationidEqualTo(String value) {
            addCriterion("ApplicationId =", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotEqualTo(String value) {
            addCriterion("ApplicationId <>", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidGreaterThan(String value) {
            addCriterion("ApplicationId >", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidGreaterThanOrEqualTo(String value) {
            addCriterion("ApplicationId >=", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidLessThan(String value) {
            addCriterion("ApplicationId <", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidLessThanOrEqualTo(String value) {
            addCriterion("ApplicationId <=", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidLike(String value) {
            addCriterion("ApplicationId like", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotLike(String value) {
            addCriterion("ApplicationId not like", value, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidIn(List<String> values) {
            addCriterion("ApplicationId in", values, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotIn(List<String> values) {
            addCriterion("ApplicationId not in", values, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidBetween(String value1, String value2) {
            addCriterion("ApplicationId between", value1, value2, "applicationid");
            return (Criteria) this;
        }

        public Criteria andApplicationidNotBetween(String value1, String value2) {
            addCriterion("ApplicationId not between", value1, value2, "applicationid");
            return (Criteria) this;
        }

        public Criteria andLasturlIsNull() {
            addCriterion("LastUrl is null");
            return (Criteria) this;
        }

        public Criteria andLasturlIsNotNull() {
            addCriterion("LastUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLasturlEqualTo(String value) {
            addCriterion("LastUrl =", value, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlNotEqualTo(String value) {
            addCriterion("LastUrl <>", value, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlGreaterThan(String value) {
            addCriterion("LastUrl >", value, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlGreaterThanOrEqualTo(String value) {
            addCriterion("LastUrl >=", value, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlLessThan(String value) {
            addCriterion("LastUrl <", value, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlLessThanOrEqualTo(String value) {
            addCriterion("LastUrl <=", value, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlLike(String value) {
            addCriterion("LastUrl like", value, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlNotLike(String value) {
            addCriterion("LastUrl not like", value, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlIn(List<String> values) {
            addCriterion("LastUrl in", values, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlNotIn(List<String> values) {
            addCriterion("LastUrl not in", values, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlBetween(String value1, String value2) {
            addCriterion("LastUrl between", value1, value2, "lasturl");
            return (Criteria) this;
        }

        public Criteria andLasturlNotBetween(String value1, String value2) {
            addCriterion("LastUrl not between", value1, value2, "lasturl");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("Theme is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("Theme is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("Theme =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("Theme <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("Theme >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("Theme >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("Theme <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("Theme <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("Theme like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("Theme not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("Theme in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("Theme not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("Theme between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("Theme not between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andPortalnameIsNull() {
            addCriterion("PortalName is null");
            return (Criteria) this;
        }

        public Criteria andPortalnameIsNotNull() {
            addCriterion("PortalName is not null");
            return (Criteria) this;
        }

        public Criteria andPortalnameEqualTo(String value) {
            addCriterion("PortalName =", value, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameNotEqualTo(String value) {
            addCriterion("PortalName <>", value, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameGreaterThan(String value) {
            addCriterion("PortalName >", value, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameGreaterThanOrEqualTo(String value) {
            addCriterion("PortalName >=", value, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameLessThan(String value) {
            addCriterion("PortalName <", value, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameLessThanOrEqualTo(String value) {
            addCriterion("PortalName <=", value, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameLike(String value) {
            addCriterion("PortalName like", value, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameNotLike(String value) {
            addCriterion("PortalName not like", value, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameIn(List<String> values) {
            addCriterion("PortalName in", values, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameNotIn(List<String> values) {
            addCriterion("PortalName not in", values, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameBetween(String value1, String value2) {
            addCriterion("PortalName between", value1, value2, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalnameNotBetween(String value1, String value2) {
            addCriterion("PortalName not between", value1, value2, "portalname");
            return (Criteria) this;
        }

        public Criteria andPortalidIsNull() {
            addCriterion("PortalId is null");
            return (Criteria) this;
        }

        public Criteria andPortalidIsNotNull() {
            addCriterion("PortalId is not null");
            return (Criteria) this;
        }

        public Criteria andPortalidEqualTo(String value) {
            addCriterion("PortalId =", value, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidNotEqualTo(String value) {
            addCriterion("PortalId <>", value, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidGreaterThan(String value) {
            addCriterion("PortalId >", value, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidGreaterThanOrEqualTo(String value) {
            addCriterion("PortalId >=", value, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidLessThan(String value) {
            addCriterion("PortalId <", value, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidLessThanOrEqualTo(String value) {
            addCriterion("PortalId <=", value, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidLike(String value) {
            addCriterion("PortalId like", value, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidNotLike(String value) {
            addCriterion("PortalId not like", value, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidIn(List<String> values) {
            addCriterion("PortalId in", values, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidNotIn(List<String> values) {
            addCriterion("PortalId not in", values, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidBetween(String value1, String value2) {
            addCriterion("PortalId between", value1, value2, "portalid");
            return (Criteria) this;
        }

        public Criteria andPortalidNotBetween(String value1, String value2) {
            addCriterion("PortalId not between", value1, value2, "portalid");
            return (Criteria) this;
        }

        public Criteria andRolesIsNull() {
            addCriterion("Roles is null");
            return (Criteria) this;
        }

        public Criteria andRolesIsNotNull() {
            addCriterion("Roles is not null");
            return (Criteria) this;
        }

        public Criteria andRolesEqualTo(String value) {
            addCriterion("Roles =", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotEqualTo(String value) {
            addCriterion("Roles <>", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThan(String value) {
            addCriterion("Roles >", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThanOrEqualTo(String value) {
            addCriterion("Roles >=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThan(String value) {
            addCriterion("Roles <", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThanOrEqualTo(String value) {
            addCriterion("Roles <=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLike(String value) {
            addCriterion("Roles like", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotLike(String value) {
            addCriterion("Roles not like", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesIn(List<String> values) {
            addCriterion("Roles in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotIn(List<String> values) {
            addCriterion("Roles not in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesBetween(String value1, String value2) {
            addCriterion("Roles between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotBetween(String value1, String value2) {
            addCriterion("Roles not between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andNavigationIsNull() {
            addCriterion("Navigation is null");
            return (Criteria) this;
        }

        public Criteria andNavigationIsNotNull() {
            addCriterion("Navigation is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationEqualTo(String value) {
            addCriterion("Navigation =", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationNotEqualTo(String value) {
            addCriterion("Navigation <>", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationGreaterThan(String value) {
            addCriterion("Navigation >", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationGreaterThanOrEqualTo(String value) {
            addCriterion("Navigation >=", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationLessThan(String value) {
            addCriterion("Navigation <", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationLessThanOrEqualTo(String value) {
            addCriterion("Navigation <=", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationLike(String value) {
            addCriterion("Navigation like", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationNotLike(String value) {
            addCriterion("Navigation not like", value, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationIn(List<String> values) {
            addCriterion("Navigation in", values, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationNotIn(List<String> values) {
            addCriterion("Navigation not in", values, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationBetween(String value1, String value2) {
            addCriterion("Navigation between", value1, value2, "navigation");
            return (Criteria) this;
        }

        public Criteria andNavigationNotBetween(String value1, String value2) {
            addCriterion("Navigation not between", value1, value2, "navigation");
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