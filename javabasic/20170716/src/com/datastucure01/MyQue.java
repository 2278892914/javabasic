package com.datastucure01;

public class MyQue<E> {

	
	private Object [] obj = new Object[10];
	
	private int size;
	
	public boolean push(E e){
		if(size>obj.length){
			throw new RuntimeException("�±�Խ��");
		}
		obj[size++] = e;
		return true;
		
	}
	
	public E poll(){
		if(size==0){
			throw new RuntimeException("�����Ѿ�Ϊ��");
		}
		return (E)obj[--size];
	}
}
