package com.jikexueyuan.jdk8;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


/**
 * 
 * @author Administrator
 *	����ǰ���ڸ�ʽ��Ϊ�ַ�������ʾ�ꡢ�¡��ա�ʱ���ֺ���
 */
public class Test10_ZonedDateTime {
	public static void main(String[] args) {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy:HH:mm:ss");
		String strDate = zonedDateTime.format(dateTimeFormatter);
		System.out.println(strDate);
	}
}
