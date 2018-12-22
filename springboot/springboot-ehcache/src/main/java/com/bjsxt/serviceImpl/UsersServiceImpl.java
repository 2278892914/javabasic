package com.bjsxt.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bjsxt.dao.UsersRepository;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersRepository usersRepository;

	/*
	 * 缓存的时候采用的是key和value   生成一个key值指向缓存的对象   默认的key为：当前的参数对象
	 */
	@Override
	@Cacheable(value="users")   //把方法的返回值添加到Ehcache当中作为缓存，value属性为自定义的缓存策略
	public int findcount() {
		
		return (int) usersRepository.count();
	}

	/*
	 *@CacheEvit作用：清楚缓存
	 *
	 *
	 */

	@Override
	@Cacheable(value="users")   //使用缓存
	public List<Users> findAll() {
		
		return usersRepository.findAll();
	}

	/*
	 * @CacheEvict(value="users", allEntries=true)
	 * 是清楚缓存当中以users缓存策略的对象
	 */
	@Override
	@CacheEvict(value="users", allEntries=true)
	public void save(Users users) {
		
	}

	
	
	

	
}
