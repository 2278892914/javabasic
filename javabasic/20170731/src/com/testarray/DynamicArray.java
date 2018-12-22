package com.testarray;

public class DynamicArray {
	
	private Object[] value;
	int size=0;
	public DynamicArray(){
		value = new Object[10];
	}
	//为元素赋值
	public void add(Object obj){
		value[size]=obj;
		size++;
		if(size>value.length-1){
			Object[] value2= new Object[value.length*2];
			System.arraycopy(value, 0, value2, 0, value.length);
			value = value2;
		}
	}
	//返回数组元素
	public Object get(int index){
		return value[index];
	}
	
	//获取数组中元素的个数
	public int getlrnth(){
		return size;
	}
	
}
