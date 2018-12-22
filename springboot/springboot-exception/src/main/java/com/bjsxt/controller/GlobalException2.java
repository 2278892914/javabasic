package com.bjsxt.controller;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * 通过SimpleMappingExceptionResolver做全局处理异常
 * 缺点是：不能返回异常信息
 *
 */
@Configuration
public class GlobalException2 {
	
	/**
	 * 该方法必须有返回值，返回值类型必须是SimpleMappingExceptionResolver
//	 */
//	@Bean
//	public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
//		SimpleMappingExceptionResolver sr = new SimpleMappingExceptionResolver();
//		Properties mappings = new Properties();
//		
//		/*
//		 * 参数一：异常的类型，必须是异常类型的类全名 
//		 * 参数二：视图名称
//		 */
//		mappings.put("java.lang.ArithmeticException", "error2");
//		/*
//		 * 设置异常与视图映射信息
//		 * 此方法存入的类型必须是Properties类型的,因此创建一个Properties对象用来存放异常的映射信息
//		 */
//		sr.setExceptionMappings(mappings);
//		return sr;
//		
//	}
	

}
