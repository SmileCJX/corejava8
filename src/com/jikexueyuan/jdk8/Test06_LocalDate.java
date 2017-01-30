package com.jikexueyuan.jdk8;

import java.time.LocalDate;


/**
 * 
 * @author Administrator
 *	用localDate获取当前日期
 */
public class Test06_LocalDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println( date.getYear() + "年");
		System.out.println( date.getMonthValue() + "月");
		System.out.println( date.getDayOfMonth() + "日");
		System.out.println( date.toString() );
	}
}
