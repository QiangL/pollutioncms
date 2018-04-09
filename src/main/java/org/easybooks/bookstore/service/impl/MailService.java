package org.easybooks.bookstore.service.impl;

//import java.sql.Timestamp;

import org.apache.commons.mail.HtmlEmail;
import org.easybooks.bookstore.dao.IMailDAO;
import org.easybooks.bookstore.dao.ISignDAO;
import org.easybooks.bookstore.service.IMailService;
import org.easybooks.bookstore.vo.Mail;

import javax.persistence.ManyToOne;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MailService implements IMailService {

	// 属性contactsDAO
	@ManyToOne
	private IMailDAO mailDAO;
	@ManyToOne
	private ISignDAO signDAO;

	public boolean sendMail(String to, String subject, String content)
			throws Exception {
		String host = "smtp.163.com";
		String from = "websystem123@163.com";
		String username = "websystem123";
		String password = "sunflower123";
	
		/*
		 * //接收者邮箱 String to = "1067513726@qq.com"; String subject="这是测试主题！";
		 * String mailConent="这是测试邮件";
		 */
		// 调用发送附件邮件方法
		return sendAttachmentMail(host, from, username, password, to, subject,
				content);
	}

	public boolean sendAttachmentMail(String host, String from,
			String username, String password, String to, String subject,
			String mailConent) throws Exception {
		HtmlEmail email = new HtmlEmail();
		email.setAuthentication(username, password);
		email.setHostName(host);
		email.addTo(to, from);
		email.setFrom(from);
		email.setSubject(subject);
		// 注意，发送内容时，后面这段会让中文正常显示，否则乱码
		email.setCharset("GB2312");
		email.setHtmlMsg("<html>" + mailConent + "</html>"); /* 邮件内容 */
		email.send();
		System.out.println("邮件发送成功！");
		
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	
		String now =format.format(date);
		//Timestamp now = new Timestamp(System.currentTimeMillis());
		
		Mail mail = new Mail(0, subject, mailConent, "websystem",
				"websystem123@163.com", to, to, now);
		mailDAO.insertMail(mail);
		return true;
	}

	public List getAllMail() {
		return mailDAO.getAllMail();
	}

	public IMailDAO getMailDAO() {
		return mailDAO;
	}

	public void setMailDAO(IMailDAO mailDAO) {
		this.mailDAO = mailDAO;
	}

	public List getAllSign() {
		return signDAO.getAllSign();
	}

	public ISignDAO getSignDAO() {
		return signDAO;
	}

	public void setSignDAO(ISignDAO signDAO) {
		this.signDAO = signDAO;
	}

	public void updateSign(String id, String signText) {
		signDAO.updateSign(id, signText);
	}

	public void deleteSign(String id) {
		signDAO.deleteSign(id);
		
	}

	public void addSign(String title, String text) {
		// TODO Auto-generated method stub
		signDAO.addSign(title, text);
	}
	
    public void deleteMail(String mailId){
		mailDAO.deleteMail(mailId);
	}
}
