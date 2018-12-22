package com.bjsxt.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bjsxt.App;
import com.bjsxt.dao.UersRepositoryByName;
import com.bjsxt.dao.UersRepositoryCrudRepository;
import com.bjsxt.dao.UsersJPASpecification;
import com.bjsxt.dao.UsersRepository;
import com.bjsxt.dao.UsersRepositoryPagingAndSorting;
import com.bjsxt.dao.UsersRepositoryQueryAnnotation;
import com.bjsxt.pojo.Users;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={App.class})
public class UsersRepositoryTest {

	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private UersRepositoryByName uersRepositoryByName;
	@Autowired
	private UsersRepositoryQueryAnnotation usersRepositoryQueryAnnotation;
	@Autowired
	private UersRepositoryCrudRepository uersRepositoryCrudRepository;
	@Autowired
	private UsersRepositoryPagingAndSorting usersRepositoryPagingAndSorting;
	@Autowired
	private UsersJPASpecification usersJPASpecification;
	@Test
	public void testsave(){
		Users users = new Users();
		users.setAddress("东京");
		users.setAge(20);
		users.setId(4);
		users.setName("尚学堂");
		usersRepository.save(users);
		
	}
	@Test
	public void testbyname(){
		List<Users> list = uersRepositoryByName.findByName("尚学堂");
		for(Users users: list){
			System.out.println(users);
		}
	}
	/*
	@Test
	public void testbyquerynamehql(){
		List<Users> list = usersRepositoryQueryAnnotation.queryByNameUseHQL("尚学堂");
		for(Users users: list){
			System.out.println(users);
		}
	}*/
	@Test
	public void testbyquerynamesql(){
		List<Users> list = usersRepositoryQueryAnnotation.queryByNameUsesql("尚学堂");
		for(Users users: list){
			System.out.println(users);
		}
	}
	@Test
	@Transactional        //事物
	@Rollback(false)    //取消自动回滚
	public void testupdate(){
		usersRepositoryQueryAnnotation.updateUsers("张三san", 1);
	}
	/*
	 * CrudRepository的查询是不用写sql语句的，方法内部自动封装了sql语句，只需要在调用方法的时候传入响应的参数
	 * 缺点就是多表查询，比较麻烦
	 * 
	 * 每个方法会自动开启事物，既就是自动在方法上面加上了@Transactional注解
	 * 
	 * 此save方法既是插入又是更新，当传入的对象数据库当中存在的时候，
	 * 则执行的是更新的操作，如果数据库当中不存在，则执行的是插入的操作
	 */
	@Test
	public void testCrudRepository(){
		Users users = new Users();
		users.setAddress("华盛顿");
		users.setAge(100);
		users.setId(4);
		users.setName("张三丰");
		uersRepositoryCrudRepository.save(users);
	}
	
	@Test  
	public void testPagingAndSorting(){
		/*Order order = new Order(Direction.DESC,"id");   排序
		Sort sort = new Sort(order);
		List<Users> list = (List<Users>)usersRepositoryPagingAndSorting.findAll(sort);
		for (Users users : list) {
			System.out.println(users);
		}*/
		Pageable pageable = new PageRequest(0, 2);        //分页
		Page<Users> page = usersRepositoryPagingAndSorting.findAll(pageable);
		System.out.println("总条数："+page.getTotalElements());
		System.out.println("总页数"+page.getTotalPages());
		List<Users> list = page.getContent();
		for(Users users : list){
			System.out.println(users);
		}
			
	}
	@Test           //分页加排序
	public void testPagingAndSortingroll(){
		Sort sort = new Sort(new Order(Direction.DESC,"id"));
		Pageable pageable = new PageRequest(0, 3, sort);
		Page<Users> page = usersRepositoryPagingAndSorting.findAll(pageable);
		System.out.println("总条数："+page.getTotalElements());
		System.out.println("总页数"+page.getTotalPages());
		List<Users> list = page.getContent();
		for(Users users : list){
			System.out.println(users);
		}
	}
	/*
	 * 测试jpaRepository  
	 */
	@Test
	public void testjpaRpository(){
		Order order = new Order(Direction.DESC,"id");   //排序
		Sort sort = new Sort(order);
		List<Users> list = usersRepository.findAll(sort);
		for (Users users : list) {
			System.out.println(users);
		}
	}
	
	/*
	 * JpaSpecificationExecutor1    单条件查询
 	 */
	@Test
	public void testJpaSpecificationExecutor1(){
		/*
		 * Specification<Users>:用于封装了单个的查询条件
		 */
		Specification<Users>  spec = new Specification<Users>(){
			/*
			 * Root<Users> root:查询对象的属性的封装
			 * CriteriaQuery<?> query:封装了我们要查询中的各个部分的信息
			 *  CriteriaBuilder cb：查询条件的构造器，定义不同的查询条件
			 */
			@Override
			public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				//    where name="尚学堂"          查询的条件属性	 条件的值   
				Predicate pre = cb.equal(root.get("name"), "尚学堂");
				return pre;
			}
			
		};
		List<Users> list = usersJPASpecification.findAll(spec);
		for(Users users : list){
			System.out.println(users);
		}
	}
	
	/*
	 * JpaSpecificationExecutor1    多条件查询实现一
 	 */
	@Test
	public void testJpaSpecificationExecutor2(){
		/*
		 * Specification<Users>:用于封装了单个的查询条件
		 */
		Specification<Users>  spec = new Specification<Users>(){
			/*
			 * Predicate封装了多个条件的查询
			 * 
			 * Root<Users> root:查询对象的属性的封装
			 * CriteriaQuery<?> query:封装了我们要查询中的各个部分的信息
			 *  CriteriaBuilder cb：查询条件的构造器，定义不同的查询条件
			 */
			@Override
			public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				//where name="尚学堂" and age = 20
				List<Predicate> list =  new ArrayList<>();
				list.add(cb.equal(root.get("name"), "尚学堂"));
				list.add(cb.equal(root.get("age"), 20));
				Predicate[]  arr = new Predicate[list.size()];
				//此时and当中传递的是一个可变参数，将list集合转换为一个predicate数组
				return cb.and(list.toArray(arr));
			}
			
		};
		List<Users> list = usersJPASpecification.findAll(spec);
		for(Users users : list){
			System.out.println(users);
		}
	} 
	/*
	 * JpaSpecificationExecutor1    多条件查询实现二
 	 */
	@Test
	public void testJpaSpecificationExecutor3(){
		/*
		 * Specification<Users>:用于封装了单个的查询条件
		 */
		Specification<Users>  spec = new Specification<Users>(){
			/*
			 * Predicate封装了多个条件的查询
			 * 
			 * Root<Users> root:查询对象的属性的封装
			 * CriteriaQuery<?> query:封装了我们要查询中的各个部分的信息
			 *  CriteriaBuilder cb：查询条件的构造器，定义不同的查询条件
			 */
			@Override
			public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				
				return cb.and(cb.equal(root.get("name"), "尚学堂"),cb.equal(root.get("age"), 20));
			}
			
		};
		List<Users> list = usersJPASpecification.findAll(spec);
		for(Users users : list){
			System.out.println(users);
		}
	} 
	
	
}
