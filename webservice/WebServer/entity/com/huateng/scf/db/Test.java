package com.huateng.scf.db;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.ebank.framework.util.ApplicationContextUtils;
import com.huateng.util.ContextUtil;


public class Test {
	
public static void main(String[] args) {
	String[] locations=StringUtils.tokenizeToStringArray("classpath:applicationContext.xml", ",");
	ApplicationContext context=new ClassPathXmlApplicationContext(locations);
	ApplicationContextUtils.setContext(context);
	ContextUtil.setContext(context);
	try {
		ApplicationContextUtils.init(locations.toString());
		/*启动所有定时任务*/	
		//ITaskJobScheduler scheduler=(ITaskJobScheduler)ContextUtil.getContext().getBean("TaskJobScheduler");
		//scheduler.startJob(1);
	} catch (CommonException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
