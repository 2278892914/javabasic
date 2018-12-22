package com.testoop9;

import java.util.Scanner;

public class TestHero {

	public static void main(String[] args) {
		Hero hero1 = new Hero(100,1);
		Hero hero2 = new Hero(2);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入英雄的名字");
		hero1.name = input.next();
		hero2.name = input.next();
		/*
		 * 基本战斗
		 *  英雄攻击对方，调用攻击方法，传入的参数为被攻击的英雄对象    
		 *    普通攻击
		 *    此为英雄2攻击英雄1
		 */
		hero2.fight(hero1);
		/**
		 * 绝招
		 * 利用绝招，调用普通攻击的重载方法
		 * 此为英雄1攻击英雄2
		 */
		hero1.fight(hero2,0.5);
		System.out.println(hero1);
		System.out.println(hero2);
	}
}
