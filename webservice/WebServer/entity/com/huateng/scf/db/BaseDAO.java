/**
 * Project: CMETPortal
 */
package com.huateng.scf.db;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.type.Type;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.huateng.ebank.business.common.ErrorCode;
import com.huateng.ebank.business.common.PageQueryCondition;
import com.huateng.ebank.business.common.PageQueryResult;
import com.huateng.ebank.business.common.operator.GetSeqnoOperation;
import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.ebank.framework.operation.OperationContext;
import com.huateng.ebank.framework.operation.SingleOPCaller;
import com.huateng.ebank.framework.util.ExceptionUtil;


/**
 * <p><strong>
 * Description:</strong>
 * </p>
 * <p><strong>
 * Copyright:</strong>&copy2009 Huateng
 * </p>
 * <p><strong>
 * Company:</strong>
 * </p>
 * @author Roger.li
 * @version 1.0
 */
public abstract class BaseDAO<T>  extends HibernateDaoSupport{

	private static Logger log = Logger.getLogger(BaseDAO.class);

	/**
	 * 得到序号，不推荐使用该方法
	 * @Deprecated
	 * @param valueNo
	 * @param valueIndex，，，，，，
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
	 * 得到序号，不推荐使用该方法
	 * @Deprecated
	 * @param valueNo
	 * @param valueIndex
	 * @return
	 * @throws CommonException
	 */
	/** modify by shen_antonio 20091009 jira:BMS-2059 begin . */
	protected synchronized int getSeqPK(int valueNo, String valueIndex) {
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
		try {
			SingleOPCaller.call(GetSeqnoOperation.ID, context);
		} catch (CommonException e) {
			log.error("------getSeqPK方法遇到异常："+e);
			e.printStackTrace();
		}
		Integer seqno = (Integer) context.getAttribute(GetSeqnoOperation.SEQNO);
		return seqno.intValue();
	}



	/**
	 * 查询返回较少对象的list，支持带where条件
	 * @param query 如：from TblAppliBaseInfo t where t.appno='100'
	 * @return list
	 */
	public List find(String hql){
		return getHibernateTemplate().find(hql);

	}

	/**
	 * @author Zhongxin-Cao
	 * @date 2010-12-3
	 * save 方法： 根据对象类名，主键id 查询该对象，如果没有查到，返回null
	 * @param clazz
	 * @param id
	 * @return
	 */
	public Object save(Class clazz) throws CommonException{
		//return getSession().save(clazz);

		this.getHibernateTemplate().setCacheQueries(false);
		if (log.isDebugEnabled()) {
			log.debug("save(Object) - start"); //$NON-NLS-1$
		}
		Object reObj = null;

		try {
			if (clazz != null) {
				reObj = this.getHibernateTemplate().save(clazz);
			}
		} catch (Exception e) {
			log.error("save(Object)", e); //$NON-NLS-1$
			ExceptionUtil.throwCommonException(e.getMessage(),
					ErrorCode.ERROR_CODE_DAO, e);
		}
		if (log.isDebugEnabled()) {
			log.debug("save(Object) - end"); //$NON-NLS-1$
		}
		return reObj;
	}

//	/**
//	* @author Zhongxin-Cao
//	* @date 2010-12-3
//	* update 方法： 根据对象类名，主键id 查询该对象，如果没有查到，返回null
//	* @param clazz
//	* @param id
//	* @return
//	*/
//	public Object update(Object object){
//	return this.getSession().update(object);
//	}

	/**
	 * @author Zhongxin-Cao
	 * @date 2010-12-3
	 * get 方法： 根据对象类名，主键id 查询该对象，如果没有查到，返回null
	 * @param clazz
	 * @param id
	 * @return
	 * @throws CommonException
	 */
	public Object get(Class clazz, Integer id) throws CommonException{
		return  query(clazz, id);
	}

	/**
	 * @author Zhongxin-Cao
	 * @date 2010-12-3
	 * load 方法： 根据对象类名，主键id 查询该对象，如果没有查到，load()方法可能抛出无法恢复的异常(unrecoverable exception)。
	 * load();
	 * @param clazz
	 * @param id
	 * @return
	 */
	public Object load(Class clazz, Integer id){
		return this.getHibernateTemplate().load(clazz, id);
	}

	/**
	 * @author Zhongxin-Cao
	 * @date 2010-12-3
	 * getSession 方法： 返回session。
	 * getSession();
	 * @return
	 */
//	public Session getSession(){
//	return getHibernateTemplate().getSessionFactory().openSession();
//	}

	/**
	 * 根据原生sql语句查询
	 * @param query 如：select * from dual
	 * @return list
	 */
	public Object findByNativeSql(String sql){
		return this.getCurSession().createSQLQuery(sql);
	}

	/**
	 * 查询返回 列表的第一个对象
	 * @param query 如：from TblAppliBaseInfo t where t.appno='100'
	 * @return list
	 */
	public Object findUnique(String hql){
		if(getHibernateTemplate().find(hql).size()>0)
			return getHibernateTemplate().find(hql).get(0);
		return null;
	}

	/**
	 * 根据PO名字查询返回较少对象的list，不支持带where条件
	 * @param query 如：TblAppliBaseInfo
	 * @return list
	 */
	public List findByPOName(String poName){
		return getHibernateTemplate().find("from "+poName+" t");
	}

	/**
	 * findByProperty方法 根据单属性查询PO实例，返回list
	 * @author jimmy.peng
	 * @date 2010-12-8
	 * @param propertyName
	 * @param propertyValue
	 * @return
	 */
	public List findByProperty(String poName, String propertyName, Object propertyValue) {
		log.debug("finding " + poName + " instance with property: "
				+ propertyName + ", value: " + propertyValue);
		try {
			String queryString = "from " + poName + " po where po."
			+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, propertyValue);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}







	/**
	 * @author Zhongxin-Cao
	 * @date 2010-12-2
	 * findByPreparedSQL 方法: 查询对象列表，这个方法性能高一点
	 * @param sql
	 * @param params
	 * @return
	 */
	public List findByPreparedSQL(final String sql, final Map params){
		Iterator it = params.entrySet().iterator();
		while(it.hasNext()){
			Entry e = (Entry)it.next();
			System.out.println(e.getKey() + ":" + e.getValue());
		}

		return getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
						Query query = session.createSQLQuery(sql);
						if (null != params) {
							for (Iterator i=params.entrySet().iterator(); i.hasNext(); ) {
								Map.Entry entry = (Map.Entry) i.next();
								query.setParameter((String) entry.getKey(), entry.getValue());
							}
						}
						return query.list();
					}
				}
		); //end return;
	}

	/**
	 * Return the name of the configuration file to be used with this DAO or null if default
	 */
	public String getConfigurationFileName () {
		return null;
	}

	/**
	 * Return the specific Object class that will be used for class-specific
	 * implementation of this DAO.
	 * @return the reference Class
	 */
	protected abstract Class getReferenceClass();

	/**
	 * Return a Criteria object that relates to the DAO's table
	 */
	protected Criteria createCriteria (Session s) throws DataAccessException {
		return s.createCriteria(getReferenceClass());
	}

	/**
	 * Return the property of the class you would like to use for default ordering
	 * @return the property name
	 */
	public String getDefaultOrderProperty () {
		return null;
	}
	/* shen_antonio.*/

	/**
	 * Execute a query.
	 * @param query a query expressed in Hibernate's query language
	 * @return a distinct list of instances (or arrays of instances)
	 */
//	public List<T> find(String query) {
//	return getHibernateTemplate().find(query);
//	}

	/**
	 * @param query
	 * @return
	 */
	public List findJoin(String query){
		return getHibernateTemplate().find(query);
	}

	public List<T> findByNamedQuery(final String name, final int begin, final int count) {
		return getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
						Query query = session.getNamedQuery(name);
						if( begin >= 0 ) {
							query.setFirstResult(begin);
							query.setMaxResults(count);
						}
						return query.list();
					}
				}
		);
	}

	/**
	 * Obtain an instance of Query for a named query string defined in the mapping file.
	 * Use the parameters give
	 * @param name the name of a query defined externally
	 * @param params the parameter Map
	 * @return Query
	 */
	public List<T> findByNamedQuery(final String name, final Map params) {
		return findByNamedQuery(name, params, -1, -1);
	}

	public List<T> findByNamedQuery(final String name, final Map params, final int begin, final int count) {
		return getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
						Query query = session.getNamedQuery(name);
						if (null != params) {
							for (Iterator i=params.entrySet().iterator(); i.hasNext(); ) {
								Map.Entry entry = (Map.Entry) i.next();
								query.setParameter((String) entry.getKey(), entry.getValue());
							}
						}
						if( begin >= 0 ) {
							query.setFirstResult(begin);
							query.setMaxResults(count);
						}
						return query.list();
					}
				}
		);
	}

	/**
	 * Obtain an instance of Query for a named query string defined in the mapping file.
	 * Use the parameters give
	 * @param name the name of a query defined externally
	 * @param params the parameter array
	 * @return Query
	 */
	public List<T> findByNamedQuery(final String name, final Serializable[] params) {
		return findByNamedQuery(name, params, -1, -1);
	}

	public List<T> findByNamedQuery(final String name, final Serializable[] params, final int begin, final int count) {
		return getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
						Query query = session.getNamedQuery(name);
						if (null != params) {
							for (int i = 0; i < params.length; i++) {
								query.setParameter(i, params[i]);
							}
						}
						if( begin >= 0 ) {
							query.setFirstResult(begin);
							query.setMaxResults(count);
						}
						return query.list();
					}
				}
		);
	}

	public List<T> findByPreparedStatment(final String name, final Map params) {
		System.out.println(name);
		Iterator it = params.entrySet().iterator();
		while(it.hasNext()){
			Entry e = (Entry)it.next();
			System.out.println(e.getKey() + ":" + e.getValue());
		}

		return getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
						Query query = session.createQuery(name);
						if (null != params) {
							for (Iterator i=params.entrySet().iterator(); i.hasNext(); ) {
								Map.Entry entry = (Map.Entry) i.next();
								query.setParameter((String) entry.getKey(), entry.getValue());
							}
						}
						return query.list();
					}
				}
		);
	}

	/**
	 * Used by the base DAO classes but here for your modification
	 * Get object matching the given key and return it.
	 */
	public T get(Class refClass, Serializable key) {
		return (T)getHibernateTemplate().get(refClass, key);
	}

	/**
	 * Used by the base DAO classes but here for your modification
	 * Load object matching the given key and return it.
	 */
	public T load(Class refClass, Serializable key) {
		return (T)getHibernateTemplate().load(refClass, key);
	}
	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public List<T> findAll () {
		return getHibernateTemplate().loadAll(getReferenceClass());
	}

	/**
	 * Used by the base DAO classes but here for your modification
	 * Persist the given transient instance, first assigning a enerated identifier.
	 * (Or using the current value of the identifier property if the assigned generator is used.)
	 */
	public Serializable save(Object obj) {
		return getHibernateTemplate().save(obj);
	}

	/**
	 * Used by the base DAO classes but here for your modification
	 * Either save() or update() the given instance, depending upon the value of its
	 * identifier property.
	 */
	public void saveOrUpdate(Object obj) {
		getHibernateTemplate().saveOrUpdate(obj);
	}

	/**
	 * Used by the base DAO classes but here for your modification
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param obj a transient instance containing updated state
	 */
	public void update(Object obj) {
		getHibernateTemplate().update(obj);
	}

	/**
	 * Used by the base DAO classes but here for your modification
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state.
	 */
	public void delete(Object obj) {
		getHibernateTemplate().delete(obj);
	}

	/**
	 * Used by the base DAO classes but here for your modification
	 * Re-read the state of the given instance from the underlying database. It is inadvisable to use this to implement
	 * long-running sessions that span many business tasks. This method is, however, useful in certain special circumstances.
	 */
	protected void refresh(Object obj) {
		getHibernateTemplate().refresh(obj);
	}

	protected java.util.List<T> loadAll(Class refClass){
		return getHibernateTemplate().loadAll(refClass);
	}

	//这个方法很危险，要手工关闭该session，否则会造成链接耗尽。
//	public Session openSession(){

//	return getHibernateTemplate().getSessionFactory().openSession();
//	}

	public Session getCurSession(){
		return getHibernateTemplate().getSessionFactory().getCurrentSession();
	}

	

	/**
	 * 此方法可以去掉，已经实现过了
	 * @author chengcheng
	 * @date 2011-1-28
	 * 分页查询的回调类.
	 */
	class PageQueryCallbackForSQL implements HibernateCallback {
		private PageQueryCondition queryCondition = null;
		public PageQueryCallbackForSQL(PageQueryCondition queryCondition) {
			this.queryCondition = queryCondition;
		}

		public Object doInHibernate(Session session) throws HibernateException {
			if (logger.isDebugEnabled()) {
				logger.debug("doInHibernate(Session) - start"); //$NON-NLS-1$
			}

			SQLQuery queryObject = session.createSQLQuery(queryCondition.getQueryString());
			Object[] values = queryCondition.getObjArray();
			Type[] types = queryCondition.getTypeArray();
			if (null != values) {
				for (int i = 0; i < values.length; i++) {
					if (logger.isDebugEnabled()) {
						logger.debug("i="+i);
						logger.debug("values[i]="+values[i]);
						logger.debug("types[i]="+types[i]);
					}
					if (types != null) {
						queryObject.setParameter(i, values[i], types[i]);
					} else {
						queryObject.setParameter(i, values[i]);
					}
				}
			}

			ScrollableResults sr = null;
			try {
				PageQueryResult queryResult = new PageQueryResult();
				queryResult.setQueryResult(new ArrayList());
				queryResult.setTotalCount(0);

				sr = queryObject.scroll();
				if (false == sr.last()) {

					if (logger.isDebugEnabled()) {
						logger.debug("doInHibernate(Session) - end");
					}
					return queryResult;
				}

				int totalCount = sr.getRowNumber();
				queryResult.setTotalCount(totalCount + 1);

				int pageSize = queryCondition.getPageSize();
				int pageIndex = queryCondition.getPageIndex() - 1;

				int startRowNum = pageIndex * pageSize;
				if (false == sr.setRowNumber(startRowNum)) {
					if (logger.isDebugEnabled()) {
						logger.debug("doInHibernate(Session) - end");
					}
					return queryResult;
				}

				List list = queryResult.getQueryResult();
				for (int i = 0; i < pageSize; i++) {
					list.add(sr.get());
					if (false == sr.next()) {
						break;
					}
				}

				if (logger.isDebugEnabled()) {
					logger.debug("doInHibernate(Session) - end");
				}
				return queryResult;
			} finally {
				if (null != sr)
					sr.close();
			}
		}
	}

	/**
	 * findQuery 方法
	 *  支持返回每行   1  个PO
	 * 注意：如果PO的属性名相同，后者会覆盖前者。如果需要对数据进行加工，如：转换成百分比，需要在外边自己写。
	 * FOR EXAMPLE: 注意：后面2个参数 一定要带上.class，就是类名.class
	 * @author hui.liu
	 * @param hql                  对象hql语句
	 * @param vo                   返回对象vo
	 * @param po                   数据库对应po类名字
	 * @return                     List
	 * @throws CommonException
	 */
	protected List findList(String hql, Class vo, Class po) throws CommonException {
		log.info("------"+this.getClass().getName()+" findQuery(每行返回1个po) 开始------");
		log.info("------hql："+hql);
		long startTime = System.currentTimeMillis();
		List list = find(hql);
		Iterator iter = list.iterator();
		List resultList = new ArrayList();
		try {
			while (iter.hasNext()) {
				// 实例化目标对象和源对象
				Object destVO = vo.newInstance();
				Object orinObj1 = po.newInstance();

				// 源对象取值
				orinObj1 = iter.next();

				// 将源对象的值COPY到目标对象
				BeanUtils.copyProperties(destVO, orinObj1);
				// 填装List
				resultList.add(destVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.info("------"+this.getClass().getName()+" findQuery(每行返回1个po)遇到错误："+e);
		}

		long endTime = System.currentTimeMillis();
		log.info("------"+this.getClass().getName()+" findQuery(每行返回1个vo)结束 ,共用时："+(float)(endTime-startTime)/1000+" 秒------");

		return resultList;
	}

	/**
	 * 按HQL统计查询对象所有记录数.对复杂的hql查询请另行编写count语句查询.
	 * 编辑 count 方法的文档注释
	 * @author hui.liu
	 * @date 2011-5-13
	 * count 方法
	 * @param queryStr 查询语句
	 * @param values
	 * @return
	 */
    public int count(final String queryStr, final Object... values) {
        //select子句与order by子句会影响count查询,进行简单的排除.
        String countHql = "SELECT COUNT(*) " + removeOrderBy(removeSelect(queryStr));
        try {
            return this.total(countHql, values).intValue();
        } catch (Exception e) {
        	e.printStackTrace();
			log.info("------"+this.getClass().getName()+" count记录条数遇到错误："+e);
        }
		return 0;
    }
    /**
     * 去除HQL语句中的Order By 字句.
     * @author hui.liu
     * @date 2011-5-13
     * removeOrderBy 方法
     * @param hql语句
     * @return 去除Order By后的hql字符串
     */
    protected String removeOrderBy(String hql) {
        Pattern p = Pattern.compile("ORDER\\s*by[\\w|\\W|\\s|\\S]*", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(hql);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, "");
        }
        m.appendTail(sb);
        return sb.toString();
    }
    /**
     * 去除hql的from前的语句
     * 编辑 removeSelect 方法的文档注释
     * @author hui.liu
     * @date 2011-5-13
     * removeSelect 方法
     * @param hql语句
     * @return 去除from前字段后的hql字符串
     */
    protected String removeSelect(String hql) {
        int beginPos = hql.toLowerCase().indexOf("from");
        return hql.substring(beginPos);
    }

   /**
    * 根据查询HQL与参数列表创建Query对象.
    * 编辑 createQuery 方法的文档注释
    * @author hui.liu
    * @date 2011-5-13
    * createQuery 方法
    * @param queryStr HQL查询语句.
    * @param values 数量可变的参数,按顺序绑定.
    * @return
    * 非安全的写法会造成连接耗尽
    */
//    protected Query createQuery(final String queryStr, final Object... values) {
//        Query queryObject = getSession().createQuery(queryStr);
//        if (values != null) {
//            for (int i = 0; i < values.length; i++) {
//                if (values[i] != null) queryObject.setParameter(i, values[i]);
//            }
//        }
//        return queryObject;
//    }

	/**
	 *
	 * @Description: 获取总记录数
	 * @author kangbyron
	 * @Created 2013-5-9下午04:31:52
	 * @param hql
	 * @param values
	 * @return Long
	 *
	 */

    public Long total(final String hql, final Object... values) {
        return this.getHibernateTemplate().execute(new HibernateCallback<Long>() {

            public Long doInHibernate(Session session) throws HibernateException, SQLException {
                Query q = session.createQuery(hql);
                if (values != null && values.length > 0) {
                    for (int i = 0; i < values.length; i++) {
                        q.setParameter(i, values[i]);
                    }
                }
                return (Long) q.uniqueResult();
            }
        });
    }

	
	
	
	

	
	


	/**
	 * @title 通过键值查询
	 * @Description 通过键值查询，返回数据库实体对象
	 * @param id
	 * @return Object
	 * @throws CommonException
	 */
	public <T> T query(Class<T> cls, Serializable id) throws CommonException {
		this.getHibernateTemplate().setCacheQueries(true);
		if (log.isDebugEnabled()) {
			log.debug("query(Class,String) - start"); //$NON-NLS-1$
		}
		try {

			Object reObj = this.getHibernateTemplate().get(cls, id);
			if (log.isDebugEnabled()) {
				log.debug("query(Class,String) - end"); //$NON-NLS-1$
			}
			return (T)reObj;
		} catch (Exception e) {
			log.error("query(String)", e); //$NON-NLS-1$

			ExceptionUtil.throwCommonException(e.getMessage(),
					ErrorCode.ERROR_CODE_DAO, e);
		}

		if (log.isDebugEnabled()) {
			log.debug("query(Class,String) - end"); //$NON-NLS-1$
		}
		return null;
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
