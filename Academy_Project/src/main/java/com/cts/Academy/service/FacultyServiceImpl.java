package com.cts.Academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Academy.bean.Faculty;
import com.cts.Academy.dao.FacultyDAO;

@Service("facultyService")
public class FacultyServiceImpl implements FacultyService{
	
	@Autowired
	private FacultyDAO facultyDAO;
	
	@Override
	public String addProduct(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyDAO.addProduct(faculty);
	}

	@Override
	public String deleteProduct(String Faculty_Id) {
		// TODO Auto-generated method stub
    	return facultyDAO.deleteProduct(Faculty_Id);
	}

	@Override
	public Faculty getProduct(String id) {
		// TODO Auto-generated method stub
		return facultyDAO.getProduct(id);
	}

}
