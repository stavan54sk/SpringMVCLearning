package com.testpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class RegistrationController extends SimpleFormController{
	
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Map<String, List<String>> map=new HashMap<String, List<String>>();
		
		List<String> qualification=new ArrayList<String>();
		qualification.add("SSC");
		qualification.add("HSC");
		qualification.add("Graduation");
		qualification.add("Post-Graduation");
		map.put("qualification", qualification);
		
		List<String> location=new ArrayList<String>();
		location.add("Pune");
		location.add("Hyderabad");
		location.add("Bangalore");
		location.add("Mumbai");
		map.put("location", location);
		
		List<String> hobbies=new ArrayList<String>();
		hobbies.add("Singing");
		hobbies.add("Dancing");
		hobbies.add("Movie Watching");
		map.put("hobbies", hobbies);
		
		List<String> profession=new ArrayList<String>();
		profession.add("Developer");
		profession.add("Tester");
		profession.add("InfraSupport");
		map.put("profession", profession);
		
		
		return map;
	}
	
	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		// TODO Auto-generated method stub
		User user =(User)command;
		return new ModelAndView("registerDetails", "user",user );
		
	}

}
