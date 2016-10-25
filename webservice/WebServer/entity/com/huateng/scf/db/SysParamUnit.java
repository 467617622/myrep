/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2008-2012 TOPSCF  All rights reserved.
 * ==================================================================
 */

package com.huateng.scf.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.ebank.framework.util.ExceptionUtil;
import com.huateng.exception.AppException;
import com.huateng.scf.systemmng.dao.TblSysParamDAO;
import com.huateng.scf.systemmng.data.TblSysParam;

/**
 * 系统参数表操作类
 *
 * @author <a href="mailto:xiong_xiaolong@topscf.com">xiong_xiaolong</a>
 *
 * @version Revision: 1.0 Date: 2012-7-10 上午9:52:33
 *
 */

public class SysParamUnit {
	private static Logger logger = Logger.getLogger(SysParamUnit.class);

	public static final String PARAM_ID_SYSINFO = "SYSINFO";// 系统信息参数
	public static final String PARAM_INDEX_SYSINFO_DBTYPE = "DBTYPE";// 系统信息参数-数据库类型：支持【DB2|ORACLE|SQLSERVER|INFORMIX】
	public static final String PARAM_INDEX_SYSINFO_DBTYPE_DB2 = "DB2";// 系统信息参数-数据库类型[DB2]
	public static final String PARAM_INDEX_SYSINFO_DBTYPE_ORACLE = "ORACLE";// 系统信息参数-数据库类型[ORACLE]
	public static final String PARAM_INDEX_SYSINFO_DBTYPE_SQLSERVER = "SQLSERVER";// 系统信息参数-数据库类型[SQLSERVER]
	public static final String PARAM_INDEX_SYSINFO_DBTYPE_INFORMIX = "INFORMIX";// 系统信息参数-数据库类型[INFORMIX]

	public static final String PARAM_INDEX_SYSINFO_ORG = "scf_org_choice";// 系统信息参数-机构权限控制开关
	public static final String PARAM_INDEX_SYSINFO_PRODUCT_AUTH_FLAG = "PRODUCT_AUTH_FLAG";// 产品授权开关
	public static final String PARAM_INDEX_SYSINFO_RIGHT_GOODS_FLAG = "RIGHT_GOODS_FLAG";// 监管货权开关
	public static final String PARAM_INDEX_SYSINFO_PRODUCT_MORT_FLAG="PRODUCT_MORT_FLAG";//产品与押品类别绑定开关

	public static final String PARAM_INDEX_SYSINFO_CORE_FLAG="CORE_FLAG";//核心系统开关
	public static final String PARAM_INDEX_SYSINFO_CCMS_FLAG="CCMS_FLAG";//信贷系统开关
	public static final String PARAM_INDEX_SYSINFO_BILL_FLAG="BILL_FLAG";//信贷系统开关
	public static final String PARAM_INDEX_SYSINFO_IFSP_FLAG="IFSP_FLAG";//互联网金融IFSP平台开关
	public static final String PARAM_INDEX_SYSINFO_ESB_FLAG="ESB_FLAG";//esb机构开关
	public static final String PARAM_INDEX_SYSINFO_WEBTIME="WEBTIME";//服务开关
	public static final String PARAM_INDEX_SYSINFO_ZHONGJIANBAJU="ZHONGJIANBAJU";//中建八局核心客户号
	
	public static final String PARAM_ID_LOGIN = "LOGIN";// 登陆
	public static final String PARAM_INDEX_LOGIN_MODE = "LOGIN_MODE";// 登陆模式

	public static final String PARAM_ID_LOG_FLAG="LOGFLAG";//paramid
	public static final String PARAM_INDEX_QUERY_LOG_FLAG="QUERY_LOG_FLAG";//paramIndex查询操作日志开关
	public static final String PARAM_INDEX_UPDATE_LOG_FLAG="UPDATE_LOG_FLAG";//paramIndex更新操作日志开关

	private static Map paramMap = new HashMap();//参数MAP,存放从数据库表TBL_SYS_PARAM读取的数据

	/**
	 * 初始化参数
	 *
	 * @throws AppException
	 */
	public static void init() throws AppException {
		reload();
	}

	/**
	 * 重载所有参数
	 *
	 * @throws AppException
	 * 
	 */
	public static void reload() throws AppException {

		logger.info("开始读取参数表");
		TblSysParamDAO sysParam = SCFDAOUtils.getTblSysParamDAO();

		List list = sysParam.findAll();
		if (list == null) {
			
			list = new ArrayList(0);
		}
		Map newParamMap = new HashMap();
		for (int i = 0; i < list.size(); i++) {
			TblSysParam sys = (TblSysParam) list.get(i);
			Map magicMap = (Map) newParamMap.get(sys.getParamId());
			if (magicMap == null) {
				magicMap = new HashMap();
				newParamMap.put(sys.getParamId(), magicMap);
			}
			if (magicMap.containsKey(sys.getParamIndex())) {
				ExceptionUtil.throwCommonException("param not found");

			}
			logger.info("paramId:" + sys.getParamId() + "  paramIndex:"
					+ sys.getParamIndex() + "  value:" + sys.getParamValue());
			magicMap.put(sys.getParamIndex(), sys.getParamValue());
		}
		paramMap = newParamMap;
		logger.info("完成参数表读取");
	}




	/**
	 * 获得指定参数值
	 *
	 * @param paramId
	 * @param paramIndex
	 * @return
	 * @throws CommonException
	 * @throws AppException
	 */
	public static String get(String paramId, String paramIndex) throws CommonException{
		try {
			SysParamUnit.init();
		} catch (AppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String key = null;
		Map magicMap = (Map) paramMap.get(paramId);
		if (magicMap != null) {
			key = (String) magicMap.get(paramIndex);
			if (key != null) {
				return key;
			}
		}else{
			ExceptionUtil.throwCommonException("param not found:" + paramId + " " + paramIndex);
		}
		return key;

		/*String key = "";
		SysParamMgrService sysParamMgrService = SysParamMgrService.getInstance();
		OldCommonQueryVO commonQueryVO = new OldCommonQueryVO();
		commonQueryVO.setParamId(paramId);
		commonQueryVO.setParamIndex(paramIndex);
		PageQueryResult pageQueryResult = sysParamMgrService.getSysParamsByPara(commonQueryVO);
		if(pageQueryResult!=null && pageQueryResult.getQueryResult().size()>0){
			TblSysParam TblSysParam = (TblSysParam)pageQueryResult.getQueryResult().get(0);
			key = TblSysParam.getParamValue();
		}
		return key;*/
	}

	/**
	 * 获取操作员登陆模式
	 *
	 * @return
	 * @throws AppException
	 */
	public static String getLoginMode() throws CommonException {
		try {
			String value = get(PARAM_ID_LOGIN, PARAM_INDEX_LOGIN_MODE);
			return value;
		} catch (CommonException ex) {
			logger.error("没有配置PARAM_ID[PARAM_ID_LOGIN],PARAM_INDEX[PARAM_INDEX_LOGIN_MODE)]的参数,取值范围[1|2|3]");
			throw ex;
		}
	}
	/**
	 *
	 * @Description: 获取查询操作日志开关值
	 * @author jialei.zhang
	 * @Created 2013-3-21下午04:54:35
	 * @return
	 * @throws CommonException
	 */
	public static String getQueryLogFlag() throws CommonException{
		try {
			String value =get(PARAM_ID_LOG_FLAG,PARAM_INDEX_QUERY_LOG_FLAG);
			return value;
		} catch (CommonException e) {
			logger.error("没有配置PARAM_ID[PARAM_ID_QUERY_LOG_FLAG],PARAM_INDEX[PARAM_INDEX_QUERY_LOG_FLAG)]的参数,取值范围[0|1]");
			throw e;
		}
	}
	/**
	 *
	 * @Description: 获取更新操作日志开关值
	 * @author jialei.zhang
	 * @Created 2013-3-21下午04:55:42
	 * @return
	 * @throws CommonException
	 */
	public static String getUpdateLogFlag() throws CommonException{
		try {
			String value =get(PARAM_ID_LOG_FLAG,PARAM_INDEX_UPDATE_LOG_FLAG);
			return value;
		} catch (CommonException e) {
			logger.error("没有配置PARAM_ID[PARAM_ID_UPDATE_LOG_FLAG],PARAM_INDEX[PARAM_INDEX_UPDATE_LOG_FLAG)]的参数,取值范围[0|1]");
			throw e;
		}
	}

	/**
	 *
	 * @Description: 获取核心开关
	 * @author kangbyron
	 * @Created 2013-5-15下午06:06:01
	 * @return
	 * @throws CommonException
	 */
	public static String getCoreFlag() throws CommonException{
		try {
			String value =get(PARAM_ID_SYSINFO,PARAM_INDEX_SYSINFO_CORE_FLAG);
			return value;
		} catch (CommonException e) {
			logger.error("没有配置PARAM_ID[PARAM_ID_SYSINFO],PARAM_INDEX[PARAM_INDEX_SYSINFO_CORE_FLAG)]的参数,取值范围[0|1]");
			throw e;
		}
	}

	/**
	 * @Description: 获取信贷系统开关
	 * @author Guziliang
	 * @Created 2013-8-13上午09:45:57
	 * @return
	 * @throws CommonException
	 */
	public static String getCcmsFlag() throws CommonException{
		try {
			String value =get(PARAM_ID_SYSINFO,PARAM_INDEX_SYSINFO_CCMS_FLAG);
			return value;
		} catch (CommonException e) {
			logger.error("没有配置PARAM_ID[PARAM_ID_SYSINFO],PARAM_INDEX[PARAM_INDEX_SYSINFO_CCMS_FLAG)]的参数,取值范围[0|1]");
			throw e;
		}
	}

	public static String getBillFlag() throws CommonException{
		try {
			String value =get(PARAM_ID_SYSINFO,PARAM_INDEX_SYSINFO_BILL_FLAG);
			return value;
		} catch (CommonException e) {
			logger.error("没有配置PARAM_ID[PARAM_ID_SYSINFO],PARAM_INDEX[PARAM_INDEX_SYSINFO_CCMS_FLAG)]的参数,取值范围[0|1]");
			throw e;
		}
	}
	
	/**
	 * 获取互联网金融平台开关
	 * @return
	 * @throws CommonException
	 */
	public static String getIfspFlag() throws CommonException {
		try {
			String value =get(PARAM_ID_SYSINFO,PARAM_INDEX_SYSINFO_IFSP_FLAG);
			return value;
		} catch (CommonException e) {
			logger.error("没有配置PARAM_ID[PARAM_ID_SYSINFO],PARAM_INDEX[PARAM_INDEX_SYSINFO_IFSP_FLAG)]的参数,取值范围[0|1]");
			throw e;
		}
	}
	
	/**
	 * 获取互联网金融平台开关
	 * @return
	 * @throws CommonException
	 */
	public static String getEsbFlag() throws CommonException {
		try {
			String value =get(PARAM_ID_SYSINFO,PARAM_INDEX_SYSINFO_ESB_FLAG);
			return value;
		} catch (CommonException e) {
			logger.error("没有配置PARAM_ID[PARAM_ID_SYSINFO],PARAM_INDEX[PARAM_INDEX_SYSINFO_IFSP_FLAG)]的参数,取值范围[0|1]");
			throw e;
		}
	}
	/**
	 * 获取服务开关
	 * @return
	 * @throws CommonException
	 */
	public static String getWebsTime() throws CommonException {
		try {
			String value =get(PARAM_ID_SYSINFO,PARAM_INDEX_SYSINFO_WEBTIME);
			return value;
		} catch (CommonException e) {
			logger.error("没有配置PARAM_ID[PARAM_ID_SYSINFO],PARAM_INDEX[PARAM_INDEX_SYSINFO_IFSP_FLAG)]的参数,取值范围[0|1]");
			throw e;
		}
	}
	
	/**
	 * 获取中建八局核心客户号
	 * @return
	 * @throws CommonException
	 */
	public static String getCoreCustNo() throws CommonException {
		try {
			String value =get(PARAM_ID_SYSINFO,PARAM_INDEX_SYSINFO_ZHONGJIANBAJU);
			return value;
		} catch (CommonException e) {
			logger.error("没有配置PARAM_ID[PARAM_ID_SYSINFO],PARAM_INDEX[PARAM_INDEX_SYSINFO_ZHONGJIANBAJU)]的参数 ");
			throw e;
		}
	}
}
