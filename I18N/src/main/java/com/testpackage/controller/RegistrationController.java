package com.testpackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.testpackage.model.User;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getRegistrationForm()
	{
		return new ModelAndView("registrationForm","user",new User());
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView postRegistrationForm(User user)
	{
		return new ModelAndView("registrationDetails","user",user);
	}

}
