package com.nikunj.medicare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: Nikunj Balar
 * 
 * Purpose : controller of the application
 *
 */
@Controller
public class Medicare {
	
	@RequestMapping("/joker")
	public ModelAndView demo(){
		String msg = "hi kunj";
		return new ModelAndView("welcome.jsp","msg",msg);
	}
	
}
