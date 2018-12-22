package com.recursion;

import java.nio.charset.MalformedInputException;

/*
 * 方法的递归：方法调用自身的过程称为方法递归，方法递归一定在满足某些条件的情况下退出，否则将造成内存溢出
 * 
 * 递归一般用于解决某些具有特殊规律的功能，递归最终也可以转化为循环实现
 */
public class TestRecursion {
	
	//计算5的阶乘
	public int fun(int n){
		if(n==1){
			return 1;
		}else{
			return n*fun(n-1);
		}
	}
	
	public int fun1(int n){
		if(n==1||n==2){
			return 1;
		}else{
			return fun1(n-1)+fun1(n-2);
		}
	}
	public static void main(String[] args) {
		TestRecursion t = new TestRecursion();
		
		int d = t.fun1(7);  //接受返回的值
		
		System.out.println(d);
	}
}
