package com.datastucure01;

public class Node2<E> {
	
	private E data;
	private int next = -1;
	
	public Node2(E data) {
		this.data = data;
	}
	
	public int getNext() {
		
		return next;
	}

	public void setNext(int next) {
		this.next=next;
	}
	public E getData(){
		return data;
	}
}
	