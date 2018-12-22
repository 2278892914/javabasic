package com.useful;

import java.io.IOException;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws IOException {
	Runtime r =Runtime.getRuntime();
		String ss=Season.fall.name;
		System.out.println(ss);
		Date d = new Date();
		d.getYear();
		d.getMonth();
		d.getDay();
		d.getHours();
		d.getMinutes();
		d.getSeconds();
		r.exec("H:\\360Downloads\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
	}
}
