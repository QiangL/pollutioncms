package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IAlarmloggingDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlarmloggingDAO extends BaseDAO implements IAlarmloggingDAO{

	public List getAllAlarmloggings() {
		Session session = getSession();
		Query query = session.createQuery("from Alarmlogging alarmlogging");
		List alarmloggings = query.list();
		session.close();
		return alarmloggings;
	}

}
