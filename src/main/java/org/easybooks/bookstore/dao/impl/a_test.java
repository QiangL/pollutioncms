package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.vo.Alarmlogging;

import java.util.List;


public class a_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		//test EnvByNoDAO
		EnvByNoDAO a = new EnvByNoDAO();
		List envs = a.getEnvironmentByEnt_no(3);
		Environment env = (Environment) envs.get(0);
		System.out.println(env.toString());
		*/
		
		//test AlarmloggingDAO
		AlarmloggingDAO b = new AlarmloggingDAO();
		List alr = b.getAllAlarmloggings();
		Alarmlogging al = (Alarmlogging) alr.get(0);
		System.out.println(al.toString());

	}

}
