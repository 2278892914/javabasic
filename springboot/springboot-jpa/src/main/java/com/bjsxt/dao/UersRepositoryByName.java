package com.bjsxt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjsxt.pojo.Users;
/*
 * 此接口是在开发当中最为常用的一个接口，该接口继承了PagingAndSorting接口
 * 对继承的父接口的返回值做了一个适配
 */
public interface UersRepositoryByName extends JpaRepository<Users,Integer>{
     //方法的名称必须遵循驼峰式命名规则，具体构成：关键字findBy+属性名称大写
	List<Users> findByName(String name);
}
