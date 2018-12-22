package com.oop2;
/**
 * 方法的重载:在同一个类中，方法名相同，参数类型或者参数个数不同，与返回值无关的  方法
 * 具体调用哪一个，住要是由重载方法的类型和个数来确定
 *   
 */
public class TestOverLoadMethod {

	public int fun(){
		return 1;
	}
	
	public void fun(int i){
		
		
	}
	
	public void fun(String i){
		
	}
	
	public void fun(String i,int j){
		
	}
	public static void main(String[] args) {
		
		char[] c=new char[]{'a','b'};
		System.out.println(c);
		
	}
	
}


