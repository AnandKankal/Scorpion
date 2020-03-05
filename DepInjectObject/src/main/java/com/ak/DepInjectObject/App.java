package com.ak.DepInjectObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student s = context.getBean("stu",Student.class);
        s.studentCheat();
    }
}
