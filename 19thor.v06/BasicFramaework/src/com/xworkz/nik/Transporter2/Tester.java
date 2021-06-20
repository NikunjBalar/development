package com.xworkz.nik.Transporter2;

import com.xworkz.nik.Transporter.dao.TransporterDAO;
import com.xworkz.nik.Transporter.dao.TransporterDAOImpl;
import com.xworkz.nik.Transporter.dto.TransporterDTO;

public class Tester {
	public static void main(String[] args) {
		try {
			TransporterDTO dto=new TransporterDTO();
			//dto.setId(2);
			dto.setName("BRTS");
			dto.setState("Gujrat");
			dto.setEmail("gjtransport@gamil.org");
			dto.setPhoneno(9737366556l);
			
			TransporterDAO dao=new TransporterDAOImpl();
			dao.save(dto);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
