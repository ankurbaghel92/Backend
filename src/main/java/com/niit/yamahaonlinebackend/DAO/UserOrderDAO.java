package com.niit.yamahaonlinebackend.DAO;

import com.niit.yamahaonlinebackend.model.UserOrder;

public interface UserOrderDAO {
	
	public boolean save(UserOrder userorder);
	public boolean delete(UserOrder userorder);
	public UserOrder get(String Id);

}
