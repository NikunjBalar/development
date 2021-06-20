package com.xworkz.nik.Transporter2.dao;

import com.xworkz.nik.Transporter.dto.TransporterDTO;

public interface TransporterDAO {
	public void save(TransporterDTO dto);
	
	public default TransporterDTO fatchBy(int id) {
		System.out.println("Default Boday");
		return null;	
	}
}
