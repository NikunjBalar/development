package com.mvc.joc.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.joc.dto.TrendDTO;
import com.mvc.joc.service.TrendService;

@Component
@RequestMapping("/")
public class TrendControler {

	@Autowired
	private TrendService service;

	public TrendControler() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/trend.joc", method = RequestMethod.POST)
	public String register(TrendDTO dto, ModelMap map) {
		System.out.println("running register");

		boolean saved = this.service.validateAndSave(dto);
		if (saved) {
			System.out.println("saved successfully");
			map.addAttribute("message", "Registration failed again, try again");
		} else {
			System.out.println("not saved");
			map.addAttribute("message", "Registration failed, try again");
			return "Shadidotcom";
		}
		// System.out.println(matrimonyDTO.getUuid());
		// request.setAttribute("name", matrimonyDTO);
		 map.addAttribute("model",dto );
		return "Success";
	}
}