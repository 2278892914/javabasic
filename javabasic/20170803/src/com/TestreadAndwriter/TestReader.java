package com.TestreadAndwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

/*
 * 字符流，以字符为单位读取和写入数据
 * reader:字符输入流
 * writer：字符输出流
 */
public class TestReader {
	
	public static void main(String[] args) {
		System.out.println(Charset.defaultCharset());
		//System.out.println(Char);
		try {
			Reader r = new FileReader("D:/hello.txt");
			char[] c = new char[2];
			int len=0;
			while((len=r.read(c))!=-1){
				for(int i=0;i<len;i++){
					System.out.println(c[i]);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
