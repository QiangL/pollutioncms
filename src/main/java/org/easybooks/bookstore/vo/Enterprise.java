package org.easybooks.bookstore.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Enterprise entity. @author MyEclipse Persistence Tools
 */

public class Enterprise implements java.io.Serializable {

	// Fields

	private Integer entNo;
	private Environment environment;
	private Manage manage;
	private String entName;
	private String entShort;
	private String entAddress;
	private String entClass;
	private String entRegisterClass;
	private String entFrNo;
	private String entFrName;
	private String entFrTel;
	private String entFrAddress;
	private String entFrPostalcode;
	private Float entLatitude;
	private Float entLongitude;
	private String entTradeClass;
	private String entSubRelation;
	private String entBank;
	private String entBankNumber;
	private String entEmail;
	private String entWeb;
	private String entCommissionDate;
	private Float entAcreage;
	private String entStreet;
	private String entFoundedTime;
	private Float entFund;
	private String entRemark;
	private Set outfalls = new HashSet(0);
	private Set inlets = new HashSet(0);
	private Set scies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Enterprise() {
	}

	/** full constructor */
	public Enterprise(Environment environment, Manage manage, String entName,
			String entShort, String entAddress, String entClass,
			String entRegisterClass, String entFrNo, String entFrName,
			String entFrTel, String entFrAddress, String entFrPostalcode,
			Float entLatitude, Float entLongitude, String entTradeClass,
			String entSubRelation, String entBank, String entBankNumber,
			String entEmail, String entWeb, String entCommissionDate,
			Float entAcreage, String entStreet, String entFoundedTime,
			Float entFund, String entRemark, Set outfalls, Set inlets, Set scies) {
		this.environment = environment;
		this.manage = manage;
		this.entName = entName;
		this.entShort = entShort;
		this.entAddress = entAddress;
		this.entClass = entClass;
		this.entRegisterClass = entRegisterClass;
		this.entFrNo = entFrNo;
		this.entFrName = entFrName;
		this.entFrTel = entFrTel;
		this.entFrAddress = entFrAddress;
		this.entFrPostalcode = entFrPostalcode;
		this.entLatitude = entLatitude;
		this.entLongitude = entLongitude;
		this.entTradeClass = entTradeClass;
		this.entSubRelation = entSubRelation;
		this.entBank = entBank;
		this.entBankNumber = entBankNumber;
		this.entEmail = entEmail;
		this.entWeb = entWeb;
		this.entCommissionDate = entCommissionDate;
		this.entAcreage = entAcreage;
		this.entStreet = entStreet;
		this.entFoundedTime = entFoundedTime;
		this.entFund = entFund;
		this.entRemark = entRemark;
		this.outfalls = outfalls;
		this.inlets = inlets;
		this.scies = scies;
	}

	// Property accessors

	public Integer getEntNo() {
		return this.entNo;
	}

	public void setEntNo(Integer entNo) {
		this.entNo = entNo;
	}

	public Environment getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public Manage getManage() {
		return this.manage;
	}

	public void setManage(Manage manage) {
		this.manage = manage;
	}

	public String getEntName() {
		return this.entName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getEntShort() {
		return this.entShort;
	}

	public void setEntShort(String entShort) {
		this.entShort = entShort;
	}

	public String getEntAddress() {
		return this.entAddress;
	}

	public void setEntAddress(String entAddress) {
		this.entAddress = entAddress;
	}

	public String getEntClass() {
		return this.entClass;
	}

	public void setEntClass(String entClass) {
		this.entClass = entClass;
	}

	public String getEntRegisterClass() {
		return this.entRegisterClass;
	}

	public void setEntRegisterClass(String entRegisterClass) {
		this.entRegisterClass = entRegisterClass;
	}

	public String getEntFrNo() {
		return this.entFrNo;
	}

	public void setEntFrNo(String entFrNo) {
		this.entFrNo = entFrNo;
	}

	public String getEntFrName() {
		return this.entFrName;
	}

	public void setEntFrName(String entFrName) {
		this.entFrName = entFrName;
	}

	public String getEntFrTel() {
		return this.entFrTel;
	}

	public void setEntFrTel(String entFrTel) {
		this.entFrTel = entFrTel;
	}

	public String getEntFrAddress() {
		return this.entFrAddress;
	}

	public void setEntFrAddress(String entFrAddress) {
		this.entFrAddress = entFrAddress;
	}

	public String getEntFrPostalcode() {
		return this.entFrPostalcode;
	}

	public void setEntFrPostalcode(String entFrPostalcode) {
		this.entFrPostalcode = entFrPostalcode;
	}

	public Float getEntLatitude() {
		return this.entLatitude;
	}

	public void setEntLatitude(Float entLatitude) {
		this.entLatitude = entLatitude;
	}

	public Float getEntLongitude() {
		return this.entLongitude;
	}

	public void setEntLongitude(Float entLongitude) {
		this.entLongitude = entLongitude;
	}

	public String getEntTradeClass() {
		return this.entTradeClass;
	}

	public void setEntTradeClass(String entTradeClass) {
		this.entTradeClass = entTradeClass;
	}

	public String getEntSubRelation() {
		return this.entSubRelation;
	}

	public void setEntSubRelation(String entSubRelation) {
		this.entSubRelation = entSubRelation;
	}

	public String getEntBank() {
		return this.entBank;
	}

	public void setEntBank(String entBank) {
		this.entBank = entBank;
	}

	public String getEntBankNumber() {
		return this.entBankNumber;
	}

	public void setEntBankNumber(String entBankNumber) {
		this.entBankNumber = entBankNumber;
	}

	public String getEntEmail() {
		return this.entEmail;
	}

	public void setEntEmail(String entEmail) {
		this.entEmail = entEmail;
	}

	public String getEntWeb() {
		return this.entWeb;
	}

	public void setEntWeb(String entWeb) {
		this.entWeb = entWeb;
	}

	public String getEntCommissionDate() {
		return this.entCommissionDate;
	}

	public void setEntCommissionDate(String entCommissionDate) {
		this.entCommissionDate = entCommissionDate;
	}

	public Float getEntAcreage() {
		return this.entAcreage;
	}

	public void setEntAcreage(Float entAcreage) {
		this.entAcreage = entAcreage;
	}

	public String getEntStreet() {
		return this.entStreet;
	}

	public void setEntStreet(String entStreet) {
		this.entStreet = entStreet;
	}

	public String getEntFoundedTime() {
		return this.entFoundedTime;
	}

	public void setEntFoundedTime(String entFoundedTime) {
		this.entFoundedTime = entFoundedTime;
	}

	public Float getEntFund() {
		return this.entFund;
	}

	public void setEntFund(Float entFund) {
		this.entFund = entFund;
	}

	public String getEntRemark() {
		return this.entRemark;
	}

	public void setEntRemark(String entRemark) {
		this.entRemark = entRemark;
	}

	public Set getOutfalls() {
		return this.outfalls;
	}

	public void setOutfalls(Set outfalls) {
		this.outfalls = outfalls;
	}

	public Set getInlets() {
		return this.inlets;
	}

	public void setInlets(Set inlets) {
		this.inlets = inlets;
	}

	public Set getScies() {
		return this.scies;
	}

	public void setScies(Set scies) {
		this.scies = scies;
	}

}