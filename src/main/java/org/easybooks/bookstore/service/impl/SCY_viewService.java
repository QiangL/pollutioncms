package org.easybooks.bookstore.service.impl;

import org.easybooks.bookstore.dao.ISCY_viewDAO;
import org.easybooks.bookstore.service.ISCY_viewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SCY_viewService implements ISCY_viewService{
	@Autowired
	private ISCY_viewDAO scy_viewDAO;

	public List getAllSCY_views() {
		
		return scy_viewDAO.getAllSCY_views();
	}

	public ISCY_viewDAO getScy_viewDAO() {
		return scy_viewDAO;
	}

	public void setScy_viewDAO(ISCY_viewDAO scy_viewDAO) {
		this.scy_viewDAO = scy_viewDAO;
	}
	
	
	

}
