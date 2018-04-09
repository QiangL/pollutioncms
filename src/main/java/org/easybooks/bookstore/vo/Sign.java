package org.easybooks.bookstore.vo;

/**
 * Sign entity. @author MyEclipse Persistence Tools
 */

public class Sign implements java.io.Serializable {

	// Fields

	private Integer signId;
	private User user;
	private String signTitle;
	private String signText;
	private String signState;

	// Constructors

	/** default constructor */
	public Sign() {
	}

	/** full constructor */
	public Sign(User user, String signTitle, String signText, String signState) {
		this.user = user;
		this.signTitle = signTitle;
		this.signText = signText;
		this.signState = signState;
	}

	// Property accessors

	public Integer getSignId() {
		return this.signId;
	}

	public void setSignId(Integer signId) {
		this.signId = signId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSignTitle() {
		return this.signTitle;
	}

	public void setSignTitle(String signTitle) {
		this.signTitle = signTitle;
	}

	public String getSignText() {
		return this.signText;
	}

	public void setSignText(String signText) {
		this.signText = signText;
	}

	public String getSignState() {
		return this.signState;
	}

	public void setSignState(String signState) {
		this.signState = signState;
	}

}