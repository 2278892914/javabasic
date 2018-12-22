package com.testswing;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 产生5个随机数，放在一个数组当中
		int[] b = new int[5];
		// 定义一个标记位
		boolean ak = false;
		Random rd = new Random();

		/*
		 * 因为数组当中的默认值为0，而且产生的随机数也有可能为0， 所以ff用来保证产生的第一个为0的随机数插入在数组当中，
		 * 以后产生的随机数按照重复处理
		 * 
		 */
		int ff = 1;
		// 产生五个随机数存放在一个数组当中
		for (int i = 0; i < 5; i++) {
			int flag = rd.nextInt(10);
			for (int j = 0; j < b.length; j++) {
				if (flag == 0) {
					if (ff < 2) {
						++ff;
						break;
					} else {
						i--;
						ak = true;
						break;
					}
				}
				if (b[j] == flag) {
					i--;
					ak = true;
					break;
				} else {
					ak = false;
				}
			}
			if (!ak) {
				b[i] = flag;
			}
		}
		for (int k = 0; k < 5; k++) {
			System.out.println(b[k]);
		}

	}
}
