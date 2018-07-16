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

        public Criteria andDbtIdIsNull() {
            addCriterion("dbt_id is null");
            return (Criteria) this;
        }

        public Criteria andDbtIdIsNotNull() {
            addCriterion("dbt_id is not null");
            return (Criteria) this;
        }

        public Criteria andDbtIdEqualTo(Integer value) {
            addCriterion("dbt_id =", value, "dbtId");
            return (Criteria) this;
        }

        public Criteria andDbtIdNotEqualTo(Integer value) {
            addCriterion("dbt_id <>", value, "dbtId");
            return (Criteria) this;
        }

        public Criteria andDbtIdGreaterThan(Integer value) {
            addCriterion("dbt_id >", value, "dbtId");
            return (Criteria) this;
        }

        public Criteria andDbtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dbt_id >=", value, "dbtId");
            return (Criteria) this;
        }

        public Criteria andDbtIdLessThan(Integer value) {
            addCriterion("dbt_id <", value, "dbtId");
            return (Criteria) this;
        }

        public Criteria andDbtIdLessThanOrEqualTo(Integer value) {
            addCriterion("dbt_id <=", value, "dbtId");
            return (Criteria) this;
        }

        public Criteria andDbtIdIn(List<Integer> values) {
            addCriterion("dbt_id in", values, "dbtId");
            return (Criteria) this;
        }

        public Criteria andDbtIdNotIn(List<Integer> values) {
            addCriterion("dbt_id not in", values, "dbtId");
            return (Criteria) this;
        }

        public Criteria andDbtIdBetween(Integer value1, Integer value2) {
            addCriterion("dbt_id between", value1, value2, "dbtId");
            return (Criteria) this;
        }

        public Criteria andDbtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dbt_id not between", value1, value2, "dbtId");
            return (Criteria) this;
        }

        public Criteria andHascreditloanIsNull() {
            addCriterion("hasCreditLoan is null");
            return (Criteria) this;
        }

        public Criteria andHascreditloanIsNotNull() {
            addCriterion("hasCreditLoan is not null");
            return (Criteria) this;
        }

        public Criteria andHascreditloanEqualTo(Boolean value) {
            addCriterion("hasCreditLoan =", value, "hascreditloan");
            return (Criteria) this;
        }

        public Criteria andHascreditloanNotEqualTo(Boolean value) {
            addCriterion("hasCreditLoan <>", value, "hascreditloan");
            return (Criteria) this;
        }

        public Criteria andHascreditloanGreaterThan(Boolean value) {
            addCriterion("hasCreditLoan >", value, "hascreditloan");
            return (Criteria) this;
        }

        public Criteria andHascreditloanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasCreditLoan >=", value, "hascreditloan");
            return (Criteria) this;
        }

        public Criteria andHascreditloanLessThan(Boolean value) {
            addCriterion("hasCreditLoan <", value, "hascreditloan");
            return (Criteria) this;
        }

        public Criteria andHascreditloanLessThanOrEqualTo(Boolean value) {
            addCriterion("hasCreditLoan <=", value, "hascreditloan");
            return (Criteria) this;
        }

        public Criteria andHascreditloanIn(List<Boolean> values) {
            addCriterion("hasCreditLoan in", values, "hascreditloan");
            return (Criteria) this;
        }

        public Criteria andHascreditloanNotIn(List<Boolean> values) {
            addCriterion("hasCreditLoan not in", values, "hascreditloan");
            return (Criteria) this;
        }

        public Criteria andHascreditloanBetween(Boolean value1, Boolean value2) {
            addCriterion("hasCreditLoan between", value1, value2, "hascreditloan");
            return (Criteria) this;
        }

        public Criteria andHascreditloanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasCreditLoan not between", value1, value2, "hascreditloan");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountIsNull() {
            addCriterion("creditLoanAmount is null");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountIsNotNull() {
            addCriterion("creditLoanAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountEqualTo(String value) {
            addCriterion("creditLoanAmount =", value, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountNotEqualTo(String value) {
            addCriterion("creditLoanAmount <>", value, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountGreaterThan(String value) {
            addCriterion("creditLoanAmount >", value, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountGreaterThanOrEqualTo(String value) {
            addCriterion("creditLoanAmount >=", value, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountLessThan(String value) {
            addCriterion("creditLoanAmount <", value, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountLessThanOrEqualTo(String value) {
            addCriterion("creditLoanAmount <=", value, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountLike(String value) {
            addCriterion("creditLoanAmount like", value, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountNotLike(String value) {
            addCriterion("creditLoanAmount not like", value, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountIn(List<String> values) {
            addCriterion("creditLoanAmount in", values, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountNotIn(List<String> values) {
            addCriterion("creditLoanAmount not in", values, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountBetween(String value1, String value2) {
            addCriterion("creditLoanAmount between", value1, value2, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanamountNotBetween(String value1, String value2) {
            addCriterion("creditLoanAmount not between", value1, value2, "creditloanamount");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceIsNull() {
            addCriterion("creditLoanBalance is null");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceIsNotNull() {
            addCriterion("creditLoanBalance is not null");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceEqualTo(String value) {
            addCriterion("creditLoanBalance =", value, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceNotEqualTo(String value) {
            addCriterion("creditLoanBalance <>", value, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceGreaterThan(String value) {
            addCriterion("creditLoanBalance >", value, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("creditLoanBalance >=", value, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceLessThan(String value) {
            addCriterion("creditLoanBalance <", value, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceLessThanOrEqualTo(String value) {
            addCriterion("creditLoanBalance <=", value, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceLike(String value) {
            addCriterion("creditLoanBalance like", value, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceNotLike(String value) {
            addCriterion("creditLoanBalance not like", value, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceIn(List<String> values) {
            addCriterion("creditLoanBalance in", values, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceNotIn(List<String> values) {
            addCriterion("creditLoanBalance not in", values, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceBetween(String value1, String value2) {
            addCriterion("creditLoanBalance between", value1, value2, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloanbalanceNotBetween(String value1, String value2) {
            addCriterion("creditLoanBalance not between", value1, value2, "creditloanbalance");
            return (Criteria) this;
        }

        public Criteria andCreditloancntIsNull() {
            addCriterion("creditLoanCnt is null");
            return (Criteria) this;
        }

        public Criteria andCreditloancntIsNotNull() {
            addCriterion("creditLoanCnt is not null");
            return (Criteria) this;
        }

        public Criteria andCreditloancntEqualTo(Integer value) {
            addCriterion("creditLoanCnt =", value, "creditloancnt");
            return (Criteria) this;
        }

        public Criteria andCreditloancntNotEqualTo(Integer value) {
            addCriterion("creditLoanCnt <>", value, "creditloancnt");
            return (Criteria) this;
        }

        public Criteria andCreditloancntGreaterThan(Integer value) {
            addCriterion("creditLoanCnt >", value, "creditloancnt");
            return (Criteria) this;
        }

        public Criteria andCreditloancntGreaterThanOrEqualTo(Integer value) {
            addCriterion("creditLoanCnt >=", value, "creditloancnt");
            return (Criteria) this;
        }

        public Criteria andCreditloancntLessThan(Integer value) {
            addCriterion("creditLoanCnt <", value, "creditloancnt");
            return (Criteria) this;
        }

        public Criteria andCreditloancntLessThanOrEqualTo(Integer value) {
            addCriterion("creditLoanCnt <=", value, "creditloancnt");
            return (Criteria) this;
        }

        public Criteria andCreditloancntIn(List<Integer> values) {
            addCriterion("creditLoanCnt in", values, "creditloancnt");
            return (Criteria) this;
        }

        public Criteria andCreditloancntNotIn(List<Integer> values) {
            addCriterion("creditLoanCnt not in", values, "creditloancnt");
            return (Criteria) this;
        }

        public Criteria andCreditloancntBetween(Integer value1, Integer value2) {
            addCriterion("creditLoanCnt between", value1, value2, "creditloancnt");
            return (Criteria) this;
        }

        public Criteria andCreditloancntNotBetween(Integer value1, Integer value2) {
            addCriterion("creditLoanCnt not between", value1, value2, "creditloancnt");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgIsNull() {
            addCriterion("creditLoanOrg is null");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgIsNotNull() {
            addCriterion("creditLoanOrg is not null");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgEqualTo(String value) {
            addCriterion("creditLoanOrg =", value, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgNotEqualTo(String value) {
            addCriterion("creditLoanOrg <>", value, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgGreaterThan(String value) {
            addCriterion("creditLoanOrg >", value, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgGreaterThanOrEqualTo(String value) {
            addCriterion("creditLoanOrg >=", value, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgLessThan(String value) {
            addCriterion("creditLoanOrg <", value, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgLessThanOrEqualTo(String value) {
            addCriterion("creditLoanOrg <=", value, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgLike(String value) {
            addCriterion("creditLoanOrg like", value, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgNotLike(String value) {
            addCriterion("creditLoanOrg not like", value, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgIn(List<String> values) {
            addCriterion("creditLoanOrg in", values, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgNotIn(List<String> values) {
            addCriterion("creditLoanOrg not in", values, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgBetween(String value1, String value2) {
            addCriterion("creditLoanOrg between", value1, value2, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andCreditloanorgNotBetween(String value1, String value2) {
            addCriterion("creditLoanOrg not between", value1, value2, "creditloanorg");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanIsNull() {
            addCriterion("hasSmallMortgageLoan is null");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanIsNotNull() {
            addCriterion("hasSmallMortgageLoan is not null");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanEqualTo(Boolean value) {
            addCriterion("hasSmallMortgageLoan =", value, "hassmallmortgageloan");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanNotEqualTo(Boolean value) {
            addCriterion("hasSmallMortgageLoan <>", value, "hassmallmortgageloan");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanGreaterThan(Boolean value) {
            addCriterion("hasSmallMortgageLoan >", value, "hassmallmortgageloan");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasSmallMortgageLoan >=", value, "hassmallmortgageloan");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanLessThan(Boolean value) {
            addCriterion("hasSmallMortgageLoan <", value, "hassmallmortgageloan");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanLessThanOrEqualTo(Boolean value) {
            addCriterion("hasSmallMortgageLoan <=", value, "hassmallmortgageloan");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanIn(List<Boolean> values) {
            addCriterion("hasSmallMortgageLoan in", values, "hassmallmortgageloan");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanNotIn(List<Boolean> values) {
            addCriterion("hasSmallMortgageLoan not in", values, "hassmallmortgageloan");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanBetween(Boolean value1, Boolean value2) {
            addCriterion("hasSmallMortgageLoan between", value1, value2, "hassmallmortgageloan");
            return (Criteria) this;
        }

        public Criteria andHassmallmortgageloanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasSmallMortgageLoan not between", value1, value2, "hassmallmortgageloan");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountIsNull() {
            addCriterion("smallMortgageAmount is null");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountIsNotNull() {
            addCriterion("smallMortgageAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountEqualTo(String value) {
            addCriterion("smallMortgageAmount =", value, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountNotEqualTo(String value) {
            addCriterion("smallMortgageAmount <>", value, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountGreaterThan(String value) {
            addCriterion("smallMortgageAmount >", value, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountGreaterThanOrEqualTo(String value) {
            addCriterion("smallMortgageAmount >=", value, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountLessThan(String value) {
            addCriterion("smallMortgageAmount <", value, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountLessThanOrEqualTo(String value) {
            addCriterion("smallMortgageAmount <=", value, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountLike(String value) {
            addCriterion("smallMortgageAmount like", value, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountNotLike(String value) {
            addCriterion("smallMortgageAmount not like", value, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountIn(List<String> values) {
            addCriterion("smallMortgageAmount in", values, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountNotIn(List<String> values) {
            addCriterion("smallMortgageAmount not in", values, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountBetween(String value1, String value2) {
            addCriterion("smallMortgageAmount between", value1, value2, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageamountNotBetween(String value1, String value2) {
            addCriterion("smallMortgageAmount not between", value1, value2, "smallmortgageamount");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceIsNull() {
            addCriterion("smallMortgageBalance is null");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceIsNotNull() {
            addCriterion("smallMortgageBalance is not null");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceEqualTo(String value) {
            addCriterion("smallMortgageBalance =", value, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceNotEqualTo(String value) {
            addCriterion("smallMortgageBalance <>", value, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceGreaterThan(String value) {
            addCriterion("smallMortgageBalance >", value, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceGreaterThanOrEqualTo(String value) {
            addCriterion("smallMortgageBalance >=", value, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceLessThan(String value) {
            addCriterion("smallMortgageBalance <", value, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceLessThanOrEqualTo(String value) {
            addCriterion("smallMortgageBalance <=", value, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceLike(String value) {
            addCriterion("smallMortgageBalance like", value, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceNotLike(String value) {
            addCriterion("smallMortgageBalance not like", value, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceIn(List<String> values) {
            addCriterion("smallMortgageBalance in", values, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceNotIn(List<String> values) {
            addCriterion("smallMortgageBalance not in", values, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceBetween(String value1, String value2) {
            addCriterion("smallMortgageBalance between", value1, value2, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagebalanceNotBetween(String value1, String value2) {
            addCriterion("smallMortgageBalance not between", value1, value2, "smallmortgagebalance");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntIsNull() {
            addCriterion("smallMortgageCnt is null");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntIsNotNull() {
            addCriterion("smallMortgageCnt is not null");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntEqualTo(Integer value) {
            addCriterion("smallMortgageCnt =", value, "smallmortgagecnt");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntNotEqualTo(Integer value) {
            addCriterion("smallMortgageCnt <>", value, "smallmortgagecnt");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntGreaterThan(Integer value) {
            addCriterion("smallMortgageCnt >", value, "smallmortgagecnt");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntGreaterThanOrEqualTo(Integer value) {
            addCriterion("smallMortgageCnt >=", value, "smallmortgagecnt");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntLessThan(Integer value) {
            addCriterion("smallMortgageCnt <", value, "smallmortgagecnt");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntLessThanOrEqualTo(Integer value) {
            addCriterion("smallMortgageCnt <=", value, "smallmortgagecnt");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntIn(List<Integer> values) {
            addCriterion("smallMortgageCnt in", values, "smallmortgagecnt");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntNotIn(List<Integer> values) {
            addCriterion("smallMortgageCnt not in", values, "smallmortgagecnt");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntBetween(Integer value1, Integer value2) {
            addCriterion("smallMortgageCnt between", value1, value2, "smallmortgagecnt");
            return (Criteria) this;
        }

        public Criteria andSmallmortgagecntNotBetween(Integer value1, Integer value2) {
            addCriterion("smallMortgageCnt not between", value1, value2, "smallmortgagecnt");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgIsNull() {
            addCriterion("smallMortgageOrg is null");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgIsNotNull() {
            addCriterion("smallMortgageOrg is not null");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgEqualTo(String value) {
            addCriterion("smallMortgageOrg =", value, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgNotEqualTo(String value) {
            addCriterion("smallMortgageOrg <>", value, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgGreaterThan(String value) {
            addCriterion("smallMortgageOrg >", value, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgGreaterThanOrEqualTo(String value) {
            addCriterion("smallMortgageOrg >=", value, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgLessThan(String value) {
            addCriterion("smallMortgageOrg <", value, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgLessThanOrEqualTo(String value) {
            addCriterion("smallMortgageOrg <=", value, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgLike(String value) {
            addCriterion("smallMortgageOrg like", value, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgNotLike(String value) {
            addCriterion("smallMortgageOrg not like", value, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgIn(List<String> values) {
            addCriterion("smallMortgageOrg in", values, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgNotIn(List<String> values) {
            addCriterion("smallMortgageOrg not in", values, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgBetween(String value1, String value2) {
            addCriterion("smallMortgageOrg between", value1, value2, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andSmallmortgageorgNotBetween(String value1, String value2) {
            addCriterion("smallMortgageOrg not between", value1, value2, "smallmortgageorg");
            return (Criteria) this;
        }

        public Criteria andHassmallloanIsNull() {
            addCriterion("hasSmallLoan is null");
            return (Criteria) this;
        }

        public Criteria andHassmallloanIsNotNull() {
            addCriterion("hasSmallLoan is not null");
            return (Criteria) this;
        }

        public Criteria andHassmallloanEqualTo(Boolean value) {
            addCriterion("hasSmallLoan =", value, "hassmallloan");
            return (Criteria) this;
        }

        public Criteria andHassmallloanNotEqualTo(Boolean value) {
            addCriterion("hasSmallLoan <>", value, "hassmallloan");
            return (Criteria) this;
        }

        public Criteria andHassmallloanGreaterThan(Boolean value) {
            addCriterion("hasSmallLoan >", value, "hassmallloan");
            return (Criteria) this;
        }

        public Criteria andHassmallloanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasSmallLoan >=", value, "hassmallloan");
            return (Criteria) this;
        }

        public Criteria andHassmallloanLessThan(Boolean value) {
            addCriterion("hasSmallLoan <", value, "hassmallloan");
            return (Criteria) this;
        }

        public Criteria andHassmallloanLessThanOrEqualTo(Boolean value) {
            addCriterion("hasSmallLoan <=", value, "hassmallloan");
            return (Criteria) this;
        }

        public Criteria andHassmallloanIn(List<Boolean> values) {
            addCriterion("hasSmallLoan in", values, "hassmallloan");
            return (Criteria) this;
        }

        public Criteria andHassmallloanNotIn(List<Boolean> values) {
            addCriterion("hasSmallLoan not in", values, "hassmallloan");
            return (Criteria) this;
        }

        public Criteria andHassmallloanBetween(Boolean value1, Boolean value2) {
            addCriterion("hasSmallLoan between", value1, value2, "hassmallloan");
            return (Criteria) this;
        }

        public Criteria andHassmallloanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasSmallLoan not between", value1, value2, "hassmallloan");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountIsNull() {
            addCriterion("smallLoanAmount is null");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountIsNotNull() {
            addCriterion("smallLoanAmount is not null");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountEqualTo(String value) {
            addCriterion("smallLoanAmount =", value, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountNotEqualTo(String value) {
            addCriterion("smallLoanAmount <>", value, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountGreaterThan(String value) {
            addCriterion("smallLoanAmount >", value, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountGreaterThanOrEqualTo(String value) {
            addCriterion("smallLoanAmount >=", value, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountLessThan(String value) {
            addCriterion("smallLoanAmount <", value, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountLessThanOrEqualTo(String value) {
            addCriterion("smallLoanAmount <=", value, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountLike(String value) {
            addCriterion("smallLoanAmount like", value, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountNotLike(String value) {
            addCriterion("smallLoanAmount not like", value, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountIn(List<String> values) {
            addCriterion("smallLoanAmount in", values, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountNotIn(List<String> values) {
            addCriterion("smallLoanAmount not in", values, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountBetween(String value1, String value2) {
            addCriterion("smallLoanAmount between", value1, value2, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanamountNotBetween(String value1, String value2) {
            addCriterion("smallLoanAmount not between", value1, value2, "smallloanamount");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceIsNull() {
            addCriterion("smallLoanBalance is null");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceIsNotNull() {
            addCriterion("smallLoanBalance is not null");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceEqualTo(String value) {
            addCriterion("smallLoanBalance =", value, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceNotEqualTo(String value) {
            addCriterion("smallLoanBalance <>", value, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceGreaterThan(String value) {
            addCriterion("smallLoanBalance >", value, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("smallLoanBalance >=", value, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceLessThan(String value) {
            addCriterion("smallLoanBalance <", value, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceLessThanOrEqualTo(String value) {
            addCriterion("smallLoanBalance <=", value, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceLike(String value) {
            addCriterion("smallLoanBalance like", value, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceNotLike(String value) {
            addCriterion("smallLoanBalance not like", value, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceIn(List<String> values) {
            addCriterion("smallLoanBalance in", values, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceNotIn(List<String> values) {
            addCriterion("smallLoanBalance not in", values, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceBetween(String value1, String value2) {
            addCriterion("smallLoanBalance between", value1, value2, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloanbalanceNotBetween(String value1, String value2) {
            addCriterion("smallLoanBalance not between", value1, value2, "smallloanbalance");
            return (Criteria) this;
        }

        public Criteria andSmallloancntIsNull() {
            addCriterion("smallLoanCnt is null");
            return (Criteria) this;
        }

        public Criteria andSmallloancntIsNotNull() {
            addCriterion("smallLoanCnt is not null");
            return (Criteria) this;
        }

        public Criteria andSmallloancntEqualTo(Integer value) {
            addCriterion("smallLoanCnt =", value, "smallloancnt");
            return (Criteria) this;
        }

        public Criteria andSmallloancntNotEqualTo(Integer value) {
            addCriterion("smallLoanCnt <>", value, "smallloancnt");
            return (Criteria) this;
        }

        public Criteria andSmallloancntGreaterThan(Integer value) {
            addCriterion("smallLoanCnt >", value, "smallloancnt");
            return (Criteria) this;
        }

        public Criteria andSmallloancntGreaterThanOrEqualTo(Integer value) {
            addCriterion("smallLoanCnt >=", value, "smallloancnt");
            return (Criteria) this;
        }

        public Criteria andSmallloancntLessThan(Integer value) {
            addCriterion("smallLoanCnt <", value, "smallloancnt");
            return (Criteria) this;
        }

        public Criteria andSmallloancntLessThanOrEqualTo(Integer value) {
            addCriterion("smallLoanCnt <=", value, "smallloancnt");
            return (Criteria) this;
        }

        public Criteria andSmallloancntIn(List<Integer> values) {
            addCriterion("smallLoanCnt in", values, "smallloancnt");
            return (Criteria) this;
        }

        public Criteria andSmallloancntNotIn(List<Integer> values) {
            addCriterion("smallLoanCnt not in", values, "smallloancnt");
            return (Criteria) this;
        }

        public Criteria andSmallloancntBetween(Integer value1, Integer value2) {
            addCriterion("smallLoanCnt between", value1, value2, "smallloancnt");
            return (Criteria) this;
        }

        public Criteria andSmallloancntNotBetween(Integer value1, Integer value2) {
            addCriterion("smallLoanCnt not between", value1, value2, "smallloancnt");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgIsNull() {
            addCriterion("smallLoanOrg is null");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgIsNotNull() {
            addCriterion("smallLoanOrg is not null");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgEqualTo(String value) {
            addCriterion("smallLoanOrg =", value, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgNotEqualTo(String value) {
            addCriterion("smallLoanOrg <>", value, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgGreaterThan(String value) {
            addCriterion("smallLoanOrg >", value, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgGreaterThanOrEqualTo(String value) {
            addCriterion("smallLoanOrg >=", value, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgLessThan(String value) {
            addCriterion("smallLoanOrg <", value, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgLessThanOrEqualTo(String value) {
            addCriterion("smallLoanOrg <=", value, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgLike(String value) {
            addCriterion("smallLoanOrg like", value, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgNotLike(String value) {
            addCriterion("smallLoanOrg not like", value, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgIn(List<String> values) {
            addCriterion("smallLoanOrg in", values, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgNotIn(List<String> values) {
            addCriterion("smallLoanOrg not in", values, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgBetween(String value1, String value2) {
            addCriterion("smallLoanOrg between", value1, value2, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andSmallloanorgNotBetween(String value1, String value2) {
            addCriterion("smallLoanOrg not between", value1, value2, "smallloanorg");
            return (Criteria) this;
        }

        public Criteria andHascreditcardIsNull() {
            addCriterion("hasCreditCard is null");
            return (Criteria) this;
        }

        public Criteria andHascreditcardIsNotNull() {
            addCriterion("hasCreditCard is not null");
            return (Criteria) this;
        }

        public Criteria andHascreditcardEqualTo(Boolean value) {
            addCriterion("hasCreditCard =", value, "hascreditcard");
            return (Criteria) this;
        }

        public Criteria andHascreditcardNotEqualTo(Boolean value) {
            addCriterion("hasCreditCard <>", value, "hascreditcard");
            return (Criteria) this;
        }

        public Criteria andHascreditcardGreaterThan(Boolean value) {
            addCriterion("hasCreditCard >", value, "hascreditcard");
            return (Criteria) this;
        }

        public Criteria andHascreditcardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasCreditCard >=", value, "hascreditcard");
            return (Criteria) this;
        }

        public Criteria andHascreditcardLessThan(Boolean value) {
            addCriterion("hasCreditCard <", value, "hascreditcard");
            return (Criteria) this;
        }

        public Criteria andHascreditcardLessThanOrEqualTo(Boolean value) {
            addCriterion("hasCreditCard <=", value, "hascreditcard");
            return (Criteria) this;
        }

        public Criteria andHascreditcardIn(List<Boolean> values) {
            addCriterion("hasCreditCard in", values, "hascreditcard");
            return (Criteria) this;
        }

        public Criteria andHascreditcardNotIn(List<Boolean> values) {
            addCriterion("hasCreditCard not in", values, "hascreditcard");
            return (Criteria) this;
        }

        public Criteria andHascreditcardBetween(Boolean value1, Boolean value2) {
            addCriterion("hasCreditCard between", value1, value2, "hascreditcard");
            return (Criteria) this;
        }

        public Criteria andHascreditcardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasCreditCard not between", value1, value2, "hascreditcard");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntIsNull() {
            addCriterion("creditCardCnt is null");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntIsNotNull() {
            addCriterion("creditCardCnt is not null");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntEqualTo(Integer value) {
            addCriterion("creditCardCnt =", value, "creditcardcnt");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntNotEqualTo(Integer value) {
            addCriterion("creditCardCnt <>", value, "creditcardcnt");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntGreaterThan(Integer value) {
            addCriterion("creditCardCnt >", value, "creditcardcnt");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("creditCardCnt >=", value, "creditcardcnt");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntLessThan(Integer value) {
            addCriterion("creditCardCnt <", value, "creditcardcnt");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntLessThanOrEqualTo(Integer value) {
            addCriterion("creditCardCnt <=", value, "creditcardcnt");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntIn(List<Integer> values) {
            addCriterion("creditCardCnt in", values, "creditcardcnt");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntNotIn(List<Integer> values) {
            addCriterion("creditCardCnt not in", values, "creditcardcnt");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntBetween(Integer value1, Integer value2) {
            addCriterion("creditCardCnt between", value1, value2, "creditcardcnt");
            return (Criteria) this;
        }

        public Criteria andCreditcardcntNotBetween(Integer value1, Integer value2) {
            addCriterion("creditCardCnt not between", value1, value2, "creditcardcnt");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaIsNull() {
            addCriterion("creditCardQuota is null");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaIsNotNull() {
            addCriterion("creditCardQuota is not null");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaEqualTo(String value) {
            addCriterion("creditCardQuota =", value, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaNotEqualTo(String value) {
            addCriterion("creditCardQuota <>", value, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaGreaterThan(String value) {
            addCriterion("creditCardQuota >", value, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaGreaterThanOrEqualTo(String value) {
            addCriterion("creditCardQuota >=", value, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaLessThan(String value) {
            addCriterion("creditCardQuota <", value, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaLessThanOrEqualTo(String value) {
            addCriterion("creditCardQuota <=", value, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaLike(String value) {
            addCriterion("creditCardQuota like", value, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaNotLike(String value) {
            addCriterion("creditCardQuota not like", value, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaIn(List<String> values) {
            addCriterion("creditCardQuota in", values, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaNotIn(List<String> values) {
            addCriterion("creditCardQuota not in", values, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaBetween(String value1, String value2) {
            addCriterion("creditCardQuota between", value1, value2, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcardquotaNotBetween(String value1, String value2) {
            addCriterion("creditCardQuota not between", value1, value2, "creditcardquota");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtIsNull() {
            addCriterion("creditCardDebt is null");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtIsNotNull() {
            addCriterion("creditCardDebt is not null");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtEqualTo(String value) {
            addCriterion("creditCardDebt =", value, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtNotEqualTo(String value) {
            addCriterion("creditCardDebt <>", value, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtGreaterThan(String value) {
            addCriterion("creditCardDebt >", value, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtGreaterThanOrEqualTo(String value) {
            addCriterion("creditCardDebt >=", value, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtLessThan(String value) {
            addCriterion("creditCardDebt <", value, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtLessThanOrEqualTo(String value) {
            addCriterion("creditCardDebt <=", value, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtLike(String value) {
            addCriterion("creditCardDebt like", value, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtNotLike(String value) {
            addCriterion("creditCardDebt not like", value, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtIn(List<String> values) {
            addCriterion("creditCardDebt in", values, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtNotIn(List<String> values) {
            addCriterion("creditCardDebt not in", values, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtBetween(String value1, String value2) {
            addCriterion("creditCardDebt between", value1, value2, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andCreditcarddebtNotBetween(String value1, String value2) {
            addCriterion("creditCardDebt not between", value1, value2, "creditcarddebt");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanIsNull() {
            addCriterion("hasOtherNotCreditLoan is null");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanIsNotNull() {
            addCriterion("hasOtherNotCreditLoan is not null");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanEqualTo(Boolean value) {
            addCriterion("hasOtherNotCreditLoan =", value, "hasothernotcreditloan");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanNotEqualTo(Boolean value) {
            addCriterion("hasOtherNotCreditLoan <>", value, "hasothernotcreditloan");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanGreaterThan(Boolean value) {
            addCriterion("hasOtherNotCreditLoan >", value, "hasothernotcreditloan");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasOtherNotCreditLoan >=", value, "hasothernotcreditloan");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanLessThan(Boolean value) {
            addCriterion("hasOtherNotCreditLoan <", value, "hasothernotcreditloan");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanLessThanOrEqualTo(Boolean value) {
            addCriterion("hasOtherNotCreditLoan <=", value, "hasothernotcreditloan");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanIn(List<Boolean> values) {
            addCriterion("hasOtherNotCreditLoan in", values, "hasothernotcreditloan");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanNotIn(List<Boolean> values) {
            addCriterion("hasOtherNotCreditLoan not in", values, "hasothernotcreditloan");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanBetween(Boolean value1, Boolean value2) {
            addCriterion("hasOtherNotCreditLoan between", value1, value2, "hasothernotcreditloan");
            return (Criteria) this;
        }

        public Criteria andHasothernotcreditloanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasOtherNotCreditLoan not between", value1, value2, "hasothernotcreditloan");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntIsNull() {
            addCriterion("otherNotCreditLoanCnt is null");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntIsNotNull() {
            addCriterion("otherNotCreditLoanCnt is not null");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntEqualTo(String value) {
            addCriterion("otherNotCreditLoanCnt =", value, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntNotEqualTo(String value) {
            addCriterion("otherNotCreditLoanCnt <>", value, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntGreaterThan(String value) {
            addCriterion("otherNotCreditLoanCnt >", value, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntGreaterThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanCnt >=", value, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntLessThan(String value) {
            addCriterion("otherNotCreditLoanCnt <", value, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntLessThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanCnt <=", value, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntLike(String value) {
            addCriterion("otherNotCreditLoanCnt like", value, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntNotLike(String value) {
            addCriterion("otherNotCreditLoanCnt not like", value, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntIn(List<String> values) {
            addCriterion("otherNotCreditLoanCnt in", values, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntNotIn(List<String> values) {
            addCriterion("otherNotCreditLoanCnt not in", values, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanCnt between", value1, value2, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloancntNotBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanCnt not between", value1, value2, "othernotcreditloancnt");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountIsNull() {
            addCriterion("otherNotCreditLoanAmount is null");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountIsNotNull() {
            addCriterion("otherNotCreditLoanAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountEqualTo(String value) {
            addCriterion("otherNotCreditLoanAmount =", value, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountNotEqualTo(String value) {
            addCriterion("otherNotCreditLoanAmount <>", value, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountGreaterThan(String value) {
            addCriterion("otherNotCreditLoanAmount >", value, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountGreaterThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanAmount >=", value, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountLessThan(String value) {
            addCriterion("otherNotCreditLoanAmount <", value, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountLessThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanAmount <=", value, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountLike(String value) {
            addCriterion("otherNotCreditLoanAmount like", value, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountNotLike(String value) {
            addCriterion("otherNotCreditLoanAmount not like", value, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountIn(List<String> values) {
            addCriterion("otherNotCreditLoanAmount in", values, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountNotIn(List<String> values) {
            addCriterion("otherNotCreditLoanAmount not in", values, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanAmount between", value1, value2, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanamountNotBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanAmount not between", value1, value2, "othernotcreditloanamount");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgIsNull() {
            addCriterion("otherNotCreditLoanOrg is null");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgIsNotNull() {
            addCriterion("otherNotCreditLoanOrg is not null");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgEqualTo(String value) {
            addCriterion("otherNotCreditLoanOrg =", value, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgNotEqualTo(String value) {
            addCriterion("otherNotCreditLoanOrg <>", value, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgGreaterThan(String value) {
            addCriterion("otherNotCreditLoanOrg >", value, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgGreaterThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanOrg >=", value, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgLessThan(String value) {
            addCriterion("otherNotCreditLoanOrg <", value, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgLessThanOrEqualTo(String value) {
            addCriterion("otherNotCreditLoanOrg <=", value, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgLike(String value) {
            addCriterion("otherNotCreditLoanOrg like", value, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgNotLike(String value) {
            addCriterion("otherNotCreditLoanOrg not like", value, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgIn(List<String> values) {
            addCriterion("otherNotCreditLoanOrg in", values, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgNotIn(List<String> values) {
            addCriterion("otherNotCreditLoanOrg not in", values, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanOrg between", value1, value2, "othernotcreditloanorg");
            return (Criteria) this;
        }

        public Criteria andOthernotcreditloanorgNotBetween(String value1, String value2) {
            addCriterion("otherNotCreditLoanOrg not between", value1, value2, "othernotcreditloanorg");
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