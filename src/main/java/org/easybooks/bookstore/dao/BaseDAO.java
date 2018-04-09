package org.easybooks.bookstore.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAO {
	@Autowired
	private SessionFactory sessionFactory1;
	public SessionFactory getSessionFactory(){
		return sessionFactory1;
	}
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory1 = sessionFactory;
	}
	public Session getSession(){
		Session session = sessionFactory1.openSession();
		return session;
	}

}
