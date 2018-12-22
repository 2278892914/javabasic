package com.oop1;
/*
 * 实例变量和静态变量的区别
 * 实例变量是在创建对象的时候分配内存并且初始化
 * 静态变量是在类加载的时候分配内存并且初始化，和是否创建对象无关
 * 
 */
public class Computer {
	String brand="三星";   
	int size=14;
	/*
	 * static修饰的变量:在类被装载到虚拟机后，就会将类中的静态变量在
	 * 方法区分配一块内存,该内存被所有对象共享，程序结束后，由系统自动释放
	 */
	static String color;
	public static void main(String[] args) {
	
		Computer c=new Computer();
//		System.out.println(c.brand);
//		System.out.println(c.size);
		System.out.println(Computer.color);
		System.out.println(c);
	}
}
