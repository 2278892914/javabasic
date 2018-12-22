package com.datastucure01;

public class MyQue2<E> {

	private Object [] obj = new Object[10];
	
	private int size;
	
	private int rear;    //��β
	
	private int first;
	
	public boolean push(E e){
		if(isFull()){
			return false;
		}
		if(first>obj.length-1){
			first = first%obj.length;
		}
		obj[first++] = e;
		size++;
		return true;
		
	}
	

	public E poll(){
		if(size==0){
			throw new RuntimeException("�����Ѿ�Ϊ��");
		}
		size--;
		return (E)obj[rear++];
	}
	
	public int size(){
		return size;
	}
	

	private boolean isFull() {
		
		return size==obj.length;
	}
	
}
