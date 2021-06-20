package com.xworkz.nik.Transporter.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.nik.Transporter.dto.TransporterDTO;

public class TransporterDAOImpl implements TransporterDAO{

	@Override
	public void save(TransporterDTO dto) {
		System.out.println("Implimeted method"+this.getClass().getSimpleName());
		SessionFactory factory=null;
		Session session=null;
		try {
			System.out.println("creating hibernate configeration");
			Configuration cfg=new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(TransporterDTO.class);
			factory=cfg.buildSessionFactory();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Serializable id=session.save(dto);
			transaction.commit();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}
}
