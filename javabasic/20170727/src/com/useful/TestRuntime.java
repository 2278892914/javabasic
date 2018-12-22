package com.useful;

import java.io.IOException;

/*
 * java 的运行机制，在java虚拟机运行期间执行的功能
 */
public class TestRuntime {
	
	public static void main(String[] args) throws IOException  {
		Runtime r= Runtime.getRuntime();
		System.out.println(r.totalMemory());
		//用于打开其他应用
		r.exec("H:\\360Downloads\\Tencent\\QQ\\Bin\\QQScLauncher.exe");
	}	
}

