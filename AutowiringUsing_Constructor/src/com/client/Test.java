package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
Student s=ac.getBean("s",Student.class);
System.out.println(s.getRollno());
System.out.println(s.getName());
System.out.println(s.getAdr().getCityName());
System.out.println(s.getAdr().getAreaName());
	}

}
