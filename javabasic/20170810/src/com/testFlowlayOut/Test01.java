package com.testFlowlayOut;
import java.awt.FlowLayout;

import javax.swing.JButton;
/*
 * Netbeans
 * 
 * 流失布局
 */
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test01 extends JFrame{
	JPanel jp = new JPanel();
	public Test01(){
		jp.setLayout(new FlowLayout(FlowLayout.LEFT,20,50));
		for(int i=0;i<=10;i++){
			JButton jb = new JButton("按钮"+i);
			jp.add(jb);
		}
		
		
		
		
		this.setTitle("流式布局");
		this.setBounds(200, 200, 500, 500);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		Test01 t = new Test01();
	}
}
