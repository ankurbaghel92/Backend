package com.niit.yamahaonlinebackend.DAO;

import com.niit.yamahaonlinebackend.model.UserOrder;

public interface UserOrderDAO {
	
	public boolean save(UserOrder userDAO);
	public boolean delete(UserOrder userDAO);
	public UserOrder get(String Id);

}
