package com.test04;

public class MyThread1 extends  Thread{
	MySync1 ms1;
	public MyThread1(MySync1 ms1){
		this.ms1=ms1;
		
	}
	public void run(){
		ms1.m1();
 	}
}
