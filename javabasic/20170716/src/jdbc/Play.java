package jdbc;

/**
 *创建主类 
 *
 */
public class Play {

	public static void main(String[] args) {
		/*
		 * 实例化三个对象
		 */
		 Bird bird = new Bird();
		 Cat cat = new Cat();
		 Dog dog = new Dog();
		 //调用类的静态方法    传入的参数为实例化的对象
		 Play.playSound(cat);
	}
	//由于实例化的三个对象都继承了Animal抽象类，因此传过去的对象实行向上转型，为Animal类
	public static void playSound(Animal animal){
		animal.say();
	}
}
