package com.testoop3;
/*
 * if选择结构
 * 单分支
 * if(表达式){
 * }
 * 双分支
 * if(表达式){
 * }
 * else{
 * 
 * }
 * 多分支
 * if（表达式）{
 * 
 * }else if（表达式）{
 * 
 * }else{
 * 
 * }
 */
public class TestIf {
	public static void main(String[] args) {
		int score=59;
		if(score>90&&score<=100){
			System.out.println("A级");
		}else if (score>=80){
			System.out.println("B");
		}else if (score>=70){
			System.out.println("C");
		}else if (score>=60){
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	}

}
