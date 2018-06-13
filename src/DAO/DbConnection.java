package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import constant.Constant;

public class DbConnection {
	
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(Constant.DB_HOST + Constant.DB_NAME,Constant.DB_USER_NAME,Constant.DB_USER_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
