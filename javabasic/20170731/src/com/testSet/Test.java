package com.testSet;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Emp e1 = new Emp("1000","张三",20,new Date());
		Emp e2 = new Emp("1002","李四",202,new Date());
		Emp e3 = new Emp("1003","王五",205,new Date());
		List list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
