package org.jock.jocker.port.init.Dramaa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		try {
			String path="resources/Dramma.xml";
			ApplicationContext container=new ClassPathXmlApplicationContext(path);
			Women women =container.getBean(Women.class);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
