package com.useful;

public class TestArrays {
	public static void testsort(Object[] obj){
		Student stu1=(Student) obj[0]; 
		Student stu2=(Student) obj[1]; 
		
		int flag=stu1.compareTo(stu2);
		
		if(flag==1){  
			obj[0]=stu1;
			obj[1]=stu2;
			
		}else{    
			obj[0]=stu2;
			obj[1]=stu1;
		}
		
	}
}
