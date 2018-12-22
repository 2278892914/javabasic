package com.printstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;

import org.junit.Test;

public class TestPrintStream {
	@Test
	public void test(){
		
		try {
			Reader f = new FileReader("d:/hello.txt");
			PrintWriter p = new PrintWriter("f:/aa.txt");
			int len=0;
			char[] c = new char[5];
			while((len=f.read(c))!=-1){
				p.print(new String(c,0,len));
				p.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		try {
			System.setOut(new PrintStream("d:/b.txt"));
			PrintStream p = new PrintStream("d:/b.txt");
			p.println("asdsd");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
