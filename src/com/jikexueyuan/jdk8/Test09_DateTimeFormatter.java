package com.jikexueyuan.jdk8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Administrator
 *	���ַ���"2014-04-01:13:24:01"��ʽ��Ϊһ��LocalDateTime���󣬲���ʾ�ꡢ�¡��ա�ʱ���ֺ��롣
 */
public class Test09_DateTimeFormatter {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd:HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.parse("2014-04-01:13:24:01",formatter);
		System.out.println(localDateTime.toString());
	}
}
