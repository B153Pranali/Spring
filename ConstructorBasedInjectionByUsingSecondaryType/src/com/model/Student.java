package com.model;

public class Student {
private int rollno;
private String name;
private Address adr;
public Student(int rollno, String name, Address adr) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.adr = adr;
}
public void display() {
	System.out.println(rollno);
	System.out.println(name);
	adr.display();
}
}
