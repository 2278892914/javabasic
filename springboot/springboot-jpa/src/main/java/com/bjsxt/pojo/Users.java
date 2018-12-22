package com.bjsxt.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 正向工程
 * @author HP
 *
 */
@Entity  //代表实体类
@Table(name="t_users")   //代表的是表名
public class Users {

	@Id          //代表的是此为主键
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //主键的生成策略
	@Column(name="id")   //完成表和列的映射关系    列的名字就是id
 	private Integer id;  
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="age")
	private Integer age;
	
	@ManyToOne
	@JoinColumn()            //维护外键
	private Roles roles;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
}
