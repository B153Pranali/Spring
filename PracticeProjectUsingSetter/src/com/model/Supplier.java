package com.model;

import java.util.List;

public class Supplier {
	private int supId;
	private String supName;
	private long supMobile;
	private List<String> cities;
	public int getSupId() {
		return supId;
	}
	public void setSupId(int supId) {
		this.supId = supId;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public long getSupMobile() {
		return supMobile;
	}
	public void setSupMobile(long supMobile) {
		this.supMobile = supMobile;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
}
