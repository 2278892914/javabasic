package com.testoop2;
/**
 * 位运算符
 * &，按位与
 * |，按位或
 * ^,按位异或
 * ~，按位取反
 * <<,左移
 * >>,右移
 * 运算时现将数字转化为二进制，其结果仍为十进制
 *
 */
public class Testoperator4 {
	public static void main(String[] args) {
		int a=5&6;
		System.out.println(a);
		
		int b=5<<2;//向左移动i位，相当于给原数*2的i次方
		System.out.println(b);
		
		int c=5>>2;//向右移动i，相当于原数/2的几次方
		System.out.println(c);
	}

}
