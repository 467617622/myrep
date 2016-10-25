package com.huateng.scf.systemmng.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.scf.db.BaseDAO;
import com.huateng.scf.db.SCFBaseDAOUtils;
import com.huateng.scf.systemmng.data.TblDebtExtInfo;
 
public class TblDebtExtInfoDAO extends BaseDAO<TblDebtExtInfo> {

	

	@Override
	protected Class<TblDebtExtInfo> getReferenceClass() {
		 
		return  TblDebtExtInfo.class;
	}
	

	
	public void saveDebtExtInfo() throws CommonException{
		String sql=" select  sum(bills_amount) ,CNAME_SELLER,CUSTCD_SALLER, CNAME_BUYER,CUSTCD_BUYER,APP_NUM ," +
				"insert_date,mast_CONTNO,AGING , status from tbl_debt_base_info where    STATUS='02' and  app_num " +
				"<> ' '  group by CNAME_SELLER,CUSTCD_SALLER, CNAME_BUYER,CUSTCD_BUYER,APP_NUM ,insert_date,mast_CONTNO,AGING , status ";
		Iterator it=SCFBaseDAOUtils.getHQLDAO().queryBySQL(sql);
		while(it.hasNext()){
			Object[] td = (Object[]) it.next();
			TblDebtExtInfo tdei=new TblDebtExtInfo();
			tdei.setId(getUUID());

			tdei.setBillAmount(new BigDecimal(td[0].toString()));
			tdei.setCnameSeller(td[1].toString());
			tdei.setCustcdSaller(td[2].toString());
			tdei.setCnameBuyer(td[3].toString());
			tdei.setCustcdBuyer(td[4].toString());
			tdei.setAppNum(td[5].toString());
			//tdei.setBillDate(td[6].toString());
			//tdei.setDebtContNo(td[7].toString());
			//tdei.setCreditPeriod( new Integer(td[8].toString()));
			tdei.setStatus(td[9].toString());
			this.save(tdei);
			
		}
	}
 

   /**
    * 保存
    * @param tdei
    */

	public void saveDebtExtBaseInfo(TblDebtExtInfo tdei) {
		 
		tdei.setId(getUUID());
		this.save(tdei);
		 
	}
	
	/**
	 * 检查AppNum是否存在
	 * @param appNum
	 */
	public  Boolean checkAppNumExist(String appNum) {
	    
		String hql="select tdei from TblDebtExtInfo tdei where 1=1 and appNum='"+appNum+"'";
		List list=this.find(hql);
		if(list.size()>0){
			return true;
		}
		return false;
	}
	
	/**
	 * @description 通过业务合同号查询
	 * @param appNum
	 * @return
	 * @author HUATENG_ZHANGYI
	 * @date 2016-8-11
	 */
	public TblDebtExtInfo getTblDebtExtInfoByAppNum (String appNum) {
		StringBuffer sb = new StringBuffer("select tdei from TblDebtExtInfo tdei where tdei.appNum ='"+appNum+"'");
		List list =super.find(sb.toString());
		TblDebtExtInfo TblDebtExtInfo = null;
		if(list != null && list.size() > 0){
			TblDebtExtInfo = (TblDebtExtInfo)list.get(0);
		}
		return TblDebtExtInfo;
	}
}