/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2008-2012 TOPSCF  All rights reserved.
 * ==================================================================
 */

package com.huateng.scf.common.util;



/**
 *  接口常量
 *
 * @author <a href="mailto:jingnan.wang@topscf.com">jingnan.wang</a>
 *
 * @version Revision: 1.0  Date: 2012-12-13 下午12:34:13
 *
 */

public class B2BConstants {
	/** 接口调用是否成功标识 **/
	public static final String SUCCESS = "0000";//成功
	public static final String FAILED = "9999";//失败
	/** 查询方式 00--详情; 01--目录 默认 详情 **/
	public static final String QUERY_TYPE_DETAIL = "00";//详情
	public static final String QUERY_TYPE_CATALOG = "01";//目录
	/** 操作类型：00业务查询，01 全部查询 **/
	public static final String OPER_TYPE_SALLER = "00"; // 00卖方查询
	public static final String OPER_TYPE_BUY = "01"; // 01 买方查询
	public static final String OPER_TYPE_ALL =  "02"; //  02 全部查询
    /** B2B接口查询监管协议的查询类型 **/
	public static final String OPER_TYPE_QUERY = "00";//查询
	public static final String OPER_TYPE_BUSS = "01";//业务
	/** B2B接口押品信息的查询类型 **/
	public static final String QUERY_TYPE_MORT = "00";//查询押品信息
	public static final String QUERY_TYPE_MORT_DTL = "01";//查询在质押品明细信息

	/** --- 通知书回执结果 --- */
	public static final String AGREE = "0";//同意
	public static final String DISAGREE = "1";//拒绝

	public static final String B2B_OPERATOR_ID = "1109";//B2B虚拟用户
}
