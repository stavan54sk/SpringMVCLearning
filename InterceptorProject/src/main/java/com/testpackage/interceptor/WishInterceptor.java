package com.testpackage.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class WishInterceptor implements HandlerInterceptor{


	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("#################PREHANDLE HANDLE WISH################");
		long starttime = System.currentTimeMillis();
		request.setAttribute("starttime", starttime);
		return true;

	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("#################POST HANDLE WISH################");
		long starttime = (Long) request.getAttribute("starttime");
		long endtime = System.currentTimeMillis();
		request.setAttribute("endtime", endtime);
		modelAndView.addObject("endtime",endtime );
		modelAndView.addObject("starttime",starttime );
		modelAndView.addObject("processingtime",endtime-starttime );
		
	
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("#################HANDLER COMPLETED WISH################");
		long starttime = (Long) request.getAttribute("starttime");
		long endtime = (Long) request.getAttribute("endtime");
		long processingTime=endtime-starttime;
		request.setAttribute("processingTime", processingTime);
		
	}

}
