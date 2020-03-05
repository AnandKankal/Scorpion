package com.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		 Student student = ctx.getBean("student",Student.class);
	     
	     student.displayInfo();
	}
	 
}
