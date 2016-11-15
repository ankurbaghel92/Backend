package com.niit.yamahaonlinebackend.DAO;

import com.niit.yamahaonlinebackend.model.Cart;

public interface CartDAO {

	public boolean Save(Cart cart);
	public boolean delete(Cart cart);
	public Cart get(String Id);
}
