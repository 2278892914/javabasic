package com.oop1;

public class Testcar {
	public static void main(String[] args) {
		Car c=new Car();
		c.name="宝马";
		c.color="黑色";
		System.out.println(c.name+c.color);
		
		//定义引用变量，重新接受方法的返回值
		Car c1=c.getCar();   //其返回的是一个地址
		System.out.println(c1);  //c1为一个地址
		System.out.println(c1.name);
	}
	
}
