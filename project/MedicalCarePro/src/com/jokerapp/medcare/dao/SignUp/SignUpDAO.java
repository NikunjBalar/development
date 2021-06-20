package com.jokerapp.medcare.dao.SignUp;

import com.jokerapp.medcare.entity.Master;
import com.jokerapp.medcare.entity.SignUp;

public interface SignUpDAO {

	public void getDetails(Master master );
	public void signUp(SignUp signUp);
}
