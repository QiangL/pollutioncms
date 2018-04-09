package org.easybooks.bookstore.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Manage entity. @author MyEclipse Persistence Tools
 */

public class Manage implements java.io.Serializable {

	// Fields

	private Integer manNo;
	private String manEntId;
	private String manHbOrgnization;
	private String manConcernExtent;
	private String manWryProperty;
	private String manHbPerson;
	private String manHbPersonTel;
	private String manHbOfficeTel;
	private String manHbFax;
	private String manEntDivision;
	private String manEntDepartment;
	private Integer manEntPerson;
	private String manEntDate;
	private Float manGrossProduct;
	private Float manTotal;
	private Float manSewage;
	private Float manRepeat;
	private Float manFresh;
	private Float manStarndard;
	private String manEntClass;
	private String manWryScale;
	private String manReportedNo;
	private String manDataAccepter;
	private Set enterprises = new HashSet(0);

	// Constructors

	/** default constructor */
	public Manage() {
	}

	/** full constructor */
	public Manage(String manEntId, String manHbOrgnization,
			String manConcernExtent, String manWryProperty, String manHbPerson,
			String manHbPersonTel, String manHbOfficeTel, String manHbFax,
			String manEntDivision, String manEntDepartment,
			Integer manEntPerson, String manEntDate, Float manGrossProduct,
			Float manTotal, Float manSewage, Float manRepeat, Float manFresh,
			Float manStarndard, String manEntClass, String manWryScale,
			String manReportedNo, String manDataAccepter, Set enterprises) {
		this.manEntId = manEntId;
		this.manHbOrgnization = manHbOrgnization;
		this.manConcernExtent = manConcernExtent;
		this.manWryProperty = manWryProperty;
		this.manHbPerson = manHbPerson;
		this.manHbPersonTel = manHbPersonTel;
		this.manHbOfficeTel = manHbOfficeTel;
		this.manHbFax = manHbFax;
		this.manEntDivision = manEntDivision;
		this.manEntDepartment = manEntDepartment;
		this.manEntPerson = manEntPerson;
		this.manEntDate = manEntDate;
		this.manGrossProduct = manGrossProduct;
		this.manTotal = manTotal;
		this.manSewage = manSewage;
		this.manRepeat = manRepeat;
		this.manFresh = manFresh;
		this.manStarndard = manStarndard;
		this.manEntClass = manEntClass;
		this.manWryScale = manWryScale;
		this.manReportedNo = manReportedNo;
		this.manDataAccepter = manDataAccepter;
		this.enterprises = enterprises;
	}

	// Property accessors

	public Integer getManNo() {
		return this.manNo;
	}

	public void setManNo(Integer manNo) {
		this.manNo = manNo;
	}

	public String getManEntId() {
		return this.manEntId;
	}

	public void setManEntId(String manEntId) {
		this.manEntId = manEntId;
	}

	public String getManHbOrgnization() {
		return this.manHbOrgnization;
	}

	public void setManHbOrgnization(String manHbOrgnization) {
		this.manHbOrgnization = manHbOrgnization;
	}

	public String getManConcernExtent() {
		return this.manConcernExtent;
	}

	public void setManConcernExtent(String manConcernExtent) {
		this.manConcernExtent = manConcernExtent;
	}

	public String getManWryProperty() {
		return this.manWryProperty;
	}

	public void setManWryProperty(String manWryProperty) {
		this.manWryProperty = manWryProperty;
	}

	public String getManHbPerson() {
		return this.manHbPerson;
	}

	public void setManHbPerson(String manHbPerson) {
		this.manHbPerson = manHbPerson;
	}

	public String getManHbPersonTel() {
		return this.manHbPersonTel;
	}

	public void setManHbPersonTel(String manHbPersonTel) {
		this.manHbPersonTel = manHbPersonTel;
	}

	public String getManHbOfficeTel() {
		return this.manHbOfficeTel;
	}

	public void setManHbOfficeTel(String manHbOfficeTel) {
		this.manHbOfficeTel = manHbOfficeTel;
	}

	public String getManHbFax() {
		return this.manHbFax;
	}

	public void setManHbFax(String manHbFax) {
		this.manHbFax = manHbFax;
	}

	public String getManEntDivision() {
		return this.manEntDivision;
	}

	public void setManEntDivision(String manEntDivision) {
		this.manEntDivision = manEntDivision;
	}

	public String getManEntDepartment() {
		return this.manEntDepartment;
	}

	public void setManEntDepartment(String manEntDepartment) {
		this.manEntDepartment = manEntDepartment;
	}

	public Integer getManEntPerson() {
		return this.manEntPerson;
	}

	public void setManEntPerson(Integer manEntPerson) {
		this.manEntPerson = manEntPerson;
	}

	public String getManEntDate() {
		return this.manEntDate;
	}

	public void setManEntDate(String manEntDate) {
		this.manEntDate = manEntDate;
	}

	public Float getManGrossProduct() {
		return this.manGrossProduct;
	}

	public void setManGrossProduct(Float manGrossProduct) {
		this.manGrossProduct = manGrossProduct;
	}

	public Float getManTotal() {
		return this.manTotal;
	}

	public void setManTotal(Float manTotal) {
		this.manTotal = manTotal;
	}

	public Float getManSewage() {
		return this.manSewage;
	}

	public void setManSewage(Float manSewage) {
		this.manSewage = manSewage;
	}

	public Float getManRepeat() {
		return this.manRepeat;
	}

	public void setManRepeat(Float manRepeat) {
		this.manRepeat = manRepeat;
	}

	public Float getManFresh() {
		return this.manFresh;
	}

	public void setManFresh(Float manFresh) {
		this.manFresh = manFresh;
	}

	public Float getManStarndard() {
		return this.manStarndard;
	}

	public void setManStarndard(Float manStarndard) {
		this.manStarndard = manStarndard;
	}

	public String getManEntClass() {
		return this.manEntClass;
	}

	public void setManEntClass(String manEntClass) {
		this.manEntClass = manEntClass;
	}

	public String getManWryScale() {
		return this.manWryScale;
	}

	public void setManWryScale(String manWryScale) {
		this.manWryScale = manWryScale;
	}

	public String getManReportedNo() {
		return this.manReportedNo;
	}

	public void setManReportedNo(String manReportedNo) {
		this.manReportedNo = manReportedNo;
	}

	public String getManDataAccepter() {
		return this.manDataAccepter;
	}

	public void setManDataAccepter(String manDataAccepter) {
		this.manDataAccepter = manDataAccepter;
	}

	public Set getEnterprises() {
		return this.enterprises;
	}

	public void setEnterprises(Set enterprises) {
		this.enterprises = enterprises;
	}

}