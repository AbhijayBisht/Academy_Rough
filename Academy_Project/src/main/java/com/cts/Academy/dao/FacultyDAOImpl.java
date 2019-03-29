package com.cts.Academy.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Academy.bean.Faculty;

@Repository("facultyDAO")
@Transactional
public class FacultyDAOImpl implements FacultyDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private FacultyDAO facultyDAO;
	
	@Override
	public String addProduct(Faculty faculty) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(faculty);
			return "success";
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
}

	@Override
	public String deleteProduct(String Faculty_Id) {
		// TODO Auto-generated method stub
		try {
			Faculty faculty= facultyDAO.getProduct(Faculty_Id);
			sessionFactory.getCurrentSession().delete(faculty);
			return "success";
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public Faculty getProduct(String id) {
		// TODO Auto-generated method stub
		Faculty faculty = null;
		try {
			faculty = sessionFactory.getCurrentSession().load(Faculty.class, id);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(faculty);
		return faculty;
	}

}
