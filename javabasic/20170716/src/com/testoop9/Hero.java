package com.testoop9;

/**
 *（1）定义一个游戏中Hero?英雄的类，在该类中定义英雄的名字，?生命值和等级3?个属性，定义一个构造函数完成对生命值和等级的初始化，
		分别赋初值为100，1。同时实现名字的输入和英雄信息的输出。??
（2）在上一题的基础上，为英雄再定义拥有一个参数的构造方法，传入一个英雄类型的值，如果为1，
		则为普通英雄，生命值为100，如果该值为2，则为高级英雄，生命值初始化为200。?
（3）在上两英雄类型的基础上，为英雄添加一个基本战斗的方法，?该方法拥有一个英雄类型的参数，
	当传入另一个英雄时，能降低对方100?点血。?再增加一个绝招的重载方法，加入一个战斗类型参数，通过输入不同绝招参数，降低对方不同的血量。
 *
 */
public class Hero {

	public String name;
	public int lifevalue;
	public int grade;
	public Hero(){
		
	}
	//通过构造方法传入的参数初始化等级和分数，如果为1，调用fun1，如果为2调用fun2
	public Hero(int flag){
		if(flag==1)
			//this为调用该方法的对象
			this.fun1();
		if(flag==2)
			this.fun2();
	}
	public void fun1(){
		this.grade=1;
		this.lifevalue = 100;
	}
    public void fun2(){
    	this.grade=2;
		this.lifevalue = 200;
	}
    public Hero(int lifevalue,int grade ){
		this.lifevalue = lifevalue;
		this.grade = grade;
	}
    //普通攻击
    public void fight(Hero hero){
    	hero.lifevalue-=100;
    }
    //绝招                              变量的含义为攻击幅度，取值为0~1中间的任何小数，如果为0，则表示无任何伤害，如果为1，表示已经阵亡
    public void fight(Hero hero,double f){
    	hero.lifevalue-=f*(hero.lifevalue);
    }
	@Override
	public String toString() {
		return "Hero [name=" + name + ", lifevalue=" + lifevalue + ", grade=" + grade + "]";
	}
    
}
