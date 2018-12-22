package com.useful;

import java.util.Arrays;

/*
 * 对象数组排序
 * 
 * 
 * System.exit(0);//退出Java虚拟机
 */
public class TestSystem {
	public static void main(String[] args) {
		//创建两个学生对象
		Student s1=new Student();
		s1.age=25;
		Student s2=new Student();
		s2.age=30;
		//定义两个对象数组
		Student[] s=new Student[2];
		s[0]=s1;
		s[1]=s2;
		TestArrays.testsort(s);  //调用方法对数组排序
		//操作数组的实用类
		//Arrays.sort(s);  //直接调用方法进行排序
		
		for(Student stu:s){
			System.out.println(stu.age);
		}

	}
}
