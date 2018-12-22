package com.bjsxt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjsxt.pojo.Users;
                                                      //映射的实体类型   主键的类型
/*
 * 运用正向工程
 * 
 */
public interface UsersRepository extends JpaRepository<Users,Integer>{

}
