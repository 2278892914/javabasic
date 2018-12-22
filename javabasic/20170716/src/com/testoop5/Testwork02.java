package com.testoop5;
/*
 * 
 * 插入一个数值，其余数字往后移动
 */
public class Testwork02 {
	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=15;
		a[1]=45;
		a[2]=35;
		a[3]=32;
		a[4]=18;
		for(int i=a.length-1;i>1;i--){
			a[i]=a[i-1];
		}
		a[2]=88;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
	
	}
}
