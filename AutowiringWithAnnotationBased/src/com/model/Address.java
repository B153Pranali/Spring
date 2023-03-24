package com.model;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;

public class Address {

private String cityName;
private String areaName;
public String getAreaName() {
	return areaName;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}


}
