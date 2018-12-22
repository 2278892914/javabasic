package com.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestAdd {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			//遍历所要合并的元素
			for(int i=1;i<=5;i++){
				is = new FileInputStream("F:/电影"+i+".mp4");
				//保证合并后的视频依次累加，而不覆盖，选用true
				os=new FileOutputStream("H:/电影.mp4",true);
				int len =0;
				byte[] b = new byte[1024];
				int count =0;
				//输出所读写到的内容
				while((len=is.read(b))!=-1){
					count = count + len;
					os.write(b);
					//不需要加循环条件，每次读取的都是一个视频
//					if(count>201*1024*1024){
//						break;
//					}
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
				os.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
