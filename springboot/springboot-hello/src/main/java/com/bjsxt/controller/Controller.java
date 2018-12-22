package com.bjsxt.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Controller {

	/**
	 * 文件上传
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping("/fileupload")
	public Map<String,Object> fileupload(MultipartFile filename) throws IllegalStateException, IOException{
		Long a = System.currentTimeMillis();
		System.out.println(filename.getOriginalFilename());
		filename.transferTo(new File("f:/"+filename.getOriginalFilename()));
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("msg", "文件已经上传成功");
		Long b = System.currentTimeMillis();
		System.out.println("上传文件所需的时间为:"+(b-a));
		return map;
		
	}
}
