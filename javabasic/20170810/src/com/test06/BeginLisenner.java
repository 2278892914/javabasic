package com.test06;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;

public class BeginLisenner implements ActionListener{
	
	private List<JButton> listB ;
	
	public static CPThread cp;
	
	public BeginLisenner(List<JButton> listB) {
		this.listB = listB;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(cp == null){
			cp = new CPThread(listB);
			cp.start();
		}
		
		
	}

}