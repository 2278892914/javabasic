package com.testoop3;

import java.util.Scanner;

public class TestIf02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		if (score<10){
			
			String sex= input.next();
			if(sex.equals("男")){  //判断字符串是否相等
				System.out.println("进入男子组");
			}else if (sex.equals("女")){
				
				System.out.println("进入女子组");
			}else {
				
				System.out.println("性别有误");
			}
		}
	}
}
