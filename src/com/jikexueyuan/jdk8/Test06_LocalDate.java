package com.jikexueyuan.jdk8;

import java.time.LocalDate;


/**
 * 
 * @author Administrator
 *	��localDate��ȡ��ǰ����
 */
public class Test06_LocalDate {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println( date.getYear() + "��");
		System.out.println( date.getMonthValue() + "��");
		System.out.println( date.getDayOfMonth() + "��");
		System.out.println( date.toString() );
	}
}
