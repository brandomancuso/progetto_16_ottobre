package it.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/log", method = RequestMethod.GET)
	public String login() {
		System.out.println("Redirect..");
		return "login";
	}
	
	@RequestMapping(value = "/h", method = RequestMethod.GET)
	public String conferma() {
		System.out.println("Redirect..");
		return "home";
	}
	
	
	
}
