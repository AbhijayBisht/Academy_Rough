package com.cts.Academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Academy.bean.Module;
import com.cts.Academy.dao.ModuleDAO;

@Service("moduleService")
public class ModuleServiceImpl implements ModuleService{
	
	@Autowired
	ModuleDAO moduleDAO;

	@Override
	public String addModulePage(Module module) {
		// TODO Auto-generated method stub
		return moduleDAO.addModulePage(module);
	}

}
