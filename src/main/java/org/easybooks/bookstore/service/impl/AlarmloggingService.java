package org.easybooks.bookstore.service.impl;

import org.easybooks.bookstore.dao.IAlarmloggingDAO;
import org.easybooks.bookstore.service.IAlarmloggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmloggingService implements IAlarmloggingService {
	@Autowired
	private IAlarmloggingDAO alarmloggingDAO;

	public List getAllAlarmloggings() {
		return alarmloggingDAO.getAllAlarmloggings();
	}

	public IAlarmloggingDAO getAlarmloggingDAO() {
		return alarmloggingDAO;
	}

	public void setAlarmloggingDAO(IAlarmloggingDAO alarmloggingDAO) {
		this.alarmloggingDAO = alarmloggingDAO;
	}


}
