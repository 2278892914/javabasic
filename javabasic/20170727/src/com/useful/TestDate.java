package com.useful;

import java.io.IOException;
import java.util.Date;
/*
 * date : 日期类
 */
public class TestDate {
//	//获取年份
//	int year=date.getYear()+1900;
//	System.out.println(year);
//	//获取月份
	
//	int month=date.getMonth()+1;
//	System.out.println(month);
	public static void main(String[] args) throws IOException {
		
		while(true){
			Date d = new Date();
	
			String s = d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
			System.out.println("当前时间为："+s);
			if(s.equals("23:38:40")){
				Runtime r = Runtime.getRuntime();
				
				r.exec("H:\\360Downloads\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
				break;
			}
			
			
		}
	}
}
