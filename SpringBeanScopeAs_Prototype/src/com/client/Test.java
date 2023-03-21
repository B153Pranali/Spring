package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
Student s=(Student) ac.getBean("s");
System.out.println(s);
Student s1=(Student) ac.getBean("s");
System.out.println(s1);
Student s2=(Student) ac.getBean("s");
System.out.println(s2);
	}

}
