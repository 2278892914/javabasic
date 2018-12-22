package com.testoop7;
/**
 * 多维数组
 * @author HP
 *一个制表符占八个空格
 */
public class MultiArray01 {
	public static void main(String[] args) {
		//二维数组声明以及初始化
		int [][]b=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		//二维数组的声明以及初始化
		//int [][]b=new int[3][];
		//b[0]=new int[]{1,2,3};
		
		//访问数组元素 
		//获取高维数组长度
		//System.out.println(b.length);
		//获取高维数组下标为0的数组的长度
		//System.out.println(b[0].length);
		//遍历数组
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
