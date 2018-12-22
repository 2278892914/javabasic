package com.testoop5;
/*
 * 删除数组元素
 */
public class Testwork3 {
	public static void main(String[] args) {
		int []a=new int[]{10,20,30,40,50};  //静态初始化
		for(int i=2;i<a.length-1;i++){
			a[i]=a[i+1];
			
		}
		a[4]=0;
		for(int j=0;j<a.length;j++){
			System.out.println(a[j]);
			
		}
	}
}
