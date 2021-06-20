package com.kuwy.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class LoanEntity {

	@NonNull
	private int id;
	@NonNull
	private int mfgYear;
	@NonNull
	private String selectBrand;
	@NonNull
	private String selectLocation;
	@NonNull
	private String ownerShip;
	@NonNull
	private String condition;
	@NonNull
	private double vehiclePrice;
	
}
