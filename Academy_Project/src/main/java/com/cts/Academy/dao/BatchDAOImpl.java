package com.cts.Academy.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Academy.bean.Batch;

@Repository("batchDAO")
@Transactional
public class BatchDAOImpl implements BatchDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String batchAllocationPage(Batch batch) {
		// TODO Auto-generated method stub
		
		try {
			sessionFactory.getCurrentSession().save(batch);
			return "success";
		} catch (HibernateException e) {
			e.printStackTrace();
			return "fail";
		}
	}

}
