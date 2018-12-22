package com.testSet;

import java.util.Date;

public class Emp1 {
	private String name;
	private String id;
	private int age;
	private Date date;
	public Emp1(String name,String id,int age,Date date){
		this.name=name;
		this.id = id;
		this.age=age;
		this.date= date;
	}
	public String toString(){
		return "编号为"+id+"姓名为"+name+"年龄为"+age+"入职日期为"+new Date();
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
//	
}
