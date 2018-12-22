package com.bjsxt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.bjsxt.pojo.Users;
/*
 * 该接口只要是提供了多条件的查询的支持，并且可以在查询中
 * 添加分页与排序 注意:JPASpecificationExecutor是单独存在，完全的独立
 * 
 * 两个接口配合使用，开发中最为常用的
 */
public interface UsersJPASpecification 
extends JpaRepository<Users,Integer>,JpaSpecificationExecutor<Users>{

	
	
	
	
}
