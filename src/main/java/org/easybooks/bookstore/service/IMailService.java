package org.easybooks.bookstore.service;

import java.util.List;

public interface IMailService {

	public List getAllMail();
	public boolean sendMail(String to, String subject, String content) throws Exception;
	public List getAllSign();
	public void updateSign(String id, String signText);
	public void deleteSign(String id);
	public void addSign(String title, String text);
	public void deleteMail(String mailId);
}
