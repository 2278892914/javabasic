package com.oop3;
/*
 * this代表当前类的一个隐藏对象，他会在运行期间指向调用方法的对象
 * 
 * this
 * 1:出现在实例方法中，代表了当前正在调用的对象
 * 2:可以解决成员变量和局部变量重名的问题
 * 3:this可以用来调用当前类中的构造方法,并且只能出现在第一行
 * 
 * this的注意事项
 * this关键字不能出现在静态方法里面;
 * 
 * 静态方法里面访问成员变量的注意事项
 * 1：静态方法中不能出现this
 * 2：静态方法中如果需要访问实例变量或者实例方法，需要进行实例化才可以访问
 * 3：静态方法中可以直接访问静态变量(默认缺省类名点.)和静态方法
 * 
 * 构造方法的作用:通常用来初始化操作
 */
public class Demo1 {
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println(d);
		d = new Demo1();
		System.out.println(d);
	}

}
