package org.easybooks.bookstore.vo;

import java.util.Date;

/**
 * Datamanage entity. @author MyEclipse Persistence Tools
 */

public class Datamanage implements java.io.Serializable {

	// Fields

	private Integer daNo;
	private String daArea;
	private String daOutName;
	private String daDegree;
	private Date daLastTime;
	private String daState;
	private Date daDataTime;
	private Date daCodToc;
	private Float daPh;
	private String daPhState;
	private Float daCod;
	private String daCodState;
	private Float daToc;
	private String daTocState;
	private Float daAd;
	private String daAdState;
	private Float daTn;
	private String daTnState;

	// Constructors

	/** default constructor */
	public Datamanage() {
	}

	/** full constructor */
	public Datamanage(String daArea, String daOutName, String daDegree,
			Date daLastTime, String daState, Date daDataTime, Date daCodToc,
			Float daPh, String daPhState, Float daCod, String daCodState,
			Float daToc, String daTocState, Float daAd, String daAdState,
			Float daTn, String daTnState) {
		this.daArea = daArea;
		this.daOutName = daOutName;
		this.daDegree = daDegree;
		this.daLastTime = daLastTime;
		this.daState = daState;
		this.daDataTime = daDataTime;
		this.daCodToc = daCodToc;
		this.daPh = daPh;
		this.daPhState = daPhState;
		this.daCod = daCod;
		this.daCodState = daCodState;
		this.daToc = daToc;
		this.daTocState = daTocState;
		this.daAd = daAd;
		this.daAdState = daAdState;
		this.daTn = daTn;
		this.daTnState = daTnState;
	}

	// Property accessors

	public Integer getDaNo() {
		return this.daNo;
	}

	public void setDaNo(Integer daNo) {
		this.daNo = daNo;
	}

	public String getDaArea() {
		return this.daArea;
	}

	public void setDaArea(String daArea) {
		this.daArea = daArea;
	}

	public String getDaOutName() {
		return this.daOutName;
	}

	public void setDaOutName(String daOutName) {
		this.daOutName = daOutName;
	}

	public String getDaDegree() {
		return this.daDegree;
	}

	public void setDaDegree(String daDegree) {
		this.daDegree = daDegree;
	}

	public Date getDaLastTime() {
		return this.daLastTime;
	}

	public void setDaLastTime(Date daLastTime) {
		this.daLastTime = daLastTime;
	}

	public String getDaState() {
		return this.daState;
	}

	public void setDaState(String daState) {
		this.daState = daState;
	}

	public Date getDaDataTime() {
		return this.daDataTime;
	}

	public void setDaDataTime(Date daDataTime) {
		this.daDataTime = daDataTime;
	}

	public Date getDaCodToc() {
		return this.daCodToc;
	}

	public void setDaCodToc(Date daCodToc) {
		this.daCodToc = daCodToc;
	}

	public Float getDaPh() {
		return this.daPh;
	}

	public void setDaPh(Float daPh) {
		this.daPh = daPh;
	}

	public String getDaPhState() {
		return this.daPhState;
	}

	public void setDaPhState(String daPhState) {
		this.daPhState = daPhState;
	}

	public Float getDaCod() {
		return this.daCod;
	}

	public void setDaCod(Float daCod) {
		this.daCod = daCod;
	}

	public String getDaCodState() {
		return this.daCodState;
	}

	public void setDaCodState(String daCodState) {
		this.daCodState = daCodState;
	}

	public Float getDaToc() {
		return this.daToc;
	}

	public void setDaToc(Float daToc) {
		this.daToc = daToc;
	}

	public String getDaTocState() {
		return this.daTocState;
	}

	public void setDaTocState(String daTocState) {
		this.daTocState = daTocState;
	}

	public Float getDaAd() {
		return this.daAd;
	}

	public void setDaAd(Float daAd) {
		this.daAd = daAd;
	}

	public String getDaAdState() {
		return this.daAdState;
	}

	public void setDaAdState(String daAdState) {
		this.daAdState = daAdState;
	}

	public Float getDaTn() {
		return this.daTn;
	}

	public void setDaTn(Float daTn) {
		this.daTn = daTn;
	}

	public String getDaTnState() {
		return this.daTnState;
	}

	public void setDaTnState(String daTnState) {
		this.daTnState = daTnState;
	}

}