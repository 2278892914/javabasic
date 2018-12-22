package com.bjsxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;

@Service
public class UsersImpl implements UsersService{

	@Autowired
	private UsersMapper usersMapper;
	@Override
	public List<Users> selectUser() {
		
		return this.usersMapper.selectUser();
	}

}
