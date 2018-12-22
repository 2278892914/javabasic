package com.datastucure01;

import com.datastucure01.Outer.Inner;

public class TestOuter {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		Inner it= out.new Inner();
		Inner it2= out.new Inner("abc");
		
		Outer out2 = new Outer("abc");
		Inner it3 = out.new Inner();
		
		
	}
}
