package com.test06;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame{
	
	
	public TestFrame() {
		
		List<JButton> listB = new ArrayList<JButton>();
		JPanel j1 = new JPanel();
		for (int i = 0; i < 32; i++) {
			JButton b1 = new JButton(new ImageIcon("red/"+(i+1)+".png"));
			//设置按钮是否可以点击  --- true可以点击    false不可点击
			b1.setEnabled(false);
			j1.add(b1);
			
			listB.add(b1);
			
		}
		JButton begin = new JButton("开始");
		//多态体现
		begin.addActionListener(new BeginLisenner(listB));
		
		JButton end = new JButton("结束");
		
		end.addActionListener(new EndLisenner());
		
		
		JPanel j2 = new JPanel();
		j2.add(begin);
		j2.add(end);
		
		this.add(j2,"South");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(j1);
		this.setTitle("彩票摇号");
		this.setSize(900, 260);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFrame();
		System.out.println("niaho");
	}
	
}
