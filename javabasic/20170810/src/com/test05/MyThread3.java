package com.test05;

import java.nio.charset.MalformedInputException;

public class MyThread3 extends Thread{
	
	public void run(){
		
		while(!this.isInterrupted()){
			
				try {
					Thread.sleep(1000);
					System.out.println("run..............");
				} catch (InterruptedException e) {
					System.out.println("终止了一个阻塞的线程");
					this.interrupt();
				}
			
		}
	
	}
	public static void main(String[] args) throws Exception {
		
		MyThread3 m1 = new MyThread3();
		m1.start();
		
		Thread.sleep(5000);
		m1.interrupt();
		
	}
}
