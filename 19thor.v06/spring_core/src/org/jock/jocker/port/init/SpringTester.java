package org.jock.jocker.port.init;

import java.util.Arrays;

import org.jock.jocker.port.core.Port;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {
	public static void main(String[] args) {
		String configFilePath=("resources/context.xml");
		
		ApplicationContext spring=new ClassPathXmlApplicationContext(configFilePath);
		
/*		int noOfBeansManaged=spring.getBeanDefinitionCount();
		System.out.println("noOfBeansManaged \t"+noOfBeansManaged);*/
		Port refOfPort=spring.getBean(Port.class);
		System.out.println(refOfPort);
		Arrays refOfArrays=spring.getBean(Arrays.class);
		System.out.println(refOfArrays);
		
	}
}
