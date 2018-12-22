package com.net;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestNet1 {
	public static void main(String[] args) {
		
		try {
			InetAddress i = InetAddress.getByName("www.mi.com");
			String s = i.getHostAddress();
	
			System.out.println(s);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
