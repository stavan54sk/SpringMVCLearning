package com.testpackage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractFormController;

public class LoginController extends AbstractFormController{

	@Override
	protected ModelAndView showForm(HttpServletRequest request, HttpServletResponse response, BindException errors)
			throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("loginForm");
	}

	@Override
	protected ModelAndView processFormSubmission(HttpServletRequest request, HttpServletResponse response,
			Object command, BindException errors) throws Exception {
		

		String status = null;
		// TODO Auto-generated method stub
		Student student = (Student) command;
		String uname = student.getUserName();
		String pwd = student.getPassword();
		
		System.out.println("#########################"+uname);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$"+pwd);
		

		if (uname.equals("TestUser") && pwd.equals("TestPassword")) {
			status = "success";
		} else {
			status = "failure";
		}
		
		return new ModelAndView(status);

	
	}

}
