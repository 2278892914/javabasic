package com.exception;

public class A {
	public void fun() throws Exception{
		int i = 3/0;
	}
	public static void main(String[] args) {
		A a = new A();
		try{
		a.fun();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
