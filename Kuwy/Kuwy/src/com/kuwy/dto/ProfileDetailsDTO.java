package com.kuwy.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProfileDetailsDTO implements Serializable {

	private int id;
	private long selectYourAge;
	private long selectCustomerProfile;
	private long SelectMonthlyIncome;
	private long selectLoanAmount;
	private long SelectExistingEMI;
	private long selectEMIAffordability;
	private long selectGuarantor;
	private String selectPlaceOfStay;
	private boolean incomeProof;


}
