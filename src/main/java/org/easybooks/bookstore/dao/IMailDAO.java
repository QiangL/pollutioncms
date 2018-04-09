package org.easybooks.bookstore.dao;

import org.easybooks.bookstore.vo.Mail;

import java.util.List;

public interface IMailDAO {

	public List getAllMail();
	public void insertMail(Mail mail);
	public void deleteMail(String mailId);
}
