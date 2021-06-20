package com.xworkz.nik.Frinds;

import com.xworkz.nik.Frinds.DAO.FrindsDAO;
import com.xworkz.nik.Frinds.DAO.FrindsDAOimpl;
import com.xworkz.nik.Frinds.DTO.FrindsDTO;

public class FrindTester {
	public static void main(String[] args) {
		try {
			FrindsDTO dto=new FrindsDTO();
			dto.setFullName("pritesh dudhatra");
			dto.setNumber(9875645678l);
			dto.setEmail("priteshdudhatra@gmail.com");
			dto.setState("gujrat");
			
			FrindsDAO dao=new FrindsDAOimpl();
			dao.save(dto);
		}
		catch(Exception e) {
			System.err.println("exception in main method"+e.getMessage());
		}
	}
}
