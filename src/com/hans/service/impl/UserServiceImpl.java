package com.hans.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.hans.dao.UserDao;
import com.hans.model.User;
import com.hans.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Override
	public int save(User user) {
		userDao.save(user);
		return 0;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
