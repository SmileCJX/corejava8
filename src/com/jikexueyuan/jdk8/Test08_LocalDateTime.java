package com.jikexueyuan.jdk8;

import java.time.LocalDateTime;

/**
 * 
 * @author Administrator
 *	用LocalDateTime获取当前日期和时间
 */
public class Test08_LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.print(dateTime.getYear() + "年");
		System.out.print(dateTime.getMonthValue() + "月");
		System.out.print(dateTime.getDayOfMonth() + "日");
		System.out.print(dateTime.getHour() + "时");
		System.out.print(dateTime.getMinute() + "分");
		System.out.println(dateTime.getSecond() + "秒");
		System.out.println(dateTime.toString());
		
	}
}
