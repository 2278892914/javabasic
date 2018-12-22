package com.useful2;

import org.junit.Test;

/*
 * String :不可变的字符串
 * 字符串的用法
 */
 
public class TestString {
	@Test
	
	public void testCharAt(){
	String s = "acbd";
	char c = s.charAt(2);
	System.out.println(c);
	String user = "ab12男女cd";
	int count=0;
	for(int i=0;i<user.length();i++){
		if(user.charAt(i)>='0'&&user.charAt(i)<='9'){
			count++;
		}
	}
	System.out.println(count);
	
	}
	//提取字字符串
	@Test
	public void testSubString(){
		String s = "abcdefghijk";
		String s1=s.substring(0, s.length());
		System.out.println(s1);
		
	}
	//比较字符串的内容
	@Test
	public void testequals(){
		String s1 = "abcd";
		String s2= "abcd";
		if(s1.equals(s2)){
			System.out.println("相等");
		}
	}
	//判断母串中是否包含指定的子串
	@Test
	public void testContains(){
		String s = "abcdef";
		String s1= "cde";
		boolean b =s.contains(s1);
		System.out.println(b);
		
	}
	
	//查找子串的手字符在原来字符串中第一次出现的位置，存在则返回索引，不存在则返回-1
	@Test
	public void testIndexof(){
		String s = "abcdefgh";
		String s1 = "bcd";
		int i = s.indexOf(s1);
		System.out.println(i);
		
	}
	@Test    //拆分字符串
	public void testSplit(){
		String s = "西安.jpg";
		String[] value=s.split("\\.");   //注意是两个\\
		if(value[value.length-1].equals("jpg")){
			System.out.println("正确");
		}
		else{
			System.out.println("错误");
		}
	}
	//替换字符串
	@Test
	public void testreplace(){
		String s = "西安邮电“大学";
		String d = s.replace("邮电", "石油").replaceAll("“", "\"");
		System.out.println(s);   //原字符串仍旧不变
		System.out.println(d);
		
	}
	//转换大小写
	@Test
	public void testUpperOrLower(){
		String s = "abcdef";
	
		String s1 = s.toUpperCase();
		System.out.println(s1);
		
		
	}
	
	

}
