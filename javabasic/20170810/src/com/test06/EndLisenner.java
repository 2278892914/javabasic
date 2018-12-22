package com.test06;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;

public class EndLisenner implements ActionListener{
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(BeginLisenner.cp != null){
			BeginLisenner.cp.interrupt();
			BeginLisenner.cp = null;
		}
		
	}

}