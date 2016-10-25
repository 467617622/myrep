/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2008-2012 TOPSCF  All rights reserved.
 * ==================================================================
 */

package com.huateng.scf.systemmng.data.base;

import java.io.Serializable;

import com.huateng.scf.systemmng.data.TblSysParam;

/**
 * 系统参数表（TBL_SYS_PARAM）
 *
 * @author <a href="mailto:xiong_xiaolong@topscf.com">xiong_xiaolong</a>
 *
 * @version Revision: 1.0 Date: 2012-7-10 下午4:05:41
 *
 */

@SuppressWarnings("rawtypes")
public abstract class BaseTblSysParam implements Comparable, Serializable {

	private static final long serialVersionUID = 4507105927196475934L;
	public static String REF = "TblSysParam";
	public static String PROP_LAST_UPD_DATE = "lastUpdDate";
	public static String PROP_PARAM_ID = "paramId";
	public static String PROP_PARAM_VALUE = "paramValue";
	public static String PROP_LAST_UPD_OPRID = "lastUpdTlr";
	public static String PROP_ID = "id";
	public static String PROP_MAGIC_ID = "magicId";
	public static String PROP_PARAM_DESC = "paramDesc";

	public BaseTblSysParam() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTblSysParam(java.lang.String paramId, java.lang.String paramIndex) {
		this.setParamId(paramId);
		this.setParamIndex(paramIndex);
		initialize();
	}

	protected void initialize() {

	}

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String paramId;//参数ID
	private java.lang.String paramIndex;//参数索引

	// fields
	private java.lang.String paramName;//参数名
	private java.lang.String paramValue;//参数值
	private java.lang.String paramDesc;//参数描述
	private java.util.Date lastUpdDate;//最后更新时间
	private java.lang.String lastUpdTlr;//最后更新操作员
	private java.lang.String defaultValue;//默认值
	private java.lang.String type;//参数类型

	public java.lang.String getParamId() {
		return paramId;
	}

	public void setParamId(java.lang.String paramId) {
		this.paramId = paramId;
	}

	public java.lang.String getParamIndex() {
		return paramIndex;
	}

	public void setParamIndex(java.lang.String paramIndex) {
		this.paramIndex = paramIndex;
	}

	public java.lang.String getParamName() {
		return paramName;
	}

	public void setParamName(java.lang.String paramName) {
		this.paramName = paramName;
	}

	public java.lang.String getParamValue() {
		return paramValue;
	}

	public void setParamValue(java.lang.String paramValue) {
		this.paramValue = paramValue;
	}

	public java.lang.String getParamDesc() {
		return paramDesc;
	}

	public void setParamDesc(java.lang.String paramDesc) {
		this.paramDesc = paramDesc;
	}


	public java.util.Date getLastUpdDate() {
		return lastUpdDate;
	}

	public void setLastUpdDate(java.util.Date lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}

	public java.lang.String getLastUpdTlr() {
		return lastUpdTlr;
	}

	public void setLastUpdTlr(java.lang.String lastUpdTlr) {
		this.lastUpdTlr = lastUpdTlr;
	}

	public void setDefaultValue(java.lang.String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public java.lang.String getDefaultValue() {
		return defaultValue;
	}

	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TblSysParam other = (TblSysParam) obj;
		if (paramId == null) {
			if (other.getParamId() != null)
				return false;
		} else if (!paramId.equals(other.getParamId()))
			return false;
		if (paramIndex == null) {
			if (other.getParamIndex() != null)
				return false;
		} else if (!paramIndex.equals(other.getParamIndex()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getParamId())
				return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":"
						+ this.getParamId().hashCode() + ":"
						+ this.getParamIndex().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public int compareTo(Object obj) {
		if (obj.hashCode() > hashCode())
			return 1;
		else if (obj.hashCode() < hashCode())
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
