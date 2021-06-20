package com.mvc.joc.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import com.mvc.joc.dto.TrendDTO;

@Component
public class TrendDAOImpl implements TrendDAO{
	
	public TrendDAOImpl() {
		System.out.println("Created \t" + this.getClass().getPackage());

	}

	@Override
	public void save(TrendDTO dto) {
		
		SessionFactory factory = null;
		Session session = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("resources/hibernate.cfg.xml");
			System.out.println("building sessionFactory");
			factory = configuration.buildSessionFactory();
			System.out.println("session factory built");
			session = factory.openSession();
			System.out.println("transaction begins");
			Transaction transaction = session.beginTransaction();
			Serializable serializable = session.save(dto);
			System.out.println("saving dto" + dto);
			System.out.println(serializable);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("exceptio found"+e.getMessage());
		}
		finally {
			System.out.println("data saved into data base");
			if(session!=null)session.close();
			if(factory!=null)factory.close();
		}
		System.out.println("");
	}

}
