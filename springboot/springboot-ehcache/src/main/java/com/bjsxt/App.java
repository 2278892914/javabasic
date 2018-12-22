package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching        //添加缓存启动器
public class App {
	public static void main(String[] args) {

		SpringApplication.run(App.class, args);
	}
}
