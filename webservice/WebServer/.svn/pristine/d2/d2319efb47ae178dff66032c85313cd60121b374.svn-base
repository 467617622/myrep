/*
 * ==================================================================
 * The Huateng Software License
 *
 * Copyright (c) 2008-2012 TOPSCF  All rights reserved.
 * ==================================================================
 */

package com.huateng.scf.db;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.huateng.common.DataFormat;
import com.huateng.common.DateUtil;
import com.huateng.ebank.framework.exceptions.CommonException;
import com.huateng.ebank.framework.util.ExceptionUtil;

/**
 *  处理date的工作类
 *
 * @author <a href="mailto:xu.ruixing@huateng.com">xu.ruixing</a>
 *
 * @version Revision: 1.0  Date: 2012-7-9 下午3:09:51
 *
 */

public class SCFDateUtil extends DateUtil{


	public static final String DATE_PATTERN = "yyyy-MM-dd";

	public static final String DATE_NUMBER_PATTERN = "yyyyMMdd";

	public static final String TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	public static final String TIME_ONLY_PATTERN = "HHmmss";



	/**
	 *
	 * @Description: 将string改成时间字符串
	 * @author xu_ruixing
	 * @Created 2012-7-17下午4:06:30
	 * @param dateString
	 * @return
	 */
	public static String convertStringToTimeString(String dateString ) {
		Date date1 = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		try {
			date1 = simpleDateFormat.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String day = format1.format(date1);
		return day;
	}

	/**
	 * @Description: 日期加减方法
	 * @author xiong_xiaolong
	 * @Created 2012-8-2下午5:32:29
	 * @param date 基础日期
	 * @param field 日期域，例如Calendar.MILLISECOND
	 * @param amount 单位数量
	 * @return
	 */
	public static Date add(Date date, int field, int amount){
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(field, amount);
		return c.getTime();
	}




    /**
	 * 获取指定格式的时间
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String getDateFormat(Date date,String pattern){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(date);
	}




	/**
	 * 由yyyyMMdd格式的字符串返回日期
	 *
	 * @author Huaidong.Li
	 * @date 2011-1-26
	 * @param dateString
	 * @return
	 */
	public static Date numberToDate(String dateString) {

		if ("".equals(dateString) || dateString == null) {
			return null;
		}
		Date date = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		try {
			date = simpleDateFormat.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("------SCFDataFormat>>StringTodate error=" + e);
		}
		return date;
	}

	/**
	 * @Description: 将yyyyMMdd HH:mm:ss格式的时间字符串转成日期
	 * @author xiaolong.xiong
	 * @Created 2013-8-22上午8:57:44
	 * @param dateString
	 * @return
	 */
	public static Date string19ToDate(String dateString) {

		if ("".equals(dateString) || dateString == null) {
			return null;
		}
		Date date = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		try {
			date = simpleDateFormat.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("------SCFDataFormat>>StringTodate error=" + e);
		}
		return date;
	}

	/**
	 * 由日期返回yyyy-MM-dd HH:mm:ss格式的字符串
	 *
	 * @param time
	 * @return
	 */
	public static String timeToString(Date time) {
		if (time == null)
			return null;

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIME_PATTERN);
		return simpleDateFormat.format(time);
	}


	/**
	 *
	 * @Description: 根据当前日期获取指定年份后的日期
	 * @author kangbyron
	 * @Created 2013-5-10上午10:28:21
	 * @param date
	 * @param years
	 * @return
	 */
	public static Date getEndDateByYears(Date date ,int years) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(calendar.YEAR, years);
		return calendar.getTime();
	}


	/**
	 * 比较两个用yyMMdd格式字符串表示的日期，并未对其进行为空判断，调用时必须先对两个日期做非空判断
	 *
	 * @param String
	 *            startDate
	 * @param String
	 *            endDate
	 * @return int
	 * @author huaidong.li
	 * @Date 2011-7-4
	 */
	public static int compareDateSequence(String startDate, String endDate) {
		java.util.Date start_Date = numberToDate(startDate);
		java.util.Date end_Date = numberToDate(endDate);
		int result = start_Date.compareTo(end_Date);
		return result;
	}

	/**
	 * 由日期返回yyyy-MM-dd-HH.mm.ss.SSSSSS格式的字符串
	 *
	 * @param date
	 *            Date格式日期
	 * @return String yyyy-MM-dd-HH.mm.ss.SSSSSS格式 的字符串
	 */
	public static String getTimeStampFormat(Date date) {
		if (date == null)
			return null;

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"yyyy-MM-dd-HH.mm.ss.SSSSSS");
		return simpleDateFormat.format(date);
	}


	

	/**
	 *
	 * @Description:根据起始日期和终止日期计算期限
	 * @author xu_ruixing
	 * @Created 2012-8-3下午2:06:00
	 * @param startDate
	 *            起始日期
	 * @param endDate
	 *            终止日期
	 * @return
	 */
	public static String getTenOr(Date startDate, Date endDate) {
		if (startDate.after(endDate)) {
			return null;
		} else {
			Calendar calS = Calendar.getInstance();
			calS.setTime(startDate);
			int startY = calS.get(Calendar.YEAR);
			int startM = calS.get(Calendar.MONTH);
			int startD = calS.get(Calendar.DATE);
			int startDayOfMonth = calS.getActualMaximum(Calendar.DAY_OF_MONTH);
			calS.setTime(endDate);
			int endY = calS.get(Calendar.YEAR);
			int endM = calS.get(Calendar.MONTH);
			// 处理2011-01-10到2011-01-10，认为服务为一天
			// int endD = calS.get(Calendar.DATE) + 1;
			// 处理2011-01-10到2011-01-10，认为服务为0天
			int endD = calS.get(Calendar.DATE);
			int endDayOfMonth = calS.getActualMaximum(Calendar.DAY_OF_MONTH);
			StringBuilder sBuilder = new StringBuilder();
			int lday = endD - startD;
			if (lday < 0) {
				endM = endM - 1;
				lday = startDayOfMonth + lday;
			}
			// 处理天数问题，如：2011-01-01 到 2013-12-31 2年11个月31天 实际上就是3年
			if (lday == endDayOfMonth) {
				endM = endM + 1;
				lday = 0;
			}
			int mos = (endY - startY) * 12 + (endM - startM);
			int lyear = mos / 12;
			int lmonth = mos % 12;
			if (lyear > 0) {
				if (lyear < 10) {
					sBuilder.append("0" + lyear);
				} else {
					sBuilder.append(lyear);
				}
			} else {
				sBuilder.append("00");
			}
			if (lmonth > 0) {
				if (lmonth < 10) {
					sBuilder.append("0" + lmonth);
				} else {
					sBuilder.append(lmonth);
				}
			} else {
				sBuilder.append("00");
			}
			if (lday > 0) {
				if (lday < 10) {
					sBuilder.append("0" + lday);
				} else {
					sBuilder.append(lday);
				}
			} else {
				sBuilder.append("00");
			}
			return sBuilder.toString();
		}
	}

	/**
	 *
	 * @Description: 由yyyyMMddHHmmss 格式的字符串返回日期(java.util.Date)
	 * @author kangbyron
	 * @Created 2013-5-10上午10:44:56
	 * @param timeString
	 * @return
	 */
	public static Date timeTodate(String timeString) {

		if ("".equals(timeString) || timeString == null) {
			return null;
		}
		Date date = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		try {
			date = simpleDateFormat.parse(timeString);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("------SCFDateUtil>>timeTodate error=" + e);
		}
		return date;
	}

	/**
	 * 获取当前时间戳
	 *
	 * @return
	 */
	public static Timestamp getTimestamp() {
		return new Timestamp(System.currentTimeMillis());
	}

	/**
	 * DESCRIPTION:计算日期--日期加天数得到新的日期
	 * @author GUIXIU.LIU
	 * @date 2011-10-25
	 * addDate 方法
	 * @param d
	 * @param day
	 * @return
	 * @throws ParseException
	 * @return
	 */
	public static Date addDate(Date d, Date diffDay) throws CommonException {

		if(d!=null&&diffDay!=null){
			long time = d.getTime();
			long dTime=diffDay.getTime();
			time += dTime;
			return new Date(time);
		}else{
			return d;
		}
	}
	/**
	 * DESCRIPTION:是否在某一时间段内
	 * @author zhangcheng
	 * @date 2016-08-11
	 * addDate 方法
	 * @param d
	 * @param time
	 * @return
	 * @throws ParseException
	 * @return
	 */
	public static boolean isInTime() throws CommonException{
		String day=DateUtil.get8Date();
		String timeZoo=SysParamUnit.getWebsTime()==null?"":SysParamUnit.getWebsTime();
		String[] zooArr=timeZoo.split("-");
		if(zooArr!=null&&zooArr.length>1){
		String startTime=zooArr[0];
		String endTime=zooArr[1];
		String strStart=day+" "+startTime;
		String strEnd=day+" "+endTime;
		Date date=SCFDateUtil.getDate();
		Date startDate = SCFDateUtil.string19ToDate(strStart);
		Date endDate = SCFDateUtil.string19ToDate(strEnd);
		java.util.Calendar c1=java.util.Calendar.getInstance();
		java.util.Calendar c2=java.util.Calendar.getInstance();
		java.util.Calendar c3=java.util.Calendar.getInstance();
		c1.setTime(date);
		c2.setTime(startDate);
		c3.setTime(endDate);
		int flag=c1.compareTo(c2);
		int flag1=c3.compareTo(c1);
		  if(flag>=0&&flag1>=0){
			return true;
		  }
	   }
		return false;
	}	
	/**
	 * DESCRIPTION:获取结息日
	 * @author zhangcheng
	 * @date 2016-08-11
	 * addDate 方法
	 * @param d
	 * @param time
	 * @return
	 * @throws ParseException
	 * @return
	 */
	public static Date getDate21(String date) throws CommonException{
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		Date date1=null;
		try {
			date1 = dft.parse(date);
			int day=date1.getDate();
			if(day<21){
				date1.setDate(21);
			}else{
				java.util.Calendar c1=java.util.Calendar.getInstance();
				c1.setTime(date1);
				c1.add(Calendar.MONTH, 1);
				date1=c1.getTime();
			} }catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date1;
	}
	/**
	 * 计算应收账款的到期日
	 * @param billDate  
	 * @param creditPeriod  账期
	 * @return
	 * @throws CommonException 
	 */

	public static Date calcluteDebtEnd(String billDate, BigDecimal creditPeriod) throws CommonException {
		long time = SCFDateUtil.stringToDate(billDate).getTime(); 
		int day=creditPeriod.intValue();
		day = day*24*60*60*1000; 
		time+=day; 
    
		return   new Date(time); 
	}
	/**
	 *  由yyyy-MM-dd 或 yyyyMMdd 格式的字符串返回日期(java.util.Date)
	 * @Description:  由yyyy-MM-dd 或 yyyyMMdd 格式的字符串返回日期(java.util.Date)
	 * @author zhangwu
	 * @Created 2013-5-9下午08:48:30
	 * @param dateString
	 * @return
	 * @throws CommonException
	 */
	public static Date stringToDate(String dateString) throws CommonException {
		if (DataFormat.isEmpty(dateString)) {
			return null;
		}
		try {
			if(dateString.matches("^[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}$")){// yyyy-MM-dd
				return DateUtil.stringToDate(dateString);
			}else if(dateString.matches("^[0-9]{8}$")){// yyyyMMdd
				return numberToDate(dateString);
			}else if(dateString.matches("^[0-9]{4}/[0-9]{1,2}/[0-9]{1,2}$")){
				if(dateString.replace("/", "").length()<8){//yyyy/?/? add by jialei.zhang
					String[] str=dateString.split("/");
					if(str.length>0){
						if(str[1].length()==1){
							str[1]="0"+str[1];
						}
						if(str[2].length()==1){
							str[2]="0"+str[2];
						}
						dateString=str[0]+str[1]+str[2];
					}
				}else{
					dateString=dateString.replace("/", "");//yyyy/mm/dd
				}

				return numberToDate(dateString);
			}else{
				ExceptionUtil.throwCommonException("转换异常");
			}
		} catch (Exception e) {
			ExceptionUtil.throwCommonException(e.getMessage());
		}
		return null;


	}
}
	
