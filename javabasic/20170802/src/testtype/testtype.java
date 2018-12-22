package testtype;
/*
 * 泛型:也叫参数化类型，jdk1.5以后引入，允许程序在定义类，接口，方法时加入类型形参，在声明变量，创建
 * 对象时动态的指定该类型实参，给定义的泛型称之为泛型类，给接口定义的泛型被称之为泛型接口
 * 泛型的作用：通过给类，接口加入泛型后，可以在编译期间进行类型检查，避免程序在运行期间出现类型转换错误
 * 
 */
public class testtype<T> {   //T必须是引用类型
	T t;//使用泛型声明
	String s ="sdc";
	public static void main(String[] args) {
		testtype<String> tt = new testtype<String>();
	}

}
