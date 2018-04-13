package org.easybooks.bookstore.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAO {
	@Autowired
	private SessionFactory sessionFactory1;
	public Session getSession(){
		Session session = sessionFactory1.openSession();
		return session;
	}
	public SessionFactory getSessionFactory1() {
		return sessionFactory1;
	}
	public void setSessionFactory1(SessionFactory sessionFactory1) {
		this.sessionFactory1 = sessionFactory1;
	}
	
	
}
