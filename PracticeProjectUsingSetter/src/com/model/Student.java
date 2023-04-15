package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private List<Address> list;
private Set<Address> set;
private Map<Integer, Address> map;
public List<Address> getList() {
	return list;
}
public void setList(List<Address> list) {
	this.list = list;
}
public Set<Address> getSet() {
	return set;
}
public void setSet(Set<Address> set) {
	this.set = set;
}
public Map<Integer, Address> getMap() {
	return map;
}
public void setMap(Map<Integer, Address> map) {
	this.map = map;
}
}
