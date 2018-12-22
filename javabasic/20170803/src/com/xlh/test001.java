package com.xlh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class test001 {


/**
 * 转换流：将按字节流转换为按字符流读取数据，并可以指定编码格式
 */

	public static void main(String[] args) {
		//定义字节输入流和字符输入流,将字节输入流转换为字符输入流
		FileInputStream fis=null;
		InputStreamReader isr=null;
		try {
			//先利用字节流读文件
			fis=new FileInputStream("d:/hello.txt");
//			byte[] b=new byte[3];
//			fis.read(b);
//	
//			//将字节流转换为字符流，同时指定解码格式
//			if(b[0]==-17&&b[1]==-69&&b[2]==-65){
				isr=new InputStreamReader(fis,"utf-8");
//				
//			}else{
//				isr=new InputStreamReader(fis,"GBK");
//			}
			//利用转换后的字符输入流来输出内容
			char[] c=new char[3];
			int len=0;
			while((len=isr.read(c))!=-1){
				for(int i=0;i<len;i++){
					System.out.print(c[i]);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
