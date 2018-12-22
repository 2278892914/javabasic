package com.oop2;

public class De2 {
	int i;
	public void fun(int i){
		i=20;
		System.out.println(i);
	}
	public static void main(String[] args) {
		De2 d2=new De2();
		d2.i=10;
		d2.fun(d2.i);  
		System.out.println(d2.i);
	}
}
