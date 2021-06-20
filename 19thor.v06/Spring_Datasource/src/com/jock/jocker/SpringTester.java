package com.jock.jocker;

import javax.activation.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {
	public static void main(String[] args) {
		try {
			
			ApplicationContext container=new ClassPathXmlApplicationContext("resources/container.xml");
			container.getBean(DataSource.class);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
