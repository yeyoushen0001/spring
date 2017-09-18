package com.wang.study.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wang.study.dao.IUserDao;
import com.wang.study.entity.User;
import com.wang.study.service.IUserService;

@Service
public class UserService implements IUserService{
	
	@Resource
	public IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		return this.userDao.getUserById(userId);
	}
	
	@Override
	public List<User> getUserAll() {
		return this.userDao.getAll();
	}
	
	@Override
	public void save(User user) {
		this.userDao.save(user);
	}
	
	@Override
	public void updateUser(User user) {
		this.userDao.update(user);
	}
	
	@Override
	public void delete(int userId) {
		this.userDao.delete(userId);
	}
}
