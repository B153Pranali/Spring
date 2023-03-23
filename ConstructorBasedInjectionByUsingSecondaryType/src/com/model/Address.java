package com.model;

public class Address {
private String areaName;
private String cityName;
public Address(String areaName, String cityName) {
	super();
	this.areaName = areaName;
	this.cityName = cityName;
}
public void display() {
	System.out.println(areaName);
	System.out.println(cityName);
}
}
