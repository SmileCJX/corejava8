package com.jikexueyuan.jdk8;

import java.time.LocalTime;

/**
 * 
 * @author Administrator
 *	用LocalTime获取当前时间
 */
public class Test07_LocalTime {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.print(time.getHour() + "时");
		System.out.print(time.getMinute() + "分");
		System.out.println(time.getSecond() + "秒");
		System.out.println(time.toString());
	}
	
}
