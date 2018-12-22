package com.testFlowlayOut;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame  implements ActionListener{
	
	JTextArea jta = new JTextArea();
	JScrollPane jsp = new JScrollPane(jta);
	
	JTextField jtf = new JTextField(18);
	JButton jb = new JButton("发送");
	JPanel jp = new JPanel();
	PrintWriter pw = null;
	Socket sk = null;
	public Client(){
		this.add(jtf);
		this.add(jb);
		this.add(jsp);
		this.add(jp,BorderLayout.SOUTH);
		
		
		this.setTitle("客户端");
		this.setBounds(200, 200, 300, 500);
		this.setVisible(true);
		try {
			Socket sk = new Socket("127.0.0.1",10001);
			
			
			OutputStream os = sk.getOutputStream();
			new PrintWriter(os,true);
			
			InputStream is = sk.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			char[] c = new char[1024];
			int len = 0;
			while((len=isr.read(c))!=-1){
				String s = new String(c,0,len);
				jta.append("服务端说:"+s+"\n");
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Client  t = new Client();
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