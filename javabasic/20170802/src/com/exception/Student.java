package com.exception;

public class Student {
	private int  age;
	public void setAge(int age) throws AgeException{
		if(age>0&&age<150){
		this.age = age;
		}else{
			//使用throw抛出异常对象
			throw new AgeException();
		}
	}
}
