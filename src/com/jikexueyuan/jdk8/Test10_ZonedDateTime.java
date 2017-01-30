package com.jikexueyuan.jdk8;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


/**
 * 
 * @author Administrator
 *	将当前日期格式化为字符串并显示年、月、日、时、分和秒
 */
public class Test10_ZonedDateTime {
	public static void main(String[] args) {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy:HH:mm:ss");
		String strDate = zonedDateTime.format(dateTimeFormatter);
		System.out.println(strDate);
	}
}
