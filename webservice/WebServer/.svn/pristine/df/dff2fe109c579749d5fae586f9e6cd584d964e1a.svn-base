package com.huateng.scf.systemmng.data.base;

import java.io.Serializable;
import java.math.BigDecimal;

import com.huateng.scf.systemmng.data.TblContDebtInfo;

/**
 * This is an object that contains data related to the TBL_CONT_DEBT_INFO table.
 * Do not modify this class because it will be overwritten if the configuration
 * file related to this class is modified.
 *
 * @hibernate.class table="TBL_CONT_DEBT_INFO"
 */

public abstract class BaseTblContDebtInfo implements Serializable {

	private static final long serialVersionUID = 1483910933468255022L;
	public static String REF = "TblContDebtInfo";
	public static String PROP_FINANCING_TYPE = "financingType";
	public static String PROP_FACT_TYPE = "factType";
	public static String PROP_LOAN_WAY = "loanWay";
	public static String PROP_SUPPLY_CHAIN_PD_ID = "supplyChainPdId";
	public static String PROP_START_DATE = "startDate";
	public static String PROP_NOTICE_TYPE = "noticeType";
	public static String PROP_ACCOUNT_NO = "accountNo";
	public static String PROP_BAIL_ACCT_NO = "bailAcctNo";
	public static String PROP_RETURN_ACCOUNT = "returnAccount";
	public static String PROP_CHARGE_TYPE = "chargeType";
	public static String PROP_MGRNO = "mgrno";
	public static String PROP_CURCD = "curcd";
	public static String PROP_RECOVER_TYPE = "recoverType";
	public static String PROP_LOAN_PERCENT = "loanPercent";
	public static String PROP_CONT_AMOUNT = "contAmount";
	public static String PROP_CUSTCD = "custcd";
	public static String PROP_LAST_UPD_BRCODE = "lastUpdBrcode";
	public static String PROP_END_DATE = "endDate";
	public static String PROP_DEBT_CONTNO = "debtContno";
	public static String PROP_BRCODE = "brcode";
	public static String PROP_LAST_UPD_DATE = "lastUpdDate";
	public static String PROP_CONT_STATUS = "contStatus";
	public static String PROP_LAST_UPD_TLRNO = "lastUpdTlrno";
	public static String PROP_IS_AUTO_PAY = "isAutoPay";
	public static String PROP_SERVICE_CONTENT = "serviceContent";
	public static String PROP_AUTO_PAY_DAYS = "autoPayDays";
	public static String PROP_COOPERATION_BRCODE = "cooperationBrcode";

	// constructors
	public BaseTblContDebtInfo() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTblContDebtInfo(java.lang.String mastContno) {
		this.setDebtContno(mastContno);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String debtContno;

	// fields
	private java.math.BigDecimal loanPercent;
	private java.lang.String factType;
	private java.lang.String recoverType;
	private java.lang.String financingType;
	private java.lang.String returnAccount;
	private java.lang.String chargeType;
	private java.lang.String noticeType;
	private java.lang.String supplyChainPdId;
	private java.lang.String custcd;
	private java.lang.String curcd;
	private java.math.BigDecimal contAmount;
	private java.util.Date startDate;
	private java.util.Date endDate;
	private java.lang.String loanWay;
	private java.lang.String contStatus;
	private java.lang.String accountNo;
	private java.lang.String bailAcctNo;
	private java.lang.String mgrno;
	private java.lang.String lastUpdBrcode;
	private java.lang.String lastUpdTlrno;
	private java.util.Date lastUpdDate;
	private java.lang.String brcode;
	private java.lang.String remark;
	private java.lang.String isAutoPay;
	private java.lang.Integer autoPayDays;
	private java.lang.String serviceContent;
	private java.lang.String repayPurpose;
	private java.lang.String dueBalanceRule;
	private java.lang.String paymentVerifyRule;
	private java.lang.String reparationProtNo;
	private java.lang.String lease;
	private java.lang.String repurchaser;
	private java.lang.String repurchaseProtNo;
	private java.lang.String factoringBrcode;
	private Integer reparationTerm;
	private BigDecimal reparationPercent;
	private BigDecimal cumulativeReparationAmt;
	private java.lang.String factPattern;
	private java.lang.String cooperationBrcode;
	private String rentSettleWay;//租金处理方式
	private BigDecimal poolBailAmt;//池保证金余额
	private String mastContno;//授信额度编号
	private String isCycle;//是否可循环 add by zhangcheng 2016-3-9
	private String isNoapprove;//是否免审批 add by zhangcheng 2016-3-9
	private String 	rateType;//利率类型
	private BigDecimal	baseYearRate;//基准年利率
	private String	rateFloatType;//利率浮动方式
	private BigDecimal	rateFloatValue;//利率浮动值
	private BigDecimal	executeRate;//执行利率
	private String	repayMethod;//还款试
	private String	rateAdjustType;//浮动利率调整方式
	private String	loanUse;//贷款用途 add by LXH 2016-03-30
	
	
	//新加字段
	//private String preCycleMethod;//收息方式  		add by SSH 2016-08-09
	private String preCycleRate;//计息周期  			add by SSH 2016-08-09
	private BigDecimal punishIntRate;//罚息利率		add by SSH 2016-08-09
	
	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public BigDecimal getBaseYearRate() {
		return baseYearRate;
	}

	public void setBaseYearRate(BigDecimal baseYearRate) {
		this.baseYearRate = baseYearRate;
	}

	public String getRateFloatType() {
		return rateFloatType;
	}

	public void setRateFloatType(String rateFloatType) {
		this.rateFloatType = rateFloatType;
	}

	public BigDecimal getRateFloatValue() {
		return rateFloatValue;
	}

	public void setRateFloatValue(BigDecimal rateFloatValue) {
		this.rateFloatValue = rateFloatValue;
	}

	public BigDecimal getExecuteRate() {
		return executeRate;
	}

	public void setExecuteRate(BigDecimal executeRate) {
		this.executeRate = executeRate;
	}

	public String getRepayMethod() {
		return repayMethod;
	}

	public void setRepayMethod(String repayMethod) {
		this.repayMethod = repayMethod;
	}

	public String getRateAdjustType() {
		return rateAdjustType;
	}

	public void setRateAdjustType(String rateAdjustType) {
		this.rateAdjustType = rateAdjustType;
	}

	public String getLoanUse() {
		return loanUse;
	}

	public void setLoanUse(String loanUse) {
		this.loanUse = loanUse;
	}

	public java.lang.String getCooperationBrcode() {
		return cooperationBrcode;
	}

	public void setCooperationBrcode(java.lang.String cooperationBrcode) {
		this.cooperationBrcode = cooperationBrcode;
	}

	/**
	 * @return the isAutoPay
	 */
	public java.lang.String getIsAutoPay() {
		return isAutoPay;
	}

	/**
	 * @param isAutoPay
	 *            the isAutoPay to set
	 */
	public void setIsAutoPay(java.lang.String isAutoPay) {
		this.isAutoPay = isAutoPay;
	}

	/**
	 * @return the autoPayDays
	 */
	public java.lang.Integer getAutoPayDays() {
		return autoPayDays;
	}

	/**
	 * @param autoPayDays
	 *            the autoPayDays to set
	 */
	public void setAutoPayDays(java.lang.Integer autoPayDays) {
		this.autoPayDays = autoPayDays;
	}

	/**
	 * @return the serviceContent
	 */
	public java.lang.String getServiceContent() {
		return serviceContent;
	}

	/**
	 * @param serviceContent
	 *            the serviceContent to set
	 */
	public void setServiceContent(java.lang.String serviceContent) {
		this.serviceContent = serviceContent;
	}

	/**
	 * Return the unique identifier of this class
	 *
	 * @hibernate.id generator-class="assigned" column="MAST_CONTNO"
	 */
	public java.lang.String getDebtContno() {
		return debtContno;
	}

	/**
	 * Set the unique identifier of this class
	 *
	 * @param mastContno
	 *            the new ID
	 */
	public void setDebtContno(java.lang.String debtContno) {
		this.debtContno = debtContno;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
	 * Return the value associated with the column: LOAN_PERCENT
	 */
	public java.math.BigDecimal getLoanPercent() {
		return loanPercent;
	}

	/**
	 * Set the value related to the column: LOAN_PERCENT
	 *
	 * @param loanPercent
	 *            the LOAN_PERCENT value
	 */
	public void setLoanPercent(java.math.BigDecimal loanPercent) {
		this.loanPercent = loanPercent;
	}

	/**
	 * Return the value associated with the column: FACT_TYPE
	 */
	public java.lang.String getFactType() {
		return factType;
	}

	/**
	 * Set the value related to the column: FACT_TYPE
	 *
	 * @param factType
	 *            the FACT_TYPE value
	 */
	public void setFactType(java.lang.String factType) {
		this.factType = factType;
	}

	/**
	 * Return the value associated with the column: RECOVER_TYPE
	 */
	public java.lang.String getRecoverType() {
		return recoverType;
	}

	/**
	 * Set the value related to the column: RECOVER_TYPE
	 *
	 * @param recoverType
	 *            the RECOVER_TYPE value
	 */
	public void setRecoverType(java.lang.String recoverType) {
		this.recoverType = recoverType;
	}

	/**
	 * Return the value associated with the column: FINANCING_TYPE
	 */
	public java.lang.String getFinancingType() {
		return financingType;
	}

	/**
	 * Set the value related to the column: FINANCING_TYPE
	 *
	 * @param financingType
	 *            the FINANCING_TYPE value
	 */
	public void setFinancingType(java.lang.String financingType) {
		this.financingType = financingType;
	}

	/**
	 * Return the value associated with the column: RETURN_ACCOUNT
	 */
	public java.lang.String getReturnAccount() {
		return returnAccount;
	}

	/**
	 * Set the value related to the column: RETURN_ACCOUNT
	 *
	 * @param returnAccount
	 *            the RETURN_ACCOUNT value
	 */
	public void setReturnAccount(java.lang.String returnAccount) {
		this.returnAccount = returnAccount;
	}

	/**
	 * Return the value associated with the column: CHARGE_TYPE
	 */
	public java.lang.String getChargeType() {
		return chargeType;
	}

	/**
	 * Set the value related to the column: CHARGE_TYPE
	 *
	 * @param chargeType
	 *            the CHARGE_TYPE value
	 */
	public void setChargeType(java.lang.String chargeType) {
		this.chargeType = chargeType;
	}

	/**
	 * Return the value associated with the column: NOTICE_TYPE
	 */
	public java.lang.String getNoticeType() {
		return noticeType;
	}

	/**
	 * Set the value related to the column: NOTICE_TYPE
	 *
	 * @param noticeType
	 *            the NOTICE_TYPE value
	 */
	public void setNoticeType(java.lang.String noticeType) {
		this.noticeType = noticeType;
	}

	/**
	 * Return the value associated with the column: SUPPLY_CHAIN_PD_ID
	 */
	public java.lang.String getSupplyChainPdId() {
		return supplyChainPdId;
	}

	/**
	 * Set the value related to the column: SUPPLY_CHAIN_PD_ID
	 *
	 * @param supplyChainPdId
	 *            the SUPPLY_CHAIN_PD_ID value
	 */
	public void setSupplyChainPdId(java.lang.String supplyChainPdId) {
		this.supplyChainPdId = supplyChainPdId;
	}

	/**
	 * Return the value associated with the column: CUSTCD
	 */
	public java.lang.String getCustcd() {
		return custcd;
	}

	/**
	 * Set the value related to the column: CUSTCD
	 *
	 * @param custcd
	 *            the CUSTCD value
	 */
	public void setCustcd(java.lang.String custcd) {
		this.custcd = custcd;
	}

	/**
	 * Return the value associated with the column: CURCD
	 */
	public java.lang.String getCurcd() {
		return curcd;
	}

	/**
	 * Set the value related to the column: CURCD
	 *
	 * @param curcd
	 *            the CURCD value
	 */
	public void setCurcd(java.lang.String curcd) {
		this.curcd = curcd;
	}

	/**
	 * Return the value associated with the column: CONT_AMOUNT
	 */
	public java.math.BigDecimal getContAmount() {
		return contAmount;
	}

	/**
	 * Set the value related to the column: CONT_AMOUNT
	 *
	 * @param contAmount
	 *            the CONT_AMOUNT value
	 */
	public void setContAmount(java.math.BigDecimal contAmount) {
		this.contAmount = contAmount;
	}

	/**
	 * Return the value associated with the column: START_DATE
	 */
	public java.util.Date getStartDate() {
		return startDate;
	}

	/**
	 * Set the value related to the column: START_DATE
	 *
	 * @param startDate
	 *            the START_DATE value
	 */
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Return the value associated with the column: END_DATE
	 */
	public java.util.Date getEndDate() {
		return endDate;
	}

	/**
	 * Set the value related to the column: END_DATE
	 *
	 * @param endDate
	 *            the END_DATE value
	 */
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Return the value associated with the column: LOAN_WAY
	 */
	public java.lang.String getLoanWay() {
		return loanWay;
	}

	/**
	 * Set the value related to the column: LOAN_WAY
	 *
	 * @param loanWay
	 *            the LOAN_WAY value
	 */
	public void setLoanWay(java.lang.String loanWay) {
		this.loanWay = loanWay;
	}

	/**
	 * Return the value associated with the column: CONT_STATUS
	 */
	public java.lang.String getContStatus() {
		return contStatus;
	}

	/**
	 * Set the value related to the column: CONT_STATUS
	 *
	 * @param contStatus
	 *            the CONT_STATUS value
	 */
	public void setContStatus(java.lang.String contStatus) {
		this.contStatus = contStatus;
	}

	/**
	 * Return the value associated with the column: ACCOUNT_NO
	 */
	public java.lang.String getAccountNo() {
		return accountNo;
	}

	/**
	 * Set the value related to the column: ACCOUNT_NO
	 *
	 * @param accountNo
	 *            the ACCOUNT_NO value
	 */
	public void setAccountNo(java.lang.String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * Return the value associated with the column: BAIL_ACCT_NO
	 */
	public java.lang.String getBailAcctNo() {
		return bailAcctNo;
	}

	/**
	 * Set the value related to the column: BAIL_ACCT_NO
	 *
	 * @param bailAcctNo
	 *            the BAIL_ACCT_NO value
	 */
	public void setBailAcctNo(java.lang.String bailAcctNo) {
		this.bailAcctNo = bailAcctNo;
	}

	/**
	 * Return the value associated with the column: MGRNO
	 */
	public java.lang.String getMgrno() {
		return mgrno;
	}

	/**
	 * Set the value related to the column: MGRNO
	 *
	 * @param mgrno
	 *            the MGRNO value
	 */
	public void setMgrno(java.lang.String mgrno) {
		this.mgrno = mgrno;
	}

	/**
	 * Return the value associated with the column: LAST_UPD_BRCODE
	 */
	public java.lang.String getLastUpdBrcode() {
		return lastUpdBrcode;
	}

	/**
	 * Set the value related to the column: LAST_UPD_BRCODE
	 *
	 * @param lastUpdBrcode
	 *            the LAST_UPD_BRCODE value
	 */
	public void setLastUpdBrcode(java.lang.String lastUpdBrcode) {
		this.lastUpdBrcode = lastUpdBrcode;
	}

	/**
	 * Return the value associated with the column: LAST_UPD_TLRNO
	 */
	public java.lang.String getLastUpdTlrno() {
		return lastUpdTlrno;
	}

	/**
	 * Set the value related to the column: LAST_UPD_TLRNO
	 *
	 * @param lastUpdTlrno
	 *            the LAST_UPD_TLRNO value
	 */
	public void setLastUpdTlrno(java.lang.String lastUpdTlrno) {
		this.lastUpdTlrno = lastUpdTlrno;
	}

	/**
	 * Return the value associated with the column: LAST_UPD_DATE
	 */
	public java.util.Date getLastUpdDate() {
		return lastUpdDate;
	}

	/**
	 * Set the value related to the column: LAST_UPD_DATE
	 *
	 * @param lastUpdDate
	 *            the LAST_UPD_DATE value
	 */
	public void setLastUpdDate(java.util.Date lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}

	/**
	 * Return the value associated with the column: BRCODE
	 */
	public java.lang.String getBrcode() {
		return brcode;
	}

	/**
	 * Set the value related to the column: BRCODE
	 *
	 * @param brcode
	 *            the BRCODE value
	 */
	public void setBrcode(java.lang.String brcode) {
		this.brcode = brcode;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}

	public java.lang.String getRepayPurpose() {
		return repayPurpose;
	}

	public void setRepayPurpose(java.lang.String repayPurpose) {
		this.repayPurpose = repayPurpose;
	}

	public java.lang.String getDueBalanceRule() {
		return dueBalanceRule;
	}

	public void setDueBalanceRule(java.lang.String dueBalanceRule) {
		this.dueBalanceRule = dueBalanceRule;
	}

	public java.lang.String getPaymentVerifyRule() {
		return paymentVerifyRule;
	}

	public void setPaymentVerifyRule(java.lang.String paymentVerifyRule) {
		this.paymentVerifyRule = paymentVerifyRule;
	}

	public java.lang.String getReparationProtNo() {
		return reparationProtNo;
	}

	public void setReparationProtNo(java.lang.String reparationProtNo) {
		this.reparationProtNo = reparationProtNo;
	}

	public java.lang.String getLease() {
		return lease;
	}

	public void setLease(java.lang.String lease) {
		this.lease = lease;
	}

	public java.lang.String getRepurchaser() {
		return repurchaser;
	}

	public void setRepurchaser(java.lang.String repurchaser) {
		this.repurchaser = repurchaser;
	}

	public java.lang.String getRepurchaseProtNo() {
		return repurchaseProtNo;
	}

	public void setRepurchaseProtNo(java.lang.String repurchaseProtNo) {
		this.repurchaseProtNo = repurchaseProtNo;
	}

	public java.lang.String getFactoringBrcode() {
		return factoringBrcode;
	}

	public void setFactoringBrcode(java.lang.String factoringBrcode) {
		this.factoringBrcode = factoringBrcode;
	}

	public Integer getReparationTerm() {
		return reparationTerm;
	}

	public void setReparationTerm(Integer reparationTerm) {
		this.reparationTerm = reparationTerm;
	}

	public BigDecimal getReparationPercent() {
		return reparationPercent;
	}

	public void setReparationPercent(BigDecimal reparationPercent) {
		this.reparationPercent = reparationPercent;
	}

	public BigDecimal getCumulativeReparationAmt() {
		return cumulativeReparationAmt;
	}

	public void setCumulativeReparationAmt(BigDecimal cumulativeReparationAmt) {
		this.cumulativeReparationAmt = cumulativeReparationAmt;
	}
	

	public String getMastContno() {
		return mastContno;
	}

	public void setMastContno(String mastContno) {
		this.mastContno = mastContno;
	}

	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof TblContDebtInfo))
			return false;
		else {
			TblContDebtInfo tblContDebtInfo = (TblContDebtInfo) obj;
			if (null == this.getDebtContno()
					|| null == tblContDebtInfo.getDebtContno())
				return false;
			else
				return (this.getDebtContno().equals(tblContDebtInfo
						.getDebtContno()));
		}
	}

	public int hashCode() {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getDebtContno())
				return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":"
						+ this.getDebtContno().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public String toString() {
		return super.toString();
	}

	public java.lang.String getFactPattern() {
		return factPattern;
	}

	public void setFactPattern(java.lang.String factPattern) {
		this.factPattern = factPattern;
	}

	public String getRentSettleWay() {
		return rentSettleWay;
	}

	public void setRentSettleWay(String rentSettleWay) {
		this.rentSettleWay = rentSettleWay;
	}

	public BigDecimal getPoolBailAmt() {
		return poolBailAmt;
	}

	public void setPoolBailAmt(BigDecimal poolBailAmt) {
		this.poolBailAmt = poolBailAmt;
	}

	public String getIsCycle() {
		return isCycle;
	}

	public void setIsCycle(String isCycle) {
		this.isCycle = isCycle;
	}

	public String getIsNoapprove() {
		return isNoapprove;
	}

	public void setIsNoapprove(String isNoapprove) {
		this.isNoapprove = isNoapprove;
	}

	public String getPreCycleRate() {
		return preCycleRate;
	}

	public void setPreCycleRate(String preCycleRate) {
		this.preCycleRate = preCycleRate;
	}

	public BigDecimal getPunishIntRate() {
		return punishIntRate;
	}

	public void setPunishIntRate(BigDecimal punishIntRate) {
		this.punishIntRate = punishIntRate;
	}
	

}