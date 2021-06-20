package com.xworkz.mediport.services;

import com.xworkz.mediport.dto.RegistrationDto;
import com.xworkz.mediport.entity.LoginEntity;;

public interface EmployeeService {

	public boolean validateAndSave(RegistrationDto registrationDto);
	
	public boolean loginexist(LoginEntity loginEntity);
	
	public boolean forgetPassword(String emial);

}
