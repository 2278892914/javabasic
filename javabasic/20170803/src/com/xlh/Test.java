package com.xlh;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.PushbackReader;

public  class Test {
	public static void main(String[] args) throws FileNotFoundException {
//		String s = "www.java.com";       //定义字符串
//		PushbackInputStream push = null;    //定义回退流对象
//		ByteArrayInputStream b = null;        //定义内存输入流
//		b = new ByteArrayInputStream(s.getBytes());  //实例化内存输入流
//		push  = new PushbackInputStream(b);    //从内存中读取数据
		PushbackReader push = new PushbackReader(new FileReader("www.java.com"));
		char[] c = new char[10];
		System.out.println("读取之后的数据为:");
		int temp =0;
		try {
			while((temp=push.read(c))!=-1){   //读取内容
				if(temp=='.'){
					push.unread(temp);   //放回缓冲区
					
					temp = push.read();  //在读一遍
				}else{
					System.out.print((char)temp );
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
