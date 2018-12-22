package userdefineException;

public class Student {

	private int sid;
	private String name;
	private int age;
	
	public Student(){
		
	}
	
	public Student(int sid,String name,int age) throws AgeException{
		
		this.sid=sid;
		this.name=name;
		
		if(age>0&&age<150){
			this.age=age;
		}else{
			throw new AgeException();
		}
	}
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	
	/**
	 * 如果年龄不合法，则无法给age赋值，并抛出异常信息
	 */
	public void setAge(int age) throws AgeException {
		if(age>0 && age<150){
			this.age=age;
		}else{
			//使用throw抛出异常对象
			throw new AgeException();
		}
	}
	
	
}
