package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.ISignDAO;
import org.easybooks.bookstore.vo.Sign;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SignDAO extends BaseDAO implements ISignDAO {
	SignDAO(){

	}
	public List getAllSign() {
		Session session = getSession();
		Query query = session.createQuery("from Sign a");
		List sign = query.list();
		session.close();
		return sign;
	}
	
	public void updateSign(String id, String signText){
		try{
		Session session = getSession();
		
		Query query = session.createQuery("from Sign a");
		List sign = query.list();
		
		Sign closeSign = new Sign();
		Sign openSign = new Sign();
		for(int i=0;i<sign.size(); i++){
			Sign si = (Sign)sign.get(i);
			if(si.getSignState().equals("open")) closeSign = si;
			if(si.getSignId().toString().equals(id)) openSign = si;
		}
				
		closeSign.setSignState("close");
		Transaction tran = session.beginTransaction();
		session.update(closeSign);
		tran.commit();
		
		openSign.setSignState("open");
		openSign.setSignText(signText);
		tran = session.beginTransaction();
		session.update(openSign);
		tran.commit();
		session.close();
		}catch(Exception exp){
			System.out.print(exp.toString());
		}
	}
	
	public void deleteSign(String id) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Query query = session.createQuery("from Sign a");
		List sign = query.list();
		
		Sign s = new Sign();
		for(int i=0;i<sign.size(); i++){
			Sign si = (Sign)sign.get(i);
			if((si.getSignId()).toString().equals(id)) s = si;
		}
		Transaction tran = session.beginTransaction();
		
		session.delete(s);
		tran.commit();
		session.close();
	}
	
	public void addSign(String title, String text){
		Session session = getSession();
		Query query = session.createQuery("from Sign a");
		List sign = query.list();
		
		Sign s = new Sign();
		for(int i=0;i<sign.size(); i++){
			Sign si = (Sign)sign.get(i);
			if((si.getSignState()).equals("open")) s = si;
		}
		
		s.setSignState("close");
		
		Sign newSign=new Sign();
		newSign.setSignState("open");
		newSign.setSignTitle(title);
		newSign.setSignText(text);
		Transaction tran = session.beginTransaction();
		
		if(s.getSignId()!=null)
			session.update(s);
		session.save(newSign);
		tran.commit();
	}
}
