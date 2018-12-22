package com.datastucure01;

public class MyLink2<E> {

	private Node2<E> [] obj = new Node2[10];
	private int size;
	
	
	/*public boolean add(E data){
		Node2<E> node = new Node2<E>(data);
		
		if(first==null){
			first=node;
			obj[size++] = node;
			return true;
		}
		Node2 prev = first;
		while(prev.getNext()!=-1){
			prev = obj[prev.getNext()];
		}
		prev.setNext(size);
		obj[size] = node;
		size++;
		return true;
	}*/
	private int first = -1;
	private int lastIndex = 0;
	public boolean add(E data){
		Node2<E> node = new Node2<E>(data);
		if(first==-1){
			first = lastIndex;
			obj[lastIndex++]=node;
			size++;
			return true;
		}
		obj[lastIndex++]=node;
			size++;
			return true;
	}
	public boolean remove(int index){
		if(index==0){
			int t = obj[first].getNext();
			obj[first]=null;
			lastIndex=0;
			first = t;
			return true;
		}
		int count = 0;
		int n = first;
		while(count<index-1){
			n=obj[n].getNext();
			count++;
		}
		int r = obj[n].getNext();
		obj[n].setNext(obj[r].getNext());
		obj[r]=null;
		lastIndex = r;
		return true;
	}
}
