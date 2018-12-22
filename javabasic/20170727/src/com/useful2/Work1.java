package com.useful2;

public class Work1 {
public static void main(String[] args) {
		
		//产生6个不同的随机数(1-10)，并存储到数组中
		int[] a=new int[6];
		for(int i=0;i<6;i++){ 
		
			int m=(int)(Math.random()*10+1);
			boolean flag=false;//false: 不存在，true：数组存在
			for(int j=0;j<a.length;j++){
				if(a[j]==m){
					flag=true;
				}
			}
			if(flag==false){
				a[i]=m;
			}else{
				i--;
			}
		}
		
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+"   ");
		}
		
	}
}
