package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	public List<String> cities;
	public Set<Long> mobies;
	public Map<String,Integer> countrycodes;
	public Student(List<String> cities, Set<Long> mobies, Map<String, Integer> countrycodes) {
		super();
		this.cities = cities;
		this.mobies = mobies;
		this.countrycodes = countrycodes;
	}

}
