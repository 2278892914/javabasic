package com.useful1;
/*
 * 
 * Integer:
 * 1:实现和基本类型的相互转换
 * 2：封装了基本类型的相关属性，和其他对象的转换方法
 * 
 */
public class TestInteger {
	public void fun(int i){
		
	}
	public void fun1(String s){
		
	}
	public static void main(String[] args) {
		TestInteger t = new TestInteger();
		//自动装箱：将基本类型转化为对象类型的过程
		int i=1;
		Integer it =i;
		//自动拆箱：将对象类型转化为基本类型的过程
		Integer d = 20;
		int h = d;
		String s = "200";
		//将字符串转化为int类型
		Integer.parseInt(s);
		t.fun(Integer.parseInt(s));
		//将int转化为字符串
		int r =100;
		Integer.toString(r);
		t.fun1(Integer.toString(r));
		
	}
}
