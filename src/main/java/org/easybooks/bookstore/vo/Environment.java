package org.easybooks.bookstore.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Environment entity. @author MyEclipse Persistence Tools
 */

public class Environment implements java.io.Serializable {

	// Fields

	private Integer envNo;
	private String envWatershed;
	private String envArea;
	private String envCraft;
	private String envFacilitiesAbility;
	private String envSewageClass;
	private Float envSea;
	private Float envRiver;
	private String envWatersFunction;
	private String envSeaFunction;
	private String envNoise;
	private Set enterprises = new HashSet(0);

	// Constructors

	/** default constructor */
	public Environment() {
	}

	/** full constructor */
	public Environment(String envWatershed, String envArea, String envCraft,
			String envFacilitiesAbility, String envSewageClass, Float envSea,
			Float envRiver, String envWatersFunction, String envSeaFunction,
			String envNoise, Set enterprises) {
		this.envWatershed = envWatershed;
		this.envArea = envArea;
		this.envCraft = envCraft;
		this.envFacilitiesAbility = envFacilitiesAbility;
		this.envSewageClass = envSewageClass;
		this.envSea = envSea;
		this.envRiver = envRiver;
		this.envWatersFunction = envWatersFunction;
		this.envSeaFunction = envSeaFunction;
		this.envNoise = envNoise;
		this.enterprises = enterprises;
	}

	// Property accessors

	public Integer getEnvNo() {
		return this.envNo;
	}

	public void setEnvNo(Integer envNo) {
		this.envNo = envNo;
	}

	public String getEnvWatershed() {
		return this.envWatershed;
	}

	public void setEnvWatershed(String envWatershed) {
		this.envWatershed = envWatershed;
	}

	public String getEnvArea() {
		return this.envArea;
	}

	public void setEnvArea(String envArea) {
		this.envArea = envArea;
	}

	public String getEnvCraft() {
		return this.envCraft;
	}

	public void setEnvCraft(String envCraft) {
		this.envCraft = envCraft;
	}

	public String getEnvFacilitiesAbility() {
		return this.envFacilitiesAbility;
	}

	public void setEnvFacilitiesAbility(String envFacilitiesAbility) {
		this.envFacilitiesAbility = envFacilitiesAbility;
	}

	public String getEnvSewageClass() {
		return this.envSewageClass;
	}

	public void setEnvSewageClass(String envSewageClass) {
		this.envSewageClass = envSewageClass;
	}

	public Float getEnvSea() {
		return this.envSea;
	}

	public void setEnvSea(Float envSea) {
		this.envSea = envSea;
	}

	public Float getEnvRiver() {
		return this.envRiver;
	}

	public void setEnvRiver(Float envRiver) {
		this.envRiver = envRiver;
	}

	public String getEnvWatersFunction() {
		return this.envWatersFunction;
	}

	public void setEnvWatersFunction(String envWatersFunction) {
		this.envWatersFunction = envWatersFunction;
	}

	public String getEnvSeaFunction() {
		return this.envSeaFunction;
	}

	public void setEnvSeaFunction(String envSeaFunction) {
		this.envSeaFunction = envSeaFunction;
	}

	public String getEnvNoise() {
		return this.envNoise;
	}

	public void setEnvNoise(String envNoise) {
		this.envNoise = envNoise;
	}

	public Set getEnterprises() {
		return this.enterprises;
	}

	public void setEnterprises(Set enterprises) {
		this.enterprises = enterprises;
	}

}