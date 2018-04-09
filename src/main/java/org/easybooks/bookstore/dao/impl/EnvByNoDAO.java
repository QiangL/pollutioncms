package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IEnvByNoDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EnvByNoDAO extends BaseDAO implements IEnvByNoDAO{
    //根据企业序号的到相应的环境
	public List getEnvironmentByEnt_no(Integer Ent_no) {
		Session session = getSession();
		String hql = "from Environment env where env.enterprise.id = ?";
		Query query = session.createQuery(hql);
		query.setInteger(0, Ent_no);
		List environments = query.list();
		session.close();
		return environments;
	}

}
