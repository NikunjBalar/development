package com.xworkz.mediport.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.mediport.dto.RegistrationDto;
import com.xworkz.mediport.entity.LoginEntity;
import com.xworkz.mediport.services.EmployeeService;

@Component
@RequestMapping("/")
public class DetailsController {

	@Autowired
	private EmployeeService employeeService;

	public DetailsController() {
		System.out.println("cerated/t" + this.getClass().getName());
	}

	@RequestMapping(value = "/employeesignup.mdc", method = RequestMethod.POST)
	public String registartionModel(RegistrationDto registrationDto, ModelMap map) {
		try {
			System.out.println("running on Employeee....................");
			System.out.println("Details");
			System.out.println(registrationDto);
			boolean saved = this.employeeService.validateAndSave(registrationDto);
			if (saved) {
				System.out.println("saved successfully");
				map.addAttribute("message", "Registration Successfull");

			} else {
				System.out.println("not saved");
				map.addAttribute("message", "Registration failed, try again");
				return "SignUP";
			}

			// System.out.println("Value aree "+matimonyDTO);
			// req.setAttribute("name", matimonyDTO);
			// System.out.println(uuid);
			// request.setAttribute("name", matrimonyDTO);
			map.addAttribute("model", registrationDto);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return "SignIn";
	}

	@RequestMapping(value = "/employeesignIn.mdc", method = RequestMethod.POST)
	private String loginCheck(LoginEntity loginEntity, HttpServletRequest req,HttpServletResponse resp,ModelMap map) {
		try {
			System.out.println("running on employee..............");
			System.out.println("Details");
			System.out.println(loginEntity);
			boolean saved = this.employeeService.loginexist(loginEntity);
			if (saved) {
				System.out.println("saved successfully");
				map.addAttribute("message", "Registration failed again, try again");
			} else {
				System.out.println("not saved");
				map.addAttribute("message", "Registration failed, try again");
				return "SignIn";
			}
			map.addAttribute("model", loginEntity);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return "Home";
	}
	
	@RequestMapping(value = "/forgetPassword.mdc", method = RequestMethod.POST)
	private String forgetPassword(String email, ModelMap map) {
		try {
			System.out.println("running on employee..............");
			System.out.println(email);
			boolean saved = this.employeeService.forgetPassword("email");
			if (saved) {
				System.out.println("saved successfully");
				map.addAttribute("message", "Registration failed again, try again");
			} else {
				System.out.println("not saved");
				map.addAttribute("message", "Registration failed, try again");
				return "SignIn";
			}
			map.addAttribute("model", email);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return "ForgetPassword";
	}
}