package com.datastucure01;

public class MyHash<K,V>{

	private Object [] obj = new Object[10];
	
	private int size;
	
	public void push(K k,V v ){
		int hash = hash(k);
		size++;
		obj[hash] = v;
	}
	
	
	public V get(K k){
		return (V)obj[hash(k)];
	}
	public int hash(K k){
		return (int)k%obj.length;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	public int size(){
		return size;
	}
	
	
}
