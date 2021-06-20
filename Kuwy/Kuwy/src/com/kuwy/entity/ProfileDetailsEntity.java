package com.kuwy.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class ProfileDetailsEntity {

	@NonNull
	private int id;
	@NonNull
	private long selectYourAge;
	@NonNull
	private long selectCustomerProfile;
	@NonNull
	private long SelectMonthlyIncome;
	@NonNull
	private long selectLoanAmount;
	@NonNull
	private long SelectExistingEMI;
	@NonNull
	private long selectEMIAffordability;
	@NonNull
	private long selectGuarantor;
	@NonNull
	private String selectPlaceOfStay;
	@NonNull
	private boolean incomeProof;
}
