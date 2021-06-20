package com.jokerapp.medcare.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jokerapp.medcare.dto.MedicalCareDTO;
import com.jokerapp.medcare.entity.SignIn;
import com.jokerapp.medcare.services.signIn.SignInService;
import com.jokerapp.medcare.services.signUp.SignUpService;

@Controller
@RequestMapping("/")
public class MedicalCare {

	Logger logger = Logger.getLogger(MedicalCare.class.getName());

	@Autowired
	private SignUpService signUpService;

	@Autowired
	private SignInService signInService;
	
	public MedicalCare() {
		System.out.println("created " + this.getClass().getSimpleName());
		logger.info("created \t" + this.getClass().hashCode());
	}

	@RequestMapping(value = "/home.hasi", method = RequestMethod.POST)
	public String mediCare() {

		return "signup.jsp";
	}

	@RequestMapping(value = "/signup.hasi", method = RequestMethod.POST)
	public String signUp(MedicalCareDTO dto ,ModelMap map) {
		try {
			boolean saved = this.signUpService.suValidAndSave(dto);
			if (saved) {
				map.addAttribute("message", "registration faild try again");
				return "signIn.jsp";
			}
		} catch (Exception e) {
			System.out.println("exception in " + e.getMessage());

			logger.info(" exception in controler.signUp");
		}
		return "signUp.jsp";
	}
	
	@RequestMapping(value="/signin.hasi" ,method=RequestMethod.POST)
	private String loginCheck(MedicalCareDTO dto, HttpServletRequest req,HttpServletResponse resp,ModelMap map) {
		try {
			System.out.println("running on employee..............");
			System.out.println("Details");
			System.out.println(signInEntity);
			boolean saved = this.signInService.loginexist(signInEntity);
			if (saved) {
				System.out.println("saved successfully");
				map.addAttribute("message", "Registration failed again, try again");
			} else {
				System.out.println("not saved");
				map.addAttribute("message", "Registration failed, try again");
				return "signIn.jsp";
			}
			map.addAttribute("model", signInEntity);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return "home.hasi";
	}
	
}