package com.testoop7;

public class MultiArray02 {
	
	public static void main(String[] args) {
		
	
	int[]   a=new  int[]{4,5,6,8,9,10,10,10,11,12,13,14,15};
	int target=10;//需求，返回11的下标
	int i=0;
	int j=a.length-1;
	int mid;
	while(i<=j){
		mid=(i+j)/2;
		if(a[mid]==target){
			for(int k=mid-1;k>0;k--){ //查找前面的重复目标数字
				if(a[k]==a[mid]){
					System.out.println("查找成功,下标为："+k);
				}else{
					break;
				}
			}
			for(int k=mid;k<a.length;k++){ //查找后面重复的目标数字
				if(a[k]==a[mid]){
					System.out.println("查找成功,下标为："+k);
				}else{
					break;
				}
			}
			break;
			//continue;
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
