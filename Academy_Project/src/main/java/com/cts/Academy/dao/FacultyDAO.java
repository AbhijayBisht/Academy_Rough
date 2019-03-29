package com.cts.Academy.dao;

import com.cts.Academy.bean.Faculty;

public interface FacultyDAO {

	public String addProduct(Faculty faculty);
	public Faculty getProduct(String id);
	public String deleteProduct(String Faculty_Id);

}
