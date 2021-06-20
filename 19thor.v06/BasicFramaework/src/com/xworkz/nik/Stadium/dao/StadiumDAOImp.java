package com.xworkz.nik.Stadium.dao;

import java.io.Closeable;
import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.nik.Stadium.dto.StadiumDTO;

public class StadiumDAOImp implements StadiumDAO {

	public StadiumDAOImp() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	public void save(StadiumDTO dto) {
		System.out.println("implemented merthod" + dto);
		SessionFactory factory=null;
		Session session=null;
		try {
			System.out.println("creating hibernate configaration");
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(StadiumDTO.class);
			factory=cfg.buildSessionFactory();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Serializable id=session.save(dto);
			transaction.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

}
