package com.testpackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/login")
public class UserController {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getView() {
		return new ModelAndView("login");
	}

}
