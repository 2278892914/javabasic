package com.oop3;

public class Book {
	//成员变量的定义
	String name;
	String author;
	int totalPage;
	//通过构造器来改变初值
	public Book(String name,String author,int totalPage){
		this.name=name;
		this.author=author;
		this.totalPage=totalPage;
	}
	public static void main(String[] args) {
		//定义两个对象
		Book b1=new Book("西游记","吴承恩",500);
		Book b2=new Book("红楼梦","曹雪芹",800);
		//定义两个数组
		Book[] book=new Book[3];
		//将数组指向对象
		book[0]=b1;
		book[1]=b2;
		//通过for-each结构遍历数组
		for(Book b:book){
			if(b!=null){
				System.out.println("书名为:"+b.name+"作者为:"+b.author+"页数为:"+b.totalPage);
			}
				
		}
	}

}
