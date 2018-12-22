package com.testFlowlayOut;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test03 extends JFrame implements ActionListener{
	
	JTextArea jta = new JTextArea();
	JScrollPane jsp = new JScrollPane(jta);
	
	JTextField jtf = new JTextField(18);
	JButton jb = new JButton("发送");
	JPanel jp = new JPanel();
	
	PrintWriter pw = null;
	Socket sk = null;
	public Test03(){
		this.add(jtf);
		this.add(jb);
		jb.addActionListener(this);
		this.add(jsp);
		this.add(jp,BorderLayout.SOUTH);
		this.setTitle("服务端");
		this.setBounds(200, 200, 300, 500);
		this.setVisible(true);
		
		try {
			ServerSocket ss =new  ServerSocket(10001);
			sk = ss.accept();
			OutputStream os = sk.getOutputStream();
			new PrintWriter(os,true);
			
			InputStream is = sk.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			char[] c = new char[1024];
			int len = 0;
			while((len=isr.read(c))!=-1){
				String s = new String(c,0,len);
				jta.append("客户端说:"+s+"\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		Test03  t = new Test03();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb){
			String message = jtf.getText();
			jta.append("说："+message+"\n");
			pw.println(message);
			try {
				sk.shutdownInput();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			jtf.setText("");
		}
	}
}
