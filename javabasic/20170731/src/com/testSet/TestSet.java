package com.testSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * set:不允许有重复值，且无序的集合， 
 * 
 * set为一个借口，其HashSet为一个实现类
 * 接口不能够实例化，创建接口对象的时候，只能够引用接口，指向它的实现类
 * 常用的实现类
 * list同样如此，接口均不能被实例化，都只能指向它的实现类
 * 
 * HashSet
 * 
 * 1:不能够保证元素的排列顺序，顺序可能与添加顺序不同
 * 2:线程不安全，加入有两个或者两个以上的线程同时修改访了HashSet集合，输出结果就存在二义性
 * 3:集合元素可以是null值
 * 4:值不能重复
 * 
   SotedSet：set的子接口，允许对元素进行排序的集合
 
        常用的实现类:TreeSet 内部对数组自然排序
        
 */
public class TestSet {
	
	public void testTreeSet(){
		TreeSet ts = new TreeSet();
		ts.add(6);
		ts.add(5);
		ts.add(10);
		for(Object obj:ts){
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("张三");
		set.add("张三");
		set.add("张三");
		set.add("李四");
		//遍历数组
		Iterator it =set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
	}
}
