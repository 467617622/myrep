package com.huateng.scf.webservices.vo;

import java.io.Serializable;

import com.huateng.scf.common.util.B2BConstants;


/**
 * 通用报文bean
 *
 * @author <a href="mailto:xiong_xiaolong@huateng.com">xiong_xiaolong</a>
 *
 * @version Revision: 1.0 Date: 2012-7-20 下午3:37:12
 *
 */
public class BaseSysProxyBean implements Serializable {

	private static final long serialVersionUID = 135273548756528L;

	private String traCode;// 交易代码
	private String channelMark;// 渠道标识：
	private String flowNo;// 流水号
	private String traDate;// 交易日期
	private String traTime;// 交易时间
	private String rcvMsg;// 返回报文

	private String resultCode = B2BConstants.SUCCESS;// 0000-成功，9999-失败;默认为成功

	private String errmsg;// 失败时填写原因
	private Integer totalSize;// 总记录数

	public String getRcvMsg() {
		return rcvMsg;
	}

	public void setRcvMsg(String rcvMsg) {
		this.rcvMsg = rcvMsg;
	}

	public String getTraCode() {
		return traCode;
	}

	public void setTraCode(String traCode) {
		this.traCode = traCode;
	}

	public String getChannelMark() {
		return channelMark;
	}

	public void setChannelMark(String channelMark) {
		this.channelMark = channelMark;
	}

	public String getFlowNo() {
		return flowNo;
	}

	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}

	public String getTraDate() {
		return traDate;
	}

	public void setTraDate(String traDate) {
		this.traDate = traDate;
	}

	public String getTraTime() {
		return traTime;
	}

	public void setTraTime(String traTime) {
		this.traTime = traTime;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public Integer getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	@Override
	public String toString() {
		String str0 =  "--交易代码:"+ traCode+"--";
		String str1 =  "--渠道标识:"+ channelMark+"--";
		String str2 =  "--流水号:"+ flowNo+"--";
		String str3 =  "--交易日期:"+ traDate+"--";
		String str4 =  "--交易时间:"+ traTime+"--";
		String str =  str0 + str1 + str2 + str3 + str4;
		return str;
	}

}
