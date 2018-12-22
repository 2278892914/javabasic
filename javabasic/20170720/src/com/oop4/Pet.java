package com.oop4;

public class Pet {

/**
 * 父类
 */
	protected String name;
	protected String love;
	protected int    age;
	
	
	protected A eat(){
		System.out.println("吃");
		return new A();
	}
}
