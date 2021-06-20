package com.xworkz.nik.Village;

import com.xworkz.nik.Village.DAO.VillageDAO;
import com.xworkz.nik.Village.DAO.VillageDAOimpl;
import com.xworkz.nik.Village.DTO.VillageDTO;

public class Tester {
	public static void main(String[] args) {
		try {
			VillageDTO dto=new VillageDTO();
			dto.setName("Shakhpur");
			dto.setPincode(365220);
			dto.setPopulation(2200);
			dto.setFamousFor("maa khodiyar temple");
			
			
			
			VillageDAO dao=new VillageDAOimpl();
			dao.save(dto);
			
			
		}catch (Exception e) {
			System.err.println("exception in "+e.getMessage());
		}
	}
}
