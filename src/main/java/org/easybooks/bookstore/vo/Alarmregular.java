package org.easybooks.bookstore.vo;

/**
 * Alarmregular entity. @author MyEclipse Persistence Tools
 */

public class Alarmregular implements java.io.Serializable {

	// Fields

	private Integer arNo;
	private String arArea;
	private String entName;
	private String arOutName;
	private String arWrw;
	private String arStandardValue;
	private String arStandardNo;

	// Constructors

	/** default constructor */
	public Alarmregular() {
	}

	/** full constructor */
	public Alarmregular(String arArea, String entName, String arOutName,
			String arWrw, String arStandardValue, String arStandardNo) {
		this.arArea = arArea;
		this.entName = entName;
		this.arOutName = arOutName;
		this.arWrw = arWrw;
		this.arStandardValue = arStandardValue;
		this.arStandardNo = arStandardNo;
	}

	// Property accessors

	public Integer getArNo() {
		return this.arNo;
	}

	public void setArNo(Integer arNo) {
		this.arNo = arNo;
	}

	public String getArArea() {
		return this.arArea;
	}

	public void setArArea(String arArea) {
		this.arArea = arArea;
	}

	public String getEntName() {
		return this.entName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getArOutName() {
		return this.arOutName;
	}

	public void setArOutName(String arOutName) {
		this.arOutName = arOutName;
	}

	public String getArWrw() {
		return this.arWrw;
	}

	public void setArWrw(String arWrw) {
		this.arWrw = arWrw;
	}

	public String getArStandardValue() {
		return this.arStandardValue;
	}

	public void setArStandardValue(String arStandardValue) {
		this.arStandardValue = arStandardValue;
	}

	public String getArStandardNo() {
		return this.arStandardNo;
	}

	public void setArStandardNo(String arStandardNo) {
		this.arStandardNo = arStandardNo;
	}

}