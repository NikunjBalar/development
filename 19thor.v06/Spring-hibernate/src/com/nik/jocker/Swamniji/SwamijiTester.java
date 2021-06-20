package com.nik.jocker.Swamniji;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.nik.jocker.Swamniji.DAO.SwamijiDAO;
import com.nik.jocker.Swamniji.DAO.SwamijiDAOImpl;
import com.nik.jocker.Swamniji.DTO.SwamijiDTO;

public class SwamijiTester {
	
	public static void main(String[] args) {
		SwamijiDTO dto=new SwamijiDTO("siddu","legend",true);
		
		SwamijiDAO dao=new SwamijiDAOImpl();
		dao.save(dto);
			
	}
	
}