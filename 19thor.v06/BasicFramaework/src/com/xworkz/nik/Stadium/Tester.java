package com.xworkz.nik.Stadium;

import com.xworkz.nik.Stadium.dao.StadiumDAO;
import com.xworkz.nik.Stadium.dao.StadiumDAOImp;
import com.xworkz.nik.Stadium.dto.StadiumDTO;

public class Tester {
	public static void main(String[] args) {
		try {
		StadiumDTO dto=new StadiumDTO();
		dto.setCapacity(50000);
		dto.setEntryFee(550.00);
		dto.setNoOfEntry(6);
		dto.setParking(true);
		dto.setSid(1);
		
		
		StadiumDAO dao=new StadiumDAOImp();
		dao.save(dto);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
