package com.test04;

public class Test {
	
	
	public static void main(String[] args) {
		MySync1 ms1 = new MySync1();
		
		MyThread1 mt1_1 = new MyThread1(ms1);
		MyThread1 mt1_2 = new MyThread1(ms1);
		
		MyThread2 mt2_1 = new MyThread2(ms1);
		
		mt1_1.start();
		mt1_2.start();
		mt2_1.start();
	}
}
