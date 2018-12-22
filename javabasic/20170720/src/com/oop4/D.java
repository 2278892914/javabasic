package com.oop4;

public class D extends C{
	public D(){     //构造方法，也就是构造器在创建对象之前就被调用
		super(10);
		System.out.println("这是子类无参构造");
	}
	
	
	public static void main(String[] args) {
		
		D b=new D(); //当执行（）时候构造器就已经别调用
	}

}
