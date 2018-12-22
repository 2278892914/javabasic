package com.test04;

public class MySync1 {
	public synchronized void m1(){
		
		try {
			String name = Thread.currentThread().getName();
			System.out.println(name+"开始执行了");
			Thread.sleep(2000);
			System.out.println(name+"执行结束了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public synchronized void m2(){
			synchronized(this){
				try {
					String name = Thread.currentThread().getName();
					System.out.println(name+"开始执行了--------m2");
					
					Thread.sleep(2000);
					System.out.println(name+"执行结束了");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
