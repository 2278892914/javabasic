package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.catalina.Manager;

public class Test02 {

	public void add(Emp emp){
		try {
			//.连接数据库,插入数据
			Class.forName("oracle.jdbc.OracleDriver");
			Connection comn = DriverManager.getConnection("jdbc:oracle:thin:"+"@localhost:1521:ORCL","scott","tiger");
			PreparedStatement pre = comn.prepareStatement(" insert into  emp(empno,ename,job) values(?,?,?) ");
			pre.setInt(1, emp.getEmpno());
			pre.setString(2, emp.getEname());
			pre.setString(3, emp.getJob());
			pre.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
