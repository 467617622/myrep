/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2008-2012 TOPSCF  All rights reserved.
 * ==================================================================
 */

package com.huateng.scf.systemmng.dao;


import java.util.Iterator;

import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.scf.db.BaseDAO;
import com.huateng.scf.db.SCFDAOUtils;
import com.huateng.scf.systemmng.data.TblCustMapInfo;

 
/**
 * 客户基本信息DAO
 *
 * @author <a href="mailto:xiong_xiaolong@topscf.com">xiong_xiaolong</a>
 *
 * @version Revision: 1.0 Date: 2012-7-11 下午3:54:29
 *
 */
@SuppressWarnings({"rawtypes","unchecked","deprecation"})
public class TblCustMapInfoDAO extends BaseDAO<TblCustMapInfo> {

	@Override
	protected Class<TblCustMapInfo> getReferenceClass() {
		return TblCustMapInfo.class;
	}

	public TblCustMapInfo get(java.lang.String key)
			throws org.hibernate.HibernateException {
			return (TblCustMapInfo) get(getReferenceClass(), key);
	}

	

	public Boolean getCustNoFlag(String custId, String custType) throws CommonException {
		 
		String hql="select tcmi.custNo from TblCustMapInfo tcmi where tcmi.custId='"+custId+"' and tcmi.custType='"+custType+"' ";
		Iterator it=SCFDAOUtils.getHQLDAO().queryByQL(hql);	 
		Boolean custNoFlag=true;
		while(it.hasNext()){
			  it.next();
			  custNoFlag=false;		 
		}
		return custNoFlag;
	 
	}
	
	public String getCustNo(String custId, String custType) throws CommonException {
		 
		String hql="select tcmi.custNo from TblCustMapInfo tcmi where status='00' and  custId='"+custId+"' and custType='"+custType+"'";
		Iterator it=SCFDAOUtils.getHQLDAO().queryByQL(hql);	 
		String custNo="";
		while(it.hasNext()){
			custNo=(String) it.next();
		}
		return custNo;
	 
	}

	public void CustMapDelete(String id) {
		 TblCustMapInfo tcmi=this.get(id);
		 this.delete(tcmi);
		 
	}
	
	 

}
