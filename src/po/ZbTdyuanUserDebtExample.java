package po;

import java.util.ArrayList;
import java.util.List;

public class ZbTdyuanUserDebtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZbTdyuanUserDebtExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanIsNull() {
            addCriterion("hasCreditLoan is null");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanIsNotNull() {
            addCriterion("hasCreditLoan is not null");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanEqualTo(Boolean value) {
            addCriterion("hasCreditLoan =", value, "hasCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanNotEqualTo(Boolean value) {
            addCriterion("hasCreditLoan <>", value, "hasCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanGreaterThan(Boolean value) {
            addCriterion("hasCreditLoan >", value, "hasCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasCreditLoan >=", value, "hasCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanLessThan(Boolean value) {
            addCriterion("hasCreditLoan <", value, "hasCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanLessThanOrEqualTo(Boolean value) {
            addCriterion("hasCreditLoan <=", value, "hasCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanIn(List<Boolean> values) {
            addCriterion("hasCreditLoan in", values, "hasCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanNotIn(List<Boolean> values) {
            addCriterion("hasCreditLoan not in", values, "hasCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanBetween(Boolean value1, Boolean value2) {
            addCriterion("hasCreditLoan between", value1, value2, "hasCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasCreditLoanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasCreditLoan not between", value1, value2, "hasCreditLoan");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountIsNull() {
            addCriterion("creditLoanAmount is null");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountIsNotNull() {
            addCriterion("creditLoanAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountEqualTo(String value) {
            addCriterion("creditLoanAmount =", value, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountNotEqualTo(String value) {
            addCriterion("creditLoanAmount <>", value, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountGreaterThan(String value) {
            addCriterion("creditLoanAmount >", value, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountGreaterThanOrEqualTo(String value) {
            addCriterion("creditLoanAmount >=", value, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountLessThan(String value) {
            addCriterion("creditLoanAmount <", value, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountLessThanOrEqualTo(String value) {
            addCriterion("creditLoanAmount <=", value, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountLike(String value) {
            addCriterion("creditLoanAmount like", value, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountNotLike(String value) {
            addCriterion("creditLoanAmount not like", value, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountIn(List<String> values) {
            addCriterion("creditLoanAmount in", values, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountNotIn(List<String> values) {
            addCriterion("creditLoanAmount not in", values, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountBetween(String value1, String value2) {
            addCriterion("creditLoanAmount between", value1, value2, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanAmountNotBetween(String value1, String value2) {
            addCriterion("creditLoanAmount not between", value1, value2, "creditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceIsNull() {
            addCriterion("creditLoanBalance is null");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceIsNotNull() {
            addCriterion("creditLoanBalance is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceEqualTo(String value) {
            addCriterion("creditLoanBalance =", value, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceNotEqualTo(String value) {
            addCriterion("creditLoanBalance <>", value, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceGreaterThan(String value) {
            addCriterion("creditLoanBalance >", value, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("creditLoanBalance >=", value, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceLessThan(String value) {
            addCriterion("creditLoanBalance <", value, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceLessThanOrEqualTo(String value) {
            addCriterion("creditLoanBalance <=", value, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceLike(String value) {
            addCriterion("creditLoanBalance like", value, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceNotLike(String value) {
            addCriterion("creditLoanBalance not like", value, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceIn(List<String> values) {
            addCriterion("creditLoanBalance in", values, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceNotIn(List<String> values) {
            addCriterion("creditLoanBalance not in", values, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceBetween(String value1, String value2) {
            addCriterion("creditLoanBalance between", value1, value2, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanBalanceNotBetween(String value1, String value2) {
            addCriterion("creditLoanBalance not between", value1, value2, "creditLoanBalance");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntIsNull() {
            addCriterion("creditLoanCnt is null");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntIsNotNull() {
            addCriterion("creditLoanCnt is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntEqualTo(Integer value) {
            addCriterion("creditLoanCnt =", value, "creditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntNotEqualTo(Integer value) {
            addCriterion("creditLoanCnt <>", value, "creditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntGreaterThan(Integer value) {
            addCriterion("creditLoanCnt >", value, "creditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("creditLoanCnt >=", value, "creditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntLessThan(Integer value) {
            addCriterion("creditLoanCnt <", value, "creditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntLessThanOrEqualTo(Integer value) {
            addCriterion("creditLoanCnt <=", value, "creditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntIn(List<Integer> values) {
            addCriterion("creditLoanCnt in", values, "creditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntNotIn(List<Integer> values) {
            addCriterion("creditLoanCnt not in", values, "creditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntBetween(Integer value1, Integer value2) {
            addCriterion("creditLoanCnt between", value1, value2, "creditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andCreditLoanCntNotBetween(Integer value1, Integer value2) {
            addCriterion("creditLoanCnt not between", value1, value2, "creditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgIsNull() {
            addCriterion("creditLoanOrg is null");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgIsNotNull() {
            addCriterion("creditLoanOrg is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgEqualTo(String value) {
            addCriterion("creditLoanOrg =", value, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgNotEqualTo(String value) {
            addCriterion("creditLoanOrg <>", value, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgGreaterThan(String value) {
            addCriterion("creditLoanOrg >", value, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgGreaterThanOrEqualTo(String value) {
            addCriterion("creditLoanOrg >=", value, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgLessThan(String value) {
            addCriterion("creditLoanOrg <", value, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgLessThanOrEqualTo(String value) {
            addCriterion("creditLoanOrg <=", value, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgLike(String value) {
            addCriterion("creditLoanOrg like", value, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgNotLike(String value) {
            addCriterion("creditLoanOrg not like", value, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgIn(List<String> values) {
            addCriterion("creditLoanOrg in", values, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgNotIn(List<String> values) {
            addCriterion("creditLoanOrg not in", values, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgBetween(String value1, String value2) {
            addCriterion("creditLoanOrg between", value1, value2, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andCreditLoanOrgNotBetween(String value1, String value2) {
            addCriterion("creditLoanOrg not between", value1, value2, "creditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanIsNull() {
            addCriterion("hasSmallMortgageLoan is null");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanIsNotNull() {
            addCriterion("hasSmallMortgageLoan is not null");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanEqualTo(Boolean value) {
            addCriterion("hasSmallMortgageLoan =", value, "hasSmallMortgageLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanNotEqualTo(Boolean value) {
            addCriterion("hasSmallMortgageLoan <>", value, "hasSmallMortgageLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanGreaterThan(Boolean value) {
            addCriterion("hasSmallMortgageLoan >", value, "hasSmallMortgageLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasSmallMortgageLoan >=", value, "hasSmallMortgageLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanLessThan(Boolean value) {
            addCriterion("hasSmallMortgageLoan <", value, "hasSmallMortgageLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanLessThanOrEqualTo(Boolean value) {
            addCriterion("hasSmallMortgageLoan <=", value, "hasSmallMortgageLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanIn(List<Boolean> values) {
            addCriterion("hasSmallMortgageLoan in", values, "hasSmallMortgageLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanNotIn(List<Boolean> values) {
            addCriterion("hasSmallMortgageLoan not in", values, "hasSmallMortgageLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanBetween(Boolean value1, Boolean value2) {
            addCriterion("hasSmallMortgageLoan between", value1, value2, "hasSmallMortgageLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallMortgageLoanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasSmallMortgageLoan not between", value1, value2, "hasSmallMortgageLoan");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountIsNull() {
            addCriterion("smallMortgageAmount is null");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountIsNotNull() {
            addCriterion("smallMortgageAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountEqualTo(String value) {
            addCriterion("smallMortgageAmount =", value, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountNotEqualTo(String value) {
            addCriterion("smallMortgageAmount <>", value, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountGreaterThan(String value) {
            addCriterion("smallMortgageAmount >", value, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountGreaterThanOrEqualTo(String value) {
            addCriterion("smallMortgageAmount >=", value, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountLessThan(String value) {
            addCriterion("smallMortgageAmount <", value, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountLessThanOrEqualTo(String value) {
            addCriterion("smallMortgageAmount <=", value, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountLike(String value) {
            addCriterion("smallMortgageAmount like", value, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountNotLike(String value) {
            addCriterion("smallMortgageAmount not like", value, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountIn(List<String> values) {
            addCriterion("smallMortgageAmount in", values, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountNotIn(List<String> values) {
            addCriterion("smallMortgageAmount not in", values, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountBetween(String value1, String value2) {
            addCriterion("smallMortgageAmount between", value1, value2, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageAmountNotBetween(String value1, String value2) {
            addCriterion("smallMortgageAmount not between", value1, value2, "smallMortgageAmount");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceIsNull() {
            addCriterion("smallMortgageBalance is null");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceIsNotNull() {
            addCriterion("smallMortgageBalance is not null");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceEqualTo(String value) {
            addCriterion("smallMortgageBalance =", value, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceNotEqualTo(String value) {
            addCriterion("smallMortgageBalance <>", value, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceGreaterThan(String value) {
            addCriterion("smallMortgageBalance >", value, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("smallMortgageBalance >=", value, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceLessThan(String value) {
            addCriterion("smallMortgageBalance <", value, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceLessThanOrEqualTo(String value) {
            addCriterion("smallMortgageBalance <=", value, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceLike(String value) {
            addCriterion("smallMortgageBalance like", value, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceNotLike(String value) {
            addCriterion("smallMortgageBalance not like", value, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceIn(List<String> values) {
            addCriterion("smallMortgageBalance in", values, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceNotIn(List<String> values) {
            addCriterion("smallMortgageBalance not in", values, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceBetween(String value1, String value2) {
            addCriterion("smallMortgageBalance between", value1, value2, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageBalanceNotBetween(String value1, String value2) {
            addCriterion("smallMortgageBalance not between", value1, value2, "smallMortgageBalance");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntIsNull() {
            addCriterion("smallMortgageCnt is null");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntIsNotNull() {
            addCriterion("smallMortgageCnt is not null");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntEqualTo(Integer value) {
            addCriterion("smallMortgageCnt =", value, "smallMortgageCnt");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntNotEqualTo(Integer value) {
            addCriterion("smallMortgageCnt <>", value, "smallMortgageCnt");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntGreaterThan(Integer value) {
            addCriterion("smallMortgageCnt >", value, "smallMortgageCnt");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("smallMortgageCnt >=", value, "smallMortgageCnt");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntLessThan(Integer value) {
            addCriterion("smallMortgageCnt <", value, "smallMortgageCnt");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntLessThanOrEqualTo(Integer value) {
            addCriterion("smallMortgageCnt <=", value, "smallMortgageCnt");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntIn(List<Integer> values) {
            addCriterion("smallMortgageCnt in", values, "smallMortgageCnt");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntNotIn(List<Integer> values) {
            addCriterion("smallMortgageCnt not in", values, "smallMortgageCnt");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntBetween(Integer value1, Integer value2) {
            addCriterion("smallMortgageCnt between", value1, value2, "smallMortgageCnt");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageCntNotBetween(Integer value1, Integer value2) {
            addCriterion("smallMortgageCnt not between", value1, value2, "smallMortgageCnt");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgIsNull() {
            addCriterion("smallMortgageOrg is null");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgIsNotNull() {
            addCriterion("smallMortgageOrg is not null");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgEqualTo(String value) {
            addCriterion("smallMortgageOrg =", value, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgNotEqualTo(String value) {
            addCriterion("smallMortgageOrg <>", value, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgGreaterThan(String value) {
            addCriterion("smallMortgageOrg >", value, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgGreaterThanOrEqualTo(String value) {
            addCriterion("smallMortgageOrg >=", value, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgLessThan(String value) {
            addCriterion("smallMortgageOrg <", value, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgLessThanOrEqualTo(String value) {
            addCriterion("smallMortgageOrg <=", value, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgLike(String value) {
            addCriterion("smallMortgageOrg like", value, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgNotLike(String value) {
            addCriterion("smallMortgageOrg not like", value, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgIn(List<String> values) {
            addCriterion("smallMortgageOrg in", values, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgNotIn(List<String> values) {
            addCriterion("smallMortgageOrg not in", values, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgBetween(String value1, String value2) {
            addCriterion("smallMortgageOrg between", value1, value2, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andSmallMortgageOrgNotBetween(String value1, String value2) {
            addCriterion("smallMortgageOrg not between", value1, value2, "smallMortgageOrg");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanIsNull() {
            addCriterion("hasSmallLoan is null");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanIsNotNull() {
            addCriterion("hasSmallLoan is not null");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanEqualTo(Boolean value) {
            addCriterion("hasSmallLoan =", value, "hasSmallLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanNotEqualTo(Boolean value) {
            addCriterion("hasSmallLoan <>", value, "hasSmallLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanGreaterThan(Boolean value) {
            addCriterion("hasSmallLoan >", value, "hasSmallLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasSmallLoan >=", value, "hasSmallLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanLessThan(Boolean value) {
            addCriterion("hasSmallLoan <", value, "hasSmallLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanLessThanOrEqualTo(Boolean value) {
            addCriterion("hasSmallLoan <=", value, "hasSmallLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanIn(List<Boolean> values) {
            addCriterion("hasSmallLoan in", values, "hasSmallLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanNotIn(List<Boolean> values) {
            addCriterion("hasSmallLoan not in", values, "hasSmallLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanBetween(Boolean value1, Boolean value2) {
            addCriterion("hasSmallLoan between", value1, value2, "hasSmallLoan");
            return (Criteria) this;
        }

        public Criteria andHasSmallLoanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasSmallLoan not between", value1, value2, "hasSmallLoan");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountIsNull() {
            addCriterion("smallLoanAmount is null");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountIsNotNull() {
            addCriterion("smallLoanAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountEqualTo(String value) {
            addCriterion("smallLoanAmount =", value, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountNotEqualTo(String value) {
            addCriterion("smallLoanAmount <>", value, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountGreaterThan(String value) {
            addCriterion("smallLoanAmount >", value, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountGreaterThanOrEqualTo(String value) {
            addCriterion("smallLoanAmount >=", value, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountLessThan(String value) {
            addCriterion("smallLoanAmount <", value, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountLessThanOrEqualTo(String value) {
            addCriterion("smallLoanAmount <=", value, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountLike(String value) {
            addCriterion("smallLoanAmount like", value, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountNotLike(String value) {
            addCriterion("smallLoanAmount not like", value, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountIn(List<String> values) {
            addCriterion("smallLoanAmount in", values, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountNotIn(List<String> values) {
            addCriterion("smallLoanAmount not in", values, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountBetween(String value1, String value2) {
            addCriterion("smallLoanAmount between", value1, value2, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanAmountNotBetween(String value1, String value2) {
            addCriterion("smallLoanAmount not between", value1, value2, "smallLoanAmount");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceIsNull() {
            addCriterion("smallLoanBalance is null");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceIsNotNull() {
            addCriterion("smallLoanBalance is not null");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceEqualTo(String value) {
            addCriterion("smallLoanBalance =", value, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceNotEqualTo(String value) {
            addCriterion("smallLoanBalance <>", value, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceGreaterThan(String value) {
            addCriterion("smallLoanBalance >", value, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("smallLoanBalance >=", value, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceLessThan(String value) {
            addCriterion("smallLoanBalance <", value, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceLessThanOrEqualTo(String value) {
            addCriterion("smallLoanBalance <=", value, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceLike(String value) {
            addCriterion("smallLoanBalance like", value, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceNotLike(String value) {
            addCriterion("smallLoanBalance not like", value, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceIn(List<String> values) {
            addCriterion("smallLoanBalance in", values, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceNotIn(List<String> values) {
            addCriterion("smallLoanBalance not in", values, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceBetween(String value1, String value2) {
            addCriterion("smallLoanBalance between", value1, value2, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanBalanceNotBetween(String value1, String value2) {
            addCriterion("smallLoanBalance not between", value1, value2, "smallLoanBalance");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntIsNull() {
            addCriterion("smallLoanCnt is null");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntIsNotNull() {
            addCriterion("smallLoanCnt is not null");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntEqualTo(Integer value) {
            addCriterion("smallLoanCnt =", value, "smallLoanCnt");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntNotEqualTo(Integer value) {
            addCriterion("smallLoanCnt <>", value, "smallLoanCnt");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntGreaterThan(Integer value) {
            addCriterion("smallLoanCnt >", value, "smallLoanCnt");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("smallLoanCnt >=", value, "smallLoanCnt");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntLessThan(Integer value) {
            addCriterion("smallLoanCnt <", value, "smallLoanCnt");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntLessThanOrEqualTo(Integer value) {
            addCriterion("smallLoanCnt <=", value, "smallLoanCnt");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntIn(List<Integer> values) {
            addCriterion("smallLoanCnt in", values, "smallLoanCnt");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntNotIn(List<Integer> values) {
            addCriterion("smallLoanCnt not in", values, "smallLoanCnt");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntBetween(Integer value1, Integer value2) {
            addCriterion("smallLoanCnt between", value1, value2, "smallLoanCnt");
            return (Criteria) this;
        }

        public Criteria andSmallLoanCntNotBetween(Integer value1, Integer value2) {
            addCriterion("smallLoanCnt not between", value1, value2, "smallLoanCnt");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgIsNull() {
            addCriterion("smallLoanOrg is null");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgIsNotNull() {
            addCriterion("smallLoanOrg is not null");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgEqualTo(String value) {
            addCriterion("smallLoanOrg =", value, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgNotEqualTo(String value) {
            addCriterion("smallLoanOrg <>", value, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgGreaterThan(String value) {
            addCriterion("smallLoanOrg >", value, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgGreaterThanOrEqualTo(String value) {
            addCriterion("smallLoanOrg >=", value, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgLessThan(String value) {
            addCriterion("smallLoanOrg <", value, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgLessThanOrEqualTo(String value) {
            addCriterion("smallLoanOrg <=", value, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgLike(String value) {
            addCriterion("smallLoanOrg like", value, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgNotLike(String value) {
            addCriterion("smallLoanOrg not like", value, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgIn(List<String> values) {
            addCriterion("smallLoanOrg in", values, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgNotIn(List<String> values) {
            addCriterion("smallLoanOrg not in", values, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgBetween(String value1, String value2) {
            addCriterion("smallLoanOrg between", value1, value2, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andSmallLoanOrgNotBetween(String value1, String value2) {
            addCriterion("smallLoanOrg not between", value1, value2, "smallLoanOrg");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardIsNull() {
            addCriterion("hasCreditCard is null");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardIsNotNull() {
            addCriterion("hasCreditCard is not null");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardEqualTo(Boolean value) {
            addCriterion("hasCreditCard =", value, "hasCreditCard");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardNotEqualTo(Boolean value) {
            addCriterion("hasCreditCard <>", value, "hasCreditCard");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardGreaterThan(Boolean value) {
            addCriterion("hasCreditCard >", value, "hasCreditCard");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasCreditCard >=", value, "hasCreditCard");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardLessThan(Boolean value) {
            addCriterion("hasCreditCard <", value, "hasCreditCard");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardLessThanOrEqualTo(Boolean value) {
            addCriterion("hasCreditCard <=", value, "hasCreditCard");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardIn(List<Boolean> values) {
            addCriterion("hasCreditCard in", values, "hasCreditCard");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardNotIn(List<Boolean> values) {
            addCriterion("hasCreditCard not in", values, "hasCreditCard");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardBetween(Boolean value1, Boolean value2) {
            addCriterion("hasCreditCard between", value1, value2, "hasCreditCard");
            return (Criteria) this;
        }

        public Criteria andHasCreditCardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasCreditCard not between", value1, value2, "hasCreditCard");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntIsNull() {
            addCriterion("creditCardCnt is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntIsNotNull() {
            addCriterion("creditCardCnt is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntEqualTo(Integer value) {
            addCriterion("creditCardCnt =", value, "creditCardCnt");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntNotEqualTo(Integer value) {
            addCriterion("creditCardCnt <>", value, "creditCardCnt");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntGreaterThan(Integer value) {
            addCriterion("creditCardCnt >", value, "creditCardCnt");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("creditCardCnt >=", value, "creditCardCnt");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntLessThan(Integer value) {
            addCriterion("creditCardCnt <", value, "creditCardCnt");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntLessThanOrEqualTo(Integer value) {
            addCriterion("creditCardCnt <=", value, "creditCardCnt");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntIn(List<Integer> values) {
            addCriterion("creditCardCnt in", values, "creditCardCnt");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntNotIn(List<Integer> values) {
            addCriterion("creditCardCnt not in", values, "creditCardCnt");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntBetween(Integer value1, Integer value2) {
            addCriterion("creditCardCnt between", value1, value2, "creditCardCnt");
            return (Criteria) this;
        }

        public Criteria andCreditCardCntNotBetween(Integer value1, Integer value2) {
            addCriterion("creditCardCnt not between", value1, value2, "creditCardCnt");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaIsNull() {
            addCriterion("creditCardQuota is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaIsNotNull() {
            addCriterion("creditCardQuota is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaEqualTo(String value) {
            addCriterion("creditCardQuota =", value, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaNotEqualTo(String value) {
            addCriterion("creditCardQuota <>", value, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaGreaterThan(String value) {
            addCriterion("creditCardQuota >", value, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaGreaterThanOrEqualTo(String value) {
            addCriterion("creditCardQuota >=", value, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaLessThan(String value) {
            addCriterion("creditCardQuota <", value, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaLessThanOrEqualTo(String value) {
            addCriterion("creditCardQuota <=", value, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaLike(String value) {
            addCriterion("creditCardQuota like", value, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaNotLike(String value) {
            addCriterion("creditCardQuota not like", value, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaIn(List<String> values) {
            addCriterion("creditCardQuota in", values, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaNotIn(List<String> values) {
            addCriterion("creditCardQuota not in", values, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaBetween(String value1, String value2) {
            addCriterion("creditCardQuota between", value1, value2, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardQuotaNotBetween(String value1, String value2) {
            addCriterion("creditCardQuota not between", value1, value2, "creditCardQuota");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtIsNull() {
            addCriterion("creditCardDebt is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtIsNotNull() {
            addCriterion("creditCardDebt is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtEqualTo(String value) {
            addCriterion("creditCardDebt =", value, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtNotEqualTo(String value) {
            addCriterion("creditCardDebt <>", value, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtGreaterThan(String value) {
            addCriterion("creditCardDebt >", value, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtGreaterThanOrEqualTo(String value) {
            addCriterion("creditCardDebt >=", value, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtLessThan(String value) {
            addCriterion("creditCardDebt <", value, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtLessThanOrEqualTo(String value) {
            addCriterion("creditCardDebt <=", value, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtLike(String value) {
            addCriterion("creditCardDebt like", value, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtNotLike(String value) {
            addCriterion("creditCardDebt not like", value, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtIn(List<String> values) {
            addCriterion("creditCardDebt in", values, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtNotIn(List<String> values) {
            addCriterion("creditCardDebt not in", values, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtBetween(String value1, String value2) {
            addCriterion("creditCardDebt between", value1, value2, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andCreditCardDebtNotBetween(String value1, String value2) {
            addCriterion("creditCardDebt not between", value1, value2, "creditCardDebt");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanIsNull() {
            addCriterion("hasOtherNotCreditLoan is null");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanIsNotNull() {
            addCriterion("hasOtherNotCreditLoan is not null");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanEqualTo(Boolean value) {
            addCriterion("hasOtherNotCreditLoan =", value, "hasOtherNotCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanNotEqualTo(Boolean value) {
            addCriterion("hasOtherNotCreditLoan <>", value, "hasOtherNotCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanGreaterThan(Boolean value) {
            addCriterion("hasOtherNotCreditLoan >", value, "hasOtherNotCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasOtherNotCreditLoan >=", value, "hasOtherNotCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanLessThan(Boolean value) {
            addCriterion("hasOtherNotCreditLoan <", value, "hasOtherNotCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanLessThanOrEqualTo(Boolean value) {
            addCriterion("hasOtherNotCreditLoan <=", value, "hasOtherNotCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanIn(List<Boolean> values) {
            addCriterion("hasOtherNotCreditLoan in", values, "hasOtherNotCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanNotIn(List<Boolean> values) {
            addCriterion("hasOtherNotCreditLoan not in", values, "hasOtherNotCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanBetween(Boolean value1, Boolean value2) {
            addCriterion("hasOtherNotCreditLoan between", value1, value2, "hasOtherNotCreditLoan");
            return (Criteria) this;
        }

        public Criteria andHasOtherNotCreditLoanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasOtherNotCreditLoan not between", value1, value2, "hasOtherNotCreditLoan");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntIsNull() {
            addCriterion("otherNotCreditLoanCnt is null");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntIsNotNull() {
            addCriterion("otherNotCreditLoanCnt is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntEqualTo(String value) {
            addCriterion("otherNotCreditLoanCnt =", value, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntNotEqualTo(String value) {
            addCriterion("otherNotCreditLoanCnt <>", value, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntGreaterThan(String value) {
            addCriterion("otherNotCreditLoanCnt >", value, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntGreaterThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanCnt >=", value, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntLessThan(String value) {
            addCriterion("otherNotCreditLoanCnt <", value, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntLessThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanCnt <=", value, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntLike(String value) {
            addCriterion("otherNotCreditLoanCnt like", value, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntNotLike(String value) {
            addCriterion("otherNotCreditLoanCnt not like", value, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntIn(List<String> values) {
            addCriterion("otherNotCreditLoanCnt in", values, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntNotIn(List<String> values) {
            addCriterion("otherNotCreditLoanCnt not in", values, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanCnt between", value1, value2, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanCntNotBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanCnt not between", value1, value2, "otherNotCreditLoanCnt");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountIsNull() {
            addCriterion("otherNotCreditLoanAmount is null");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountIsNotNull() {
            addCriterion("otherNotCreditLoanAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountEqualTo(String value) {
            addCriterion("otherNotCreditLoanAmount =", value, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountNotEqualTo(String value) {
            addCriterion("otherNotCreditLoanAmount <>", value, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountGreaterThan(String value) {
            addCriterion("otherNotCreditLoanAmount >", value, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountGreaterThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanAmount >=", value, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountLessThan(String value) {
            addCriterion("otherNotCreditLoanAmount <", value, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountLessThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanAmount <=", value, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountLike(String value) {
            addCriterion("otherNotCreditLoanAmount like", value, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountNotLike(String value) {
            addCriterion("otherNotCreditLoanAmount not like", value, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountIn(List<String> values) {
            addCriterion("otherNotCreditLoanAmount in", values, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountNotIn(List<String> values) {
            addCriterion("otherNotCreditLoanAmount not in", values, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanAmount between", value1, value2, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanAmountNotBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanAmount not between", value1, value2, "otherNotCreditLoanAmount");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgIsNull() {
            addCriterion("otherNotCreditLoanOrg is null");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgIsNotNull() {
            addCriterion("otherNotCreditLoanOrg is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgEqualTo(String value) {
            addCriterion("otherNotCreditLoanOrg =", value, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgNotEqualTo(String value) {
            addCriterion("otherNotCreditLoanOrg <>", value, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgGreaterThan(String value) {
            addCriterion("otherNotCreditLoanOrg >", value, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgGreaterThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanOrg >=", value, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgLessThan(String value) {
            addCriterion("otherNotCreditLoanOrg <", value, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgLessThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanOrg <=", value, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgLike(String value) {
            addCriterion("otherNotCreditLoanOrg like", value, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgNotLike(String value) {
            addCriterion("otherNotCreditLoanOrg not like", value, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgIn(List<String> values) {
            addCriterion("otherNotCreditLoanOrg in", values, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgNotIn(List<String> values) {
            addCriterion("otherNotCreditLoanOrg not in", values, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanOrg between", value1, value2, "otherNotCreditLoanOrg");
            return (Criteria) this;
        }

        public Criteria andOtherNotCreditLoanOrgNotBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanOrg not between", value1, value2, "otherNotCreditLoanOrg");
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