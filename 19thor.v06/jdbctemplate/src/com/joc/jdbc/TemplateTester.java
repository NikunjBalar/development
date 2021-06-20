package com.joc.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joc.jdbc.template.Ground;
import com.joc.jdbc.template.GroundDAO;

public class TemplateTester {
	public static void main(String[] args) {
		
		Ground dto=new Ground();
		dto.setId(1);
		dto.setName("lalbhai");
		dto.setNoOfGate(2);
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resources/jdbctemplate.xml");
		GroundDAO dao=(GroundDAO) container.getBean("groundDAOImpl");
		int status=dao.saveGround(dto);
		
		System.out.println(status);
	}
	
}
