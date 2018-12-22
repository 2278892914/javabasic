package com.testFlowlayOut;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*
 * 边界布局
 */
public class Test02 extends JFrame{
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JPanel jp4 = new JPanel();
	JPanel jp5 = new JPanel();
	
	JButton jb1 = new JButton("按钮1");
	JButton jb2 = new JButton("按钮2");
	JButton jb3 = new JButton("按钮3");
	JButton jb4 = new JButton("按钮4");
	JButton jb5 = new JButton("按钮5");
	
	public Test02(){
		jp1.add(jb1);
		jp2.add(jb2);
		jp3.add(jb3);
		jp4.add(jb4);
		jp5.add(jb5);
		
		this.add(jb1,BorderLayout.NORTH);
		this.add(jb2,BorderLayout.SOUTH);
		this.add(jb3,BorderLayout.WEST);
		this.add(jb4,BorderLayout.EAST);
		//this.add(jb5,BorderLayout.NORTH);
		this.setTitle("边界布局");
		this.setBounds(200, 200, 500, 500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Test02  t = new Test02();
	}
}
