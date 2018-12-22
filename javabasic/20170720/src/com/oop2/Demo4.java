package com.oop2;


public class Demo4 {

	char[] c=new char[]{'a','b','c'};
	
	public void  fun(char[] c){
		c[1]='f';
	}
	
	public static void main(String[] args) {
		Demo4 d4=new Demo4();
		d4.fun(d4.c);
		char[] c=d4.c;
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		
	}
}