package com.testoop6;

public class Testsort03 {
	public static void main(String[] args) {
		int[]   a=new  int[]{4,5,6,8,9,10,10,10,11,12,13,13,13,14,15};

		int target=13;
		int i=0;
	    int j=a.length-1;
		int mid;
		
		while(i<=j){
			mid=(i+j)/2;
			if(a[mid]==target){
				for(int k=mid;k<a.length;k++){
					if(a[k]==a[mid]){
					System.out.println("查找成功，下标为: "+k);
					}else{
						break;
					}
				}
				break;
			}
			if(target<a[mid]){
				j=mid-1;
			}
			if(target>a[mid]){
				i=mid+1;
			}
		}
		
	}
}
