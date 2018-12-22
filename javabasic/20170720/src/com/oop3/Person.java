package com.oop3;

public class Person {

	String name;
	int age;
	
	public Person(){}
	
	//使用构造方法给属性进行初始化操作
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		Person p1=new Person("张三",23);
		Person p2=new Person("李四",24);
		
		
	}
}


