package com.huateng.scf.systemmng.dao;


import java.util.List;

import org.hibernate.HibernateException;

import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.scf.db.BaseDAO;
import com.huateng.scf.systemmng.data.TblContDebtExtInfo;

/**
 *
 * 交易对手信息
 *
 * @author <a href="mailto:Administrator@topscf.com">Administrator</a>
 *
 * @version Revision: 1.0  Date: 2012-7-24 下午03:31:24
 *
 */
public class TblContDebtExtInfoDAO extends BaseDAO<TblContDebtExtInfo> {

public TblContDebtExtInfoDAO () {}


/**
 *
 * @Description:交易对手信息保存
 * @author Administrator
 * @Created 2012-7-24下午03:31:45
 * @param mastContno
 * @param buyerCustcd
 */
	public void TblContDebtExtInfoSave(String mastContno,String buyerCustcd){
		TblContDebtExtInfo debtBaseInfo = new TblContDebtExtInfo();
		debtBaseInfo.setId(this.getUUID());
		debtBaseInfo.setBusinessNo(mastContno);
		debtBaseInfo.setBuyerCustcd(buyerCustcd);
		this.save(debtBaseInfo);
	}

	@Override
	protected Class<TblContDebtExtInfo> getReferenceClass() {
		return TblContDebtExtInfo.class;
	}




	/**
	 * @Description: 根据relationId查询合同扩展表信息
	 * @author xu_hong
	 * @Created 2012-11-29下午06:26:49
	 * @param relationId
	 * @return
	 * @throws CommonException
	 */
	public List<TblContDebtExtInfo> queryMastContnoByRelaId(String relationId) throws CommonException{
		String hql=" select tcde from TblContDebtExtInfo tcde where tcde.relationId='"+relationId+"'";
		List list = this.findList(hql, TblContDebtExtInfo.class, TblContDebtExtInfo.class);
		return list;
	}

	/**
	 * DESCRIPTION:根据合同号、买方客户号查询保理扩展表
	 * @author zhoujun.hou
	 * @date 2013-6-20
	 * queryContDebtExInfoByMastContno 方法
	 * @param mastContno
	 * @param custcd
	 * @return
	 * @throws CommonException
	 * @param commonQueryVO
	 * @return
	 */
	public TblContDebtExtInfo queryContDebtExInfoByMastContno(String mastContno,String custcd) throws CommonException{
		String hql=" select tcde from TblContDebtExtInfo tcde where tcde.businessNo='"+mastContno+"' and tcde.buyerCustcd='"+custcd+"'";
		List list = this.find(hql);
		if(list.size()>0){
			return (TblContDebtExtInfo)list.get(0);
		}else{
			return null;
		}
	}


	/**
	 * DESCRIPTION:买方客户号查询保理扩展表
	 * @param custcd
	 * @return
	 * @throws CommonException
	 * @param commonQueryVO
	 * @return
	 */
	public List<TblContDebtExtInfo> queryContDebtExInfoByBuyercustcd(String custcd) throws CommonException{
		String hql=" select tcde from TblContDebtExtInfo tcde where  tcde.buyerCustcd='"+custcd+"'";
		List list = this.find(hql);
		if(list.size()>0){
			return list;
		}else{
			return null;
		}
	}


	/**
	 * DESCRIPTION:业务合同号查询保理扩展表
	 * @param custcd
	 * @return
	 * @throws CommonException
	 * @param commonQueryVO
	 * @return
	 */
	public List<TblContDebtExtInfo> queryContDebtExInfoByBusinessNo(String businessNo) throws CommonException{
		String hql=" select tcde from TblContDebtExtInfo tcde where  tcde.businessNo='"+businessNo+"'";
		List list = this.find(hql);
		if(list.size()>0){
			return list;
		}else{
			return null;
		}
	}
	
	/**
	 * DESCRIPTION:业务合同号查询买方客户号表
	 * @param businessNo
	 * @return buyerCustcd
	 * @throws CommonException
	 * @author luotianran
	 * @date 2016/05/03
	 * @return
	 */
	public String getBuyerCustcdByBusinessNo(String businessNo) throws CommonException{
		String hql=" select tcde.buyerCustcd from TblContDebtExtInfo tcde where  tcde.businessNo='"+businessNo+"'";
		List list = this.find(hql);
		if(list != null && list.size()>0){
			Object obj = list.get(0);
			return obj.toString();
		}else{
			return null;
		}
	}

}