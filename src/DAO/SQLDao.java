package DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import bean.Item;
import bean.User;
import constant.Constant;

public class SQLDao extends DAOFactory{

	boolean flag = false;
	Connection con;
	Statement st;
	String query;
	ResultSet res;
	int rs;
	@Override
	public boolean LoginUser(User user) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			String query = "SELECT * FROM "+Constant.DB_USER_TABLE+" WHERE `email_id`='"+user.getEmail()+"' AND PASSWORD='"+user.getPassword()+"'";
			res = st.executeQuery(query);
			
			if(res.next())
				flag = true;
			con.close();
			st.close();
			res.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public boolean InsertProduct(Item item) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query = "insert into "+Constant.DB_Item_TABLE+"(name,price,quantity)values('"+item.getName()+"','"+item.getPrice()+"','"+item.getQty()+"')";
			rs = st.executeUpdate(query);
			if(rs>0)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public boolean UpdateProduct(Item item) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query = "Update "+Constant.DB_Item_TABLE+" set name='"+item.getName()+"',price='"+item.getPrice()+"',quantity='"+item.getQty()+"'  where name='"+item.getSel_name()+"' ";
			rs = st.executeUpdate(query);
			if(rs>0)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public boolean DeleteProduct(Item item) {
		try {
			con = DbConnection.getConnection();
			st = con.createStatement();
			query = "DELETE FROM "+Constant.DB_Item_TABLE+" WHERE name='"+item.getSel_name()+"'";
			rs = st.executeUpdate(query);
			if(rs>0)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	
}
