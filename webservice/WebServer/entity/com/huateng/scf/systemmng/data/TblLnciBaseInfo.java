package com.huateng.scf.systemmng.data;

import com.huateng.scf.systemmng.data.base.BaseTblLnciBaseInfo;



public class TblLnciBaseInfo extends BaseTblLnciBaseInfo {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public TblLnciBaseInfo () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public TblLnciBaseInfo (java.lang.String debetNo) {
		super(debetNo);
	}

	/**
	 * Constructor for required fields
	 */
	public TblLnciBaseInfo (
		java.lang.String debetNo,
		java.lang.String debetId) {

		super (
			debetNo,
			debetId);
	}

/*[CONSTRUCTOR MARKER END]*/


}