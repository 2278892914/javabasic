package com.bjsxt.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjsxt.App;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=App.class)
public class UserServiceTset {

	@Autowired
	private UsersService usersService;
	/*
	 * 测试使用缓存
	 */
	@Test
	public void testfinaAll(){
		System.out.println(usersService.findcount());
		System.out.println(usersService.findcount());
	}
	/*
	 * 测试清楚缓存
	 */
	@Test
	public void findAll(){
		//第一次查询
		System.out.println(usersService.findAll().size());
		//第二次查询
		System.out.println(usersService.findAll().size());
	}
	
}
