package com.jikexueyuan.jdk8;

/**
 * 
 * @author Administrator
 * ��lambdaʵ��Runnable�ӿ�	
 */
public class Test01_lambda01 {

	public static void main(String[] args) {
		new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�����ڲ���ʵ��Runnable�ӿ�");
			}
		}.run();
		
		
		int i = 1;
		Runnable r = ()->{
			System.out.println("��lambdaʵ��Runnable�ӿ�");
			System.out.println("i="+i);
		};
		r.run();
	}

}
