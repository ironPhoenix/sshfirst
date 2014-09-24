package com.hans.dao.impl;

import org.springframework.stereotype.Component;

import com.hans.dao.LogDao;
import com.hans.dao.SuperDao;
import com.hans.model.Log;

@Component("logDao")
public class LogDaoImpl extends SuperDao implements LogDao {

	@Override
	public int save(Log log) {
		this.getHibernateTemplate().save(log);
		return 0;
	}

}
