package com.cts.Academy.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Academy.bean.Module;

@Repository("moduleDAO")
@Transactional
public class ModuleDAOImpl implements ModuleDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addModulePage(Module module) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(module);
			return "success";
		} catch (HibernateException e) {
			e.printStackTrace();
			return "fail";
		}
	}
}