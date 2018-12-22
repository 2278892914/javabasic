package com.testoop2;
/*
 * 逻辑运算符
 * &，逻辑与     两边都得运算
 * |，逻辑或
 * !，逻辑取反
 * &&，短路逻辑与 ,,只要左边为假，就不计算右边的
 * ||，短路逻辑或,,只要左边表达式为真，则不计算右边的表达式
 * 其结果还是boolean
 */
public class Testoperator3 {
	public static void main(String[] args) {
		boolean b1=(2>3)&(3>4);
		System.out.println(b1);
		
		boolean b2= (2>3)&&(5<6);
		System.out.println(b2);
		
		boolean b3=(2>3)|(4<5);
		System.out.println(b3);
		
		boolean b4=(2<3)||(4<5);
		System.out.println(b4);
		
		boolean b5=!(2<3);
		System.out.println(b5);
	}
}
