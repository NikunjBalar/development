package com.joker.register.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joker.register.Entity.RegisterEntityAddress;

@Component
public class AddDAOImpl implements AddDAO {

	private SessionFactory factory;

	@Autowired
	public AddDAOImpl(SessionFactory factory) {
		System.out.println("created \t" + this.getClass().getSimpleName());
		this.factory = factory;
	}

	@Override
	public void save(RegisterEntityAddress address) {
		System.out.println("saving address" + address);
		Session session = null;
		try {
			session = this.factory.openSession();
			session.beginTransaction();
			session.save(address);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.err.println("exception add\t" + e.getMessage());
		} finally {
			if (session != null)
				session.close();
		}
	}

}
