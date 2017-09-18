package com.wang.study.dao;


import java.util.List;

import com.wang.study.entity.User;

public interface IUserDao {
	
	User getUserById(int userId);
	
	List<User> getAll();
	
	void save(User user);
	
	void update(User user);
	
	void delete(int userId);
}
