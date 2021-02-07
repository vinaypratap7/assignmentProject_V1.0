package com.project.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.spring.dao.TestDAO;

@Service
@Transactional(readOnly = true)
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDAO TestDao;
	

	@Override
	public void update() {
		TestDao.update();
		
	}

}
