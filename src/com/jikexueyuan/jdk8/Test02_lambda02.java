package com.jikexueyuan.jdk8;
//lambdaʵ���Զ���ӿڣ�ģ���½����
public class Test02_lambda02 {
	public static void main(String[] args) {
		new Action() {
			
			@Override
			public void execute(String content) {
				System.out.println(content);
			}
		}.execute("jdk1.8֮ǰ�������ڲ���ʵ�ַ�ʽ��ִ�е�½����");
		
		Action loginAction = (String content)->{
			System.out.println(content);
		};
		loginAction.execute("jdk1.8��lambda�﷨ʵ�ֵ�½����");
	}
	
	static interface Action{
		void execute(String content);
	}
}
