package com.oop5;

public class Dep {
	private int number;
	private String name;
	private int phone;
	private String add;
	public String toString(){
		return "员工编号为"+(number)+"员工姓名为"+name+"员工电话为"+phone+"员工地址为"+add;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	
}
