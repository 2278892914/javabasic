package com.test02;

public class Test02 {

	public static void main(String[] args) {
		
		Account count = new Account();
		
		MyThead2 m2 = new MyThead2(count);
		m2.setName("小白");
		
		MyThead2 m3 = new MyThead2(count);
		m3.setName("小黑");
		
		m2.start();
		
		m3.start();
		
	}
}





