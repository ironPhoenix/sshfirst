package com.hans.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.hans.dao.UserDao;
import com.hans.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;

	@Override
	public int save(User user) {
		System.out.println("p");
		Session session = sessionFactory.openSession();
		System.out.println("q");
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		return 0;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
