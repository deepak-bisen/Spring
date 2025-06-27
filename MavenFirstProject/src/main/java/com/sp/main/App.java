package com.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String config_path = "com/sp/resources/ApplicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
        Student std = (Student) context.getBean("std");
        std.display();
    }
}
