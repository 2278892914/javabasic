package com.test06;

import java.util.List;
import java.util.Random;

import javax.swing.JButton;

public class CPThread extends Thread{
	
	private List<JButton> listB ;
	
	public CPThread(List<JButton> listB) {
		this.listB = listB;
	}
	@Override
	public void run() {
		while(!this.isInterrupted()){
			for (int i = 0; i < listB.size(); i++) {
				JButton j1 = listB.get(i);
				j1.setEnabled(false);
			}
			Random ran = new Random();
			for (int i = 0; i < 6;){
				int t  = ran.nextInt(33);
				
				JButton j1 = listB.get(t);
				if(j1.isEnabled()){
					continue;
				}
				j1.setEnabled(true);
				i++;
			}
		}
	}
	
	
}
