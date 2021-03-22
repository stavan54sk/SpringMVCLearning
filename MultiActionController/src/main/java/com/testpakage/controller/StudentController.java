package com.testpakage.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class StudentController extends MultiActionController {

	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("home");
		model.addObject("message", "Home");
		return model;
	}

	public ModelAndView create(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("create");
		model.addObject("message", "Add");
		return model;
	}

	public ModelAndView search(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("search");
		model.addObject("message", "Remove");
		return model;
	}

	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("update");
		model.addObject("message", "Update");
		return model;
	}
	
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("delete");
		model.addObject("message", "Update");
		return model;
	}

}
