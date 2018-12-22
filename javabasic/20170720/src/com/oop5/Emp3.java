package com.oop5;

public class Emp3 extends Emp2{
	static{
		System.out.println("emp3静态初始化");
	}
	{
		System.out.println("emp3非静态");
	}
	public Emp3(){
		System.out.println(3);
	}
	public static void main(String[] args) {
		Emp3 s=new Emp3();
		s=new Emp3();   //final对象:表示该对象无法再指向其他实例,重新指向一个新的对象
		Emp1 ad = new Emp1();
		ad.setAdd("北京");
		ad.setAge(30);
		ad.setName("丁力");
		System.out.println(ad);
	}
	
}
