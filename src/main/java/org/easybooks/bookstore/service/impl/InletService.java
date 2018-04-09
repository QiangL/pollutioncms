package org.easybooks.bookstore.service.impl;

import org.easybooks.bookstore.dao.IInletDAO;
import org.easybooks.bookstore.service.IInletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InletService implements IInletService {
	@Autowired
	private IInletDAO inletDAO;

	public List getAllInlets() {

		return inletDAO.getAllInlets();
	}

	public IInletDAO getInletDAO() {
		return inletDAO;
	}

	public void setInletDAO(IInletDAO inletDAO) {
		this.inletDAO = inletDAO;
	}


}
