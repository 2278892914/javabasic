package com.datastucure01;

public class MyLink4<E> {

	private Node4<E> first;
	private int size;
	private Node4<E> last;
	
	public boolean add(E data){
		Node4<E> node = new Node4<E>(data);
		if(first==null){
			first=last=node;
			size++;
			return true;
		}
		last.setNext(node);
		node.setPrev(last);
		last = node;
		first.setPrev(last);
		last.setNext(first);
		size++;
		return true;
	}
	public boolean add(int index,E data){
		if(index<0||index>size){
			throw new IndexOutOfBoundsException("数组下标越界");
		}
		Node4<E> node = new Node4<E>(data);
		Node4<E> rnode = first;
		int count = 0;
		while(count<index){
			rnode = rnode.getNext();
			count++;
		}
		Node4<E> prev = rnode.getPrev();
		prev.setNext(node);
		node.setPrev(rnode);
		node.setNext(rnode);
		rnode.setPrev(node);
		size++;
		return true;
	}
	public boolean remove(int index){
		if(index<0||index>size){
			throw new IndexOutOfBoundsException("删除失败，数组下标越界");
		}
		
		return true;
		
		
		
		
		
		
		
		
		
	}
	
	
}
