package com.exception;

public class AgeException extends Exception{
	
	
	private String message="年龄输出错误";
	public String getMessage(){
		return message;
	}
}
