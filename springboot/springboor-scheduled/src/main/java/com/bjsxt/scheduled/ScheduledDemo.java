package com.bjsxt.scheduled;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*
 * Scheduled定时任务
 * 
 * 
 */
@Component
public class ScheduledDemo {

	/*
	 * 定时任务方法
	 * @Scheduled:设置定时任务
	 * cron:cron表达式：    定时任务触发时间的一个字符串表达式
	 * 
	 *  
	 * 
	 */
	@Scheduled(cron="0/2 * * * * ?")
	public void scheduledMethod(){
		System.out.println("定时器被触发"+new Date());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
