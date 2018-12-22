package com.testoop4;
/*
 * 输出1到100的偶数
 */
public class TestCircle3 {
	public static void main(String[] args) {
//		for(int i=0;i<=100;i++){
//			if(i%2==0){
//				System.out.print(i);
//			}
//		}
//		
		for(int i=1;i<=5;i++){
			for(int j=5-i;j>=1;j--){
				//输出空格
				System.out.print(" ");
			}
			//输出*
				for(int n=0;n<i;n++){
					System.out.print("*"+" ");
					
			    }
				System.out.println();
			
			
		}
//		for(int i=1;i<=9;i++){
//			for(int j=1;j<=i;j++){
//				System.out.print(i+"*"+j+"="+(i*j)+"\t");
//			}
//			System.out.println();
//		}
	}

}
