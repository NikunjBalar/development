package com.nikunj.medicalCare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MedicalCareController {

	public MedicalCareController() {
		System.out.println("invoking "+ this.getClass().getSimpleName());
	}
	
	@RequestMapping(value="")
	public void home() {

	}
}
