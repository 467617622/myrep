package com.huateng.scf.systemmng.data.base;

import java.io.Serializable;

import com.huateng.scf.systemmng.data.TblCommLog;


/**
 * This is an object that contains data related to the TBL_COMM_LOG table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="TBL_COMM_LOG"
 */

public abstract class BaseTblCommLog  implements Serializable {

	public static String REF = "TblCommLog";
	public static String PROP_LAST_UPD_TLR = "lastUpdTlr";
	public static String PROP_TIMESTAMPS = "timestamps";
	public static String PROP_RSP_CODE = "rspCode";
	public static String PROP_SEND_MSG = "sendMsg";
	public static String PROP_RCV_MSG = "rcvMsg";
	public static String PROP_LAST_UPD_FUNC = "lastUpdFunc";
	public static String PROP_TLRNO = "tlrno";
	public static String PROP_MISCFLGS = "miscflgs";
	public static String PROP_TXN_AMT = "txnAmt";
	public static String PROP_BUSINESS_NO = "businessNo";
	public static String PROP_LAST_UPD_DATE = "lastUpdDate";
	public static String PROP_SOURCE = "source";
	public static String PROP_MISC = "misc";
	public static String PROP_BRCODE = "brcode";
	public static String PROP_TXDATE = "txdate";
	public static String PROP_TXN_STATUS = "txnStatus";
	public static String PROP_DEST = "dest";
	public static String PROP_RES_CODE = "resCode";
	public static String PROP_TXN_CODE = "txnCode";
	public static String PROP_ID = "id";
	public static String PROP_FLOW_NO = "flowNo";
	public static String PROP_TXTIME = "txtime";


	// constructors
	public BaseTblCommLog () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTblCommLog (java.lang.String id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseTblCommLog (
		java.lang.String id,
		java.util.Date txdate,
		java.util.Date txtime) {

		this.setId(id);
		this.setTxdate(txdate);
		this.setTxtime(txtime);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String flowNo;
	private java.lang.String businessNo;
	private java.lang.String txnCode;
	private java.util.Date txdate;
	private java.util.Date txtime;
	private java.lang.String brcode;
	private java.lang.String tlrno;
	private java.lang.String source;
	private java.lang.String dest;
	private java.lang.String txnStatus;
	private java.lang.String resCode;
	private java.lang.String rcvMsg;
	private java.lang.String sendMsg;
	private java.lang.String miscflgs;
	private java.lang.String misc;
	private java.util.Date timestamps;
	private java.lang.String lastUpdTlr;
	private java.lang.String lastUpdFunc;
	private java.util.Date lastUpdDate;
	private java.lang.String rspCode;
	private java.math.BigDecimal txnAmt;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="assigned"
     *  column="ID"
     */
	public java.lang.String getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.String id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: FLOW_NO
	 */
	public java.lang.String getFlowNo () {
		return flowNo;
	}

	/**
	 * Set the value related to the column: FLOW_NO
	 * @param flowNo the FLOW_NO value
	 */
	public void setFlowNo (java.lang.String flowNo) {
		this.flowNo = flowNo;
	}



	/**
	 * Return the value associated with the column: BUSINESS_NO
	 */
	public java.lang.String getBusinessNo () {
		return businessNo;
	}

	/**
	 * Set the value related to the column: BUSINESS_NO
	 * @param businessNo the BUSINESS_NO value
	 */
	public void setBusinessNo (java.lang.String businessNo) {
		this.businessNo = businessNo;
	}



	/**
	 * Return the value associated with the column: TXN_CODE
	 */
	public java.lang.String getTxnCode () {
		return txnCode;
	}

	/**
	 * Set the value related to the column: TXN_CODE
	 * @param txnCode the TXN_CODE value
	 */
	public void setTxnCode (java.lang.String txnCode) {
		this.txnCode = txnCode;
	}



	/**
	 * Return the value associated with the column: TXDATE
	 */
	public java.util.Date getTxdate () {
		return txdate;
	}

	/**
	 * Set the value related to the column: TXDATE
	 * @param txdate the TXDATE value
	 */
	public void setTxdate (java.util.Date txdate) {
		this.txdate = txdate;
	}



	/**
	 * Return the value associated with the column: TXTIME
	 */
	public java.util.Date getTxtime () {
		return txtime;
	}

	/**
	 * Set the value related to the column: TXTIME
	 * @param txtime the TXTIME value
	 */
	public void setTxtime (java.util.Date txtime) {
		this.txtime = txtime;
	}



	/**
	 * Return the value associated with the column: BRCODE
	 */
	public java.lang.String getBrcode () {
		return brcode;
	}

	/**
	 * Set the value related to the column: BRCODE
	 * @param brcode the BRCODE value
	 */
	public void setBrcode (java.lang.String brcode) {
		this.brcode = brcode;
	}



	/**
	 * Return the value associated with the column: TLRNO
	 */
	public java.lang.String getTlrno () {
		return tlrno;
	}

	/**
	 * Set the value related to the column: TLRNO
	 * @param tlrno the TLRNO value
	 */
	public void setTlrno (java.lang.String tlrno) {
		this.tlrno = tlrno;
	}



	/**
	 * Return the value associated with the column: SOURCE
	 */
	public java.lang.String getSource () {
		return source;
	}

	/**
	 * Set the value related to the column: SOURCE
	 * @param source the SOURCE value
	 */
	public void setSource (java.lang.String source) {
		this.source = source;
	}



	/**
	 * Return the value associated with the column: DEST
	 */
	public java.lang.String getDest () {
		return dest;
	}

	/**
	 * Set the value related to the column: DEST
	 * @param dest the DEST value
	 */
	public void setDest (java.lang.String dest) {
		this.dest = dest;
	}



	/**
	 * Return the value associated with the column: TXN_STATUS
	 */
	public java.lang.String getTxnStatus () {
		return txnStatus;
	}

	/**
	 * Set the value related to the column: TXN_STATUS
	 * @param txnStatus the TXN_STATUS value
	 */
	public void setTxnStatus (java.lang.String txnStatus) {
		this.txnStatus = txnStatus;
	}



	/**
	 * Return the value associated with the column: RES_CODE
	 */
	public java.lang.String getResCode () {
		return resCode;
	}

	/**
	 * Set the value related to the column: RES_CODE
	 * @param resCode the RES_CODE value
	 */
	public void setResCode (java.lang.String resCode) {
		this.resCode = resCode;
	}



	/**
	 * Return the value associated with the column: RCV_MSG
	 */
	public java.lang.String getRcvMsg () {
		return rcvMsg;
	}

	/**
	 * Set the value related to the column: RCV_MSG
	 * @param rcvMsg the RCV_MSG value
	 */
	public void setRcvMsg (java.lang.String rcvMsg) {
		this.rcvMsg = rcvMsg;
	}



	/**
	 * Return the value associated with the column: SEND_MSG
	 */
	public java.lang.String getSendMsg () {
		return sendMsg;
	}

	/**
	 * Set the value related to the column: SEND_MSG
	 * @param sendMsg the SEND_MSG value
	 */
	public void setSendMsg (java.lang.String sendMsg) {
		this.sendMsg = sendMsg;
	}



	/**
	 * Return the value associated with the column: MISCFLGS
	 */
	public java.lang.String getMiscflgs () {
		return miscflgs;
	}

	/**
	 * Set the value related to the column: MISCFLGS
	 * @param miscflgs the MISCFLGS value
	 */
	public void setMiscflgs (java.lang.String miscflgs) {
		this.miscflgs = miscflgs;
	}



	/**
	 * Return the value associated with the column: MISC
	 */
	public java.lang.String getMisc () {
		return misc;
	}

	/**
	 * Set the value related to the column: MISC
	 * @param misc the MISC value
	 */
	public void setMisc (java.lang.String misc) {
		this.misc = misc;
	}



	/**
	 * Return the value associated with the column: TIMESTAMPS
	 */
	public java.util.Date getTimestamps () {
		return timestamps;
	}

	/**
	 * Set the value related to the column: TIMESTAMPS
	 * @param timestamps the TIMESTAMPS value
	 */
	public void setTimestamps (java.util.Date timestamps) {
		this.timestamps = timestamps;
	}



	/**
	 * Return the value associated with the column: LAST_UPD_TLR
	 */
	public java.lang.String getLastUpdTlr () {
		return lastUpdTlr;
	}

	/**
	 * Set the value related to the column: LAST_UPD_TLR
	 * @param lastUpdTlr the LAST_UPD_TLR value
	 */
	public void setLastUpdTlr (java.lang.String lastUpdTlr) {
		this.lastUpdTlr = lastUpdTlr;
	}



	/**
	 * Return the value associated with the column: LAST_UPD_FUNC
	 */
	public java.lang.String getLastUpdFunc () {
		return lastUpdFunc;
	}

	/**
	 * Set the value related to the column: LAST_UPD_FUNC
	 * @param lastUpdFunc the LAST_UPD_FUNC value
	 */
	public void setLastUpdFunc (java.lang.String lastUpdFunc) {
		this.lastUpdFunc = lastUpdFunc;
	}



	/**
	 * Return the value associated with the column: LAST_UPD_DATE
	 */
	public java.util.Date getLastUpdDate () {
		return lastUpdDate;
	}

	/**
	 * Set the value related to the column: LAST_UPD_DATE
	 * @param lastUpdDate the LAST_UPD_DATE value
	 */
	public void setLastUpdDate (java.util.Date lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}



	/**
	 * Return the value associated with the column: RSP_CODE
	 */
	public java.lang.String getRspCode () {
		return rspCode;
	}

	/**
	 * Set the value related to the column: RSP_CODE
	 * @param rspCode the RSP_CODE value
	 */
	public void setRspCode (java.lang.String rspCode) {
		this.rspCode = rspCode;
	}



	/**
	 * Return the value associated with the column: TXN_AMT
	 */
	public java.math.BigDecimal getTxnAmt () {
		return txnAmt;
	}

	/**
	 * Set the value related to the column: TXN_AMT
	 * @param txnAmt the TXN_AMT value
	 */
	public void setTxnAmt (java.math.BigDecimal txnAmt) {
		this.txnAmt = txnAmt;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof TblCommLog)) return false;
		else {
			TblCommLog tblCommLog = (TblCommLog) obj;
			if (null == this.getId() || null == tblCommLog.getId()) return false;
			else return (this.getId().equals(tblCommLog.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}