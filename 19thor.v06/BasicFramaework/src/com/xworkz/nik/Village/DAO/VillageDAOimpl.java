package com.xworkz.nik.Village.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.nik.Village.DTO.VillageDTO;

public class VillageDAOimpl implements VillageDAO{

	@Override
	public void save(VillageDTO dto) {
		System.out.println("creating ");
		SessionFactory factory=null;
		Session session=null;
		try {
			Configuration cfg=new Configuration();
			cfg.configure();
			factory=cfg.buildSessionFactory();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(dto);
			transaction.commit();
			
		}catch (HibernateException e) {
			System.err.println("exception in"+e.getMessage());
		}
		finally {
			if(session!=null)session.close();
			if(factory!=null)factory.close();
		}
	}

	@Override
	public VillageDTO fatchById(int id) {
		SessionFactory factory=null;
		Session session=null;
		try {
			Configuration configuration=new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(VillageDTO.class);
			factory=configuration.buildSessionFactory();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			VillageDTO entity=session.get(VillageDTO.class, id);
			if (entity!=null) {
				System.out.println("entity found for id\t"+id);
				return entity;
			} else {
				System.out.println("entity not found for id\t"+id);
				return null;
			}
		}
		catch (HibernateException e) {
			System.err.println("exception in fatchbyid"+e.getMessage());
		}
		finally {
			if(session!=null)session.close();
			if(factory!=null)factory.close();
		}
		
		return VillageDAO.super.fatchById(id);
	}
	
}
