package com.datastucure01;

public class TestF<B> {

	private B  b;
	
	public void n1(B a){
		b=a;
	}
	
	public B getB(){
		return b;
	}
	
	public static void main(String[] args) {
		TestF<String> tf = new TestF<String>();
		tf.n1("abc");
		String s = tf.getB();
		System.out.println(s);
		
	}
	
}
