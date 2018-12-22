package testtype;

import java.util.ArrayList;
import java.util.List;

public class TsetB {
	
	public static void main(String[] args) {
	TestA a = new TestA();
//		List<String>  list = new ArrayList<String>();
//		list.add("abc");
//		list.add("jn");
//		a.fun(list);
		
		List<A> list = new ArrayList<A>();
		list.add(new A());
		list.add(new A());
		a.fun3(list);
	}
	
}
