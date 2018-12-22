package com.useful2;

import org.junit.Test;

/*
 * StringBuffer:一个可变的线程安全字符串
 * StringBuilder:代表一个可变的线程不安全字符串
 * 赋值必须得通过创建对象类进行赋值
 * 常用方法如下
 * 1:append():将指定的字符串追加到原字符串的末尾
 * 2：insert():在指定赋的位置插入字符（串）
 * 3：delete():删除指定位置或者某个区间内的字符串
 */
public class TestStringBuffer {
	//追加字符串
	@Test
	public void add(){
		StringBuffer s = new StringBuffer("abc");
		//追加
		s.append("def");
		s.append("gh");
		System.out.println(s);
	}
	
	//指定位置插入字符串
	@Test
	public void testinsert(){
		StringBuffer s = new StringBuffer("abc");
		s.insert(1, "er");
		System.out.println(s);
	}
	//删除
	@Test
	public void testdelete(){
		StringBuffer s = new StringBuffer("abcefg");
		s.delete(1, 3);   //不含有3
		System.out.println(s);
	}
	

}
