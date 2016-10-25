package com.huateng.scf.webservices.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class LnciArraVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String billNum;
	private BigDecimal prepaymentAmt;
	private String loanDate;
	private String prepaymentDueDate;
	public String getBillNum() {
		return billNum;
	}
	public void setBillNum(String billNum) {
		this.billNum = billNum;
	}
	public BigDecimal getPrepaymentAmt() {
		return prepaymentAmt;
	}
	public void setPrepaymentAmt(BigDecimal prepaymentAmt) {
		this.prepaymentAmt = prepaymentAmt;
	}
	public String getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}
	public String getPrepaymentDueDate() {
		return prepaymentDueDate;
	}
	public void setPrepaymentDueDate(String prepaymentDueDate) {
		this.prepaymentDueDate = prepaymentDueDate;
	}
	

}
