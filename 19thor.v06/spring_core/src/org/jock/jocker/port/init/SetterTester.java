package org.jock.jocker.port.init;

import org.jock.jocker.port.init.Setter.Rainbow;
import org.jock.jocker.port.init.Setter.Stethoscope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SetterTester {
	public static void main(String[] args) {
		
		try {
			Stethoscope s=new Stethoscope();
			s.setBrand("Philips");
			
			System.out.println("brand \t"+s.getBrand());
			System.out.println("****************************************");
			
			//String path="resources/Setter.xml";
			ApplicationContext container=new ClassPathXmlApplicationContext("resources/Setter.xml");
			
			container.getBean(Stethoscope.class).getBrand();
			container.getBean(Rainbow.class);
			if(container!=null) {
				container.getBean(Rainbow.class).getIntensity();
				container.getBean(Rainbow.class).isThere();
			}
			Thread t=container.getBean(Thread.class);
			Thread.sleep(3000);
			t.start();
			
			DriverManagerDataSource dataSource=container.getBean(DriverManagerDataSource.class);
			System.out.println("Password is \t"+dataSource.getPassword());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
