package com.oop5;

public class Emp1 extends Emp{
	private String name;
	private int age;
	private String add;
	public String toString(){
		return "员工姓名"+name+"年龄"+age+"地址为"+add;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
}
