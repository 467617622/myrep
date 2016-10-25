/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2008-2012 TOPSCF  All rights reserved.
 * ==================================================================
 */

package com.huateng.scf.systemmng.dao;

import java.util.List;

import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.scf.db.BaseDAO;
import com.huateng.scf.systemmng.data.TblLnciBaseInfo;


/**
 *  DESCRIPTION:
 * <p>
 * <a href="TblLnciBaseInfoDAO.java"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:zhoujun.hou@huateng.com">zhoujun.hou</a>
 *
 * @version Revision: 1.0  Date: 2013-5-15 下午8:49:06
 *
 */
@SuppressWarnings({"rawtypes","unchecked","deprecation"})
public class TblLnciBaseInfoDAO extends BaseDAO<TblLnciBaseInfo> {

	@Override
	protected Class<TblLnciBaseInfo> getReferenceClass(){
		return TblLnciBaseInfo.class;
	}
	/**
	 * DESCRIPTION:中建八局根据业务参考号查询唯一一条借据借据
	 * @author zhangcheng
	 * @date 2013-6-25
	 * queryLnciBalByProtocol 方法
	 * @param appNum
	 * @return
	 * @throws CommonException
	 * @param commonQueryVO
	 * @return
	 */
	public TblLnciBaseInfo getTblLnciBaseInfoByAppNum(String appNum) {
		 String hql="select tlbi  from TblLnciBaseInfo tlbi where tlbi.appNum ='"+appNum+"')";
		 List list=this.find(hql.toString());
		 TblLnciBaseInfo lnci=null;
		 
		 if(list!=null && list.size()>0){
			 lnci=(TblLnciBaseInfo)list.get(0);
		 }
		 return lnci;	 
}		
	
}