package com.huateng.scf.systemmng.data.base;

import java.io.Serializable;
import java.math.BigDecimal;

import com.huateng.scf.systemmng.data.TblContDebtExtInfo;

/**
 * This is an object that contains data related to the TBL_CONT_DEBT_EXT_INFO
 * table. Do not modify this class because it will be overwritten if the
 * configuration file related to this class is modified.
 * 
 * @hibernate.class table="TBL_CONT_DEBT_EXT_INFO"
 */

public abstract class BaseTblContDebtExtInfo implements Serializable {

	private static final long serialVersionUID = -3287464245348592864L;
	public static String REF = "TblContDebtExtInfo";
	public static String PROP_BUSINESS_NO = "businessNo";
	public static String PROP_ID = "id";
	public static String PROP_BUYER_CUSTCD = "buyerCustcd";
	public static String PROP_BUYER_NAME = "buyerName";
	public static String PROP_LOAN_DAYS = "loanDays";
	public static String PROP_DEBT_GRACE_DAYS = "debtGraceDays";

	// constructors
	public BaseTblContDebtExtInfo() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTblContDebtExtInfo(java.lang.String id) {
		this.setId(id);
		initialize();
	}

	public Class<TblContDebtExtInfo> getReferenceClass() {
		return TblContDebtExtInfo.class;
	}

	/**
	 * Constructor for required fields
	 */
	public BaseTblContDebtExtInfo(java.lang.String id,
			java.lang.String businessNo) {

		this.setId(id);
		this.setBusinessNo(businessNo);
		initialize();
	}

	protected void initialize() {
	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String businessNo;
	private java.lang.String buyerName;
	private java.lang.String buyerCustcd;
	private java.lang.Integer loanDays;
	private java.lang.Integer debtGraceDays;
	private java.lang.String batchNumber;
	private java.lang.Integer creditTerm;
	private BigDecimal creditAmt;
	private java.lang.Integer riskTerm;
	private java.lang.String recoverType;
	private java.lang.String factPattern;
	private java.lang.String noticeType;
	private BigDecimal loanPercent;

	/**
	 * Return the unique identifier of this class
	 * 
	 * @hibernate.id generator-class="assigned" column="ID"
	 */
	public java.lang.String getId() {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * 
	 * @param id
	 *            the new ID
	 */
	public void setId(java.lang.String id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
	 * @return the businessNo
	 */
	public java.lang.String getBusinessNo() {
		return businessNo;
	}

	/**
	 * @param businessNo
	 *            the businessNo to set
	 */
	public void setBusinessNo(java.lang.String businessNo) {
		this.businessNo = businessNo;
	}

	/**
	 * @return the buyerName
	 */
	public java.lang.String getBuyerName() {
		return buyerName;
	}

	/**
	 * @param buyerName
	 *            the buyerName to set
	 */
	public void setBuyerName(java.lang.String buyerName) {
		this.buyerName = buyerName;
	}

	public java.lang.String getBuyerCustcd() {
		return buyerCustcd;
	}

	public void setBuyerCustcd(java.lang.String buyerCustcd) {
		this.buyerCustcd = buyerCustcd;
	}

	public java.lang.Integer getLoanDays() {
		return loanDays;
	}

	public void setLoanDays(java.lang.Integer loanDays) {
		this.loanDays = loanDays;
	}

	public java.lang.Integer getDebtGraceDays() {
		return debtGraceDays;
	}

	public void setDebtGraceDays(java.lang.Integer debtGraceDays) {
		this.debtGraceDays = debtGraceDays;
	}

	public java.lang.String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(java.lang.String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public java.lang.Integer getCreditTerm() {
		return creditTerm;
	}

	public void setCreditTerm(java.lang.Integer creditTerm) {
		this.creditTerm = creditTerm;
	}

	public BigDecimal getCreditAmt() {
		return creditAmt;
	}

	public void setCreditAmt(BigDecimal creditAmt) {
		this.creditAmt = creditAmt;
	}

	public java.lang.Integer getRiskTerm() {
		return riskTerm;
	}

	public void setRiskTerm(java.lang.Integer riskTerm) {
		this.riskTerm = riskTerm;
	}

	public java.lang.String getRecoverType() {
		return recoverType;
	}

	public void setRecoverType(java.lang.String recoverType) {
		this.recoverType = recoverType;
	}

	public java.lang.String getFactPattern() {
		return factPattern;
	}

	public void setFactPattern(java.lang.String factPattern) {
		this.factPattern = factPattern;
	}

	public java.lang.String getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(java.lang.String noticeType) {
		this.noticeType = noticeType;
	}

	public BigDecimal getLoanPercent() {
		return loanPercent;
	}

	public void setLoanPercent(BigDecimal loanPercent) {
		this.loanPercent = loanPercent;
	}

	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof TblContDebtExtInfo))
			return false;
		else {
			TblContDebtExtInfo tblContDebtExtInfo = (TblContDebtExtInfo) obj;
			if (null == this.getId() || null == tblContDebtExtInfo.getId())
				return false;
			else
				return (this.getId().equals(tblContDebtExtInfo.getId()));
		}
	}

	public int hashCode() {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId())
				return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":"
						+ this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public String toString() {
		return super.toString();
	}

}