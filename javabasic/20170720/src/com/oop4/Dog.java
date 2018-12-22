package com.oop4;

public class Dog extends Pet{

	//如果子类的属性和父类属性重名了，那么子类的属性会覆盖父类属性(但内存仍然有两块)
	String name;
	
	public  B eat(){
		super.name="哈士奇";//访问子类的属性
		
		System.out.println("骨头");
		return new B();
	}

	
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
	}
}
