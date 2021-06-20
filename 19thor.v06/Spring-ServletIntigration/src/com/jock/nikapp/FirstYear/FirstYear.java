package com.jock.nikapp.FirstYear;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class FirstYear {
public FirstYear() {
System.out.println("created \t"+this.getClass().getSimpleName());
}

@RequestMapping("/send.odc")
public String onSend(@RequestParam String message) {
	
	System.out.println("running onSend()");
	System.out.println("message is :\t "+message);
	return "/Jocker.jsp";
	
}
	
}
