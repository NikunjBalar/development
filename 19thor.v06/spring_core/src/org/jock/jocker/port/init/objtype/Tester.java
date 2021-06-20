package org.jock.jocker.port.init.objtype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		String s=new String();
		try {
			String path="resources/objtype.xml";
			
			ApplicationContext container= new ClassPathXmlApplicationContext(path);
			Factory factory=container.getBean(Factory.class);
			factory.polishing();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
