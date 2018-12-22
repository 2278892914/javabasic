package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 热部署方式一 ： 利用一个jar包启动一个项目
 * @author HP
 *
 */
@Controller
public class UsersController {

	@RequestMapping("/show22")
	public String showPage(){
		System.out.println("ShowPage.....");
		return "index";
	}
}