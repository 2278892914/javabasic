package com.testswing;

/**
 * String.intern方法的作用：如果字符串常量池中已经包含了一个等于此String对象的字符串，
 * 则返回常量池中这个字符串的String对象的引用
 * 否则，将此String对象包含的字符串添加到常量池中，并且返回此String对象的引用
 * 
 */
public class Heap {

	
	public static void main(String[] args) {
//		String str1 = new StringBuilder("计算机").append("软件").toString();
//		System.out.println(str1.intern()==str1);
//		
		
		String str2 = new StringBuilder("ja1").append("va").toString();
		System.out.println(str2.intern()==str2);
		
		
		String str3 = new StringBuilder("ja1").append("va").toString();
		System.out.println(str3.intern()==str3);
	}

		                                
	
}
