package com.joker.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joker.register.dto.RegisterDTO;
import com.joker.register.service.RegisterService;

@Component
@RequestMapping("/")
public class Register {

	@Autowired
	private RegisterService registerService;

	public Register() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/registerPersonal.joc", method = RequestMethod.POST)
	public String registerPersonal(RegisterDTO dto) {

		System.out.println("registerPersonal() Starting");
		boolean saved = this.registerService.validAndSave(dto);
		if (saved) {
			System.out.println("data save successfull");
			return "success.jsp";
		} else {
			System.out.println("data not save");
		}
		System.out.println("registerPersonal() Ending");
		return "Register.jsp";

	}

	@RequestMapping(value = "/success.joc", method = RequestMethod.POST)
	public String done() {

		return "Register.jsp";

	}
}
