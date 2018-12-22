package com.testSet;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		Emp1 e1 = new Emp1("1000","张的三",20,new Date());
		Emp1 e2 = new Emp1("1002","李四",202,new Date());
		Emp1 e3 = new Emp1("1003","王五",205,new Date());
		Set set = new HashSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		Iterator it =set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}