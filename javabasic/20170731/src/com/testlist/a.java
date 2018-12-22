  package com.testlist;

import java.util.ArrayList;

public class a {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("java");
		list.add("aaa");
		list.add("java");
		list.add("java");
		list.add("bbb");
		list.remove("java");
		for(Object obj : list){
			System.out.println(list);
			
		}
	}
}
