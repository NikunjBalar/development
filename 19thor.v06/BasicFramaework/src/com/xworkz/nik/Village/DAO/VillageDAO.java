package com.xworkz.nik.Village.DAO;

import com.xworkz.nik.Village.DTO.VillageDTO;

public interface VillageDAO {

	public void save(VillageDTO dto);
	
	public default VillageDTO fatchById(int id) {
		return null;
	}
	
}
