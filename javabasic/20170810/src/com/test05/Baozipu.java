package com.test05;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Baozipu {
	
	
	private int num;
	
	private ReentrantLock rt = new ReentrantLock();
	private Condition conA = rt.newCondition();
	private Condition conB = rt.newCondition();
	
	
	public  void mbz1(){
		
		
		try {
			rt.lock();
			String name = Thread.currentThread().getName();
			System.out.println(name+"开始卖包子了");
			if(num>150){
//				this.notify();
//				this.wait();
				conA.signal();
			}else{
				conB.signal();
			}
			Thread.sleep(1000);
			num+=10;
			System.out.println(name+"蒸完包子了有"+num);
		} catch (Exception e) {
		
			e.printStackTrace();
		}finally{
			rt.unlock();
		}
	}
	public  void mbz2(){
		
		rt.lock();
		try {
			String name = Thread.currentThread().getName();
			System.out.println(name+"卖包子了");
			if(num<50){
			System.out.println(name+"包子数不够，等等");
				//this.wait();
			
			}
		
			num-=50;
			System.out.println(name+"卖完包子了，包子还剩"+num);
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			rt.unlock();
		}
	}
}
