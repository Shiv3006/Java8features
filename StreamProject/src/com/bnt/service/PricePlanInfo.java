package com.bnt.service;

public class PricePlanInfo {
	private String id;
	private String name;
	private String isActive;
	private String customerType;

	@Override
	public String toString() {
		return "PricePlanInfo [id=" + id + ", name=" + name + ", isActive=" + isActive + ", customerType="
				+ customerType + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public PricePlanInfo(String id, String name, String isActive, String customerType) {
		super();
		this.id = id;
		this.name = name;
		this.isActive = isActive;
		this.customerType = customerType;
	}

	public PricePlanInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Object builder() {
		PricePlanInfo p = null;
		return p;
	}

}
