package com.oop2;


public class Student {
	int a;
	int b;
	public void change1(Student st1){
	int temp;
	temp=st1.a;
	st1.a=st1.b;
	st1.b=temp;
	System.out.println("change1方法中的a="+a+"    b="+b);
}
	public static void main(String[]args) {
	Student  st=new  Student();
	st.a=10;
	st.b=20;
	st.change1(st);
	System.out.println(st.a+"==="+st.b);
	}
}
