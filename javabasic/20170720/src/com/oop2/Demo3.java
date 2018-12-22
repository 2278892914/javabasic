package com.oop2;

public class Demo3 {
	int i;
		
	public void fun(Demo3 d){
		d.i=100;
	}
	
	public static void main(String[] args) {
		Demo3  d3=new Demo3();
		d3.i=50;
		d3.fun(new Demo3());
		System.out.println(d3.i);
		
	}
	
}
