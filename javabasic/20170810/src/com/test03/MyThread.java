package com.test03;

public class MyThread extends Thread{
	public MyThread(){
		Thread thread = Thread.currentThread();
		System.out.println("MyThread-------------"+thread.getName());
	}
	public void run(){
		try {
			for(int i=0;i<5;i++){
				Thread.sleep(1000);
				System.out.println(this.getName()+"----------"+i+"-------"+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
