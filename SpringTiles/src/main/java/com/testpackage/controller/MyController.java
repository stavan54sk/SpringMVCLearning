package com.testpackage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testpackage.model.User;

@Controller
public class MyController {

	
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getWelcomePage() {
		return ("welcome");
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getLoginPage() {
		return new ModelAndView("loginForm", "user", new User());
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
		String message="Your Login has Failed ,Please Check you Credentials...:(";
		String username=(String)request.getParameter("username");
		String password=(String)request.getParameter("password");
		if (username.equals("stavan54sk@gmail.com") && password.equals("Test@1234")) {
			 message="Congratulations "+username+",You have Logged In Successfully...!!!";
		}
		return new ModelAndView("loginStatus","message",message);
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView getRegistrationPage() {
		return new ModelAndView("registrationForm", "user", new User());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(User user) {
		return new ModelAndView("registrationDetails", "user", user);
	}

}
