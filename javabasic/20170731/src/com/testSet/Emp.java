package com.testSet;

import java.util.Date;

public class Emp {
	private String id;
	private String name;
	private int age;
	private Date date;

	public Emp(String id,String name,int age,Date date){
		this.id=id;
		this.name=name;
		this.age=age;
		this.date=date;
		
	}
	public String toString(){
		return "编号为"+id+"姓名为"+name+"年龄为"+age+"入职日期为"+new Date();
	}
	
}
