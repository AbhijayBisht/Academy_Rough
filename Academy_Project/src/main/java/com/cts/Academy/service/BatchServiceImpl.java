package com.cts.Academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Academy.bean.Batch;
import com.cts.Academy.dao.BatchDAO;

@Service("batchService")
public class BatchServiceImpl implements BatchService{

	@Autowired
	BatchDAO batchDAO;

	@Override
	public String batchAllocationPage(Batch batch) {
		return batchDAO.batchAllocationPage(batch);
	}

}
