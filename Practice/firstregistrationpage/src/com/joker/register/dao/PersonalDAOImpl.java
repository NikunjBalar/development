package com.joker.register.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joker.register.Entity.RegisterEntityPersonal;

@Component
public class PersonalDAOImpl implements PersonalDAO {

	private SessionFactory factory;

	@Autowired
	public PersonalDAOImpl(SessionFactory factory) {
		System.out.println("created \t" + this.getClass().getSimpleName());
		this.factory = factory;
	}

	@Override
	public void save(RegisterEntityPersonal entityPersonal) {
		System.out.println("saving " + entityPersonal);
		Session session = null;
		try {
			session=this.factory.openSession();
			session.beginTransaction();
			session.save(entityPersonal);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.err.println("exception personal\t" + e.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

	}

}
