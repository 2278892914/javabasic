package com.testoop4;

import java.util.Scanner;

public class TestCircle4 {
	public static void main(String[] args) {
		//break,用于循环语句当中，退出当前循环
//		for(int i=1;i<=10;i++){
//			if(i%4==0){
//				break;        //跳出当前的for循环，后面不能出现任何语句
//			}
//			System.out.println(i);
//			
//		}
//		
//		//continue:跳过循环体当中的内容执行下一次循环
//		//打印1到10非4的倍数
//		for(int i=1;i<=10;i++){
//			if(i%4==0){
//				continue;
		
//			}
//			System.out.println(i);
//		}
		//判断一个数是否为素数(只能被1和它自身整除)，，，1除外
		Scanner input =new Scanner(System.in);
		System.out.println("请输入任意一个数");
		int a = input.nextInt();
		boolean b=true;
		for(int i=2;i<a;i++){
			if(a%i==0){
				b=false;
				break;
			}
			
		}
		if(b==false){
			System.out.println("不是素数");
		}else{
			System.out.println("是素数");
			
		}
		
	}
}
