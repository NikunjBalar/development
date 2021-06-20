package com.xworkz.nik.Transporter2.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUTIL {
	private static SessionFactory factory;
	
	public static SessionFactory getFactory() {
		
		System.out.println("Invoked getFactory");
		return factory;
	}
	
	static {
		try {
			System.out.println("Starting to configure Hibernate");
			Configuration cfg=new Configuration();
			cfg.configure();
			System.out.println("Starting to build SF");
			factory=cfg.buildSessionFactory();
			
		}catch (Exception e) {
			System.err.println("Exception in creating SF, STATIC BLOCK"+e.getMessage());
		}
	}
}
