package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IInletDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InletDAO extends BaseDAO implements IInletDAO{

	public List getAllInlets() {
		Session session = getSession();
		Query query = session.createQuery("from Inlet inlet");
		List inlets = query.list();
		session.close();
		return inlets;
	}

}
