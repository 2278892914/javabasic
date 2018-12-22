package com.useful1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 实用类测试日期
 * 
 */
public class TestSimpleDateFormat {
	
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date=format.format(new Date());  //将日期转换为字符串
		System.out.println(date);
		//将字符串转换为日期  调用的是format.parse()方法
		String s = "2017-07-28 09:41:12";
		try {
			Date d =format.parse(s); 
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
