package com.hans.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.hans.dao.LogDao;
import com.hans.model.Log;

@Component("logDao")
public class LogDaoImpl implements LogDao {

	private SessionFactory sessionFactory;

	@Override
	public int save(Log log) {
		Session session = sessionFactory.getCurrentSession();
		session.save(log);
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
