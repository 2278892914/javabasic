package com.useful;

import java.util.Arrays;

public class Testarray {

	public static void main(String[] args) {
		int []a =new int []{10,20,30};
		int []b =new int[3];
		System.arraycopy(a,0,b,0,a.length);
		Arrays.sort(a);
		for( int i=0;i<b.length;i++){
			System.out.println(b[i]);
			
		}
		Student[] stu = new Student[2];
		Student s1= new Student();
		s1.age=30;
		Student s2= new Student();
		s2.age=40;
		System.exit(2);//终止当前程序的运行
		System.gc();  //垃圾回收机制（准备操作，无法立即执行）
	
	}
}
