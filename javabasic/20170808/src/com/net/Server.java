package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * Socket锛� 濂楁帴瀛楋紝鍩轰簬TCP/IP鍗忚杩涜缃戠粶缂栫▼鐨勫伐鍏风被
 * ServerSocket锛� 璁剧疆搴旂敤绋嬪簭涓烘湇鍔＄
 * 
 */
public class Server {

	public Server(){
		try {
			Scanner input=new Scanner(System.in);
			String s=null;
			//设置应用程序为服务端
			ServerSocket ss=new ServerSocket(10001);
			do{
			
			//通过accept()监听来自客户端的请求
			//创建输出流对象
			OutputStream os=null;
			//将字节输出流转换为打印流
			PrintWriter pw=null;
			while(true){
				Socket sk=ss.accept();
				os=sk.getOutputStream();
				pw=new PrintWriter(os,true);
				System.out.println("建立成功,来自客户端的ip："+sk.getInetAddress().getHostAddress());
				pw.println(s);
				sk.shutdownOutput();//关闭一端的输出流，将Socket中标记位置于流的末尾
				//sk.close();//与当前客户端断开连接
				//pw.close();
				InputStream is=sk.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				char[] c=new char[1024];
				int len=0;
				while((len=isr.read(c))!=-1){
					System.out.println("建立成功,来自客户端的ip："+sk.getInetAddress().getHostAddress()+"说："+new String(c,0,len));
				}
				
				System.out.println("请对客户端说：");
				s=input.next();
			}
			}while(!s.equals("quit"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Server s = new Server();
	}
	
}
