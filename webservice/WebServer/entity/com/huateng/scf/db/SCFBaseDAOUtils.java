/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2004-2005 Huateng Software System.  All rights
 * reserved.
 * ==================================================================
 */
package com.huateng.scf.db;

import com.huateng.ebank.framework.util.ApplicationContextUtils;
import com.huateng.scf.systemmng.dao.SCFHQLDAO;


/**
 * @author <a href="mailto:liu_wen@huateng.com">Liu Wen </a>
 * @version $Revision: 1.23 $
 *
 * 用来获得DAO实例的工具类. 主要是避免DAO的名称在各处的使用而导致以后修改出现困难.
 */
public class SCFBaseDAOUtils {

	public static SCFHQLDAO getHQLDAO() {
		return (SCFHQLDAO) ApplicationContextUtils.getBean("SCFHQLDAO");
	}

	
}

