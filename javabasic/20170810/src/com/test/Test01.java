package com.test;

public class Test01 extends Thread{
	public void run(){
	for(int i =0;i<10;i++){
		System.out.println("Test01"+i);
	}
	}
}
