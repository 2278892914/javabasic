package com.bjsxt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjsxt.dao.UserImpl;

@Service
public class UserService {

	@Autowired
	private UserImpl userImpl;
	public void save(){
		userImpl.saveUser();
	}
}
