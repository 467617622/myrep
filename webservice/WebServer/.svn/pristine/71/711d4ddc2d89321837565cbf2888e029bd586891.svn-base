/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2004-2005 Huateng Software System.  All rights
 * reserved.
 * ==================================================================
 */
package com.huateng.scf.systemmng.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.huateng.common.log.HtLog;
import com.huateng.common.log.HtLogFactory;
import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.ebank.framework.util.ExceptionUtil;

/**
 * @author valley
 * @date 2005-06-01
 * @desc 数据库访问类
 */
public class SCFHQLDAO extends HibernateDaoSupport {
	/**
	 * Logger for this class
	 */
	private static final HtLog logger = HtLogFactory.getLogger(SCFHQLDAO.class);

	public SCFHQLDAO() {
		super();
	}

	/** add by shen_antonio 20091030 jira:BMS-2140 begin .*/

	/**
	 * 根据输入条件查询
	 *
	 * @param sql，SQL查询语句
	 * @return Iterator，返回数组集合
	 * @throws CommonException
	 */
	public Iterator queryBySQL(String sql) throws CommonException {
		if (logger.isDebugEnabled()) {
			logger.debug("queryBySQL(String) - start"); //$NON-NLS-1$
		}
		final String tempSql = sql;
		Iterator it = null;
		try {
			it = (Iterator)this.getHibernateTemplate().execute(new HibernateCallback()
			{
			   public Object doInHibernate(Session session)
			     throws HibernateException
			   {
				 if (logger.isDebugEnabled()) {
					   logger.debug("queryBySQL(String) - sql sql=" + tempSql); //$NON-NLS-1$
				 }
			     SQLQuery sqlQuery = session.createSQLQuery(tempSql);
			     return sqlQuery.list().iterator();
			    }
			   });
			if (logger.isDebugEnabled()) {
				logger.debug("queryBySQL(String) - list end"); //$NON-NLS-1$
			}
		} catch (Exception e) {
			logger.error("queryBySQL(String)", e); //$NON-NLS-1$
			ExceptionUtil.throwCommonException(e.getMessage());
		}

		if (logger.isDebugEnabled()) {
			logger.debug("queryBySQL(String) - end"); //$NON-NLS-1$
		}
		return it;
	}
	/**
	 * 根据输入条件查询
	 *
	 * @param hql，对象查询语句
	 * @return Iterator，对象数组集合
	 * @throws CommonException
	 */
	public List queryListByQL(String hql) throws CommonException {
		if (logger.isDebugEnabled()) {
			logger.debug("queryByQL(String) - start"); //$NON-NLS-1$
		}
		List list=null;
		try {
			//it = this.getSession().iterate(hql);
			list = this.getHibernateTemplate().find(hql);
			if (logger.isDebugEnabled()) {
				logger.debug("queryByQL(String) - hql hql=" + hql); //$NON-NLS-1$
			}
		 //    return list;
		} catch (Exception e) {
			logger.error("queryByQL(String)", e); //$NON-NLS-1$
			 ExceptionUtil.throwCommonException("HQLDAO查询错误");
//			ExceptionUtil.throwCommonException(e.getMessage(),
//					ErrorCode.ERROR_CODE_DAO, e);
		}

		if (logger.isDebugEnabled()) {
			logger.debug("queryByQL(String) - end"); //$NON-NLS-1$
		}
		return list;
	}

	/**
	 * 根据输入条件查询
	 *
	 * @param hql，对象查询语句
	 * @return Iterator，对象数组集合
	 * @throws CommonException
	 */
	public Iterator queryByQL(String hql) throws CommonException {
		if (logger.isDebugEnabled()) {
			logger.debug("queryByQL(String) - start"); //$NON-NLS-1$
		}

		Iterator returnIterator = null;
		try {
			//it = this.getSession().iterate(hql);
			List list = this.getHibernateTemplate().find(hql);
			if (logger.isDebugEnabled()) {
				logger.debug("queryByQL(String) - hql hql=" + hql); //$NON-NLS-1$
			}
			returnIterator = list.iterator();
			if (logger.isDebugEnabled()) {
				logger.debug("queryByQL(String) - list end"); //$NON-NLS-1$
			}

		} catch (Exception e) {
			logger.error("queryByQL(String)", e); //$NON-NLS-1$
			 ExceptionUtil.throwCommonException("HQLDAO查询错误");
//			ExceptionUtil.throwCommonException(e.getMessage(),
//					ErrorCode.ERROR_CODE_DAO, e);
		}

		if (logger.isDebugEnabled()) {
			logger.debug("queryByQL(String) - end"); //$NON-NLS-1$
		}
		return returnIterator;
	}

}