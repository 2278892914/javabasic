package com.useful;
/*
 * 枚举类
 * 枚举：通常用来定义一组相同的常量
 */
public enum Season {
	spring("春天"),fall("秋天"),winter("冬天"); // 第一行必须写一些常量
	String name="";
	private Season(String name){   //构造方法必须私有
		this.name = name;
	}
	public String getname(){
		return name;
	}
}
