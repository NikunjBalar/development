package com.xworkz.matrimony.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.matrimony.Dao.MatrimonyDao;
import com.xworkz.matrimony.dto.MatrimonyDto;

@Component
public class MatrimonyServiceImpl implements MatrimonyService{

	@Autowired
	 MatrimonyDao matrimonyDao; 
	
	public MatrimonyServiceImpl() {
		System.out.println("created\t"+this.getClass().getMethods());
	}
	@Override
	public boolean saveValidate(MatrimonyDto dto) {
		System.out.println("invoking save ann validate"+dto);
		this.matrimonyDao.saveService(dto);
		
		return true;
	}

}
