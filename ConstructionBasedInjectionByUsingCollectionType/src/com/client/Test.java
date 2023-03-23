package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student s=ac.getBean("s",Student.class);
		s.cities.forEach(st->System.out.println(st));
		s.mobies.forEach(stu->System.out.println(stu));
		s.countrycodes.forEach((k,v)->{System.out.println(k);
		System.out.println(v);});
	}

}
