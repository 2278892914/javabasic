package com.bjsxt.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 *全局处理异常类
 *其实就是第二种方法的简化，就是将第二种处理异常的方法统一放在一个类当中，可以实现异常处理的复用 
 *
 */

@ControllerAdvice
public class GlobalException {

	/*@ExceptionHandler(value={java.lang.ArithmeticException.class})
	public ModelAndView arithmeticException(Exception e){
		ModelAndView mv = new ModelAndView();
		mv.addObject("error", e.toString());
		mv.setViewName("error2");
		return mv;
	}*/
}
