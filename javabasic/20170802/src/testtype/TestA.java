package testtype;

import java.util.List;
/*
 * ? : java泛型通配符
 * 一旦某个类和接口使用通配符后，该泛型类或者泛型接口可以看成该类的任意泛型类或者泛型接口父类型
 */
public class TestA {
	public void fun(List<?> list){
		
	}
	//与fun相同
	public void fun2(List<? extends Object> list){
		
	}
	
	//设置通配符上限，规定了通配符只能是A类或者其他子类类型
	public void fun3(List<? extends A> list){
		
	}
	//设置统配符的下限:规定了通配符只能是A类或者其他父类类型
	public void fun4(List<? super A> list){
		
	}
}
