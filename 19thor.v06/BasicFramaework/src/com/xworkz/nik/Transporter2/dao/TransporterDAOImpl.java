package com.xworkz.nik.Transporter2.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.nik.Transporter.dto.TransporterDTO;
import com.xworkz.nik.Transporter2.util.HibernateUTIL;

public class TransporterDAOImpl implements TransporterDAO{

	@Override
	public void save(TransporterDTO dto) {
		System.out.println("Implimeted method"+this.getClass().getSimpleName());
		SessionFactory factory=HibernateUTIL.getFactory();
		Session session=null;
		try {
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
