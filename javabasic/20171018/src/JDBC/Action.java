package JDBC;

public class Action {

	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.setEmpno(1200);
		emp.setEname("赵丽");
		emp.setJob("程序员");
		Test02 t = new Test02();
		t.add(emp);
		
	}
}
