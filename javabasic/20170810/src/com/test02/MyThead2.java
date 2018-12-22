package com.test02;

public class MyThead2 extends Thread{
	
	
	private Account count ;
	
	public MyThead2(Account count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		count.getMoney();
	}
}
