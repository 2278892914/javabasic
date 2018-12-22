package com.datastucure01;

public class Books {

	private String [] obj ;
	//定义数组下标
	private int index;
	
	public Books(){
		this(10);
	}
	public Books(int size){
		obj = new String[size];
	}
	
	
	
	public boolean add(String s){
		if(index>=obj.length){
			String[] o2 = new String[obj.length*2];
			for(int i=0;i<index;i++){
				o2[i]=obj[i];
			}
			obj = o2;
		}
		obj[index++]=s;
		return true;
	}
	//向前移动
	public void add(int n,String s1){
		if(n>index-1){
			throw new RuntimeException("插入位置不对");
		}
		
		/*for(int i=this.index;i>n;i--){
			obj[i+1]=obj[i];
		}*/
		if(index>=obj.length){
			String[] o2 = new String[obj.length*2];
			for(int i=0;i<index;i++){
				o2[i]=obj[i];
			}
		}
		for(int i=this.index;i>n;i--){
			obj[i]=obj[i-1];
		}
		obj[n]=s1;
		index++;
	}
	
	public String get(int n){
		if(n>obj.length-1){
			throw new RuntimeException("位置不对");
		}
		return obj[n];
	}
	
	public int indexOf(String s1){
		for(int i=0;i<index;i++){
			if(obj[i].equals(s1)){
				return i;
			}
		}

		return -1;
	}
	
	public boolean remove(int n){
		if(n>index-1){
			throw new RuntimeException("位置不对");
		}
		for(int i=n;i<index;i++){
			obj[i]=obj[i+1];
		}
		index--;
		return true;
	}
	//删除
	public boolean remove(String s1){
		int n = indexOf(s1);
		if(n==-1){
			return false;
		}
		for(int i=n;i<index;i++){
			obj[i]=obj[i+1];
		}
		index--;
		return true;
	}
	
	public boolean isEmpty(){
		return  index>0;
	}
	public boolean clear(){
		for(int i =0;i<index;i++){
			obj[i]=null;
		}
		return true;
	}
	
	public String[] getBooks(){
		return obj;
	}
	
	public int size(){
		return index;
	}
}
