package com.jokerapp.medcare.dao.SignIn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jokerapp.medcare.entity.SignIn;

@Component
public class SignInDAOImpl implements SignInDAO{
	
	@Autowired
	private SessionFactory factory;
	
	public SignInDAOImpl(SessionFactory factory) {
		this.factory=factory;
	}

	@Override
	public Object chacklogin(SignIn signIn) {
		String empid=signIn.getEmployeeId();
		String password=signIn.getPassword();
		System.out.println("chaking signUp.................");
		//Transaction transaction=null;
		Session session = null;
		try {
			session = this.factory.openSession();
			System.out.println("session creating");
	
			String hql = "from RegistrationEntity where e_employeeid='"+empid+"' and e_password ='"+password+"'";
			System.out.println("HQL QUERY :" +hql);
			org.hibernate.Query query = session.createQuery(hql);		
			Object loginobject = query.uniqueResult();
			if(loginobject != null) {
				System.out.println("login sucessfull......");
				return loginobject;
			}
			else {
				System.out.println("login fail try again ................");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}

	
}
