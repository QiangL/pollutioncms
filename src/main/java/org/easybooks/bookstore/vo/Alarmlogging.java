package org.easybooks.bookstore.vo;

import java.sql.Timestamp;

/**
 * Alarmlogging entity. @author MyEclipse Persistence Tools
 */

public class Alarmlogging implements java.io.Serializable {

	// Fields

	private Integer alaNo;
	private String alaState;
	private String alaOutName;
	private Timestamp alaTime;
	private String alaType;
	private String alaWrwName;
	private Float alaWrwValue;
	private Float alaUpper;
	private Float alaLower;

	// Constructors

	/** default constructor */
	public Alarmlogging() {
	}

	/** full constructor */
	public Alarmlogging(String alaState, String alaOutName, Timestamp alaTime,
			String alaType, String alaWrwName, Float alaWrwValue,
			Float alaUpper, Float alaLower) {
		this.alaState = alaState;
		this.alaOutName = alaOutName;
		this.alaTime = alaTime;
		this.alaType = alaType;
		this.alaWrwName = alaWrwName;
		this.alaWrwValue = alaWrwValue;
		this.alaUpper = alaUpper;
		this.alaLower = alaLower;
	}

	// Property accessors

	public Integer getAlaNo() {
		return this.alaNo;
	}

	public void setAlaNo(Integer alaNo) {
		this.alaNo = alaNo;
	}

	public String getAlaState() {
		return this.alaState;
	}

	public void setAlaState(String alaState) {
		this.alaState = alaState;
	}

	public String getAlaOutName() {
		return this.alaOutName;
	}

	public void setAlaOutName(String alaOutName) {
		this.alaOutName = alaOutName;
	}

	public Timestamp getAlaTime() {
		return this.alaTime;
	}

	public void setAlaTime(Timestamp alaTime) {
		this.alaTime = alaTime;
	}

	public String getAlaType() {
		return this.alaType;
	}

	public void setAlaType(String alaType) {
		this.alaType = alaType;
	}

	public String getAlaWrwName() {
		return this.alaWrwName;
	}

	public void setAlaWrwName(String alaWrwName) {
		this.alaWrwName = alaWrwName;
	}

	public Float getAlaWrwValue() {
		return this.alaWrwValue;
	}

	public void setAlaWrwValue(Float alaWrwValue) {
		this.alaWrwValue = alaWrwValue;
	}

	public Float getAlaUpper() {
		return this.alaUpper;
	}

	public void setAlaUpper(Float alaUpper) {
		this.alaUpper = alaUpper;
	}

	public Float getAlaLower() {
		return this.alaLower;
	}

	public void setAlaLower(Float alaLower) {
		this.alaLower = alaLower;
	}

}