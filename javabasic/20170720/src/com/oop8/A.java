package com.oop8;

public class A {
	private String name;
	private String add;
	private String color;
	private int age;
	public String toString(){
		return "地址为"+add+"姓名为"+name+"年龄"+age+"颜色为"+color;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAdd(String add){
		this.add = add;
	}
	public String getAdd(){
		return add;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
