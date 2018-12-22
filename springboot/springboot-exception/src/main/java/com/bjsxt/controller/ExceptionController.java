package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {

	/*
	 * 异常处理一：通过默认的页面返回错误的信息，默认的页面为error.html,在src/main/resources/templates
	 */
	@RequestMapping("/show1")
	public String show(){
		
		int sdsd = 10/0;
		return "index";
	}
	@RequestMapping("/show2")
	public String show2(){
		String sr = null;
		sr.length();
		return "index";
	}
	/*
	 *异常处理2：通过注解.value值为一个数组，里面的值可以存放多个异常
	 *返回的必须是一个 modelandview对象，此对象可以存放返回错误的信息，以及视图的跳转名称
	 *缺点就是不能实现代码的复用，耦合度高
	 */
	/*@ExceptionHandler(value={java.lang.ArithmeticException.class})
	public ModelAndView arithmeticException(Exception e){
		ModelAndView mv = new ModelAndView();
		mv.addObject("error", e.toString());
		mv.setViewName("error2");
		return mv;
	}*/
	
	
	
	
}
