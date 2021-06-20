package com.kuwy.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class LoanDTO implements Serializable{

		private int id;
		private int mfgYear;
		private String selectBrand;
		private String selectLocation;
		private String ownerShip;
		private String condition;
		private double vehiclePrice;
		

	}


