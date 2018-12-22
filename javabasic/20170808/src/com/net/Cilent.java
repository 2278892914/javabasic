package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cilent {

	
	public Cilent(){
		try {
			Scanner input=new Scanner(System.in);
			String message=null;
			do{
			//通过Socket对象请求服务端进行连接的建立
			Socket sk=new Socket("192.168.43.194",10001);
			System.out.println("请对服务端说：");
			message=input.next();
			//通过Socket对象建立输入流对象
			InputStream is=sk.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			char[] c=new char[1024];
			int len=0;
			while((len=isr.read(c))!=-1){
				System.out.println(new String(c,0,len));
			}
			//创建输出流对象
			OutputStream os=sk.getOutputStream();
			PrintWriter  pw=new PrintWriter(os,true);
			pw.println(message);
			sk.shutdownOutput();
			pw.close();
			isr.close();
		  }while(!message.equals("quit"));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Cilent c=new Cilent();
	}
}
