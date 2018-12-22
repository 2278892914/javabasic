package com.xlh;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PushbackInputStream;

import org.junit.Test;

/*
 * 序列化：将一个对象（包含其属性和值）转换为二进制存储于磁盘，以便于进行传输
 * 
 * 序列化时候将属性私有transient
 * 反序列化：从磁盘中读取二进制文件在转换为对象的过程称之为反序列化
 * 
 * java中实现序列化的步骤
 * 1：将对象实现Serializable接口
 * 2：利用ObjectOutputStream（对象流）中的writeObject方法将对象保存于磁盘的文件之中
 * 
 * java中反序列化的步骤
 * 利用ObjectInputStream（对象输入流）读取二进制文件在转化为对象
 */
public class TestXLH {
	@Test  //反序列化
	public void fun(){
		try {
			ObjectInputStream os = new ObjectInputStream(new FileInputStream("d:/hello.txt"));
			//序列化之后将取出的数组对象转化为student类型
			Student s = (Student)os.readObject();
			System.out.println(s.name+"  "+s.add+"  ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		//序列化
		try {
			//字节输入流的处理流，无法直接连接到物理文件上
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("d:/hello.txt"));
			Student s =new Student();
			o.writeObject(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

//package com.xlh;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.PushbackInputStream;
//
//public  class Test {
//	public static void main(String[] args) {
//		String s = "www.java.com";       //定义字符串
//		PushbackInputStream push = null;    //定义回退流对象
//		ByteArrayInputStream b = null;        //定义内存输入流
//		b = new ByteArrayInputStream(s.getBytes());  //实例化内存输入流
//		push  = new PushbackInputStream(b);    //从内存中读取数据
//		
//		System.out.println("读取之后的数据为:");
//		int temp =0;
//		try {
//			while((temp=push.read())!=-1){   //读取内容
//				if(temp=='.'){
//					push.unread(temp);   //放回缓冲区
//					
//					temp = push.read();  //在读一遍
//				}else{
//					System.out.print((char)temp );
//				}
//				
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//}
//
//
