package com.model;

import java.util.List;

public class Supplier {
	private int supId;
	private String supName;
	private long supMobile;
	private List<String> cities;
	public Supplier(int supId, String supName, long supMobile, List<String> cities) {
		super();
		this.supId = supId;
		this.supName = supName;
		this.supMobile = supMobile;
		this.cities = cities;
	}
}
