package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IAlarmRegularDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlarmRegularDAO extends BaseDAO implements IAlarmRegularDAO{

	public List getAllAlarmRegular() {
		Session session = getSession();
		Query query = session.createQuery("from Alarmregular a");
		List alarmRegulars = query.list();
		System.out.println("AlarmRegularDAO:size"+alarmRegulars.size());
		session.close();
		return alarmRegulars;
	}
	

}
