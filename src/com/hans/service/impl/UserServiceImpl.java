package com.hans.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hans.dao.LogDao;
import com.hans.dao.UserDao;
import com.hans.model.Log;
import com.hans.model.User;
import com.hans.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	private LogDao logDao;

	@Override
	public int save(User user) {
		userDao.save(user);
		Log log = new Log();
		log.setMessage(user.getClass().getName() + " save");
		logDao.save(log);
		return 0;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public LogDao getLogDao() {
		return logDao;
	}

	@Resource
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}

}
