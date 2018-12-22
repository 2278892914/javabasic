package com.testoop6;
/*
 * 二分法查找：在已经排序好的基础上，选取数组的中间元素进行比较，如果相等，则查找成功
 * 如果被查找的数字小于中间数字，则从中间数字左边部分重复上述操作，如果被查找的数字
 * 大于中间数字则从右边继续重复上述操作 
 */
public class Testsort02 {
	public static void main(String[] args) {
		int[]   a=new  int[]{4,5,13,13,13,14,15};

		int target=13;//需求，返回11的下标
		int i=0;
		int j=a.length-1;
		int mid;
		while(i<=j){
			mid=(i+j)/2;
			if(a[mid]==target){

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
//		for(int k=mid-1;k>0;k--){ //查找前面的重复目标数字
//			if(a[k]==a[mid]){
//				System.out.println("查找成功,下标为："+k);
//			}else{
//				break;
//			}
//		}