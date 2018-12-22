package com.datastucure01;

import java.util.ArrayList;

public class TestStrack {

	public static void main(String[] args) {
		
		String a = "2*3+1";
		ArrayList<Character> array = new ArrayList<>();
		MyStrak<Character> stack = new MyStrak<>();
		for(int i=0;i<10;i++){
			char c = (char)('0'+i);
			array.add(c);
		}
		for(int i=0;i<a.length();i++){
			char c = a.charAt(i);
			if(array.contains(c)){
				System.out.print(c);
				if(i==a.length()-1){
					while(!stack.isEmpty()){
						System.out.println(stack.pop());
					}
				}
			}else{
				if(stack.isEmpty()){
					stack.push(c);
					continue;
				}
				char d = stack.pop();
				int a1 = (d=='+'||d=='-')?0:1;
				int a2 = (c=='+'||d=='-')?0:1;
				if(a1>=a2){
					System.out.print(d);
					stack.push(c);
				}else if(a1<a2){
					stack.push(d);
					stack.push(c);	
				}
			}
		}
	}
}
