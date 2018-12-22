package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling         //启动定时器
public class App {


	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
	}
	
}
