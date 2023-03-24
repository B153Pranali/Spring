package com.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
Product p1=ac.getBean("p",Product.class);
System.out.println(p1.getProductId());
System.out.println(p1.getProductName());
System.out.println(p1.getProductPrice());
p1.getLd().forEach(s1->System.out.println(s1.getDealerId()));
p1.getLd().forEach(s1->System.out.println(s1.getDealerName()));
p1.getLd().forEach(s1->System.out.println(s1.getDealerMobile()));
p1.getMs().forEach((k,v)->{System.out.println(k+" "+v.getSupId());
System.out.println(v.getSupName());});
	}

}
