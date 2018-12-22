package com.bjsxt.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThmeleafController {

	@RequestMapping("/show1")
	public String show(Model model){
		model.addAttribute("key", "thmeleaf的第一个案列");
		model.addAttribute("date",new Date());
		return "index1";
	}
	@RequestMapping("/show2")
	public String show2(Model model){
		List<String> list = new ArrayList<String>();
		list.add("回忆总是泪");
		list.add("纸短情长");
		list.add("爱你不是三两天");
		model.addAttribute("list",list);
		return "index2";
	}
	//URL表达式的处理
	@RequestMapping("/{page}")
	public String show3(@PathVariable String page){
		return page;
	}
}
