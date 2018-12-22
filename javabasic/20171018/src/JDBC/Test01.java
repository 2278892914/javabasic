package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 参数的的获取以及数据库连接的判断
 */
public class Test01 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//调用dopost方法
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//执行方法,获取参数
		String user = req.getParameter("user");
		String password = req.getParameter("pass");
		//连接数据库进行判断
		try {
			//1,加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//2.连接数据库
			Connection comn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/rent","tiger","tiger");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
