package com.datastucure01;

public class Node4<E> {
	
	private E data;
	private int next = -1;
	
	public Node4(E data) {
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

	public void setNext(Node4<E> node) {
		
	}

	public void setPrev(Node4<E> last) {
		
	}

	public Node4<E> getPrev() {
		// TODO Auto-generated method stub
		return null;
	}
}
	