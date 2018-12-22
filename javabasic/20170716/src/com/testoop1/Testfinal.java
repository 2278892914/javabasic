package com.testoop1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 
 * @author HP
 *常量；在程序运行时候，不变的量称之为常量
 *分为
 *1：文字常量，在程序当中直接给出量值的常量
 *2：符号常量，在程序当中使用final修饰的变量成为符号常量
 */
public class Testfinal {
	
	public static  Testfinal t1 = new Testfinal();
	public static Testfinal t2 = new Testfinal();
	
	{
		System.out.println("构造快");
		
	}
	static{
		System.out.println("静态块");
		
	}
	public static void main(String[] args) {
		
		
		Testfinal t3 = new Testfinal();
		
		
	}
	
}
