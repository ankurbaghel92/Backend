package com.niit.yamahaonlinebackend.DAO;

import java.util.List;

import com.niit.yamahaonlinebackend.model.User;

public interface UserDAO {
	
	public boolean save(User user);
	public boolean delete(User user);
	public boolean update(User user);
	public User get(String userId);
	public List<User> list();

}
