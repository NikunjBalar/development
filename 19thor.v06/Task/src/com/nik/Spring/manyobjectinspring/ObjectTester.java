package com.nik.Spring.manyobjectinspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nik.Spring.manyobjectinspring.object.SocialNetwork;

public class ObjectTester {
	public static void main(String[] args) {
		try {
			ApplicationContext container=new ClassPathXmlApplicationContext("res/Object.xml");
			
			SocialNetwork network=container.getBean(SocialNetwork.class);
			network.load();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
