package com.oop7;
/**
 * 
 * 测试多态
 *
 *同中引用类型指向不同的实例，来完成不同的操作
 */
public class Person {
	public void fun(Car p){  //首先定义一个父类
		p.run();
		if(p instanceof Benchi){  //使用intanceof来判断类型是否相同
			Benchi b=(Benchi)p;
			b.speed();
		}
		if(p instanceof Baoma){
			Baoma b=(Baoma)p;
			b.speed();
		}
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.fun(new Benchi());
	}
}
