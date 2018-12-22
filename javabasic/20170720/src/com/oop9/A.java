package com.oop9;

public class A implements ITestInterface{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("fun1方法");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("fun2方法");
	}
	public static void main(String[] args) {
		//，利用多态思想，实现调用接口中的方法
		ITestInterface it = new A();  
		it.fun1(); // 编译时调用ITestInterface,但是运行时候调用A中的fun1
		it.fun2();//编译时调用ITestInterface,但是运行时候调用A中的fun2
		it.fun3();//编译和运行时候都调用的是A中的fun3方法
		ITestInterface.fun();  //静态方法的访问
		System.out.println(ITestInterface.name);
		
	}

}
