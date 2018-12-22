package com.oop1;
/*
 * 类:是具有相同或者相似性质对象的抽象
 * 
 * 对象:是类的具体化，或者类的实例化被称之为对象
 * 
 * 对象的属性
 * 变量：
 * 局部变量：类体中，方法内的变量
 * 成员变量：类体中，方法外的变量，，，，其又分为
 * 实例变量和类变量（静态变量）
 * 实例变量:属于具体的某个对象,通过创建对象后才可以访问
 * 访问方式:对象名.实例变量
 * 类变量:属于类的本身，被所有对象共享,并且需要static关键字修饰
 * 访问方式:类名.静态变量名
 * 
 * 
 * 虚拟机将内存划分为5个区域
 * 1:栈内存，属于一种先进后出的数据结构，其存储效率高，由程序（编译器）在
 * 内存中主动分配内存和释放内存，主要用来存储局部变量，对象的引用，方法的参数
 * 2:堆内存，属于一种树形（非连续的数据结构）。需要在程序运行期间通过new关键
 * 字分配内存，主要用来存储类的实例变量，实例方法的入口等信息，在java中，
 * 无需程序员主动释放内存，而是由java虚拟机中的GC（垃圾回收器）主动释放
 * 3:方法区（静态区），主要用来存储类的结构信息，静态变量，成员方法，常量等信息
 * 4:本地方法栈，主要用来存储非java语言编程的程序的入口（程序的指定地址）
 * 5:程序计数器，主要用来存储每一个线程的指令地址
 * 
 * 
 * 成员方法分为实例方法和静态方法
 * 
 * 实例方法:属于具体某个对象，通过对象名.方法名（）的方式访问
 * 
 * 静态方法:属于类，需要通过static关键字修饰，通过类名.方法名()的方式访问
 * 
 * 基本和引用类型
 */
public class Student {
	//实例变量
	String name;
	int    age;
	
	//实例方法
	
	public void fun1(){
		System.out.println("无返返回值的实例方法");
		
	}
	public int fun2(){
		return 1;       //return 用来结束方法的执行并且返回一个常量值或者一个变量值
	}                   //并且一个方法只能执行一条return语句
	public String fun3(){
		return " ";
	}
	public String fun4(int i){     //i为形参
		System.out.println(i);
		return "  ";
	}
	public static void main(String[] args) {
		/*
		 * 实名对象的创建,其语法为
		 * 类名   对象名=new   类名();
		 */
		//创建对象,每个对象的属性自己私有
		Student stu=new Student();//stu装的是Student的地址
	
		stu.age=23;
		stu.name="张三";
		System.out.println(stu.name);
	 
		stu.fun1();
		int result=stu.fun2();
		System.out.println(result);
		stu.fun4(4);        //为实参
		Student stu1=new Student();
		System.out.println("应用类型使用==比较地址"+(stu==stu1));
		
		//匿名对象的创建，其无法输出
		new Student().name="时尚生活";
	}
}
