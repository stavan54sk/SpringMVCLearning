package com.testpackage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

public class StudentController extends AbstractCommandController {

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
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
