package com.niit.yamahaonlinebackend.DAO;

import java.util.List;

import com.niit.yamahaonlinebackend.model.Product;

public interface ProductDAO {
	
	public boolean save(Product product);
	public boolean delete(Product product);
	public boolean update(Product product);
	public Product get(String Id);
	public List<Product> list();
	

}
