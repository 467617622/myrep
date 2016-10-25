package com.huateng.scf.systemmng.dao;




import java.util.List;

import com.huateng.scf.db.BaseDAO;
import com.huateng.scf.systemmng.data.TblContDebtExtInfo;
import com.huateng.scf.systemmng.data.TblContDebtInfo;



public class TblContDebtInfoDAO extends BaseDAO<TblContDebtInfo> {

	@Override
	protected Class<TblContDebtInfo> getReferenceClass() {
		return TblContDebtInfo.class;
	}
		/**
		 * 根据卖方客户号和买方客户号查询业务合同
		 *
		 */
		public String findTblContDebtInfoByNo (String custcdBuyer , String custcdSaller) {
			String hql = "select tcdei,tcdi from TblContDebtExtInfo tcdei,TblContDebtInfo tcdi " +
					"where tcdei.businessNo = tcdi.debtContno and tcdi.contStatus =01 and tcdei.buyerCustcd ='"+custcdBuyer+"' and tcdi.custcd ='"+custcdSaller+"' ";
			List list = this.find(hql);
			String debetNo="";
			if(list != null){
				for (Object object : list) {
					Object[] obj = (Object[])object;
					TblContDebtExtInfo tblContDebtExtInfo = (TblContDebtExtInfo)obj[0];
					//TblContDebtInfo tblContDebtInfo = (TblContDebtInfo)obj[1];
					debetNo=tblContDebtExtInfo.getBusinessNo();
					}
			}
			return debetNo;
		}

	


}