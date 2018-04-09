package org.easybooks.bookstore.service.impl;

import org.easybooks.bookstore.dao.ISignDAO;
import org.easybooks.bookstore.service.ISignService;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class SignService implements ISignService {
	  @ManyToOne
		private ISignDAO signDAO;
	  
	  public List getAllSign() {			
			return signDAO.getAllSign();
		}
	  public ISignDAO getSignDAO() {
			return signDAO;
		}
		public void setSignDAO(ISignDAO signDAO) {
			this.signDAO = signDAO;
		}
}
