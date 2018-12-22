package com.bjsxt.service;

import java.util.List;

import com.bjsxt.pojo.Users;

public interface UsersService {

	int findcount();
	List<Users> findAll();
	void save(Users users);
}
