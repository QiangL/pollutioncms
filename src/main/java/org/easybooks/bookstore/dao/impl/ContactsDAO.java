package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IContactsDAO;
import org.easybooks.bookstore.vo.Contacts;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactsDAO extends BaseDAO implements IContactsDAO {
	ContactsDAO(){
	}
	public List getAllContacts() {
		Session session = getSession();
		Query query = session.createQuery("from Contacts a");
		List contacts = query.list();
		session.close();
		return contacts;
	}
	

	public void addContacts(String name, String tel, String email, String company, String division, String post){
		Session session = getSession();
		Query query = session.createQuery("from Contacts a");
		List contacts = query.list();
		Contacts c = new Contacts();
		for(int i=0;i<contacts.size(); i++){
			Contacts ci = (Contacts)contacts.get(i);
		}
		
		Contacts newContacts = new Contacts();
		newContacts.setConName(name);
		newContacts.setConTel(tel);
		newContacts.setConMail(email);
		newContacts.setConCompany(company);
		newContacts.setConDivision(division);
		newContacts.setConPost(post);
		Transaction tran = session.beginTransaction();
		session.save(newContacts);
		tran.commit();	
	}
	
	public void deleteContact(String conId){
		Session session = getSession();
		Query query = session.createQuery("from Contacts a");
		List contacts = query.list();
		Contacts c = new Contacts();
		for(int i=0;i<contacts.size(); i++){
			Contacts ci = (Contacts)contacts.get(i);
			if(conId.equals(ci.getConId().toString())) {
				c = ci;
				break;
			}
			
		}
        Transaction tran = session.beginTransaction();		
		session.delete(c);
		tran.commit();
		session.close();
	}
	
	public void updateContacts(String Id, String Name, String Tel, String Email, String Company, String Division, String Post){
		Session session = getSession();
		Query query = session.createQuery("from Contacts a");
		List contacts = query.list();
		Contacts c = new Contacts();
		for(int i=0;i<contacts.size(); i++){
			Contacts ci=(Contacts)contacts.get(i);
			if(ci.getConId().toString().equals(Id)) 	c = ci;	
			//if(conId.equals(ci.getConId().toString()))
		}
		c.setConName(Name);
		c.setConTel(Tel);
		c.setConMail(Email);
		c.setConCompany(Company);
		c.setConDivision(Division);
		c.setConPost(Post);
		Transaction tran = session.beginTransaction();
		tran = session.beginTransaction();
		session.update(c);
		tran.commit();
		session.close();
	}
}
