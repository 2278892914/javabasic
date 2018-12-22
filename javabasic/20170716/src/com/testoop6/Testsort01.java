package com.testoop6;
/**
 * 排序
 * 1，冒泡排序
 * 2，选择排序
 * 3，快速排序
 *
 *冒泡排序:
 *以从小到大为例，通过比较前后两个元素，如果前面的元素大于后面的元素，
 *则交换位置，否则不交换，通过便利一趟序列，能够将最大的元素移动到最后的位置，
 *最后通过N-1趟便利，将顺序有小到大排出
 *
 *选择排序:
 *从带排序序列r[1],r[2],r[3],,,r[N]中选择一个最小值，将最小值和R[1]进行交换
 *，然后再从R[2],R[3],,;,,R[N]选择一个最小值，和r[2]进行交换，依次类推，将
 *最终序列由小到大排出
 *
 *
 */
public class Testsort01 {
	public static void main(String[] args) {
		 int []a=new int[]{6,8,2,4,9,10,1};
		 int temp;
//		 for(int j=1;j<a.length;j++){   //外层循环控制躺数
//			 for(int i=0;i<a.length-j;i++){  //内存循环比较相邻元素
//				 if(a[i]>a[i+1]){
//					 temp=a[i];
//					 a[i]=a[i+1];
//					 a[i+1]=temp;
//				 }
//			 }
//		 }
		 
//		 for(int i=0;i<a.length-1;i++){
//			 for(int j=i+1;j<a.length;j++){
//				 if(a[i]>a[j]){
//					 temp=a[j];
//					 a[j]=a[i];
//					 a[i]=temp;
//				 }
//			 }
//		}
		 
		 int flag=1;
		 for(int j=0;j<a.length-1;j++){
			 int min=a[j];
			 for(int i=j+1;i<a.length-1;i++){
				 if(a[j]>a[i]){
					 min=a[i];
					 flag=i;
				 }
				  }
				  if(min!=a[j]){  
					 temp=a[j];
					 a[flag]=a[j];
					 a[flag]=temp;
			 }
		}
		  for(int k=0;k<a.length;k++){
			 System.out.println(a[k]);
		  }
	}
}
