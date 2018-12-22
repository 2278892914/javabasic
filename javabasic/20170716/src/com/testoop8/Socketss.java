package com.testoop8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class Socketss {

	private static Map<String,String> map = new HashMap<String,String>();
	//初始化
	public static void init(){
		map.put("jpg", "image/jpeg");
		map.put("ppg", "image/png");
		map.put("html", "text/html");
		map.put("txt", "text/plain");
	}
	
	public static String getContentType(String key){
		return map.get(key);
	}
	
	//资源找不到， 为404错误
	public static void responseError(OutputStream os){
		String  msg = "你查看的资源找不见";
		try{
			os.write("HTTP/1.1 404 ERROR\r\n".getBytes());
			os.write("Content-Type:text/html\r\n".getBytes());
			os.write("Date:Tue,27 Mar 2018  11:02:08 GMT\r\n".getBytes());
			os.write("Server:YS-IT/1.1\r\n".getBytes());
			os.write(("Content-Length:"+(msg.getBytes().length)+"\r\n").getBytes());
			os.write("\r\n".getBytes());
			os.write(msg.getBytes());
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	//正确响应的文件 200
	public static void responseOK(OutputStream os,File file){
		String  fname = file.getName();
		try{
			String type = fname.substring(fname.lastIndexOf(".")+1);
			FileInputStream fis = new FileInputStream(file);
			os.write("HTTP/1.1 200 OK\r\n".getBytes());
			os.write("Content-Type:text/html\r\n".getBytes());
			os.write("Date:Tue,27 Mar 2018  11:02:08 GMT\r\n".getBytes());
			os.write("Server:YS-IT/1.1\r\n".getBytes());
			os.write(("Content-Length:"+(file.length())+"\r\n").getBytes());
			os.write("\r\n".getBytes());
			int t = 0;
			while((t=fis.read())!=-1){
				os.write(t);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		init();
		ServerSocket server = new ServerSocket(8888);
		boolean b = true;
		String inf = null;
		while(!(msg=br.readLine()).equals("")){
			if(b){
				info = msg;
				b = false;
				
			}
		}
		String[] s = info.split(" ");
		String[] ss = s[1].split("\\?");
		OutputStream os = =socker.getoutputStream();
		if(ss.length>1){
			String [] params = ss[1].split("=");
			Claas.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/test","root","root");
			PreparedStatement pre = conn.prepareStatement("select * from user where id=?");
			pre.setInt(1, Integer.parseInt(params[1]));
			ResultSet rs = pre.executeQuery();
			String respmsg = "";
			if(rs.next()){
				respmsg = "<span style='color:green'>学号："+rs.getString("id")+"</span><br/>"
						+"<span style='color:green'>姓名："+rs.getString("id")+"</span><br/>"
						+"<span style='color:green'>性别："+rs.getString("id")+"</span><br/>"
						+"<span style='color:green'>年龄："+rs.getString("id")+"</span><br/>";
			}
		}
		
		while(true){
			Socket  socket = server.accept();
				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os);
				File file = new File("d:/a.jpg");
				FileInputStream fis = new FileInputStream(file);
				pw.write("HTTP/1.1 200 OK\r\n");
				pw.write("Content-Type:image/jpeg;charset=utf-8\r\n");
				pw.write("Date:Tue,27 Mar 2018  11:02:08 GMT\r\n");
				pw.write("Server:YS-IT/1.1\r\n");
				pw.write("Content-Length:"+file.length()+"6\r\n");
				pw.write("\r\n");
				//pw.write("hello");
				int t=0;
				while((t=fis.read())!=-1){
					pw.write(t);
				}
				pw.flush();
				pw.close();
				os.close();
			
			}
		
		}
		
}
