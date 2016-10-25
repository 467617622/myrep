package com.huateng.scf.systemmng.data.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.huateng.scf.systemmng.data.TblLnciBaseInfo;

/**
 * This is an object that contains data related to the TBL_LNCI_BASE_INFO table.
 * Do not modify this class because it will be overwritten if the configuration
 * file related to this class is modified.
 *
 * @hibernate.class table="TBL_LNCI_BASE_INFO"
 */

public abstract class BaseTblLnciBaseInfo implements Serializable {

	private static final long serialVersionUID = 6011467884230616991L;

	// constructors
	public BaseTblLnciBaseInfo() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTblLnciBaseInfo(java.lang.String debetNo) {
		this.setDebetNo(debetNo);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseTblLnciBaseInfo(java.lang.String debetNo,
			java.lang.String debetId) {

		this.setDebetNo(debetNo);
		this.setDebetId(debetId);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String debetNo;

	// fields
	private java.lang.String debetId;
	private java.lang.String mastContno;
	private java.lang.String lnciType;
	private java.lang.String lnciStatus;
	private java.math.BigDecimal lnciAmt;
	private java.math.BigDecimal lnciBal;
	private java.lang.String fivelevel;
	private java.lang.String loanType;
	private java.util.Date startDate;
	private java.util.Date endDate;
	private java.lang.String loanUse;
	private java.lang.String bussBrcode;
	private java.lang.String mgrno;
	private java.lang.String appno;
	private java.lang.String curcd;
	private java.math.BigDecimal rate;
	private java.util.Date commonDate;
	private java.lang.String accountNo;
	private java.lang.String confirmStatus;
	private java.math.BigDecimal bailAmount;
	private java.math.BigDecimal amountIn;
	private java.math.BigDecimal amountOut;
	private java.math.BigDecimal amountUpOut;
	private java.math.BigDecimal firstBailRatio;
	private java.lang.String protocolNo;
	private java.lang.String orderNo;
	private java.math.BigDecimal addBailAmount;
	private java.lang.String billType;
	private java.lang.String bailAccount;
	private java.lang.Integer billNum;
	private String loanDays;
	private String slaveContno;// 抵质押合同号
	private String slaveLimit;
	private String isLocked;
	private String lockAppno;
	private java.math.BigDecimal addCashEqtAmt;// 追加现金等价物金额
	private java.math.BigDecimal initCashEqtAmt;// 初始现金等价物金额
	private Date insertDate;
	private String loanAcctNo;
	private String mastContcode;
	private String custcd;
	private String acctBrcode;
	private String productId;
	private String accountantType;
	private Date depositDate;
	private String accruedStatus;
	private String loanAcctStatus;
	private String loansChargeOrder;
	private BigDecimal issuedAmt;
	private BigDecimal avaliableAmt;
	private BigDecimal normalCapital;
	private BigDecimal overdueCapital;
	private BigDecimal idleCapittal;
	private BigDecimal badCapital;
	private BigDecimal loanFund;
	private BigDecimal receivableAccuredInt;
	private BigDecimal totalRemainAmount;
	private BigDecimal collectionAccuredInt;
	private BigDecimal receivableInt;
	private BigDecimal collectionInt;
	private BigDecimal receivableAccuredPint;
	private BigDecimal collectionAccuredPint;
	private BigDecimal receivablePunishInt;
	private BigDecimal collectionPunishInt;
	private BigDecimal accuredCompountInt;
	private BigDecimal compoundInt;
	private BigDecimal accuredDiscountInt;
	private BigDecimal receivableDiscountInt;
	private BigDecimal deferredInt;
	private BigDecimal verifiedCapital;
	private BigDecimal verifiedInt;
	private BigDecimal interest;
	private BigDecimal receivalbeFee;
	private BigDecimal fee;
	private BigDecimal receivalbeFine;
	private BigDecimal fine;
	private BigDecimal reservedAmt;
	private Date lastAcctTxdate;
	private String detailNo;
	private String depositBrcode;
	private String depositTlrno;
	private Date maintenanceDate;
	private String maintenanceTlrno;
	private Date cancellationDate;
	private String cancellationTlrno;
	private Date timestamps;
	private String repayMethod;
	private Integer graceDays;
	private String rateType;
	private String rateFloatType;
	private BigDecimal rateFloatValue;
	private BigDecimal baseYearRate;
	private String rateAdjustType;
	private String draftBrcode;// 承兑机构号
	private String signBrcode;// 签发机构号
	private String prePayBrcode;// 垫款机构号
	private String ebFlag;// 电票标志：0-否、1-是
	private String hasIndirectCredit;// 间接额度类型：有、无
	private String creditCustcd;// 间接额度占用方客户号(核心客户号)
	private String orgDebetId;// 原借据号
	private String loanAppno;// 融资出账流水号
	private String productCode;// 产品代码，是贷款产品代码，而非供应链产品代码
	private String state; // 记录状态：0-正常、1-新建
	private String payBrcode; // 放款机构
	private String payTlrno; // 放款经办员
	private String payChecker; // 放款复核员
	private String isSettle;// 是否已结清：0-否、1-是
	private BigDecimal accuSendAmt;//累计发货金额
	private BigDecimal balSendAmt;//剩余发货金额
	private String hasSendBp;//是否已发送预约还款：0-否、1-是
	private String coreState;//核心系统借据状态：0-正常、1-删除
	private String creditNo;//占用额度编号
	private String saleBrcode;//营业机构
	private BigDecimal ownFundPayAmt;//自有资金支付金额
	private BigDecimal pastExchangeRate;//当前的汇率
	private String loanNo;//贷款号
	private String appNum;//八局供应链平台融资申请编号	应收账款的号码（比如：发票号、订单号）

	 
	
	public int getHashCode() {
		return hashCode;
	}

	public void setHashCode(int hashCode) {
		this.hashCode = hashCode;
	}



	public String getSlaveContno() {
		return slaveContno;
	}

	public void setSlaveContno(String slaveContno) {
		this.slaveContno = slaveContno;
	}

	/**
	 * Return the unique identifier of this class
	 *
	 * @hibernate.id generator-class="assigned" column="DEBET_NO"
	 */
	public java.lang.String getDebetNo() {
		return debetNo;
	}

	/**
	 * Set the unique identifier of this class
	 *
	 * @param debetNo
	 *            the new ID
	 */
	public void setDebetNo(java.lang.String debetNo) {
		this.debetNo = debetNo;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
	 * Return the value associated with the column: DEBET_ID
	 */
	public java.lang.String getDebetId() {
		return debetId;
	}

	/**
	 * Set the value related to the column: DEBET_ID
	 *
	 * @param debetId
	 *            the DEBET_ID value
	 */
	public void setDebetId(java.lang.String debetId) {
		this.debetId = debetId;
	}

	/**
	 * Return the value associated with the column: MAST_CONTNO
	 */
	public java.lang.String getMastContno() {
		return mastContno;
	}

	/**
	 * Set the value related to the column: MAST_CONTNO
	 *
	 * @param mastContno
	 *            the MAST_CONTNO value
	 */
	public void setMastContno(java.lang.String mastContno) {
		this.mastContno = mastContno;
	}

	/**
	 * Return the value associated with the column: LNCI_TYPE
	 */
	public java.lang.String getLnciType() {
		return lnciType;
	}

	/**
	 * Set the value related to the column: LNCI_TYPE
	 *
	 * @param lnciType
	 *            the LNCI_TYPE value
	 */
	public void setLnciType(java.lang.String lnciType) {
		this.lnciType = lnciType;
	}

	/**
	 * Return the value associated with the column: LNCI_STATUS
	 */
	public java.lang.String getLnciStatus() {
		return lnciStatus;
	}

	/**
	 * Set the value related to the column: LNCI_STATUS
	 *
	 * @param lnciStatus
	 *            the LNCI_STATUS value
	 */
	public void setLnciStatus(java.lang.String lnciStatus) {
		this.lnciStatus = lnciStatus;
	}

	/**
	 * Return the value associated with the column: LNCI_AMT
	 */
	public java.math.BigDecimal getLnciAmt() {
		return lnciAmt;
	}

	/**
	 * Set the value related to the column: LNCI_AMT
	 *
	 * @param lnciAmt
	 *            the LNCI_AMT value
	 */
	public void setLnciAmt(java.math.BigDecimal lnciAmt) {
		this.lnciAmt = lnciAmt;
	}

	/**
	 * Return the value associated with the column: LNCI_BAL
	 */
	public java.math.BigDecimal getLnciBal() {
		return lnciBal;
	}

	/**
	 * Set the value related to the column: LNCI_BAL
	 *
	 * @param lnciBal
	 *            the LNCI_BAL value
	 */
	public void setLnciBal(java.math.BigDecimal lnciBal) {
		this.lnciBal = lnciBal;
	}

	/**
	 * Return the value associated with the column: FIVELEVEL
	 */
	public java.lang.String getFivelevel() {
		return fivelevel;
	}

	/**
	 * Set the value related to the column: FIVELEVEL
	 *
	 * @param fivelevel
	 *            the FIVELEVEL value
	 */
	public void setFivelevel(java.lang.String fivelevel) {
		this.fivelevel = fivelevel;
	}

	/**
	 * Return the value associated with the column: LOAN_TYPE
	 */
	public java.lang.String getLoanType() {
		return loanType;
	}

	/**
	 * Set the value related to the column: LOAN_TYPE
	 *
	 * @param loanType
	 *            the LOAN_TYPE value
	 */
	public void setLoanType(java.lang.String loanType) {
		this.loanType = loanType;
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
	 * Return the value associated with the column: LOAN_USE
	 */
	public java.lang.String getLoanUse() {
		return loanUse;
	}

	/**
	 * Set the value related to the column: LOAN_USE
	 *
	 * @param loanUse
	 *            the LOAN_USE value
	 */
	public void setLoanUse(java.lang.String loanUse) {
		this.loanUse = loanUse;
	}

	/**
	 * Return the value associated with the column: APPNO
	 */
	public java.lang.String getAppno() {
		return appno;
	}

	/**
	 * Set the value related to the column: APPNO
	 *
	 * @param appno
	 *            the APPNO value
	 */
	public void setAppno(java.lang.String appno) {
		this.appno = appno;
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
	 * Return the value associated with the column: RATE
	 */
	public java.math.BigDecimal getRate() {
		return rate;
	}

	/**
	 * Set the value related to the column: RATE
	 *
	 * @param rate
	 *            the RATE value
	 */
	public void setRate(java.math.BigDecimal rate) {
		this.rate = rate;
	}

	/**
	 * Return the value associated with the column: COMMON_DATE
	 */
	public java.util.Date getCommonDate() {
		return commonDate;
	}

	/**
	 * Set the value related to the column: COMMON_DATE
	 *
	 * @param commonDate
	 *            the COMMON_DATE value
	 */
	public void setCommonDate(java.util.Date commonDate) {
		this.commonDate = commonDate;
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
	 * Return the value associated with the column: CONFIRM_STATUS
	 */
	public java.lang.String getConfirmStatus() {
		return confirmStatus;
	}

	/**
	 * Set the value related to the column: CONFIRM_STATUS
	 *
	 * @param confirmStatus
	 *            the CONFIRM_STATUS value
	 */
	public void setConfirmStatus(java.lang.String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	/**
	 * Return the value associated with the column: BAIL_AMOUNT
	 */
	public java.math.BigDecimal getBailAmount() {
		return bailAmount;
	}

	/**
	 * Set the value related to the column: BAIL_AMOUNT
	 *
	 * @param bailAmount
	 *            the BAIL_AMOUNT value
	 */
	public void setBailAmount(java.math.BigDecimal bailAmount) {
		this.bailAmount = bailAmount;
	}

	/**
	 * Return the value associated with the column: AMOUNT_IN
	 */
	public java.math.BigDecimal getAmountIn() {
		return amountIn;
	}

	/**
	 * Set the value related to the column: AMOUNT_IN
	 *
	 * @param amountIn
	 *            the AMOUNT_IN value
	 */
	public void setAmountIn(java.math.BigDecimal amountIn) {
		this.amountIn = amountIn;
	}

	/**
	 * Return the value associated with the column: AMOUNT_OUT
	 */
	public java.math.BigDecimal getAmountOut() {
		return amountOut;
	}

	/**
	 * Set the value related to the column: AMOUNT_OUT
	 *
	 * @param amountOut
	 *            the AMOUNT_OUT value
	 */
	public void setAmountOut(java.math.BigDecimal amountOut) {
		this.amountOut = amountOut;
	}

	/**
	 * Return the value associated with the column: FIRST_BAIL_RATIO
	 */
	public java.math.BigDecimal getFirstBailRatio() {
		return firstBailRatio;
	}

	/**
	 * Set the value related to the column: FIRST_BAIL_RATIO
	 *
	 * @param firstBailRatio
	 *            the FIRST_BAIL_RATIO value
	 */
	public void setFirstBailRatio(java.math.BigDecimal firstBailRatio) {
		this.firstBailRatio = firstBailRatio;
	}

	/**
	 * Return the value associated with the column: PROTOCOL_NO
	 */
	public java.lang.String getProtocolNo() {
		return protocolNo;
	}

	/**
	 * Set the value related to the column: PROTOCOL_NO
	 *
	 * @param protocolNo
	 *            the PROTOCOL_NO value
	 */
	public void setProtocolNo(java.lang.String protocolNo) {
		this.protocolNo = protocolNo;
	}

	public java.lang.String getBillType() {
		return billType;
	}

	public void setBillType(java.lang.String billType) {
		this.billType = billType;
	}

	public java.lang.String getBailAccount() {
		return bailAccount;
	}

	public void setBailAccount(java.lang.String bailAccount) {
		this.bailAccount = bailAccount;
	}

	public java.lang.Integer getBillNum() {
		return billNum;
	}

	public void setBillNum(java.lang.Integer billNum) {
		this.billNum = billNum;
	}

	public String getLoanDays() {
		return loanDays;
	}

	public void setLoanDays(String loanDays) {
		this.loanDays = loanDays;
	}

	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof TblLnciBaseInfo))
			return false;
		else {
			TblLnciBaseInfo tblLnciBaseInfo = (TblLnciBaseInfo) obj;
			if (null == this.getDebetNo()
					|| null == tblLnciBaseInfo.getDebetNo())
				return false;
			else
				return (this.getDebetNo().equals(tblLnciBaseInfo.getDebetNo()));
		}
	}

	public int hashCode() {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getDebetNo())
				return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":"
						+ this.getDebetNo().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public String toString() {
		return super.toString();
	}

	public java.math.BigDecimal getAddBailAmount() {
		return addBailAmount;
	}

	public void setAddBailAmount(java.math.BigDecimal addBailAmount) {
		this.addBailAmount = addBailAmount;
	}

	public java.math.BigDecimal getAmountUpOut() {
		return amountUpOut;
	}

	public void setAmountUpOut(java.math.BigDecimal amountUpOut) {
		this.amountUpOut = amountUpOut;
	}

	public String getSlaveLimit() {
		return slaveLimit;
	}

	public void setSlaveLimit(String slaveLimit) {
		this.slaveLimit = slaveLimit;
	}

	public String getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

	public String getLockAppno() {
		return lockAppno;
	}

	public void setLockAppno(String lockAppno) {
		this.lockAppno = lockAppno;
	}

	public java.math.BigDecimal getAddCashEqtAmt() {
		return addCashEqtAmt;
	}

	public void setAddCashEqtAmt(java.math.BigDecimal addCashEqtAmt) {
		this.addCashEqtAmt = addCashEqtAmt;
	}

	public java.math.BigDecimal getInitCashEqtAmt() {
		return initCashEqtAmt;
	}

	public void setInitCashEqtAmt(java.math.BigDecimal initCashEqtAmt) {
		this.initCashEqtAmt = initCashEqtAmt;
	}

	public java.lang.String getBussBrcode() {
		return bussBrcode;
	}

	public void setBussBrcode(java.lang.String bussBrcode) {
		this.bussBrcode = bussBrcode;
	}

	public java.lang.String getMgrno() {
		return mgrno;
	}

	public void setMgrno(java.lang.String mgrno) {
		this.mgrno = mgrno;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public java.lang.String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(java.lang.String orderNo) {
		this.orderNo = orderNo;
	}

	public String getLoanAcctNo() {
		return loanAcctNo;
	}

	public void setLoanAcctNo(String loanAcctNo) {
		this.loanAcctNo = loanAcctNo;
	}

	public String getMastContcode() {
		return mastContcode;
	}

	public void setMastContcode(String mastContcode) {
		this.mastContcode = mastContcode;
	}

	public String getCustcd() {
		return custcd;
	}

	public void setCustcd(String custcd) {
		this.custcd = custcd;
	}

	public String getAcctBrcode() {
		return acctBrcode;
	}

	public void setAcctBrcode(String acctBrcode) {
		this.acctBrcode = acctBrcode;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getAccountantType() {
		return accountantType;
	}

	public void setAccountantType(String accountantType) {
		this.accountantType = accountantType;
	}

	public Date getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}

	public String getAccruedStatus() {
		return accruedStatus;
	}

	public void setAccruedStatus(String accruedStatus) {
		this.accruedStatus = accruedStatus;
	}

	public String getLoanAcctStatus() {
		return loanAcctStatus;
	}

	public void setLoanAcctStatus(String loanAcctStatus) {
		this.loanAcctStatus = loanAcctStatus;
	}

	public String getLoansChargeOrder() {
		return loansChargeOrder;
	}

	public void setLoansChargeOrder(String loansChargeOrder) {
		this.loansChargeOrder = loansChargeOrder;
	}

	public BigDecimal getIssuedAmt() {
		return issuedAmt;
	}

	public void setIssuedAmt(BigDecimal issuedAmt) {
		this.issuedAmt = issuedAmt;
	}

	public BigDecimal getAvaliableAmt() {
		return avaliableAmt;
	}

	public void setAvaliableAmt(BigDecimal avaliableAmt) {
		this.avaliableAmt = avaliableAmt;
	}

	public BigDecimal getNormalCapital() {
		return normalCapital;
	}

	public void setNormalCapital(BigDecimal normalCapital) {
		this.normalCapital = normalCapital;
	}

	public BigDecimal getOverdueCapital() {
		return overdueCapital;
	}

	public void setOverdueCapital(BigDecimal overdueCapital) {
		this.overdueCapital = overdueCapital;
	}

	public BigDecimal getIdleCapittal() {
		return idleCapittal;
	}

	public void setIdleCapittal(BigDecimal idleCapittal) {
		this.idleCapittal = idleCapittal;
	}

	public BigDecimal getBadCapital() {
		return badCapital;
	}

	public void setBadCapital(BigDecimal badCapital) {
		this.badCapital = badCapital;
	}

	public BigDecimal getLoanFund() {
		return loanFund;
	}

	public void setLoanFund(BigDecimal loanFund) {
		this.loanFund = loanFund;
	}

	public BigDecimal getReceivableAccuredInt() {
		return receivableAccuredInt;
	}

	public void setReceivableAccuredInt(BigDecimal receivableAccuredInt) {
		this.receivableAccuredInt = receivableAccuredInt;
	}

	public BigDecimal getCollectionAccuredInt() {
		return collectionAccuredInt;
	}

	public void setCollectionAccuredInt(BigDecimal collectionAccuredInt) {
		this.collectionAccuredInt = collectionAccuredInt;
	}

	public BigDecimal getReceivableInt() {
		return receivableInt;
	}

	public void setReceivableInt(BigDecimal receivableInt) {
		this.receivableInt = receivableInt;
	}

	public BigDecimal getCollectionInt() {
		return collectionInt;
	}

	public void setCollectionInt(BigDecimal collectionInt) {
		this.collectionInt = collectionInt;
	}

	public BigDecimal getReceivableAccuredPint() {
		return receivableAccuredPint;
	}

	public void setReceivableAccuredPint(BigDecimal receivableAccuredPint) {
		this.receivableAccuredPint = receivableAccuredPint;
	}

	public BigDecimal getCollectionAccuredPint() {
		return collectionAccuredPint;
	}

	public void setCollectionAccuredPint(BigDecimal collectionAccuredPint) {
		this.collectionAccuredPint = collectionAccuredPint;
	}

	public BigDecimal getReceivablePunishInt() {
		return receivablePunishInt;
	}

	public void setReceivablePunishInt(BigDecimal receivablePunishInt) {
		this.receivablePunishInt = receivablePunishInt;
	}

	public BigDecimal getCollectionPunishInt() {
		return collectionPunishInt;
	}

	public void setCollectionPunishInt(BigDecimal collectionPunishInt) {
		this.collectionPunishInt = collectionPunishInt;
	}

	public BigDecimal getAccuredCompountInt() {
		return accuredCompountInt;
	}

	public void setAccuredCompountInt(BigDecimal accuredCompountInt) {
		this.accuredCompountInt = accuredCompountInt;
	}

	public BigDecimal getCompoundInt() {
		return compoundInt;
	}

	public void setCompoundInt(BigDecimal compoundInt) {
		this.compoundInt = compoundInt;
	}

	public BigDecimal getAccuredDiscountInt() {
		return accuredDiscountInt;
	}

	public void setAccuredDiscountInt(BigDecimal accuredDiscountInt) {
		this.accuredDiscountInt = accuredDiscountInt;
	}

	public BigDecimal getReceivableDiscountInt() {
		return receivableDiscountInt;
	}

	public void setReceivableDiscountInt(BigDecimal receivableDiscountInt) {
		this.receivableDiscountInt = receivableDiscountInt;
	}

	public BigDecimal getDeferredInt() {
		return deferredInt;
	}

	public void setDeferredInt(BigDecimal deferredInt) {
		this.deferredInt = deferredInt;
	}

	public BigDecimal getVerifiedCapital() {
		return verifiedCapital;
	}

	public void setVerifiedCapital(BigDecimal verifiedCapital) {
		this.verifiedCapital = verifiedCapital;
	}

	public BigDecimal getVerifiedInt() {
		return verifiedInt;
	}

	public void setVerifiedInt(BigDecimal verifiedInt) {
		this.verifiedInt = verifiedInt;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getReceivalbeFee() {
		return receivalbeFee;
	}

	public void setReceivalbeFee(BigDecimal receivalbeFee) {
		this.receivalbeFee = receivalbeFee;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public BigDecimal getReceivalbeFine() {
		return receivalbeFine;
	}

	public void setReceivalbeFine(BigDecimal receivalbeFine) {
		this.receivalbeFine = receivalbeFine;
	}

	public BigDecimal getFine() {
		return fine;
	}

	public void setFine(BigDecimal fine) {
		this.fine = fine;
	}

	public BigDecimal getReservedAmt() {
		return reservedAmt;
	}

	public void setReservedAmt(BigDecimal reservedAmt) {
		this.reservedAmt = reservedAmt;
	}

	public Date getLastAcctTxdate() {
		return lastAcctTxdate;
	}

	public void setLastAcctTxdate(Date lastAcctTxdate) {
		this.lastAcctTxdate = lastAcctTxdate;
	}

	public String getDetailNo() {
		return detailNo;
	}

	public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}

	public String getDepositBrcode() {
		return depositBrcode;
	}

	public void setDepositBrcode(String depositBrcode) {
		this.depositBrcode = depositBrcode;
	}

	public String getDepositTlrno() {
		return depositTlrno;
	}

	public void setDepositTlrno(String depositTlrno) {
		this.depositTlrno = depositTlrno;
	}

	public Date getMaintenanceDate() {
		return maintenanceDate;
	}

	public void setMaintenanceDate(Date maintenanceDate) {
		this.maintenanceDate = maintenanceDate;
	}

	public String getMaintenanceTlrno() {
		return maintenanceTlrno;
	}

	public void setMaintenanceTlrno(String maintenanceTlrno) {
		this.maintenanceTlrno = maintenanceTlrno;
	}

	public Date getCancellationDate() {
		return cancellationDate;
	}

	public void setCancellationDate(Date cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public String getCancellationTlrno() {
		return cancellationTlrno;
	}

	public void setCancellationTlrno(String cancellationTlrno) {
		this.cancellationTlrno = cancellationTlrno;
	}

	public Date getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(Date timestamps) {
		this.timestamps = timestamps;
	}

	public String getRepayMethod() {
		return repayMethod;
	}

	public void setRepayMethod(String repayMethod) {
		this.repayMethod = repayMethod;
	}

	public Integer getGraceDays() {
		return graceDays;
	}

	public void setGraceDays(Integer graceDays) {
		this.graceDays = graceDays;
	}

	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
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

	public BigDecimal getBaseYearRate() {
		return baseYearRate;
	}

	public void setBaseYearRate(BigDecimal baseYearRate) {
		this.baseYearRate = baseYearRate;
	}

	public String getRateAdjustType() {
		return rateAdjustType;
	}

	public void setRateAdjustType(String rateAdjustType) {
		this.rateAdjustType = rateAdjustType;
	}

	public String getDraftBrcode() {
		return draftBrcode;
	}

	public void setDraftBrcode(String draftBrcode) {
		this.draftBrcode = draftBrcode;
	}

	public String getSignBrcode() {
		return signBrcode;
	}

	public void setSignBrcode(String signBrcode) {
		this.signBrcode = signBrcode;
	}

	public String getPrePayBrcode() {
		return prePayBrcode;
	}

	public void setPrePayBrcode(String prePayBrcode) {
		this.prePayBrcode = prePayBrcode;
	}

	public String getEbFlag() {
		return ebFlag;
	}

	public void setEbFlag(String ebFlag) {
		this.ebFlag = ebFlag;
	}

	public String getHasIndirectCredit() {
		return hasIndirectCredit;
	}

	public void setHasIndirectCredit(String hasIndirectCredit) {
		this.hasIndirectCredit = hasIndirectCredit;
	}

	public String getCreditCustcd() {
		return creditCustcd;
	}

	public void setCreditCustcd(String creditCustcd) {
		this.creditCustcd = creditCustcd;
	}

	public String getOrgDebetId() {
		return orgDebetId;
	}

	public void setOrgDebetId(String orgDebetId) {
		this.orgDebetId = orgDebetId;
	}

	public String getLoanAppno() {
		return loanAppno;
	}

	public void setLoanAppno(String loanAppno) {
		this.loanAppno = loanAppno;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPayBrcode() {
		return payBrcode;
	}

	public void setPayBrcode(String payBrcode) {
		this.payBrcode = payBrcode;
	}

	public String getPayTlrno() {
		return payTlrno;
	}

	public void setPayTlrno(String payTlrno) {
		this.payTlrno = payTlrno;
	}

	public String getPayChecker() {
		return payChecker;
	}

	public void setPayChecker(String payChecker) {
		this.payChecker = payChecker;
	}

	public String getIsSettle() {
		return isSettle;
	}

	public void setIsSettle(String isSettle) {
		this.isSettle = isSettle;
	}

	public BigDecimal getAccuSendAmt() {
		return accuSendAmt;
	}

	public void setAccuSendAmt(BigDecimal accuSendAmt) {
		this.accuSendAmt = accuSendAmt;
	}

	public BigDecimal getBalSendAmt() {
		return balSendAmt;
	}

	public void setBalSendAmt(BigDecimal balSendAmt) {
		this.balSendAmt = balSendAmt;
	}

	public String getHasSendBp() {
		return hasSendBp;
	}

	public void setHasSendBp(String hasSendBp) {
		this.hasSendBp = hasSendBp;
	}

	public String getCoreState() {
		return coreState;
	}

	public void setCoreState(String coreState) {
		this.coreState = coreState;
	}

	public String getCreditNo() {
		return creditNo;
	}

	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

	public String getSaleBrcode() {
		return saleBrcode;
	}

	public void setSaleBrcode(String saleBrcode) {
		this.saleBrcode = saleBrcode;
	}

	public BigDecimal getTotalRemainAmount() {
		return totalRemainAmount;
	}

	public void setTotalRemainAmount(BigDecimal totalRemainAmount) {
		this.totalRemainAmount = totalRemainAmount;
	}

	public BigDecimal getOwnFundPayAmt() {
		return ownFundPayAmt;
	}

	public void setOwnFundPayAmt(BigDecimal ownFundPayAmt) {
		this.ownFundPayAmt = ownFundPayAmt;
	}

	public BigDecimal getPastExchangeRate() {
		return pastExchangeRate;
	}

	public void setPastExchangeRate(BigDecimal pastExchangeRate) {
		this.pastExchangeRate = pastExchangeRate;
	}

	public String getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

	public String getAppNum() {
		return appNum;
	}

	public void setAppNum(String appNum) {
		this.appNum = appNum;
	}

}