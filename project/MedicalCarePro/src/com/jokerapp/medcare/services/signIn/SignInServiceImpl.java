package com.jokerapp.medcare.services.signIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jokerapp.medcare.dao.SignIn.SignInDAO;
import com.jokerapp.medcare.entity.SignIn;

@Service
public class SignInServiceImpl implements SignInService{

	@Autowired
	private SignInDAO signInDAO;
	
	public SignInServiceImpl() {
		System.out.println("created \t"+this.getClass().getSimpleName() );
	}
	
	@Override
	public boolean loginexist(SignIn signInEntity) {
		System.out.println("involked save validate method" + signInEntity);
		boolean valid = true;
		if (signInEntity != null) {
			String employeeid = signInEntity.getEmployeeId();
			// String email = loginEntity.getEmail();
			String password = signInEntity.getPassword();
			this.signInDAO.chacklogin(signInEntity);
		}
		return valid;
	}
}