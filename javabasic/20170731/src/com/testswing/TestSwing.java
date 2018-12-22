package com.testswing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestSwing extends JFrame{

	//打开窗体
	public void open(){
		//创建面板
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		
		JLabel lable1=new JLabel();
		lable1.setText("用户名：");
		
		JLabel lable2=new JLabel();
		lable2.setText("密　码：");
		
		JTextField jtf=new JTextField(18);
		
		JPasswordField jpf=new JPasswordField(18);
		
		//创建按钮
		JButton jb1=new JButton("登录");
		JButton jb2=new JButton("注册");
		
		jp1.add(lable1);
		jp1.add(jtf);
		jp2.add(lable2);
		jp2.add(jpf);
		jp3.add(jb1);
		jp3.add(jb2);
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(jp3,BorderLayout.SOUTH);
		
		//设置窗体名字
		setTitle("我的第一个窗体");
		//设置窗体出现的位置和大小
		setBounds(200, 100, 500, 300);
		//将窗体设置为可见
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TestSwing ts=new TestSwing();
		ts.open();
	}
	
}
