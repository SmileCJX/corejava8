package com.jikexueyuan.jdk8;
//lambda实现自定义接口，模拟登陆操作
public class Test02_lambda02 {
	public static void main(String[] args) {
		new Action() {
			
			@Override
			public void execute(String content) {
				System.out.println(content);
			}
		}.execute("jdk1.8之前的匿名内部类实现方式，执行登陆操作");
		
		Action loginAction = (String content)->{
			System.out.println(content);
		};
		loginAction.execute("jdk1.8的lambda语法实现登陆操作");
	}
	
	static interface Action{
		void execute(String content);
	}
}
