package com.jokerapp.medcare.dao.SignUp;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jokerapp.medcare.entity.Master;
import com.jokerapp.medcare.entity.SignUp;

@Repository
public class SignUpDAOImpl implements SignUpDAO {

	Logger logger = Logger.getLogger(SignUpDAOImpl.class.getName());

	private SessionFactory factory;
	String empid = null;
	String email = null;
	boolean finded= true;

	@Autowired
	public SignUpDAOImpl(SessionFactory factory) {
		this.factory = factory;
		System.out.println("created " + this.getClass().getSimpleName());
		logger.info("created SignUpDAOImpl()");
	}

	@Override
	public void signUp(SignUp signUpEntity) {
		empid = signUpEntity.getEmployeeId();
		email = signUpEntity.getEmail();
		Session session = null;
		try {
			session = this.factory.openSession();
			session.beginTransaction();

			if (finded) {
				session.save(signUpEntity);
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			// System.out.println("exception in "+e.getMessage());
			logger.info(" Bulshit Exception" + e.getMessage());
		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public void getDetails(Master masterentity) {
		String query = "from emp_details where emp_id='" + empid + "' and emp_email='" + email + "'";
		Session session = null;
		try {
			session = this.factory.openSession();
			finded = session.createQuery(query) != null;
			session.getTransaction();
		}catch (Exception e) {
			logger.info(" Bulshit Exception" + e.getMessage());
		}
		finally {
			if (session!=null)
				session.close();
		}
	}
}