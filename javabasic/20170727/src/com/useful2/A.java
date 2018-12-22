package com.useful2;

public class A {
	private static A a;
	//private static  A a = new A();
	private A(){
		
	}
	
	public static A fun2(){
		return a;
	}
	
	public static A fun(){
		if(a!=null){
			a = new A();
		}
		return a;
	}

}
