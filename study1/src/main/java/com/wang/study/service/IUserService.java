package com.wang.study.service;


import java.util.List;
import com.wang.study.entity.User;

public interface IUserService {
	
	User getUserById(int userId);
	
	List<User> getUserAll();
	
	void save(User user);

	void updateUser(User user);
	
	void delete(int userId);
}
