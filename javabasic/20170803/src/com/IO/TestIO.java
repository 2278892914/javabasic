package com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * java中流的分类
 * 按照方向划分为：输入流和输出流
 * 
 * 按照对文件的处理单元划分为：字节流和节点流
 * 按照功能角色划分：节点流和处理流
 * 节点流：可以直接嫁接在某个物理文件上
 * 处理流：（也叫装饰流）不可以直接嫁接在某个物理文件上，但是可以直接嫁接在节点流上
 * 
 * java流的四个顶层抽象类
 * 1：InputStream:字节输入流(以字节为单位从文件中读取数据)
 * 2：OutputStream:字节输出流(以字节为单位向目标文件中写入数据)
 * 3：Reader:字符输入流(以字符为单位从原文件中读取数据)
 * 4：Writer：字符输出流(以字符为单位向目标文件中写入数据)
 * 
 */
public class TestIO {
	
			
	public static void main(String[] args) {
		InputStream is =null;
			try {
				is = new FileInputStream("F:/文件.txt");
				byte[] b = new byte[3];
				int len=0;   //保存读取到的实际字节数
				while((len=is.read(b))!=-1){
					for(int i=0;i<len;i++){
						System.out.print((char)b[i]);
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {     //关闭文件
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
