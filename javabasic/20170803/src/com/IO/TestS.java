package com.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 切割文件
 */
public class TestS {
	public static void main(String[] args) {
		File file1 = new File("H:/迅雷下载/战狼.mp4");
		long l = file1.length();
		long d = 200*1024*1024;
		long sum=0;
		if(l%d==0){
			 sum = l/d;
		}else{
			 sum=l/d+1;
		}
		InputStream s = null;
		OutputStream o = null;
		try {
			s=new FileInputStream("H:\\迅雷下载\\战狼.mp4");
				byte[] b = new byte[1024*1024];
				int len=0;
				for(int i=1;i<=sum;i++){
					o=new FileOutputStream("F:/电影"+i+".mp4");
					long count =0;
					while((len=s.read(b))!=-1){
						count = count+len;
						o.write(b,0,len);
					if(count>200*1024*1024){
						break;
					}
					}
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
			
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
