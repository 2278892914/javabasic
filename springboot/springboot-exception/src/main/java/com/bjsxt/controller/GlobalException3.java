package com.bjsxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 通过实现HandlerExceptionResolver接口处理异常
 *
 */
@Configuration
public class GlobalException3  implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception ex) {
		ModelAndView mv = new ModelAndView();
		//判断不同类型异常，做视图跳转
		if(ex instanceof ArithmeticException){
			mv.addObject("error", ex.toString());
			mv.setViewName("error2");
		}
		if(ex instanceof NullPointerException){
			mv.addObject("error", ex.toString());
			mv.setViewName("error3");
		}
		return mv;
	}

}
