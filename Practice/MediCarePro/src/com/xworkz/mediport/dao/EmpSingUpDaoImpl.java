package com.xworkz.mediport.dao;


import java.io.Serializable;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mediport.entity.RegistrationEntity;



@Component
public class EmpSingUpDaoImpl implements EmpSignUpDao {
	
//	static Logger/;
	
	@Autowired
	private SessionFactory factory;

	public EmpSingUpDaoImpl() {
		System.out.println("created /t" + this.getClass().getSimpleName());
	}

	@Autowired
	public EmpSingUpDaoImpl(SessionFactory factory) {
		System.out.println("created /t" + this.getClass().getSimpleName());

		
		this.factory = factory;
	}

	@Override
	public void save(RegistrationEntity registrationEntity) {
		System.out.println("saving" + registrationEntity);
		//Transaction transaction=null;
		Session session = null;
		try {
			session = this.factory.openSession();
			System.out.println("session creating");
			session.beginTransaction();
			System.out.println("transaction is started");
			
			String empId = registrationEntity.getEmployeeid();
			
			String hql = "from EmployeeMainDto where employeeid='"+empId+"' ";
			System.out.println("HQL QUERY :" +hql);
			Query query=session.createQuery(hql);
			Object loginobject = query.uniqueResult();
			System.out.println("unuq result");
			System.out.println(loginobject);
			if(loginobject != null) {
				System.out.println("chack employee is there or not.......");
				
				Serializable serializable=session.save(registrationEntity);
				System.out.println(serializable);
				session.getTransaction().commit();
				System.out.println("tansaction cammited.....");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.save(registrationEntity);
			session.close();
		}
	}

	@Override
	public Object chacklogin(String empid, String password) {
		System.out.println("chaking signUp.................");
		//Transaction transaction=null;
		Session session = null;
		try {
			session = this.factory.openSession();
			System.out.println("session creating");
	
			String hql = "from RegistrationEntity where employeeid=:'"+empid+"' and password =:'"+password+"'";
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

	@Override
	public Object forgetPassword(String email) {
		System.out.println("forget password.................");
		//Transaction transaction=null;
		Session session = null;
		
		try {
			session = this.factory.openSession();
			System.out.println("session creating");
	
			String hql = "from RegistrationEntity where e_email=:'"+email+"'";
			System.out.println("HQL QUERY :" +hql);
			org.hibernate.Query query = session.createQuery(hql);		
			Object loginobject = query.uniqueResult();
			if(loginobject != null) {
				System.out.println("datafound........");
				return loginobject;
			}
			else {
				System.out.println("data not found.........");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	
		return false;
	}

}
