package com.testoop1;
/**
 * java当中数据类型的分类
 * @author HP
 *1：基本数据类型
 *
 *byte:一个字节型     —128——127
 *short:短整形，两个字节，-32768——32767
 *int:整形，四个字节
 *long:长整形，八个字节
 *float:单精度浮点型，占四个字节
 *double:双精度浮点型，8个字节
 *char:字符型，使用单引号包裹一个字符，占2个字节
 *boolean:布尔型，取值为false,或者ture,占一个字节
 *
 *2，引用数据类型：类，数组，接口，枚举，注释等
 *
 */
public class datatype {
	public static void main(String[] args) {
		/**
		 *  声明变量语法
		 * 数据类型 变量名=值
		 * 
		 * 局部变量的特点
		 * 1：局部变量必须先声明，然后赋值，才能使用
		 * 2；局部变量不能重名
		 * 3；局部变量遵循标识符规定
		 * 
		 */
		//byte a =10;
	   // char c = 'a';
	   // boolean b1= false;
	    String s="hp" ;
	    System.out.println(s);
	}
}
