package com.jikexueyuan.jdk8;

import java.time.LocalDateTime;

/**
 * 
 * @author Administrator
 *	��LocalDateTime��ȡ��ǰ���ں�ʱ��
 */
public class Test08_LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.print(dateTime.getYear() + "��");
		System.out.print(dateTime.getMonthValue() + "��");
		System.out.print(dateTime.getDayOfMonth() + "��");
		System.out.print(dateTime.getHour() + "ʱ");
		System.out.print(dateTime.getMinute() + "��");
		System.out.println(dateTime.getSecond() + "��");
		System.out.println(dateTime.toString());
		
	}
}
