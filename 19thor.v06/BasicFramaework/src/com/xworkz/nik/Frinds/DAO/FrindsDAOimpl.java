package com.xworkz.nik.Frinds.DAO;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.nik.Frinds.DTO.FrindsDTO;

public class FrindsDAOimpl implements FrindsDAO{

	@Override
	public void save(FrindsDTO dto) {
		SessionFactory factory=null;
		Session session=null;
		
		try {
			Configuration cfi=new Configuration();
			cfi.configure();
			cfi.addAnnotatedClass(FrindsDTO.class);
			factory=cfi.buildSessionFactory();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Serializable id=session.save(dto);
			transaction.commit();
			
		}
		catch (HibernateException e) {
			System.err.println("exception causes by hibernate configeration"+e.getMessage());
		}
		finally {
			if (session!=null) session.close();
			if(factory!=null) factory.close();
		}
	}
	
}
