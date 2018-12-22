package userdefineException;

public class Test {

	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.setSid(1001);
		stu.setName("张三");
		try {
			stu.setAge(220);
			//Student stu1=new Student(1002,"李四",20);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
