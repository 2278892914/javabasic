package com.oop4;
/*
 * java中的访问权限，主要通过以下几个关键字来实现
 * 1:private 私有的 可用来修改成员变量，成员方法，构造方法，内部类，属于最严格的访问权限
 *    使用private修饰的成员，只能在当前类当中访问
 * 2:default,默认的访问权限，只能在同一个包地下相互访问，子类中不可以访问
 * 
 * 3.protected:受保护的访问权限,只能在同一个包，同一个类，子类中访问
 * 
 * 4.public 公共的访问权限，可以在任何类，任何包地下访问
 */
public class Teacher {
	

	 String name;
	 int age;
	 String add;

	
}
