package org.easybooks.bookstore.vo;

/**
 * Mail entity. @author MyEclipse Persistence Tools
 */

public class Mail implements java.io.Serializable {

	// Fields

	private Integer mailId;
	private Integer userId;
	private String mailSubject;
	private String mailText;
	private String mailSendName;
	private String mailSendMail;
	private String mailRecName;
	private String mailRecMail;
	private String mailTime;

	// Constructors

	/** default constructor */
	public Mail() {
	}

	/** full constructor */
	public Mail(Integer userId, String mailSubject, String mailText,
			String mailSendName, String mailSendMail, String mailRecName,
			String mailRecMail, String mailTime) {
		this.userId = userId;
		this.mailSubject = mailSubject;
		this.mailText = mailText;
		this.mailSendName = mailSendName;
		this.mailSendMail = mailSendMail;
		this.mailRecName = mailRecName;
		this.mailRecMail = mailRecMail;
		this.mailTime = mailTime;
	}

	// Property accessors

	public Integer getMailId() {
		return this.mailId;
	}

	public void setMailId(Integer mailId) {
		this.mailId = mailId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getMailSubject() {
		return this.mailSubject;
	}

	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	public String getMailText() {
		return this.mailText;
	}

	public void setMailText(String mailText) {
		this.mailText = mailText;
	}

	public String getMailSendName() {
		return this.mailSendName;
	}

	public void setMailSendName(String mailSendName) {
		this.mailSendName = mailSendName;
	}

	public String getMailSendMail() {
		return this.mailSendMail;
	}

	public void setMailSendMail(String mailSendMail) {
		this.mailSendMail = mailSendMail;
	}

	public String getMailRecName() {
		return this.mailRecName;
	}

	public void setMailRecName(String mailRecName) {
		this.mailRecName = mailRecName;
	}

	public String getMailRecMail() {
		return this.mailRecMail;
	}

	public void setMailRecMail(String mailRecMail) {
		this.mailRecMail = mailRecMail;
	}

	public String getMailTime() {
		return this.mailTime;
	}

	public void setMailTime(String mailTime) {
		this.mailTime = mailTime;
	}

}