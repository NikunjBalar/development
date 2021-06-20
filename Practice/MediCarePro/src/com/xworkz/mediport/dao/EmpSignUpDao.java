package com.xworkz.mediport.dao;

import com.xworkz.mediport.entity.RegistrationEntity;

public interface EmpSignUpDao {

	public void save(RegistrationEntity registrationEntity);

	Object chacklogin(String empid, String password);
	
	Object forgetPassword(String email);
	
	
	
}
