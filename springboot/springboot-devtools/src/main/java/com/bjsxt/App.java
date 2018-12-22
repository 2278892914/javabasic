package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 *SpringLoader：SpringLoader在部署项目时使用的是热部署的方式。
  DevTools：DevTools在部署项目时使用的是重新部署的方式
 *
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
	}
}
