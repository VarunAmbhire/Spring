package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.service.StudentService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentService service=(StudentService) context.getBean("studentService");
		
		System.out.println(service.getAllStudent().size());
		
		System.out.println(service.hashCode());
		System.out.println(service.hashCode());
	}

}
