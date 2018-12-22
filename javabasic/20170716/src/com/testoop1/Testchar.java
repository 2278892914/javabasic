package com.testoop1;
/**
 * 
 * @author HP
 *a-z,,97-122
 *A-Z,,65_90
 *0-9,,48_57
 */
public class Testchar {
	public static void main(String[] args) {
		//char类型在运算时可以自动提升为整型
		char c= '女';
		int i=c;
		int j=97;
		//int类型如果需要转化为char型，需要强制类型转化
		char c1=(char)j;
		System.out.println(i);
		System.out.println(c1);
	}

}
