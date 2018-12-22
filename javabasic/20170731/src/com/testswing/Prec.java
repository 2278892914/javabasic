package com.testswing;

public class Prec {

	public static int a;
	public final int b = 10;
	public static void fun(){
		a++;
	}
	public static void main(String[] args) {
		Prec p = new Prec();
		p.a=2;
		
		System.out.println(a);
				
	}
	
}
