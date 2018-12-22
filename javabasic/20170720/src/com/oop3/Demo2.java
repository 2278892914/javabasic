package com.oop3;
/*
 * 构造方法的特点
 * 1 在实例化对象的同时，由系统自动调用的方法
 * 2 构造方法的方法名一定要和类名相同
 * 3 构造方法可以带参数，可以重载
 */
public class Demo2 {
	public Demo2(){
		System.out.println("无参");
	}
	public Demo2(int i){
		System.out.println("有参");
	}

	public static void main(String[] args) {
		Demo2 d = new Demo2();
	}
}
