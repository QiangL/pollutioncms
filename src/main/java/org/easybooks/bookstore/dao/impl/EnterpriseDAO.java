package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IEnterpriseDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnterpriseDAO extends BaseDAO implements IEnterpriseDAO{

	public List getAllEnterprises() {
		Session session = getSession();
		Query query = session.createQuery("from Enterprise enterprise");
		List enterprises = query.list();
		session.close();
		return enterprises;
	}

}
