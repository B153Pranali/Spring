package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Teststudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new ClassPathXmlApplicationContext("beansstudent.xml");
Student s=ac.getBean("stu",Student.class);
System.out.println(s.getList());
s.getList().forEach(l->{System.out.println("List by CityName: "+l.getCityName());
System.out.println("List by pincode: "+l.getPincode());});
System.out.println(s.getSet());
s.getSet().forEach(st->{System.out.println("Set by CityName: "+st.getCityName());
System.out.println("Set by pincode: "+st.getPincode());});
System.out.println(s.getMap());
s.getMap().forEach((k,v)->{System.out.println("Map by CityName: "+v.getCityName());
System.out.println("Map by pincode: "+v.getPincode());});

Student s1=ac.getBean("stu1",Student.class);
System.out.println(s1.getList());
s1.getList().forEach(l->{System.out.println("List by CityName1: "+l.getCityName());
System.out.println("List by pincode1: "+l.getPincode());});
System.out.println(s1.getSet());
s1.getSet().forEach(st->{System.out.println("Set by CityName1: "+st.getCityName());
System.out.println("Set by pincode1: "+st.getPincode());});
System.out.println(s1.getMap());
s1.getMap().forEach((k,v)->{System.out.println("Map by CityName1: "+v.getCityName());
System.out.println("Map by pincode1: "+v.getPincode());});
	}

}
