package com.testoop5;
/*
 * 找出最达值
 */
public class Testwork01 {
	public static void main(String[] args) {
		int[] a=new int[]{20,17,12,42,35};
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
				
			}
			
		}
		System.out.println(max);
	}
}
