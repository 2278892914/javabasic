package com.printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.junit.Test;
/*
 * 字符打印流
 * 
 */
public class TestPrintWriter {
	@Test
	public void fun(){
		//自动刷新，把PrintWriter当成一个处理流嫁接到字节流之上，然后在调用true方法
		//注意不能直接实例化PrintWriter,将目标文件直接连接在目标文件
		//应该先创建一个输出流，将打印流嫁接在打印流之上，后面跟上true，完成自动刷新
		try {
			FileOutputStream f = new FileOutputStream("d:/a.txt");
			PrintWriter p = new PrintWriter(f,true); 
			p.println("你好世界");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//     手动刷新,,,,直接调用flush方法，并且在printwriter流当中使用
		try {
			PrintWriter p = new PrintWriter("D:/aaa.txt ");
			p.println("niahoshijei");
			p.flush();  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
