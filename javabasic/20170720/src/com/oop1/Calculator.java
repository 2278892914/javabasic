package com.oop1;

import java.util.Scanner;

public class Calculator {
	public void plus(double d1,double d2){
		double result=d1+d2;
		System.out.println(result);
		}
	public void cut(double d1,double d2){
		double result=d1-d2;
		System.out.println(result);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		double d1=input.nextDouble();
		System.out.println("请输入第二个数:");
		double d2=input.nextDouble();
		System.out.println("请输入 + - * / ");
		
		String a =input.next();
		if(a=="+"){
			c.plus(d1, d2);
		}
	}
}
