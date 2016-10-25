package com.huateng.scf.systemmng.data.base;

import java.io.Serializable;
import java.util.Date;

public class BaseTblCustMapInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String  id ;
	private String custId ;
	private String custName  ;
	private String orgCode ;
	private String  custNo ;
	private String appno ;
	private String  custType;  
	private String status ;
	private String startTlrcd  ;
	private String startTlrname  ;
	private String approveTlrcd ;
	private String  approveTlrname ;
    private Date startDate ;
    private Date approveDate ;
    public BaseTblCustMapInfo(){}
    public BaseTblCustMapInfo(String id){
    	this.setId(id);
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getAppno() {
		return appno;
	}
	public void setAppno(String appno) {
		this.appno = appno;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStartTlrcd() {
		return startTlrcd;
	}
	public void setStartTlrcd(String startTlrcd) {
		this.startTlrcd = startTlrcd;
	}
	public String getStartTlrname() {
		return startTlrname;
	}
	public void setStartTlrname(String startTlrname) {
		this.startTlrname = startTlrname;
	}
	public String getApproveTlrcd() {
		return approveTlrcd;
	}
	public void setApproveTlrcd(String approveTlrcd) {
		this.approveTlrcd = approveTlrcd;
	}
	public String getApproveTlrname() {
		return approveTlrname;
	}
	public void setApproveTlrname(String approveTlrname) {
		this.approveTlrname = approveTlrname;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getApproveDate() {
		return approveDate;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
