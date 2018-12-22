package com.useful1;

import java.util.Random;

/*
 * 数学类
 */
public class TestMath {
	public static void main(String[] args) {
		//绝对值
//		int abs=Math.abs(-1);
//		//最大值
//		int max=Math.max(10, 20);
//		double d=Math.random();   //大于0小于1的数
//		//从0到100返回6个随机数
//		for(int i=1;i<=6;i++){
//			int a = (int)(Math.random()*100);
//			System.out.println(a);
//		

		
		//   产生1到10中6个不相同的随机数
		int[] a=new int[6];
		a[0]=20;
		for(int i=0;i<a.length;i++){
			int as = (int)(Math.random()*10);
			for(int j=0;j<=i;j++){
				if(as!=a[j]){
					if(j==i){
						a[i]=as;
						break;
					}
				}
				else{
					
				}
			}
		}
		
		for(int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}	
	
	}
	
}
