package com.xworkz.nik.Village;

import com.xworkz.nik.Village.DAO.VillageDAO;
import com.xworkz.nik.Village.DAO.VillageDAOimpl;

public class ReadTester {
	public static void main(String[] args) {
		try {
			VillageDAO dao=new VillageDAOimpl();
			dao.fatchById(2);	
		} catch (Exception e) {
			System.err.println("exception in main method"+e.getMessage());
		}
	}
}
