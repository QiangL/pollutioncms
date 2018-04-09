package org.easybooks.bookstore.vo;

/**
 * Contacts entity. @author MyEclipse Persistence Tools
 */

public class Contacts implements java.io.Serializable {

	// Fields

	private Integer conId;
	private User user;
	private String conName;
	private String conTel;
	private String conMail;
	private String conCompany;
	private String conDivision;
	private String conPost;

	// Constructors

	/** default constructor */
	public Contacts() {
	}

	/** full constructor */
	public Contacts(User user, String conName, String conTel, String conMail,
			String conCompany, String conDivision, String conPost) {
		this.user = user;
		this.conName = conName;
		this.conTel = conTel;
		this.conMail = conMail;
		this.conCompany = conCompany;
		this.conDivision = conDivision;
		this.conPost = conPost;
	}

	// Property accessors

	public Integer getConId() {
		return this.conId;
	}

	public void setConId(Integer conId) {
		this.conId = conId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getConName() {
		return this.conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public String getConTel() {
		return this.conTel;
	}

	public void setConTel(String conTel) {
		this.conTel = conTel;
	}

	public String getConMail() {
		return this.conMail;
	}

	public void setConMail(String conMail) {
		this.conMail = conMail;
	}

	public String getConCompany() {
		return this.conCompany;
	}

	public void setConCompany(String conCompany) {
		this.conCompany = conCompany;
	}

	public String getConDivision() {
		return this.conDivision;
	}

	public void setConDivision(String conDivision) {
		this.conDivision = conDivision;
	}

	public String getConPost() {
		return this.conPost;
	}

	public void setConPost(String conPost) {
		this.conPost = conPost;
	}

}