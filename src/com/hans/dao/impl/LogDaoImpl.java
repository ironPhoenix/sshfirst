package com.hans.dao.impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hans.dao.LogDao;
import com.hans.model.Log;

@Component("logDao")
public class LogDaoImpl implements LogDao {

	private HibernateTemplate hibernateTemplate;

	@Override
	public int save(Log log) {

		hibernateTemplate.save(log);
		return 0;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
