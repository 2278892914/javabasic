package com.oop6;
/*
 * 多态
 */
public class Zhuren {
	public void feed(Pet p){
		//p.eat();
		if(p instanceof Dog){    //向下转型
			Dog d = (Dog)p;
		d.run();
		}
		if(p instanceof Qie){
			Qie q = (Qie)p;
			q.run();
		}
	}
	
	public static void main(String[] args) {
		Zhuren t = new Zhuren(); 
	
		t.feed(new Dog()); //在java中定义父类的引用作为形参，是java实现多态的重要方式
	}
}
