package com.jikexueyuan.jdk8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Administrator
 *	将字符串"2014-04-01:13:24:01"格式化为一个LocalDateTime对象，并显示年、月、日、时、分和秒。
 */
public class Test09_DateTimeFormatter {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd:HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.parse("2014-04-01:13:24:01",formatter);
		System.out.println(localDateTime.toString());
	}
}
