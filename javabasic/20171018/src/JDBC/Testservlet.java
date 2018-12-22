package JDBC;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * get只有一个流，参数附近在url后，地址行显示要传送的信息，大小个数有严格的限制，且只能是字符串，post的参数是是通过另外的流传递的
 * 不通过url,所以可能很大，也可以传递二进制数据，比如文件的上传
 */
public class Testservlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//显示调用doPost方法
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
