package com.exception;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();
	
			try {
				s.setAge(255);
				s1.setAge(300);
			} catch (AgeException e) {
				
				e.printStackTrace();
			}
		
	}
	
	
}
