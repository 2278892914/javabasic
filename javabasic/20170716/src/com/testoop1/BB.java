package com.testoop1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BB {

	public static void main(String[] args) throws ParseException {
		List<String> list = new ArrayList<String>();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = df.format(new Date());
		System.out.println(time);
		String dstr="2019-06-08 00:00:00 ";
		java.util.Date date=df.parse(dstr);
		long  s1=date.getTime();//将时间转为毫秒
		long s2=System.currentTimeMillis();//得到当前的毫秒
		int  distance=(int) ((s1-s2)/1000/60/60/24);
		System.out.println(distance);
	}
}
