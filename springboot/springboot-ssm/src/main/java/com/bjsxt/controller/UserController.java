package com.bjsxt.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;


@Controller
public class UserController {

	@Autowired
	private UsersService service;
	@RequestMapping("/show")
	public String show(Model model){
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		List<Users> list = this.service.selectUser();
		model.addAttribute("list", list);
		return "index";
	}
	@RequestMapping("addUser")
	public String add(@ModelAttribute("aa")  Users users){
		return "index2";
	}
	@RequestMapping("/save")
	public String save(@ModelAttribute("aa")   @Valid Users users,BindingResult result){
		System.out.println(users);
		System.out.println(12);
		if(result.hasErrors()){
			System.out.println(13);
			return "index2";
		}
			
			System.out.println("zjemhgqu");
			return "OK";
		
	}
	
}
