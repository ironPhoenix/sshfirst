package com.hans.dao.impl;

import org.springframework.stereotype.Component;

import com.hans.dao.SuperDao;
import com.hans.dao.UserDao;
import com.hans.model.User;

@Component("userDao")
public class UserDaoImpl extends SuperDao implements UserDao {

	@Override
	public int save(User user) {
		this.getHibernateTemplate().save(user);
		return 0;
	}

}
