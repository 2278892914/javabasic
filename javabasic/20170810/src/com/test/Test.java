package com.test;

public class Test {
	public static void main(String[] args) {
		//继承Thread类的调用方式
		Test01 t1 = new Test01();
		t1.start();
		
		//实现Runnable接口的调用方式
		Test02 t2 = new Test02();
		Thread t = new Thread(t2);
		t.start();
	}
}
