/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2004-2005 Huateng Software System.  All rights
 * reserved.
 * ==================================================================
 */
package com.huateng.scf.systemmng.service;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.huateng.ebank.business.common.operator.GetSeqnoOperation;
import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.ebank.framework.operation.OperationContext;
import com.huateng.ebank.framework.operation.SingleOPCaller;
import com.huateng.ebank.framework.util.ApplicationContextUtils;
import com.huateng.scf.db.UUIDGenerator;
import com.huateng.scf.systemmng.dao.SCFHQLDAO;

/**
 * @author davexin
 * @date 2010-11-25
 * @desc 所有service类的基类
 */
public class BaseService {

	private static Logger log = Logger.getLogger(BaseService.class);

	private SCFHQLDAO dao;  //注入

	public BaseService() {

	}

	public synchronized static BaseService getInstance() {
		return (BaseService) ApplicationContextUtils.getBean(BaseService.class.getName());
	}

	public SCFHQLDAO getDao() {
		return dao;
	}

	public void setDao(SCFHQLDAO dao) {
		this.dao = dao;
	}

	/**
	 * 获取序列号
	 * @param seqName  sequence名字
	 * @return
	 * @throws CommonException
	 */
	public Object getSeqValueOrcl(String seqName)
	throws CommonException {
		return (Object)dao.getHibernateTemplate().getSessionFactory().getCurrentSession()
		.createSQLQuery("select " + seqName + ".nextval as seqval from dual").uniqueResult();
	}

	/**
	 * 获取序列号
	 * @param seqName  sequence名字
	 * @return
	 * @throws CommonException
	 */
	public Object getSeqValue(String seqName)
	throws CommonException {
		return (Object)dao.getHibernateTemplate().getSessionFactory().getCurrentSession()
		.createSQLQuery(" select NEXT VALUE FOR " + seqName + " FROM SYSIBM.SYSDUMMY1 ").uniqueResult();
	}

	/**
	 * 获取序列号
	 * @param seqName  sequence名字
	 * @return
	 * @throws CommonException
	 */
	public Object getSeqValueNoTr(String seqName)
	throws CommonException {
		Session session = null;
		try{
			session = this.dao.getHibernateTemplate().getSessionFactory().openSession();
			return (Object)session.createSQLQuery(" select NEXT VALUE FOR " + seqName + " FROM SYSIBM.SYSDUMMY1 ").uniqueResult();
		}catch(Exception e){
			log.error("------获取getSeqValueNoTr error="+e);
			e.printStackTrace();
			throw new CommonException(e.toString());
		}finally{
			if(session!=null){
				session.close();
			}
		}
	}

	/**
	 * 得到序号，不推荐使用该方法
	 * @Deprecated
	 * @param valueNo
	 * @param valueIndex
	 * @return
	 * @throws CommonException
	 */
	/** modify by shen_antonio 20091009 jira:BMS-2059 begin . */
	public synchronized int getSeqno(int valueNo, String valueIndex)
	throws CommonException {
		/** modify by shen_antonio 20091009 jira:BMS-2059 end . */
		/**
		 * modify by shen_antonio 20090227
		 * GetSeqnoGenerator getSeqnoGenerator =
		 * (GetSeqnoGenerator)GeneratorFactory.getGenerator("GetSeqnoGenerator");
		 * Map paramMap = new HashMap(); paramMap.put("valueNo", new
		 * Integer(valueNo)); paramMap.put("valueIndex", valueIndex); Integer
		 * seqno = new
		 * Integer(Integer.parseInt(getSeqnoGenerator.gen(paramMap)));
		 **/
		OperationContext context = new OperationContext();
		context.setAttribute(GetSeqnoOperation.VALUE_NO, new Integer(valueNo));
		context.setAttribute(GetSeqnoOperation.VALUE_INDEX, valueIndex);
		SingleOPCaller.call(GetSeqnoOperation.ID, context);
		Integer seqno = (Integer) context.getAttribute(GetSeqnoOperation.SEQNO);
		return seqno.intValue();
	}

	/**
	 *
	 * @Description: 获取UUID
	 * @author kangbyron
	 * @Created 2012-7-23下午04:53:53
	 * @return
	 */
	protected String getUUID(){
		return UUIDGenerator.generate();
	}

}