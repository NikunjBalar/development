package org.jock.jocker.port.init;

import org.jock.jocker.port.init.constructor.Barber;
import org.jock.jocker.port.init.constructor.Trimmer;
import org.jock.jocker.port.init.constructor.Water;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitTester {
	public static void main(String[] args) {
		try {
			String path=("resources/init.xml");
			ApplicationContext container=new ClassPathXmlApplicationContext(path);
			
			container.getBean(Water.class).flow("shakhpur");
			System.out.println("Water");
			Barber refOfBarber=container.getBean(Barber.class);
			System.out.println("barber \t"+refOfBarber);
			
			Trimmer refOfTrimmer1=container.getBean("trimmer1", Trimmer.class);		
			System.out.println("trimmer1 \t"+refOfTrimmer1);
			
			Trimmer refOfTrimmer2=container.getBean("trimmer2", Trimmer.class);
			System.out.println("trimmer2 \t"+refOfTrimmer2);
			
		} catch (Exception e) {
			System.err.println(""+e.getMessage());
		}
	}
}
