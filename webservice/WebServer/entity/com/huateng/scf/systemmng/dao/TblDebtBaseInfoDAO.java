package com.huateng.scf.systemmng.dao;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.scf.db.BaseDAO;
import com.huateng.scf.db.SCFDAOUtils;
import com.huateng.scf.db.SCFDateUtil;
import com.huateng.scf.systemmng.data.TblContDebtExtInfo;
import com.huateng.scf.systemmng.data.TblDebtBaseInfo;
public class TblDebtBaseInfoDAO extends BaseDAO<TblDebtBaseInfo> {

	@Override
	protected Class<TblDebtBaseInfo> getReferenceClass() {
		return TblDebtBaseInfo.class;
	}

	public TblDebtBaseInfoDAO() {
	}

	private static final Log log = LogFactory.getLog(TblDebtBaseInfoDAO.class);

	

	/**
	 * 根据凭证编号查询应收账款基本信息
	 * 
	 * @param billsNo
	 * @return
	 * @throws CommonException
	 */
	public List queryDebtBaseByBillsNo2(String billsNo) throws CommonException {
		StringBuffer sb = new StringBuffer("select dbi from TblDebtBaseInfo dbi where dbi.billsNo ='"+billsNo+"'");

		List list =super.find(sb.toString());
		return list;
	}
	/**
	 * 
	 * @param tdbiList
	 * @throws CommonException
	 */

	public String saveDebtInfoFromFactoryByArray(TblDebtBaseInfo tdbi) throws CommonException{
	 
			String custcdBuyer=tdbi.getCustcdBuyer();
			String custcdSaller=tdbi.getCustcdSaller();	 
		//	TblContDebtInfoDAO tcdiDAO=SCFDAOUtils.getTblContDebtInfoDAO();
			//String debtNo=tcdiDAO.findTblContDebtInfoByNo(custcdBuyer, custcdSaller);
			//tdbi.setMastContno(tdbi.getDebtContno());	
			TblContDebtExtInfoDAO dao = SCFDAOUtils.getTblContDebtExtInfoDAO();
			TblContDebtExtInfo cdebtExtInfo =(TblContDebtExtInfo)dao.queryContDebtExInfoByMastContno(tdbi.getMastContno(),custcdBuyer);
	        tdbi.setGracePeriod(cdebtExtInfo.getDebtGraceDays());//宽限期
	        //Date deadLine = SCFDateUtil.getEndDateByDays(tdbi.getDebtEnd(),cdebtExtInfo.getDebtGraceDays());//最迟付款日
	        Date deadLine = SCFDateUtil.getEndDateByDays(tdbi.getDebtEnd(),0);//最迟付款日不加宽限期
	        tdbi.setLoanPercent(cdebtExtInfo.getLoanPercent());
	        tdbi.setBillsType("01");//发票
	        tdbi.setBussType("1230020");
	        tdbi.setCurcd("CNY");
			tdbi.setInsertDate(new Date());
			tdbi.setId(getUUID());
			tdbi.setStatus("02");//已转让	
			tdbi.setDeadLine(deadLine);
			tdbi.setFactType("2");//反向保理
			tdbi.setIssueFlag("0");
			tdbi.setOverdueFlag("0");
			tdbi.setPurchaseDate(new Date());
			tdbi.setFlawFlag("0");//有无瑕疵 add by zhangcheng 20161024
			tdbi.setLoanOverdueFlag("2");//是否逾期add by zhangcheng 20161024
			tdbi.setBadFlag("0");//是否呆账add by zhangcheng 20161024
			this.save(tdbi);
			return tdbi.getMastContno();
	 }
}