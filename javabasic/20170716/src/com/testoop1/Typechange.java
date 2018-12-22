package com.testoop1;
/**
 * 
 * @author HP
 *基本数据类型转换
 *特点：
 *1，可以从低精度转换为高精度
 *2，如果需要将高精度转换为低精度需要强制类型转换
 */
public class Typechange {
	public static void main(String[] args) {
		int i=(int)12.9;//强制类型转化以后直接去掉小数点部分
		System.out.println(i);
		int m=20;
		int n=10;
		int temp=0;
		temp=m;
		m=n;
		n=temp;
		System.out.println(m+"    "+n);

	}

}
