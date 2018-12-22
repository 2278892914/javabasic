package com.testoop4;

import java.util.Scanner;

/*
 * 循环结构
 * for(初始条件;判断条件;步长){
 * 循环体
 * }
 * 
 * while(表达式){
 * 循环体
 * }
 * 
 * 循环次数确定的情况下，最好使用for循环
 * 循环次数不确定的情况下，最好使用while循环
 * 
 * do{
 * 循环体
 * }while(表达式);
 */
public class TestCircle01 {
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			System.out.println("好好学习，天天向上");
		}
			
		int sum=0;
		for(int i=1;i<=10;i++){
			sum=sum+i;
		}
		System.out.println(sum);
		
		int j=1;
		int count=0;
		while(j<=100){
			count=count+j;
			j++;
		}
		System.out.println(count);
		
		int k=1;
		int result=0;
		do{
			result=result+k;
			k++;
		}while(k<=100);
		System.out.println(result);
		
		for(int m=0,n=6;m<=6&&n>=0;m++,n--){
			System.out.println(m+"+"+n+"="+(m+n));
		}
			
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入学生姓名");
		String name =input.next();
		int value=0;
		for(int i=1;i<=5;i++){
			System.out.println("请输入第"+i+"门课的成绩");
			int score =input.nextInt();
			value=value+score;
		}
		int avg=value/5;
		System.out.println(name+"的平均分是"+avg);
	 }
	
}


