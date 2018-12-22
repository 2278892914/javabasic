package com.TestreadAndwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/*
 * 字符输出流: 将字符写入到目标文件
 * 
 * 先将数据写入到缓冲区(如果缓冲区被塞满，则将数据写入到目标文件)，否则需要调用flush（）方法（强制将缓冲区内容写入到目标文件，
 * 同时清空（刷新）缓冲区），才能将数据写入到目标文件，或者在关闭流 的时候，在程序内部自己调用flush方法
 * 也可调用finally关闭流,达到将缓冲区的文件写入到目标文件
 * 
 * 
 */
public class TestWriter {
	public static void main(String[] args) {
		
		//检查虚拟机的默认编码
		System.out.println(Charset.defaultCharset());
		Reader r = null;
		Writer w = null;
		try {
			r = new FileReader("d:/hello.txt");
			w = new FileWriter("f:/aa.txt");
			char[] c = new char[512];
			int len=0;
			while((len=r.read(c))!=-1){
				
					w.write(c,0,len);
					w.flush();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				r.close();
				w.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
