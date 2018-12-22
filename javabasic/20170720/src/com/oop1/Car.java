package com.oop1;

public class Car {
	String name;
	String color;
	public double getspeed(){
		return 60;
	}
	/**
	 * 方法返回值如果是引用类型，那么return返回值要不是null，要么是该类型对应的实例
	 *
	 */
	public Car getCar(){
		
		Car c=new Car();
		String name="黑色";
		return c;        //要不是return new Car();  
	}
	public Student getstu(){
		return new Student();
	}
}
