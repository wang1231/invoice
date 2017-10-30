package com.hl.util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	private TimeUtil(){
		
	}
	public static String getCurrentTime(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateNowStr = sdf.format(d);
		return dateNowStr;
	}
	
	public static Date getTimeDate(String date_str){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return sdf.parse(date_str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	//目录为年份加月，创建文件夹用的,返回url_suffix
	public static String getYearMonthDir(){
		String str = getCurrentTime();
		String year = str.substring(0, 4);
		String month = str.substring(5, 7);
		return year + month;
	}
}