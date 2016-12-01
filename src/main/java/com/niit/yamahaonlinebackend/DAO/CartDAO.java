package com.niit.yamahaonlinebackend.DAO;

import java.util.List;

import com.niit.yamahaonlinebackend.model.Cart;

public interface CartDAO {

	public List<Cart> list(String Id);
	public boolean Save(Cart cart);
	public boolean delete(String Id);
	public boolean update(Cart cart);
	public Integer getMaxId();
	public Cart get(String Id);
	public Long get_TotalAmount(String Id);
}
