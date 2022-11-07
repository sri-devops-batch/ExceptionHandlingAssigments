package com.capgemini.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.demo.entity.Employee;

public class MainApp {

	public static void main(String[] args) {
	
		ApplicationContext spring = new ClassPathXmlApplicationContext("employee-spring-conf.xml");
		// Employee e1  = (Employee)spring.getBean("101");
		//System.out.println(e1);
		Employee e1 = spring.getBean("101",Employee.class);
		System.out.println(e1);
		System.out.println(e1.getEmpname());
        System.out.println(e1.getDesignation());

	}
}