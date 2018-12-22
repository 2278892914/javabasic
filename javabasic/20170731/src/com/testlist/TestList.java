package com.testlist;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.junit.Test;

/*
 * List为一接口
 *List集合：可以存放数量不等，类型不一的元素，类型不一的元素
 *特点：
 *元素有序，并且允许有null值和重复值
 *
 *List接口有一下的常用的实现类
 *1：ArrayList(),底层实现为数组，适用于遍历查询，但是ArrayList是线程不安全的
 *常用方法：
 *初始容量为10，增长幅度为1.5倍
 *add() 添加元素
 *2:LinkedList():底层实现为双向链表，适合数据的增删改,也是线程不安全的
 *3：Vector 底层实现也是数组，同样适用于遍历查询，但是Vector是线程安全的，并允许
 *用户自动以初始容量和增长长度
 *4 Stack:底层实现是栈，是一种先进后出的数据结构
 */
public class TestList {
	@Test
	public void TestStack(){
		Stack s = new Stack();
		//将元素入栈
		s.push("abc");
		s.push("efg");
		while(!s.isEmpty()){     //用来判断栈低元素是否为空
			System.out.println(s.pop());
		}
		
		
	}
	public void TestVector(){
		Vector v = new Vector(10,20);
		v.add("战斗感");
		v.add("战斗机");
		for(Object obj : v){
			System.out.println(obj);
		}
	}
	@Test
	public void TestLinkedList(){
		LinkedList list = new LinkedList();
		list.add("张三");
	}
	
	public static void main(String[] args) {
		
	     List  list = new ArrayList();    
		
		//添加元素
		list.add(10);
		list.add("张丹");
		list.add('男');
		list.add(new Date());
		//将下标为1的元素替换为李四
		list.set(1, "李四");
		//将下标为3的元素移除
		list.remove(3);
		//判断集合里面是否包含指定的元素
		list.contains("李四");
		//遍历集合
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		
		//必须是Object类型
		for(Object obj:list){
			System.out.println(obj);
		}
		//随机生成6个不同的正数放入list的集合	
		for(int i=0;i<6;i++){
			int a = (int)(Math.random()*10);
			if(!list.contains(a)){
				list.add(a);
			}else{
				i--;
			}
		}
		for(Object obj:list){
			System.out.println(obj);
	    }
		//使用Iterator遍历数组,可以遍历任何集合,迭代器
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object obj= it.next();
			System.out.println(obj);
		}
	}
}
