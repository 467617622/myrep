package com.huateng.scf.db;

import com.huateng.ebank.framework.util.ApplicationContextUtils;
import com.huateng.scf.systemmng.dao.SCFHQLDAO;
import com.huateng.scf.systemmng.dao.TblCommLogDAO;
import com.huateng.scf.systemmng.dao.TblContDebtExtInfoDAO;
import com.huateng.scf.systemmng.dao.TblContDebtInfoDAO;
import com.huateng.scf.systemmng.dao.TblCustBaseInfoDAO;
import com.huateng.scf.systemmng.dao.TblCustMapInfoDAO;
import com.huateng.scf.systemmng.dao.TblDebtBaseInfoDAO;
import com.huateng.scf.systemmng.dao.TblDebtExtInfoDAO;
import com.huateng.scf.systemmng.dao.TblLnciBaseInfoDAO;
import com.huateng.scf.systemmng.dao.TblSysParamDAO;

/**
 * 在这里添加类的文档注释
 *
 * @author <a href="mailto:111111@wonders.com">111111</a>
 *
 * @version Revision: 1.0  Date: 2012-8-7 上午09:32:04
 *
 */
public class SCFDAOUtils {

	

	/**
	 *
	 * @Description: 得到TblTaskJobErrorDAO
	 * @author kangbyron
	 * @Created 2012-9-13下午06:48:51
	 * @return
	 */
	public static TblLnciBaseInfoDAO getTblLnciBaseInfoDAO() {
		return (TblLnciBaseInfoDAO) ApplicationContextUtils.getBean("TblLnciBaseInfoDAO");
	}
	/**
	 *
	 * @Description: 得到TblTaskJobErrorDAO
	 * @author kangbyron
	 * @Created 2012-9-13下午06:48:51
	 * @return
	 */
	public static TblSysParamDAO getTblSysParamDAO() {
		return (TblSysParamDAO) ApplicationContextUtils.getBean("TblSysParamDAO");
	}
	/**
	 *
	 * @Description: 得到TblTaskJobErrorDAO
	 * @author kangbyron
	 * @Created 2012-9-13下午06:48:51
	 * @return
	 */
	public static TblDebtExtInfoDAO getTblDebtExtInfoDAO() {
		return (TblDebtExtInfoDAO) ApplicationContextUtils.getBean("TblDebtExtInfoDAO");
	}
	/**
	 *
	 * @Description: 得到TblTaskJobErrorDAO
	 * @author kangbyron
	 * @Created 2012-9-13下午06:48:51
	 * @return
	 */
	public static TblDebtBaseInfoDAO getTblDebtBaseInfoDAO() {
		return (TblDebtBaseInfoDAO) ApplicationContextUtils.getBean("TblDebtBaseInfoDAO");
	}
	/**
	 *
	 * @Description: 得到TblTaskJobErrorDAO
	 * @author kangbyron
	 * @Created 2012-9-13下午06:48:51
	 * @return
	 */
	public static TblCustMapInfoDAO getTblCustMapInfoDAO() {
		return (TblCustMapInfoDAO) ApplicationContextUtils.getBean("TblCustMapInfoDAO");
	}
	/**
	 *
	 * @Description: 得到TblTaskJobErrorDAO
	 * @author kangbyron
	 * @Created 2012-9-13下午06:48:51
	 * @return
	 */
	public static TblCustBaseInfoDAO getTblCustBaseInfoDAO() {
		return (TblCustBaseInfoDAO) ApplicationContextUtils.getBean("TblCustBaseInfoDAO");
	}
	/**
	 *
	 * @Description: 得到TblTaskJobErrorDAO
	 * @author kangbyron
	 * @Created 2012-9-13下午06:48:51
	 * @return
	 */
	public static TblContDebtExtInfoDAO getTblContDebtExtInfoDAO() {
		return (TblContDebtExtInfoDAO) ApplicationContextUtils.getBean("TblContDebtExtInfoDAO");
	}
	/**
	 *
	 * @Description: 得到TblTaskJobErrorDAO
	 * @author kangbyron
	 * @Created 2012-9-13下午06:48:51
	 * @return
	 */
	public static TblContDebtInfoDAO getTblContDebtInfoDAO() {
		return (TblContDebtInfoDAO) ApplicationContextUtils.getBean("TblContDebtInfoDAO");
	}
	/**
	 *
	 * @Description: 得到TblTaskJobErrorDAO
	 * @author kangbyron
	 * @Created 2012-9-13下午06:48:51
	 * @return
	 */
	public static TblCommLogDAO getTblCommLogDAO() {
		return (TblCommLogDAO) ApplicationContextUtils.getBean("TblCommLogDAO");
	}
	public static SCFHQLDAO getHQLDAO() {
		return (SCFHQLDAO) ApplicationContextUtils.getBean("SCFHQLDAO");
	}
	
}