package com.jikexueyuan.jdk8;

import java.time.LocalTime;

/**
 * 
 * @author Administrator
 *	��LocalTime��ȡ��ǰʱ��
 */
public class Test07_LocalTime {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.print(time.getHour() + "ʱ");
		System.out.print(time.getMinute() + "��");
		System.out.println(time.getSecond() + "��");
		System.out.println(time.toString());
	}
	
}
