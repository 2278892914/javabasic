package com.datastucure01;

public class Outer {

	private String out;
	
	public Outer(){
		
	}
	public Outer(String out){
		this.out = out;
	}
	public Inner getInner2(){           //在外部类的方法中可以直接创建一个内部类
		return new Inner();
	}
	class Inner{

		private String s;
		
		public Inner(){
			
		}
		public Inner(String s){
			this.s = s;
		}
		
		
	}
	
}
