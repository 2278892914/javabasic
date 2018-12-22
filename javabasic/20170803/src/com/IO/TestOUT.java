package com.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//42677    42676
public class TestOUT {

	public static void main(String[] args) {
		long c1 = System.currentTimeMillis();
		InputStream s = null;
		OutputStream o = null;
		BufferedInputStream bs = null;
		try {
			s = new FileInputStream("H:/迅雷下载/战狼.mp4");
			bs = new BufferedInputStream(s);
			o = new FileOutputStream("D:/战狼.mp4");
			byte[] b = new byte[8192];
			int temp = 0;
			while ((temp = bs.read(b)) != -1) {

				o.write(b, 0, temp);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				o.close();
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long c2 = System.currentTimeMillis();
		System.out.println(c2 - c1);
	}
}
