package com.bjsxt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

import com.bjsxt.quartz.QuartzDemo;
import com.bjsxt.service.MyAdaptableJobFactory;

@Configuration     //整合springboot
public class QuartzConfig {

	/**
	 * 创建job对象
	 */
	@Bean
    public JobDetailFactoryBean jobDetailFactoryBean(){
		JobDetailFactoryBean factory = new JobDetailFactoryBean();
		//关联我们自己的job类
		factory.setJobClass(QuartzDemo.class);
		return factory;
	}
	/**
	 * 2:创建Trigger对象
	 */
	@Bean
	public SimpleTriggerFactoryBean  simpleTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
		SimpleTriggerFactoryBean factory = new SimpleTriggerFactoryBean();
		//关联JobDetail对象-
		factory.setJobDetail(jobDetailFactoryBean.getObject());
		//该参数表示执行的一个毫秒数
		factory.setRepeatInterval(2000);
		//重复的次数
		factory.setRepeatCount(20);
		
		return factory;
	}
	@Bean
	public CronTriggerFactoryBean cronTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
		CronTriggerFactoryBean factory = new CronTriggerFactoryBean();
		//关联job
		factory.setJobDetail(jobDetailFactoryBean.getObject());
		factory.setCronExpression("0/2 * * * * ?");
		return factory;
	}
	
	/**
	 * 3:创建Scheduler对象
	 */
	
	@Bean
	public SchedulerFactoryBean schedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBean){
		SchedulerFactoryBean factory = new SchedulerFactoryBean();
		//关联trigger对象
		factory.setTriggers(cronTriggerFactoryBean.getObject());
		//factory.setJobFactory(myAdaptableJobFactory);
		return factory;
	}
	
	
	
}

