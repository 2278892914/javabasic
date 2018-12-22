package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
	public static void main(String[] args) {
		try {
			URL ur = new URL("https://www.taobao.com/");
			HttpURLConnection hp = (HttpURLConnection) ur.openConnection();
			InputStream is = hp.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			char[] c = new char[1024];
			int len=0;
			while((len=isr.read(c))!=-1){
				System.out.println(new String(c,0,len));
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
