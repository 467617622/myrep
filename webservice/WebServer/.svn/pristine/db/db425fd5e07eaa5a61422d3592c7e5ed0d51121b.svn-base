package com.huateng.scf.systemmng.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.huateng.scf.db.BaseDAO;
import com.huateng.scf.systemmng.data.TblCommLog;

public class TblCommLogDAO extends BaseDAO<TblCommLog>{

	private static Log logger = LogFactory.getLog(TblCommLogDAO.class);
	public TblCommLogDAO () {
	}

	public String save(TblCommLog tblCommLog)throws org.hibernate.HibernateException {
		logger.info("---TblCommLogDAO method save start---");
		if ( tblCommLog.getId()==null||"".equals(tblCommLog.getId())) {
			tblCommLog.setId(this.getUUID());
		}
		logger.info("---TblCommLog Id:"+tblCommLog.getId().toString()+"---");
		return (java.lang.String)super.save(tblCommLog);
	}

	@Override
	protected Class getReferenceClass() {
		// TODO Auto-generated method stub
		return TblCommLog.class;
	}
	
}