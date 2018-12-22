package com.bjsxt.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bjsxt.pojo.Users;
/*
 * 此接口集成了CrudRepository接口，因此可以调用CrudRepository当中的方法
 * 这个接口只要是用来实现排序和分页的操作
 * 只能对所有的数据进行分页和排序，不能加条件
 */
public interface UsersRepositoryPagingAndSorting extends PagingAndSortingRepository<Users, Integer>{

}
