package com.useful2;
/*
 * 字符串：由多个字符组成的序列集合
 * 在java中通过String这会引用类型代表一个字符串，并且可以通过String类对字符串进行各种操作
 * 字符串在初始化的两种方式
 * 1：String s = "abc";
 * 2:String s=new String("abc");
 * 
 * java的常量池
 * 1；静态常量池，也叫class常量池，class文件中除了有类，方法等结构信息，还有一个常量池，专门用于
 * 保存类中的字面量等信息
 * 2运行时常量池，jvm在完成类的加载之后，将class文件中的常量池内容加载到内存中，并且保存在方法区
 * 
 *变量和字面量拼接，编译完成后会产生StringBuilder操作，即就在在堆中分配内存
 *字面量和字面量拼接，编译完成后仍然会拼接成一个字符串，并且检查常量池是否存在
 *
 */
public class Demo1 {
	/*
	 * 字符串的比较（比较地址）
	 */
	public static void main(String[] args) {
	
	}
}
