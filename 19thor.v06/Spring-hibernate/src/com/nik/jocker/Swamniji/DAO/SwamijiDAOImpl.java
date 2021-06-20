package com.nik.jocker.Swamniji.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nik.jocker.Swamniji.DTO.SwamijiDTO;

public class SwamijiDAOImpl implements SwamijiDAO {

	@Override
	public void save(SwamijiDTO dto) {
		
		SessionFactory factory=null;
		Session session=null;
		try {
			Configuration cfg=new Configuration().configure("resources/hibernate.xml");
			factory=cfg.buildSessionFactory();
			session=factory.openSession();
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();
			
			
		} catch (Exception e) {

			e.printStackTrace();
			session.getTransaction().rollback();
			
		}
		finally {
			if(factory!=null || session!=null) {
				session.close();
				factory.close();
			}
			
		}
	}

}
