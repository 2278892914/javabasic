package com.oop2;
/*
 * 静态方法
 * 调用，通过类名访问静态方法
 * 
 * 什么时候定义静态方法，什么时候定义实例方法？
 * 如果一个类中的方法需要经常被其他类访问(制作工具类---开发过程中，经常使用的)，
 * 此时该类中的方法定义为静态方法方便使用，否则定义为实例方法
 * 
 */
public class Phone {
	public static void p1(){  //没有返回值的静态方法
		System.out.println("没有返回值的静态方法");
	}
	public static void main(String[] args) {
		Phone.p1();
	}
}
