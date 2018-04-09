package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IMailDAO;
import org.easybooks.bookstore.vo.Mail;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MailDAO extends BaseDAO implements IMailDAO {

	MailDAO(){
//		System.out.println("MailDAO=====");
	}
	
	
	public List getAllMail() {
		Session session = getSession();
		Query query = session.createQuery("from Mail a");
		List mail = query.list();
		System.out.println("MailDAO:size"+mail.size());
		session.close();
		return mail;
	}
	
	public void insertMail(Mail mail){
		Session session = getSession();
		Transaction tran = session.beginTransaction();
		session.save(mail);//执行  
		tran.commit();//提交  
	}
	public void deleteMail(String mailId){
		Session session = getSession();
		Query query = session.createQuery("from Mail a");
		List mail = query.list();
		Mail c = new Mail();
		for(int i=0;i<mail.size(); i++){
			Mail ci = (Mail)mail.get(i);
			if(mailId.equals(ci.getMailId().toString())) {
				c = ci;
				break;
			}			
		}
        Transaction tran = session.beginTransaction();		
		session.delete(c);
		tran.commit();
		session.close();
	}
	
}
