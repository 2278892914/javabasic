package com.datastucure01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class testio {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("F:/测试.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
		String temp = null;
		while((temp=reader.readLine())!=null){
			System.out.println(temp);
		}
	}
}
