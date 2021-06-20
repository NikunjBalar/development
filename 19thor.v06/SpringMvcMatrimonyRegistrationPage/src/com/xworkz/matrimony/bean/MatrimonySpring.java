package com.xworkz.matrimony.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.matrimony.dto.MatrimonyDto;
import com.xworkz.matrimony.service.MatrimonyService;

@Component
@RequestMapping("/")
public class MatrimonySpring {

	@Autowired
	private MatrimonyService matrimonyService;

	public MatrimonySpring() {
		System.out.println("created\t" + this.getClass().getName());
	}
	@RequestMapping("/matrimony.om")
	public String onRegister(MatrimonyDto dto, ModelMap map) {
		System.out.println(dto);
		map.addAttribute("dto", dto);
		boolean saved=this.matrimonyService.saveValidate(dto);
		if(saved) {
			System.out.println("saved succesfully");
			return "success";
		}else {
			System.out.println("return me an error msg");
			return "matrimony";
		}
	}
}
