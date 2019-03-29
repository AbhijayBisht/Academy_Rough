package com.cts.Academy.service;

import com.cts.Academy.bean.Faculty;

public interface FacultyService {
	public String addProduct(Faculty faculty);
	public Faculty getProduct(String id);
	public String deleteProduct(String Faculty_Id);
}
