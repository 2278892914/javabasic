package com.testCollections;

import java.util.List;

public class SortList {

	public static void  sort(List list){
		Object[] obj=list.toArray();
			Object temp=null;
		for(int i=0;i<obj.length;i++){
		
			for(int j=0;j<obj.length-i-1;j++){
				if((Integer)obj[j]>(Integer)obj[j+1]){
					temp=obj[j];
					obj[j]=obj[j+1];
					obj[j+1]=temp;
				}
			}
		}
		for(int i=0;i<list.size();i++){
			list.set(i, obj[i]);
		}
	}
}
