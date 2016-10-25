package com.huateng.scf.webservices.vo;


public class DebtListVO extends BaseSysProxyBean{
	private DebtBaseVO[] debtBaseVO;// 应答报文循环体

	public DebtBaseVO[] getDebtBaseVO() {
		return debtBaseVO;
	}

	public void setDebtBaseVO(DebtBaseVO[] debtBaseVO) {
		this.debtBaseVO = debtBaseVO;
	}
	
	
}
