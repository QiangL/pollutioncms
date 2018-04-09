package org.easybooks.bookstore.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Inlet entity. @author MyEclipse Persistence Tools
 */

public class Inlet implements java.io.Serializable {

	// Fields

	private Integer inNo;
	private Enterprise enterprise;
	private String inCleanName;
	private String inWaterNo;
	private String inWaterName;
	private String inRange;
	private String inLocation;
	private String inState;
	private String inWatershed;
	private String inWaterSystem;
	private String inTributary;
	private String inSection;
	private String inWatersFunction;
	private String inDomain;
	private Float inLatitude;
	private Float inLongitude;
	private String inDataReport;
	private Integer inReportNo;
	private String inReportMn;
	private String inOpen;
	private Set scies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Inlet() {
	}

	/** full constructor */
	public Inlet(Enterprise enterprise, String inCleanName, String inWaterNo,
			String inWaterName, String inRange, String inLocation,
			String inState, String inWatershed, String inWaterSystem,
			String inTributary, String inSection, String inWatersFunction,
			String inDomain, Float inLatitude, Float inLongitude,
			String inDataReport, Integer inReportNo, String inReportMn,
			String inOpen, Set scies) {
		this.enterprise = enterprise;
		this.inCleanName = inCleanName;
		this.inWaterNo = inWaterNo;
		this.inWaterName = inWaterName;
		this.inRange = inRange;
		this.inLocation = inLocation;
		this.inState = inState;
		this.inWatershed = inWatershed;
		this.inWaterSystem = inWaterSystem;
		this.inTributary = inTributary;
		this.inSection = inSection;
		this.inWatersFunction = inWatersFunction;
		this.inDomain = inDomain;
		this.inLatitude = inLatitude;
		this.inLongitude = inLongitude;
		this.inDataReport = inDataReport;
		this.inReportNo = inReportNo;
		this.inReportMn = inReportMn;
		this.inOpen = inOpen;
		this.scies = scies;
	}

	// Property accessors

	public Integer getInNo() {
		return this.inNo;
	}

	public void setInNo(Integer inNo) {
		this.inNo = inNo;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getInCleanName() {
		return this.inCleanName;
	}

	public void setInCleanName(String inCleanName) {
		this.inCleanName = inCleanName;
	}

	public String getInWaterNo() {
		return this.inWaterNo;
	}

	public void setInWaterNo(String inWaterNo) {
		this.inWaterNo = inWaterNo;
	}

	public String getInWaterName() {
		return this.inWaterName;
	}

	public void setInWaterName(String inWaterName) {
		this.inWaterName = inWaterName;
	}

	public String getInRange() {
		return this.inRange;
	}

	public void setInRange(String inRange) {
		this.inRange = inRange;
	}

	public String getInLocation() {
		return this.inLocation;
	}

	public void setInLocation(String inLocation) {
		this.inLocation = inLocation;
	}

	public String getInState() {
		return this.inState;
	}

	public void setInState(String inState) {
		this.inState = inState;
	}

	public String getInWatershed() {
		return this.inWatershed;
	}

	public void setInWatershed(String inWatershed) {
		this.inWatershed = inWatershed;
	}

	public String getInWaterSystem() {
		return this.inWaterSystem;
	}

	public void setInWaterSystem(String inWaterSystem) {
		this.inWaterSystem = inWaterSystem;
	}

	public String getInTributary() {
		return this.inTributary;
	}

	public void setInTributary(String inTributary) {
		this.inTributary = inTributary;
	}

	public String getInSection() {
		return this.inSection;
	}

	public void setInSection(String inSection) {
		this.inSection = inSection;
	}

	public String getInWatersFunction() {
		return this.inWatersFunction;
	}

	public void setInWatersFunction(String inWatersFunction) {
		this.inWatersFunction = inWatersFunction;
	}

	public String getInDomain() {
		return this.inDomain;
	}

	public void setInDomain(String inDomain) {
		this.inDomain = inDomain;
	}

	public Float getInLatitude() {
		return this.inLatitude;
	}

	public void setInLatitude(Float inLatitude) {
		this.inLatitude = inLatitude;
	}

	public Float getInLongitude() {
		return this.inLongitude;
	}

	public void setInLongitude(Float inLongitude) {
		this.inLongitude = inLongitude;
	}

	public String getInDataReport() {
		return this.inDataReport;
	}

	public void setInDataReport(String inDataReport) {
		this.inDataReport = inDataReport;
	}

	public Integer getInReportNo() {
		return this.inReportNo;
	}

	public void setInReportNo(Integer inReportNo) {
		this.inReportNo = inReportNo;
	}

	public String getInReportMn() {
		return this.inReportMn;
	}

	public void setInReportMn(String inReportMn) {
		this.inReportMn = inReportMn;
	}

	public String getInOpen() {
		return this.inOpen;
	}

	public void setInOpen(String inOpen) {
		this.inOpen = inOpen;
	}

	public Set getScies() {
		return this.scies;
	}

	public void setScies(Set scies) {
		this.scies = scies;
	}

}