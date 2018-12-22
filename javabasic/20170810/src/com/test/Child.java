package com.test;

public class Child extends Parent{
	
	public String basicName="child";
	
	public Child() {
		//printBaisc();
	}
	public void printBaisc() {
		System.out.println("childPrint----"+basicName);
	}
	
	public static void main(String[] args) {
		new Child();
	}
	
}
