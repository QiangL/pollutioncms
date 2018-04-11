package org.easybooks.bookstore.service.impl;

import org.easybooks.bookstore.dao.IContactsDAO;
import org.easybooks.bookstore.service.IContactsService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class ContactsService implements IContactsService {
	
	//属性contactsDAO
		@ManyToOne
		@Autowired
		private IContactsDAO contactsDAO;
		//得到通讯录中所有联系人
		public List getAllContacts() {
			
			return contactsDAO.getAllContacts();
		}
		
		public void addContacts(String name, String tel, String email, String company, String division, String post){
			contactsDAO.addContacts(name, tel, email, company, division, post);
		}
		
		public void deleteContact(String conId){
			contactsDAO.deleteContact(conId);
		}
		
		public void updateContacts(String Id, String Name, String Tel, String Email, String Company, String Division, String Post){
			contactsDAO.updateContacts(Id, Name, Tel, Email, Company, Division, Post);		
		}
		
		//属性ContactsDAO的getter/setter方法
		public IContactsDAO getContactsDAO() {
			return contactsDAO;
		}
		public void setContactsDAO(IContactsDAO contactsDAO) {
			this.contactsDAO = contactsDAO;
		}

}
