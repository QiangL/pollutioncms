package org.easybooks.bookstore.vo;

/**
 * Scy entity. @author MyEclipse Persistence Tools
 */

public class Scy implements java.io.Serializable {

	// Fields

	private Integer scyNo;
	private Inlet inlet;
	private Outfall outfall;
	private Enterprise enterprise;
	private String scyType;
	private String scyMn;
	private String scyFactory;
	private String scyPersion;
	private String scyTel;
	private String scyIp;
	private Integer scyReportNo;
	private String scySim;
	private String scyPassword;
	private String scyOperation;
	private String scyOperationPerson;
	private String scyOperationTel;
	private String scyRecipientUnit;
	private String scyRecipient;
	private String scyStartDate;
	private String scyUseDate;

	// Constructors

	/** default constructor */
	public Scy() {
	}

	/** full constructor */
	public Scy(Inlet inlet, Outfall outfall, Enterprise enterprise,
			String scyType, String scyMn, String scyFactory, String scyPersion,
			String scyTel, String scyIp, Integer scyReportNo, String scySim,
			String scyPassword, String scyOperation, String scyOperationPerson,
			String scyOperationTel, String scyRecipientUnit,
			String scyRecipient, String scyStartDate, String scyUseDate) {
		this.inlet = inlet;
		this.outfall = outfall;
		this.enterprise = enterprise;
		this.scyType = scyType;
		this.scyMn = scyMn;
		this.scyFactory = scyFactory;
		this.scyPersion = scyPersion;
		this.scyTel = scyTel;
		this.scyIp = scyIp;
		this.scyReportNo = scyReportNo;
		this.scySim = scySim;
		this.scyPassword = scyPassword;
		this.scyOperation = scyOperation;
		this.scyOperationPerson = scyOperationPerson;
		this.scyOperationTel = scyOperationTel;
		this.scyRecipientUnit = scyRecipientUnit;
		this.scyRecipient = scyRecipient;
		this.scyStartDate = scyStartDate;
		this.scyUseDate = scyUseDate;
	}

	// Property accessors

	public Integer getScyNo() {
		return this.scyNo;
	}

	public void setScyNo(Integer scyNo) {
		this.scyNo = scyNo;
	}

	public Inlet getInlet() {
		return this.inlet;
	}

	public void setInlet(Inlet inlet) {
		this.inlet = inlet;
	}

	public Outfall getOutfall() {
		return this.outfall;
	}

	public void setOutfall(Outfall outfall) {
		this.outfall = outfall;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getScyType() {
		return this.scyType;
	}

	public void setScyType(String scyType) {
		this.scyType = scyType;
	}

	public String getScyMn() {
		return this.scyMn;
	}

	public void setScyMn(String scyMn) {
		this.scyMn = scyMn;
	}

	public String getScyFactory() {
		return this.scyFactory;
	}

	public void setScyFactory(String scyFactory) {
		this.scyFactory = scyFactory;
	}

	public String getScyPersion() {
		return this.scyPersion;
	}

	public void setScyPersion(String scyPersion) {
		this.scyPersion = scyPersion;
	}

	public String getScyTel() {
		return this.scyTel;
	}

	public void setScyTel(String scyTel) {
		this.scyTel = scyTel;
	}

	public String getScyIp() {
		return this.scyIp;
	}

	public void setScyIp(String scyIp) {
		this.scyIp = scyIp;
	}

	public Integer getScyReportNo() {
		return this.scyReportNo;
	}

	public void setScyReportNo(Integer scyReportNo) {
		this.scyReportNo = scyReportNo;
	}

	public String getScySim() {
		return this.scySim;
	}

	public void setScySim(String scySim) {
		this.scySim = scySim;
	}

	public String getScyPassword() {
		return this.scyPassword;
	}

	public void setScyPassword(String scyPassword) {
		this.scyPassword = scyPassword;
	}

	public String getScyOperation() {
		return this.scyOperation;
	}

	public void setScyOperation(String scyOperation) {
		this.scyOperation = scyOperation;
	}

	public String getScyOperationPerson() {
		return this.scyOperationPerson;
	}

	public void setScyOperationPerson(String scyOperationPerson) {
		this.scyOperationPerson = scyOperationPerson;
	}

	public String getScyOperationTel() {
		return this.scyOperationTel;
	}

	public void setScyOperationTel(String scyOperationTel) {
		this.scyOperationTel = scyOperationTel;
	}

	public String getScyRecipientUnit() {
		return this.scyRecipientUnit;
	}

	public void setScyRecipientUnit(String scyRecipientUnit) {
		this.scyRecipientUnit = scyRecipientUnit;
	}

	public String getScyRecipient() {
		return this.scyRecipient;
	}

	public void setScyRecipient(String scyRecipient) {
		this.scyRecipient = scyRecipient;
	}

	public String getScyStartDate() {
		return this.scyStartDate;
	}

	public void setScyStartDate(String scyStartDate) {
		this.scyStartDate = scyStartDate;
	}

	public String getScyUseDate() {
		return this.scyUseDate;
	}

	public void setScyUseDate(String scyUseDate) {
		this.scyUseDate = scyUseDate;
	}

}