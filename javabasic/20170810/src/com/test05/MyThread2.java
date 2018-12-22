package com.test05;

public class MyThread2 extends Thread{
	private Baozipu bp;
	public MyThread2(Baozipu bp){
		this.bp=bp;
		
	}
	public void run(){
		while(true){
			//bp.mbz();
		}
	}
}
