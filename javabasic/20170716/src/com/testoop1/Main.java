package com.testoop1;


public class Main
{
	static int f(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int[][] a = new int[c1.length+1][c2.length+1];
		System.out.println(a.length);
		int max = 0;
		for(int i=1; i<a.length; i++){
			for(int j=1; j<a[i].length; j++){
				if(c1[i-1]==c2[j-1]) {
					a[i][j] = max++;  //填空 
					if(a[i][j] > max)
						max = a[i][j];
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args){
		int n = f("abcdkkk", "baabcdadabc");
		System.out.println(n);
	}
}
