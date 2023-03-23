package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private List<String> cities;
private Set<Long> mobies;
private Map<String,Integer> countrycodes;
public List<String> getCities() {
	return cities;
}
public void setCities(List<String> cities) {
	this.cities = cities;
}
public Set<Long> getMobies() {
	return mobies;
}
public void setMobies(Set<Long> mobies) {
	this.mobies = mobies;
}
public Map<String, Integer> getCountrycodes() {
	return countrycodes;
}
public void setCountrycodes(Map<String, Integer> countrycodes) {
	this.countrycodes = countrycodes;
} 
}
