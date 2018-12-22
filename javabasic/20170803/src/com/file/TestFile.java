package com.file;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

/*
 * File : java提供了与平台无关的操作文件或者目录的工具类
 * 无法访问文件内容
 */
public class TestFile {
	
	//创建目录
	@Test
	public void TestcreateDir(){
		File file = new File("f:/西安/音乐");
		file.mkdirs();
	}
	
	//获取文件名和大小
	@Test
	public void test(){
		File file = new File("F:/java");
		System.out.println("文件"+file.getName()+"大小"+file.length());
		file.delete();
		
	}
	//访问某个目录的子目录及其文件
	@Test
	public void fun1(){
		
		File file = new File("D");
		String[] s = file.list();
		for(String s1:s){
			System.out.println(s1);
		}
		
	}
		public static void main(String[] args) {
		File file = new File("c:/西安.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
