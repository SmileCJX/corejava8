package com.jikexueyuan.jdk8;

/**
 * 
 * @author Administrator
 * 用lambda实现Runnable接口	
 */
public class Test01_lambda01 {

	public static void main(String[] args) {
		new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现Runnable接口");
			}
		}.run();
		
		
		int i = 1;
		Runnable r = ()->{
			System.out.println("用lambda实现Runnable接口");
			System.out.println("i="+i);
		};
		r.run();
	}

}
