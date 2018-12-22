package com.test03;

public class Sum {
private int a;
	
	
	public Sum() {
		
	}
	
	public Sum(int a) {
		this.a = a;
	}
	
	
	public void m1(){
		System.out.println("11111111");
	}
	
	public int m2(){
		return 0;
	}
	
	public int m3(int a){
		return a;
	}
	
	public int m4(){
		return a;
	}
	
	public static int m5(int a){
		return a;
	}
	
	public int m6(int a){
		return this.a;
	}
	
	
}
