package org.easybooks.bookstore.service;

import java.util.List;

public interface IContactsService {
	public List getAllContacts();
	public void addContacts(String name, String tel, String email, String company, String division, String post);
	public void deleteContact(String conId);
	public void updateContacts(String Id, String Name, String Tel, String Email, String Company, String Division, String Post);

}
