package com.testMap;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Map  一种以键值对存储数据的集合，通过key可以找到唯一对应的value,其中k不允许重复，
 * value可以允许重复
 * 
 * 常用的实现类
 * HashMap:线程不安全，可以使用null作为key或者value
 * Hashtable:线程安全，不允许使用null作为key或者vakue，如果把null作为Hasgtable中，
 * 将引发空指针异常
 */
public class Testmap {
	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<String,String>();
		map.put("name","张三");
		map.put("age", "23");
		map.put("add", "北京");
		Set<String> set = map.keySet();
		for(Object obj : set){
			System.out.println(obj+" "+map.get(obj));
		}
		
		Map<String,String> map1 = new Hashtable<String,String>();
		Map<String,String> map2 = new Hashtable<String,String>();
		Map<String,String> map3 = new Hashtable<String,String>();
		map1.put("姓名","23");
		map1.put("地址 ","西安");
		map1.put("年龄","56");
		map2.put("姓名", "李四");
		map2.put("年龄","32");
		map2.put("地址", "北京");
		map3.put("姓名", "王五");
		map3.put("年龄","30");
		map3.put("地址", "南京");
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		for(int i=0;i<list.size();i++){
			Map<String,String> m= (Map<String, String>)list.get(i);
			Set<String> s = m.keySet();
			for(String o :s){
				System.out.println(o+"  :  "+m.get(o));
			}
			
		}
		
	}
	
}
