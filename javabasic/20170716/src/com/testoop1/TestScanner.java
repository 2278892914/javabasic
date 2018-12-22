package com.testoop1;

import java.util.Scanner;

public class TestScanner {
	

	public static void main(String[] args) {
		//允许用户从控制台输入
		Scanner input= new Scanner(System.in);
		String s1=input.next();  //字符串输入
		int a = input.nextInt();  //整形输入
		System.out.println("用户字符串输入"+s1);
		System.out.println(a);
		
	}

}
