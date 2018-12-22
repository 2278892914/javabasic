package com.bjsxt.quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.bjsxt.service.ServiceQuartz;
/**
 *定时任务类 
 */
public class QuartzDemo implements Job{
 
	/*
	 * 因为在这个过程之中，原码是通过反射的机制来创建对象的，所以创建好的对象不是在springioc容器当中的
	 * 因此会报一个空指针异常，原码就是通过反射创建的对象直接返回
	 * 解决的办法就是手动重写原码的方法，然后将创建好的对象手动放置到springioc容器当中
	
	 */
	//@Autowired
	 ServiceQuartz service = new ServiceQuartz();
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		service.aaa();
		System.out.println("被触发le"+new Date());
	}

}
