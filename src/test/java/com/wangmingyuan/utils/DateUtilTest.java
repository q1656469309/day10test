package com.wangmingyuan.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetAge() {
		DateUtil.getAge(new Date(0));
	
	}

	@Test
	public void testGetDateByMonthInit() {
		Date date = new Date();
		
		Date src = DateUtil.getDateByMonthInit(date);
		
		SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formate01 = dateFormate.format(src);
		System.out.println(formate01+"***");
	}

	@Test
	public void testGetDateByMonthLast() {
		Date date = new Date();
		Date src = DateUtil.getDateByMonthLast(date);
		
	
	}

	@Test
	public void testGetDaysByFuture() {
		Date date = new Date(0);
		
		int i = DateUtil.getDaysByFuture(date);
		
		System.out.println(i);
	
	}

	@Test
	public void testGetDaysByDeparted() {
		Date date = new Date(0);
		
		int i = DateUtil.getDaysByDeparted(date);
		
		System.out.println(i);
	}

}
