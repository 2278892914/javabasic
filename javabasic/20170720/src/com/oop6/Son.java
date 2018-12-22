package com.oop6;

public class Son extends Father{
	public void fun(){
		System.out.println("子类方法");
		
	}
	public static void main(String[] args) {
		Father f=new Son();//向上转型，使用父类的引用指向子类的对象
		f.fun();
	}
}
