package com.xlh;

import java.io.Serializable;

public class Student implements Serializable{
	String name ="张三";
	int age=23;
	 String add = "西安";      //序列化时候讲属性私有transient
}
