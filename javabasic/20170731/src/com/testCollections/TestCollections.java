package com.testCollections;
/*
 * Collection与Collections的区别
 * Collection  java中集合的父接口
 * Collections   是操作集合的工具类，例如对集合进行排序，反转等，还可以将集合转换为线程安全等
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Collection与Collections的区别：
 * Collection: 是Java中集合的父接口
 * Collections： 是操作集合的工具类，例如可以对集合进行排序，反转等， 还可以将集合 转换为线程安全
 *
 */
public class TestCollections {

	public static void main(String[] args) {
		//将list转换为线程安全的
		List list=Collections.synchronizedList(new ArrayList());
		
		list.add(5);
		list.add(4);
		list.add(7);
		//Collections.sort(list);
		//作业：自定义sort方法，对list排序
		SortList.sort(list);
		for(Object o:list){
			System.out.println(o);
		}
	}
}
