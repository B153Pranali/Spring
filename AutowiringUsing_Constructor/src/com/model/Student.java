package com.model;

public class Student {
private int rollno;
private String name;
private Address adr;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Student(Address adr) {
	super();
	this.adr = adr;
}
public Address getAdr() {
	return adr;
}

}
