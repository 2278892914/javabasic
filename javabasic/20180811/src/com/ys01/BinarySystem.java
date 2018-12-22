package com.ys01;

import java.util.Scanner;

public class BinarySystem {

	private int size;
	
	private int []   obj = new int[64];
	
	
	public void push(int data){
		if(size == 64){
			throw new RuntimeException("Õ»Âú......");
		}
		
		int i=0;
		while(data != 0){
			i=data%2;
			data=data/2;
			obj[size++]=i;
		}
	}
	
	public void pop(){
		if(size == 0){
			throw new RuntimeException("Õ»¿Õ.....");
		}
		while(size != 0){
			System.out.print(obj[--size]);
		}
		System.out.println();
	}
	
	public int size(){
		return size;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		BinarySystem bs = new BinarySystem();
		
		bs.push(i);
		bs.pop();
	}
}
