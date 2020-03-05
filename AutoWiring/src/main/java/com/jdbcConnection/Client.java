package com.jdbcConnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanDb.xml");
		System.out.println("loaded");
        JdbcDemo jd = ctx.getBean("Jdbcdemo",JdbcDemo.class);
        jd.displayInfo();
        jd.getJdbcConnection();
        ((AbstractApplicationContext) ctx).close();
	}
}
