package com.nikapp.formes.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class MainForm {
	public MainForm() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/main.joc", method = RequestMethod.POST)
	public String mainForm() {
		return "/Country.jsp";
	}
	
	@RequestMapping(value = "/country.joc", method = RequestMethod.POST)
	public String addInCountry(@RequestParam String countryId,@RequestParam String countryName,
			@RequestParam String population,@RequestParam String devloped) {
		System.out.println("running addInCountry()");
		System.out.println("Details");
		System.out.println(countryId);
		System.out.println(countryName);
		System.out.println(population);
		System.out.println(devloped);

		return "/Success.jsp";
	}
	
	@RequestMapping(value = "/success.joc", method = RequestMethod.POST)
	public String done() {
		return "/Main.jsp";
	}
	
	/*@RequestMapping(value = "/main.joc", method = RequestMethod.POST)
	public String mainForm2() {
		return "/Movie.jsp";
	}*/
	
	@RequestMapping(value = "/movie.joc", method = RequestMethod.POST)
	public String addInMovie(@RequestParam String movieName,@RequestParam String budget,
			@RequestParam String rating,@RequestParam String language) {
		System.out.println("running addInMovie()");
		System.out.println("Details");
		System.out.println(movieName);
		System.out.println(budget);
		System.out.println(rating);
		System.out.println(language);

		return "/Success.jsp";
	}
	
	/*@RequestMapping(value = "/success.joc", method = RequestMethod.POST)
	public String done2() {
		return "/Main.jsp";
	}
	
	@RequestMapping(value = "/main.joc", method = RequestMethod.POST)
	public String mainForm3() {
		return "/Sport.jsp";
	}*/
	
	/*@RequestMapping(value = "/sport.joc", method = RequestMethod.POST)
	public String addInSport(@RequestParam String name,@RequestParam String type,
			@RequestParam String origin,@RequestParam String noOfPlayers) {
		System.out.println("running addInCountry()");
		System.out.println("Details");
		System.out.println(name);
		System.out.println(type);
		System.out.println(origin);
		System.out.println(noOfPlayers);

		return "/Success.jsp";
	}*/
}