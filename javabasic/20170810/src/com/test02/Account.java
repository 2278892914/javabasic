package com.test02;

public class Account{
	
	private int money = 1000 ;
	
	public void getMoney(){
		money -=1000;
		System.out.println("money="+money);
	}
	
	
}