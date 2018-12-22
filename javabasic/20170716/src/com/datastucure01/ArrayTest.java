package com.datastucure01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int productsum = input.nextInt();         //商品总数
		int flag = 0;    //存储可选的商品的方案总数
		for(int i=0;i<productsum;i++){      //每个商品的价格 一次存储到集合当中
			list.add(input.nextInt());
		}
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				for(int f=i+2;f<list.size();f++){
					if(list.get(i)>list.get(j)&&list.get(j)>list.get(f)&&i<j&&j<f){
						System.out.println(list.get(i)+"  "+list.get(j)+"  "+list.get(f));
						flag++;
					}
				}
			}
		}
		System.out.println(flag);
	}
	
}
