package com.useful;

public class Student implements Comparable{
	int age;

	@Override
	public int compareTo(Object o) {
		Student stu = (Student)o;
		if(this.age>stu.age){
		return -1;
		}
		return 1;
	}
	

}
