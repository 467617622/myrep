/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2008-2012 TOPSCF  All rights reserved.
 * ==================================================================
 */

package com.huateng.scf.systemmng.dao;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.huateng.common.DateUtil;
import com.huateng.ebank.business.common.GlobalInfo;
import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.ebank.framework.util.ExceptionUtil;
import com.huateng.scf.db.BaseDAO;
import com.huateng.scf.db.SCFDAOUtils;
import com.huateng.scf.systemmng.data.TblSysParam;

/**
 * 系统参数DAO
 *
 * @author <a href="mailto:xiong_xiaolong@topscf.com">xiong_xiaolong</a>
 *
 * @version Revision: 1.0 Date: 2012-7-10 下午5:15:52
 *
 */
@SuppressWarnings("rawtypes")
public class TblSysParamDAO extends BaseDAO<TblSysParam> {

	@Override
	protected Class<TblSysParam> getReferenceClass() {
		return com.huateng.scf.systemmng.data.TblSysParam.class;
	}
	
	
	/**
	 * 编辑 updateProductparamngUpdate
	 * 产品规则的更新
	 * @param updateList
	 * @throws CommonException
	 */
	public void updateProductparamngUpdate(List updateList) throws CommonException {
		GlobalInfo globalInfo = GlobalInfo.getCurrentInstance();
		if (updateList == null || updateList.size() == 0) {
			return;
		}
		for (int i = 0; i < updateList.size(); i++) {
			TblSysParam vo = (TblSysParam) updateList.get(i);
			TblSysParam tblSysParam=new TblSysParam();
			tblSysParam.setParamId(vo.getParamId()); // 规则编号
			tblSysParam.setParamName(vo.getParamName()); // 规则名称
			tblSysParam.setParamValue(vo.getParamValue()); // 规则值
			tblSysParam.setParamIndex(vo.getParamIndex());
			tblSysParam.setLastUpdTlr(globalInfo.getTlrno()); // 登记人
			tblSysParam.setLastUpdDate(DateUtil.getCurrentDate()); // 登记时间
			this.update(tblSysParam);
		}
	}

	

	
	


	public TblSysParam get(java.lang.String key)
			throws org.hibernate.HibernateException {
			return (TblSysParam) get(getReferenceClass(), key);
		}

	public TblSysParam get(Serializable key)
		throws org.hibernate.HibernateException {
		return (TblSysParam) get(getReferenceClass(), key);
	}
}
