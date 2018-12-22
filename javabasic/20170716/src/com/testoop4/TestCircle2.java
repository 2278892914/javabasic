package com.testoop4;

import java.util.Scanner;

/*
 * 嵌套循环
 */
public class TestCircle2 {
	
	public static void main(String[] args) {
		
	Scanner input= new Scanner(System.in);
	int sum=0,avg=0;
	String str="";
	do{
		System.out.println("请输入学生姓名");
		String name = input.next();
		
		
		for(int i=1;i<=5;i++){
			System.out.println("请输入5门功课当中第"+i+"门功课的成绩");
			int score=input.nextInt();
			sum=sum+score;
			
		}
		avg=sum/5;
		System.out.println(name+"的平均分时"+avg);
		System.out.println("是否继续输入(y/n");
		str=input.next();
	 }while(str.equals("y"));
	System.out.println("谢谢使用");
	
   }	
	
}
