package DAO;

import bean.Item;
import bean.User;

public abstract class DAOFactory {

	public static DAOFactory getDAo()
	{
		DAOFactory factory = new SQLDao();
		return factory;
	}
	public abstract boolean LoginUser(User user);
	
	public abstract boolean InsertProduct(Item item);
}
