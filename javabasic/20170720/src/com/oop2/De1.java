package com.oop2;

public class De1 {
   public void fun(int i){
	   i=30;
	   System.out.println(i);
   }
   public static void main(String[] args) {
	De1 d1=new De1();
	int i=100;
	d1.fun(i);
	System.out.println(i);
   }
}
