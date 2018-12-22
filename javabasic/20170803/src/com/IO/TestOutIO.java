package com.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutIO {
/*
 * OutputStream：字节输出流，作用，负责释放内存（程序）中程序写入到目标文件
 * 
 */
	public static void main(String[] args) {
		try {
			OutputStream o = new FileOutputStream("F:/文件.txt");
			byte[] b = new byte[]{97,98,99,100};
			o.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
