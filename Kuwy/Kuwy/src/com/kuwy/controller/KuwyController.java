package com.kuwy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kuwy.dto.LoanDTO;

public class KuwyController {

	
	@RequestMapping(value = "/loan.ku", method = RequestMethod.POST)
	public String loanEligibility(LoanDTO dto  ) {
		try {
			
		} catch (Exception e) {
			System.out.println("exception in " + e.getMessage());
		}
		return "profile.jsp";
	}
}
