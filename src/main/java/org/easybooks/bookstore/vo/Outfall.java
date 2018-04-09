package org.easybooks.bookstore.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Outfall entity. @author MyEclipse Persistence Tools
 */

public class Outfall implements java.io.Serializable {

	// Fields

	private Integer outNo;
	private Enterprise enterprise;
	private String outName;
	private String outWateNo;
	private String outWaterName;
	private String outRegular;
	private String outDirection;
	private String outLocation;
	private String outType;
	private String outForm;
	private String outNet;
	private String outDataReport;
	private String outTributary;
	private String outWatersFunction;
	private Float outLatitude;
	private Float outLongitude;
	private String outSamplingType;
	private String outWatershed;
	private Integer outReportNo;
	private String outReportMn;
	private String outState;
	private String outWaterSystem;
	private String outSection;
	private String outDomain;
	private Set scies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Outfall() {
	}

	/** full constructor */
	public Outfall(Enterprise enterprise, String outName, String outWateNo,
			String outWaterName, String outRegular, String outDirection,
			String outLocation, String outType, String outForm, String outNet,
			String outDataReport, String outTributary,
			String outWatersFunction, Float outLatitude, Float outLongitude,
			String outSamplingType, String outWatershed, Integer outReportNo,
			String outReportMn, String outState, String outWaterSystem,
			String outSection, String outDomain, Set scies) {
		this.enterprise = enterprise;
		this.outName = outName;
		this.outWateNo = outWateNo;
		this.outWaterName = outWaterName;
		this.outRegular = outRegular;
		this.outDirection = outDirection;
		this.outLocation = outLocation;
		this.outType = outType;
		this.outForm = outForm;
		this.outNet = outNet;
		this.outDataReport = outDataReport;
		this.outTributary = outTributary;
		this.outWatersFunction = outWatersFunction;
		this.outLatitude = outLatitude;
		this.outLongitude = outLongitude;
		this.outSamplingType = outSamplingType;
		this.outWatershed = outWatershed;
		this.outReportNo = outReportNo;
		this.outReportMn = outReportMn;
		this.outState = outState;
		this.outWaterSystem = outWaterSystem;
		this.outSection = outSection;
		this.outDomain = outDomain;
		this.scies = scies;
	}

	// Property accessors

	public Integer getOutNo() {
		return this.outNo;
	}

	public void setOutNo(Integer outNo) {
		this.outNo = outNo;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getOutName() {
		return this.outName;
	}

	public void setOutName(String outName) {
		this.outName = outName;
	}

	public String getOutWateNo() {
		return this.outWateNo;
	}

	public void setOutWateNo(String outWateNo) {
		this.outWateNo = outWateNo;
	}

	public String getOutWaterName() {
		return this.outWaterName;
	}

	public void setOutWaterName(String outWaterName) {
		this.outWaterName = outWaterName;
	}

	public String getOutRegular() {
		return this.outRegular;
	}

	public void setOutRegular(String outRegular) {
		this.outRegular = outRegular;
	}

	public String getOutDirection() {
		return this.outDirection;
	}

	public void setOutDirection(String outDirection) {
		this.outDirection = outDirection;
	}

	public String getOutLocation() {
		return this.outLocation;
	}

	public void setOutLocation(String outLocation) {
		this.outLocation = outLocation;
	}

	public String getOutType() {
		return this.outType;
	}

	public void setOutType(String outType) {
		this.outType = outType;
	}

	public String getOutForm() {
		return this.outForm;
	}

	public void setOutForm(String outForm) {
		this.outForm = outForm;
	}

	public String getOutNet() {
		return this.outNet;
	}

	public void setOutNet(String outNet) {
		this.outNet = outNet;
	}

	public String getOutDataReport() {
		return this.outDataReport;
	}

	public void setOutDataReport(String outDataReport) {
		this.outDataReport = outDataReport;
	}

	public String getOutTributary() {
		return this.outTributary;
	}

	public void setOutTributary(String outTributary) {
		this.outTributary = outTributary;
	}

	public String getOutWatersFunction() {
		return this.outWatersFunction;
	}

	public void setOutWatersFunction(String outWatersFunction) {
		this.outWatersFunction = outWatersFunction;
	}

	public Float getOutLatitude() {
		return this.outLatitude;
	}

	public void setOutLatitude(Float outLatitude) {
		this.outLatitude = outLatitude;
	}

	public Float getOutLongitude() {
		return this.outLongitude;
	}

	public void setOutLongitude(Float outLongitude) {
		this.outLongitude = outLongitude;
	}

	public String getOutSamplingType() {
		return this.outSamplingType;
	}

	public void setOutSamplingType(String outSamplingType) {
		this.outSamplingType = outSamplingType;
	}

	public String getOutWatershed() {
		return this.outWatershed;
	}

	public void setOutWatershed(String outWatershed) {
		this.outWatershed = outWatershed;
	}

	public Integer getOutReportNo() {
		return this.outReportNo;
	}

	public void setOutReportNo(Integer outReportNo) {
		this.outReportNo = outReportNo;
	}

	public String getOutReportMn() {
		return this.outReportMn;
	}

	public void setOutReportMn(String outReportMn) {
		this.outReportMn = outReportMn;
	}

	public String getOutState() {
		return this.outState;
	}

	public void setOutState(String outState) {
		this.outState = outState;
	}

	public String getOutWaterSystem() {
		return this.outWaterSystem;
	}

	public void setOutWaterSystem(String outWaterSystem) {
		this.outWaterSystem = outWaterSystem;
	}

	public String getOutSection() {
		return this.outSection;
	}

	public void setOutSection(String outSection) {
		this.outSection = outSection;
	}

	public String getOutDomain() {
		return this.outDomain;
	}

	public void setOutDomain(String outDomain) {
		this.outDomain = outDomain;
	}

	public Set getScies() {
		return this.scies;
	}

	public void setScies(Set scies) {
		this.scies = scies;
	}

}