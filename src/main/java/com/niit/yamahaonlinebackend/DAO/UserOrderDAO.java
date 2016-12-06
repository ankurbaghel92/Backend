package com.niit.yamahaonlinebackend.DAO;

import com.niit.yamahaonlinebackend.model.Order;

public interface UserOrderDAO {
	
	public boolean save(Order userorder);
	public boolean delete(Order userorder);
	public Order get(String Id);

}
