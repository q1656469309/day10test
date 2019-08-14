package com.wangmingyuan.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	//方法1：根据传入的日期获取年龄
	//示例:
	public static int getAge (Date src) {
		Date dateNow = new Date();

		SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String formate01 = dateFormate.format(dateNow);
		String formate02 = dateFormate.format(src);
		
		System.out.println(formate01);
		System.out.println(formate02);
		
		int age = Integer.parseInt(formate01.substring(0, 4))-Integer.parseInt(formate02.substring(0, 4));
		
		System.out.println(age);
		
		return age;
	//TODO
	}

	//方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	//示例:
	public static Date getDateByMonthInit (Date src) {
		
		src.setDate(1);
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		
		return src;
	//TODO
	}

	//方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	//示例:
	public static Date getDateByMonthLast(Date src) {
		
		src.setDate(1);
		src.setMonth(src.getMonth()+1);
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		
		
		
		SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formate01 = dateFormate.format(src);
		System.out.println(formate01+"***");
		
		return src;
	//TODO
	}

	//方法4：求未来日期离今天还剩的天数
	//示例:
	public static int getDaysByFuture (Date future) {
		Date dateNow = new Date();

		long time = dateNow.getTime();
		long time2 = future.getTime();
		
		long days = time-time2;
		
		int day = (int)Math.ceil( (days/(60*60*24*1000)));
		
		return day;
	//TODO
	}

	//方法5：求过去日期离今天过去的天数
	//示例:
	public static int getDaysByDeparted (Date departed) {
		Date dateNow = new Date();

		long time = dateNow.getTime();
		long time2 = departed.getTime();
		
		long days = time2-time;
		
		int day = (int)Math.ceil( (days/(60*60*24*1000)));
		
		return day;
	//TODO
	}
	
}
