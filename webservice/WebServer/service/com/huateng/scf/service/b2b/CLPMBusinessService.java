/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2008-2012 TOPSCF  All rights reserved.
 * ==================================================================
 */

package com.huateng.scf.service.b2b;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.huateng.common.DataFormat;
import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.ebank.framework.util.ApplicationContextUtils;
import com.huateng.scf.common.util.B2BConstants;
import com.huateng.scf.db.SCFDAOUtils;
import com.huateng.scf.db.SCFDateUtil;
import com.huateng.scf.db.SysParamUnit;
import com.huateng.scf.systemmng.dao.TblContDebtInfoDAO;
import com.huateng.scf.systemmng.dao.TblCustBaseInfoDAO;
import com.huateng.scf.systemmng.dao.TblCustMapInfoDAO;
import com.huateng.scf.systemmng.dao.TblDebtBaseInfoDAO;
import com.huateng.scf.systemmng.dao.TblDebtExtInfoDAO;
import com.huateng.scf.systemmng.dao.TblLnciBaseInfoDAO;
import com.huateng.scf.systemmng.data.TblCustBaseInfo;
import com.huateng.scf.systemmng.data.TblDebtBaseInfo;
import com.huateng.scf.systemmng.data.TblDebtExtInfo;
import com.huateng.scf.systemmng.data.TblLnciBaseInfo;
import com.huateng.scf.systemmng.service.BaseService;
import com.huateng.scf.webservices.vo.DebtArraVO;
import com.huateng.scf.webservices.vo.DebtBaseVO;
import com.huateng.scf.webservices.vo.DebtListVO;
import com.huateng.scf.webservices.vo.LnciArraVO;
import com.huateng.scf.webservices.vo.LnciBaseVO;

/**
 *  CLPM通用Service
 *
 * @author <a href="mailto:jingnan.wang@topscf.com">jingnan.wang</a>
 *
 * @version Revision: 1.0  Date: 2012-12-21 上午07:12:02
 *
 */

public class CLPMBusinessService extends BaseService{
	private static Logger log = Logger.getLogger(CLPMBusinessService.class);

	public CLPMBusinessService() {
		log.info("---CLPMBusinessService Constructor ---");
	}
	public synchronized static CLPMBusinessService getInstance() {
		return (CLPMBusinessService) ApplicationContextUtils.getBean(CLPMBusinessService.class.getName());
	}

	/**
	 * @Description:   ---查询支用信息方法
	 * @param LnciBaseVO
	 * @return
	 * @throws CommonException
	 */
	public LnciBaseVO queryLnci(LnciBaseVO listlnci) throws CommonException {
		LnciArraVO[] arr=listlnci.getLnciArraVO();
		if(arr!=null){
		for(int i=0;i<arr.length;i++){
			LnciArraVO vo=arr[i];
			String appNum=vo.getBillNum();//融资申请号
			if(DataFormat.isEmpty(appNum)){
				listlnci.setErrmsg("融资申请号不能为空！");
				listlnci.setResultCode(B2BConstants.FAILED);
				return listlnci;
			}
			TblLnciBaseInfoDAO lnciDao=SCFDAOUtils.getTblLnciBaseInfoDAO();
			TblLnciBaseInfo lnciInfo=lnciDao.getTblLnciBaseInfoByAppNum(appNum);
			if(lnciInfo!=null){
				vo.setLoanDate(SCFDateUtil.dateToString(lnciInfo.getStartDate()).replaceAll("-", ""));
				vo.setPrepaymentAmt(lnciInfo.getLnciAmt());
				vo.setPrepaymentDueDate(SCFDateUtil.dateToString(lnciInfo.getEndDate()).replaceAll("-", ""));
			}			
			}
		}
		    return listlnci;
	}
	/**
	 * 保存外联客户的应收账款
	 * @param lisdebt
	 * @return 
	 * @throws CommonException 
	 */
	public DebtListVO saveDebtInfo(DebtListVO lisdebt) throws CommonException {
		DebtBaseVO[] debtBaseVO = lisdebt.getDebtBaseVO();
		TblDebtBaseInfoDAO tdbiDAO = SCFDAOUtils
				.getTblDebtBaseInfoDAO();
		TblDebtExtInfoDAO tdeiDAO = SCFDAOUtils.getTblDebtExtInfoDAO();
		TblCustMapInfoDAO tcmiDAO=SCFDAOUtils.getTblCustMapInfoDAO();
		TblContDebtInfoDAO tcdiDAO=SCFDAOUtils.getTblContDebtInfoDAO();
		for (int i = 0; i < debtBaseVO.length; i++) {
			String custId1 = debtBaseVO[i].getCustId();// 中建八局供应商客户号
			String coreCustId = SysParamUnit.getCoreCustNo();//中建八局客户号
			TblCustBaseInfoDAO tcbiDAO = SCFDAOUtils
						.getTblCustBaseInfoDAO();
			TblCustBaseInfo tcbi= tcbiDAO.queryBuyerInfo(coreCustId);
			if(tcbi==null){
				lisdebt.setResultCode(B2BConstants.FAILED);
				lisdebt.setErrmsg("尊敬的客户，您还未在华瑞银行登记！");
				return lisdebt;
			}
			String buyerName = tcbi.getCname();//买方客户名称
			String scfcustCd=tcbi.getCustcd();//买方客户号
			String custNo=tcmiDAO.getCustNo(custId1,"01");
			if(custNo==null||"".equals(custNo)){
				lisdebt.setResultCode(B2BConstants.FAILED);
				lisdebt.setErrmsg(custId1+"尚未被录入");
				return lisdebt; 
			}
			//String custcd  =SCFDAOUtils.getTblCustBaseInfoDAO().getCustcdByCustno(custNo); 
			//String custName = debtBaseVO[i].getCustName();
			TblCustBaseInfo cust  =SCFDAOUtils.getTblCustBaseInfoDAO().queryBuyerInfo(custNo); 
			String custName =cust.getCname();//卖方客户名称
			String custcd=cust.getCustcd();//卖方客户号号
			String billNum = debtBaseVO[i].getBillNum();// app_num
			if(tdeiDAO.checkAppNumExist(billNum)){
				lisdebt.setResultCode(B2BConstants.FAILED);
				lisdebt.setErrmsg(billNum+"已经存在");
				return lisdebt; 
			}
			BigDecimal billAmount = debtBaseVO[i].getBillAmount();// 申请融资金额
			String billDate = debtBaseVO[i].getBillDate();
			BigDecimal creditPeriod = debtBaseVO[i].getCreditPeriod();
			DebtArraVO[] debtArraVO = debtBaseVO[i].getDebtArraVO();
			//BigDecimal billAmountSum = new BigDecimal(0);
 
			String debtNo = "";
			 debtNo=tcdiDAO.findTblContDebtInfoByNo(scfcustCd, custcd); 
			 if(debtNo==null||"".equals(debtNo)){
					lisdebt.setResultCode(B2BConstants.FAILED);
					lisdebt.setErrmsg(custName+"业务合同尚未被录入");
					return lisdebt; 
				}
			for (int j = 0; j < debtArraVO.length; j++) {
				String invoiceNum = debtArraVO[j].getInvoiceNum();
				List debtList=tdbiDAO.queryDebtBaseByBillsNo2(billNum);
				if(debtList!=null&&debtList.size()>0){
					lisdebt.setResultCode(B2BConstants.FAILED);
					lisdebt.setErrmsg(billNum+"已经存在");
					return lisdebt; 
				}
				BigDecimal invoiceAmount = debtArraVO[j].getInvoiceAmount();// 发票金额
				BigDecimal applyAmount = debtArraVO[j].getApplyAmount();			
				TblDebtBaseInfo tdbi = new TblDebtBaseInfo();
				tdbi.setCustcdBuyer(scfcustCd);
				tdbi.setCnameSeller(custName);
				tdbi.setCustcdSaller(custcd);
				tdbi.setBillsDate(SCFDateUtil.stringToDate(billDate));				
				Date debtEnd=SCFDateUtil.getEndDateByDays(tdbi.getBillsDate(),Integer.valueOf(creditPeriod.toString()));				
				tdbi.setDebtEnd(debtEnd);				
				tdbi.setAppNum(billNum);
				tdbi.setMastContno(debtNo);
				tdbi.setBillsAmount(invoiceAmount);
				tdbi.setRemainingAmount(invoiceAmount);
				tdbi.setBillsAmountView(invoiceAmount);
				tdbi.setBillsNo(invoiceNum);
				tdbi.setLoanAmount(applyAmount);   
				tdbi.setAging(creditPeriod.toString());
				//billAmountSum = billAmountSum.add(invoiceAmount);
 			
				tdbi.setCnameBuyer(buyerName);
				tdbiDAO.saveDebtInfoFromFactoryByArray(tdbi);
			}

			TblDebtExtInfo tdei = new TblDebtExtInfo();
			tdei.setBillAmount(billAmount);
			tdei.setCnameSeller(custName);
			tdei.setCustcdSaller(custcd);
			tdei.setCnameBuyer(buyerName);
			tdei.setCustcdBuyer(scfcustCd);
			tdei.setAppNum(billNum);
			tdei.setBillDate(SCFDateUtil.stringToDate(billDate));
			tdei.setDebtContNo(debtNo);
			tdei.setCreditPeriod(creditPeriod);
			tdei.setStatus("02");
		
			tdeiDAO.saveDebtExtBaseInfo(tdei);
		}
		return lisdebt; 

	}
	
 
}
