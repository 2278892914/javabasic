package com.test03;

public class Test03 {
	public static void main(String[] args) throws Exception {
		MyThread m1 = new MyThread();
		m1.setName("熊大");
		
		MyThread m2 = new MyThread();
		m2.setName("二");
		
		m1.start();
		m2.start();
		Thread.sleep(1000);
	}
}
