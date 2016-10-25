/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2008-2012 TOPSCF  All rights reserved.
 * ==================================================================
 */

package com.huateng.scf.systemmng.data;

import com.huateng.scf.systemmng.data.base.BaseTblCustBaseInfo;

/**
 * 表TBL_CUST_BASE_INFO映射类
 * 
 * @author <a href="mailto:xiong_xiaolong@topscf.com">xiong_xiaolong</a>
 * 
 * @version Revision: 1.0 Date: 2012-7-17 下午3:43:15
 * 
 */
public class TblCustBaseInfo extends BaseTblCustBaseInfo {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public TblCustBaseInfo () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public TblCustBaseInfo (java.lang.String custcd) {
		super(custcd);
	}

	/* [CONSTRUCTOR MARKER END] */

}
