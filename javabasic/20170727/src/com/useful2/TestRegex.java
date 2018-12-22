package com.useful2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 正则表达式：使用特殊字符定义的逻辑字符串
 * 
 * 给出目标字符串和正则表达式，能够实现的功能:
 * 
 * 1: 匹配目标字符串是否符合正则表达式
 * 2: 在目标字符串中利用正则表达式提取字符串
 *
 */
public class TestRegex {

	//匹配
	@Test
	public void testMatch(){
		//String reg="ba?"; //正则
		//String reg="^\\.a*"; //正则: 以 .开头，后面可以是0个a或者多个a
		//String reg="a|b|c"; //正则: a b c三项中的某一项
		//String reg="a{5}"; //正则: a 必须出现5次
		//String reg="a{1,3}"; //正则: a 可以出现 1到3次
		//定义正则：要求必须以1开头，共11位，必须是数字的电话号码
		//String reg="^1\\d{10}"; //正则: 
		//验证邮箱    xxx@xxx.com
		//String reg="\\w+@((qq)|(163)|(sina))\\.((com)|(cn))"; //正则: 
		String reg="[0-9A-Za-z]+@((qq)|(163)|(sina))\\.((com)|(cn))"; //正则: 
		String user="abc123@qq.com";
		//使用String类中的matches()方法匹配正则
		boolean b=user.matches(reg);
		System.out.println(b);
	} 
	
	//查找（提取）
	/**
	 * 使用pattern和matcher对象匹配正则表达式字符串
		步骤一：将正则表达式封装成Patter对象
		步骤二：将正则对象（Patter对象）与要操作的字符串进行相关联
		步骤三：关联后，产生正则表达式引擎（Matcher对象）
		步骤四：使用引擎对象对符合正则表达式规则的字符串进行操作，例如匹配和提取
	 */
	@Test
	public void check(){
		String user="西安邮电我的第一个电话：15829087216,我的第二个电话15729087345";
		//需求：在上述字符串中提取出所有电话号码
		Matcher m = Pattern.compile("(15\\d)\\d{8}").matcher(user);
		while(m.find()){
			System.out.println(m.group());
		}
	}
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	

