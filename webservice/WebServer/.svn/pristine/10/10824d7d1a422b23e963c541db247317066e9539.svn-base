/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2008-2012 TOPSCF  All rights reserved.
 * ==================================================================
 */

package com.huateng.scf.systemmng.dao;

import java.util.Iterator;
import java.util.List;

import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.scf.db.BaseDAO;
import com.huateng.scf.systemmng.data.TblCustBaseInfo;
/**
 * 客户基本信息DAO
 *
 * @author <a href="mailto:xiong_xiaolong@topscf.com">xiong_xiaolong</a>
 *
 * @version Revision: 1.0 Date: 2012-7-11 下午3:54:29
 *
 */
@SuppressWarnings({"rawtypes","unchecked","deprecation"})
public class TblCustBaseInfoDAO extends BaseDAO<TblCustBaseInfo> {

	@Override
	protected Class<TblCustBaseInfo> getReferenceClass() {
		return TblCustBaseInfo.class;
	}

	public TblCustBaseInfo get(java.lang.String key)
			throws org.hibernate.HibernateException {
			return (TblCustBaseInfo) get(getReferenceClass(), key);
	}

	
	
	/**
	 * @param ccmsCustcd
	 * @return
	 * @throws CommonException
	 */
	public TblCustBaseInfo getTblCustBaseInfoByCcmsCustcd (String ccmsCustcd) throws CommonException{
		String hql = "select t from TblCustBaseInfo t where t.ccmsCustcd ='"+ccmsCustcd+"'";
		List<TblCustBaseInfo> list = this.find(hql);
		TblCustBaseInfo tblCustBaseInfo = null;
		if(list != null && list.size() > 0){
			tblCustBaseInfo = list.get(0);
		}
		return tblCustBaseInfo;
	}
	
	/**
	 * 根据核心客户号查询客户信息  
	 * @param custno
	 * @author luotianran 2016/04/26
	 * @return 
	 * @throws CommonException
	 */
	public TblCustBaseInfo getTblCustBaseInfoByCustno (String custno) throws CommonException{
		String hql = "select t from TblCustBaseInfo t where t.custno ='"+custno+"' ";
		List<TblCustBaseInfo> list = this.find(hql);
		TblCustBaseInfo tblCustBaseInfo = null;
		if(list != null && list.size() > 0){
			tblCustBaseInfo = list.get(0);
		}
		return tblCustBaseInfo;
	}
	
	/**
	 * 根据核心客户号查询客户号
	 * @param custno
	 * @author luotianran 2016/05/03
	 * @return custcd
	 * @throws CommonException
	 */
	public String getCustcdByCustno (String custno) throws CommonException{
		String hql = "select t.custcd from TblCustBaseInfo t where t.custno ='"+custno+"' ";
		Iterator it = this.find(hql).iterator();
		String custcd = null;
		if(it.hasNext()){
			Object obj = it.next();
			custcd = obj.toString();
		}
		return custcd;
	}
	
	/**
	 * 根据客户号查询核心客户号
	 * @param custcd
	 * @author luotianran 2016/05/03
	 * @return custno
	 * @throws CommonException
	 */
	public String getCustnoByCustcd (String custcd) throws CommonException{
		String hql = "select t.custno from TblCustBaseInfo t where t.custcd ='"+custcd+"' ";
		List list = this.find(hql);
		String custno = null;
		if(list != null && list.size() > 0){
			custno = list.get(0).toString();
		}
		return custno;
	}

 /**
  * 根据核心客户号查询核心客户的信息
  * @param coreCustId
  * @return
  */
	public TblCustBaseInfo queryBuyerInfo(String coreCustId) {
		String hql = "select t from TblCustBaseInfo t where t.custno ='"+coreCustId+"' ";
		List list = this.find(hql);
		TblCustBaseInfo tcbi = null;
		if(list != null && list.size() > 0){
			tcbi = (TblCustBaseInfo) list.get(0) ;
		}
		return tcbi ;
	}
}
