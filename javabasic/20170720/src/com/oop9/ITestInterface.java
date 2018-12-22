package com.oop9;
/**
 * 
 * 接口
 *
 */
public interface ITestInterface {
	String name="张三";//静态常量
	public static void fun(){  //静态方法
		
	}
	void fun1();//抽象方法
	void fun2();
	default void fun3(){      //默认方法
		
	}
	
}
