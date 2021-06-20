package com.balar.nikunj.joker;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.balar.nikunj.DTO.NikDTO;

@Component
@RequestMapping("/")
public class NikController {

	public NikController() {
		System.out.println("creaated \t"+this.getClass().getSimpleName());
	}

	@RequestMapping(value="/member.joc", method=RequestMethod.POST)
	public String doAdd(@RequestParam String familyName,@RequestParam String memberName,
			@RequestParam String occupation,@RequestParam String place,@RequestParam char gender ) {
		System.out.println("running doAdd()");
		System.out.println("details");
		
		return "/Success.jsp";
	}
	
	@RequestMapping(value="/membermodel.joc", method=RequestMethod.POST)
	public String doAddModel(NikDTO dto ,HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("running doAddModel()");
		System.out.println("details");
		
		req.setAttribute("fname", dto);
		
		return "/Successmodel.jsp";
	}

}
