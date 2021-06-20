package com.annotaion.jocker;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotaion.jocker.annot.Billionarie;

public class BillionarieTester {
	public static void main(String[] args) {
		try {
			ApplicationContext container=new ClassPathXmlApplicationContext("resources/spring.xml");
			Billionarie billionarie=container.getBean(Billionarie.class);
			
			System.out.println(billionarie);
			System.out.println(billionarie.getNoOfProperty());

		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
