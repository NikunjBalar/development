package com.xworkz.matrimony.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.matrimony.dto.MatrimonyDto;

@Component
public class MatrimonyDaoImpl implements MatrimonyDao {

	public MatrimonyDaoImpl() {
		System.out.println("created\t" + this.getClass().hashCode());
	}

	private SessionFactory factory;

	@Autowired
	public MatrimonyDaoImpl(SessionFactory factor) {
		System.out.println("created\t" + this.getClass().hashCode());
		this.factory = factor;
	}

	@Override
	public void saveService(MatrimonyDto dto) {
		System.out.println("saving" + dto);

		Session session = null;
		try {
			session = this.factory.openSession();
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
