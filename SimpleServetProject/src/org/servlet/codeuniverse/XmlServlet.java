package org.servlet.codeuniverse;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String userName = request.getParameter("userName");
		response.getWriter().append("hello from get method "+ userName);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset=utf-8");
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		String prof = request.getParameter("prof");
		//String location = request.getParameter("location");
		String[] location =request.getParameterValues("location");

		response.getWriter().append("hello from post method "+ userName + "! we know your full name is " +fullName);
		response.getWriter().append("you are a "+ prof);
		response.getWriter().append("you are in "+ location.length + " places ");
		for(int i=0; i<location.length; i++) {
			response.getWriter().append(location[i]+" ");
		}

		
	}
	

}
