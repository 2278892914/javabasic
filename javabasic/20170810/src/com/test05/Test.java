package com.test05;

public class Test {

	public static void main(String[] args) {
		
		Baozipu bp = new Baozipu();
		MyThread1 m1 = new MyThread1(bp);
		
		m1.setName("小花");
		m1.start();
		MyThread1 m2 = new MyThread1(bp);
		m2.setName("小黑");
		m2.start();
		MyThread1 m3 = new MyThread1(bp);
		
		m3.setName("小白");
		m3.start();
	}
}
