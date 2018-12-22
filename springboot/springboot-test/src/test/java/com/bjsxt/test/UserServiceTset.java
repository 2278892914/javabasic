package com.bjsxt.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjsxt.App;
import com.bjsxt.service.UserService;

/**
 * springboot测试类
 * @RunWith 启动器
 *SpringJUnit4ClassRunner.class让junit与springboot整合
 *@SpringBootTest(classes={App.class) 可以启动多个启动器
 *1:当前类为springboot的测试类
 *2：加载springboot启动器，启动springboot启动器 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={App.class})
public class UserServiceTset {
	
	@Autowired
	private UserService userService;
	@Test
	public void testuser(){
		userService.save();
	}
 
	
	
}
