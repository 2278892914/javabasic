package com.bjsxt.pojo;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class Users {

	private Integer age;
	
	private Integer id;
	@NotBlank(message = "锤子")
	@Length(min=2,max=6)
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Users [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	
}
