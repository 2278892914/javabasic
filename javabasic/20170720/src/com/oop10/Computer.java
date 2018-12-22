package com.oop10;

public class Computer {
	public void insert(IUSB usb){
		usb.insert();
	}
	public static void main(String[] args) {
		Computer c = new Computer();
		//采用多态
		c.insert(new Mouse());
	}   
}
