package com.bjsxt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.bjsxt.pojo.Users;

public interface UsersRepositoryQueryAnnotation extends JpaRepository<Users,Integer>{

	
	/*@Query("from Users where name = ? ")   //springdata当中的hql语句
	List<Users> queryByNameUseHQL(String name);*/
	
	//使用sql语句
	@Query(value="select * from t_users where name=?",nativeQuery=true)  
	List<Users> queryByNameUsesql(String name);
	@Query(value="update t_users set name = ? where id= ?",nativeQuery=true)
	@Modifying  //需要执行一个更新操作
	void updateUsers(String name,Integer id);
}
