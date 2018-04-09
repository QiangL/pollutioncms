package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IEnvironmentDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnvironmentDAO extends BaseDAO implements IEnvironmentDAO{
    //得到所有环境
	public List getAllEnvironments() {
		Session session = getSession();
		Query query = session.createQuery("from Environment env");
		List environments = query.list();
		session.close();
		return environments;
	}

}
