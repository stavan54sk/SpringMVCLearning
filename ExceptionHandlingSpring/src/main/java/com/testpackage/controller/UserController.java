package com.testpackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testpackage.exception.UnderAgeException;
import com.testpackage.model.User;

@Controller
@RequestMapping(value="/register")
public class UserController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView  getRegistrationForm()
	{
		return new ModelAndView("registrationForm","user",new User());
	}

	
	@RequestMapping(method=RequestMethod.POST)
	@ExceptionHandler(UnderAgeException.class)
	public ModelAndView  submitRegistrationForm(User user)
	{
		if(user.getAge()<18)
		{
			throw new UnderAgeException("Your Age is Below Required Age");
		}
		
		return new  ModelAndView("registrationDetails","user",user);
	}
}
