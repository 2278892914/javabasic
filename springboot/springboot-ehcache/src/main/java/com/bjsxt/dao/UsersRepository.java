package com.bjsxt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bjsxt.pojo.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
