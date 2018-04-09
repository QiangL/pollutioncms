package org.easybooks.bookstore.service.impl;

import org.easybooks.bookstore.dao.IEnvironmentDAO;
import org.easybooks.bookstore.service.IEnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvironmentService implements IEnvironmentService{
	@Autowired
	private IEnvironmentDAO environmentDAO;
	
    //得到所有环境
	public List getAllEnvironments() {
		return environmentDAO.getAllEnvironments();
	}

	public IEnvironmentDAO getEnvironmentDAO() {
		return environmentDAO;
	}

	public void setEnvironmentDAO(IEnvironmentDAO environmentDAO) {
		this.environmentDAO = environmentDAO;
	}
	
}
