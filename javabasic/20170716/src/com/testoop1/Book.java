package com.testoop1;
/*
 * 保存的文件名为Book.java
 */
public class Book {
	//提供无参构造方法
	public Book(){
		
	}
	//提供有参构造方法，用来赋值
	public Book(String author,String bookName){
		this.author = author;
		this.bookName = bookName;
		
	}
	//设置两个属性，作者和书名
	private String author;
	private String bookName;
	
	//提供get和set方法
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	//重写toString方法
	public String printBook(){
		
		return "book message: [author = "+author+"],[bookName = "+bookName+"]";
	}
	
	public static void main(String[] args) {
		
		//创建书籍
		Book book1 = new Book();
		String bookmsg1 = book1.printBook();
		System.out.println(bookmsg1);
		
		Book book2 = new Book("someone","Java");
		String bookmsg2 = book2.printBook();
		System.out.println(bookmsg2);
		
	}
}