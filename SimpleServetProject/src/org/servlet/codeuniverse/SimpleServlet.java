package org.servlet.codeuniverse;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" },
initParams= {@WebInitParam(name="defaultUser", value="John Doe")})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html; charset=utf-8");
		response.getWriter().append("<h3> Hello </h3>");
		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context =request.getServletContext();
		if(userName != "" && userName != null) {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
	
		response.getWriter().append(" Request parameter has username as "+ userName);
		response.getWriter().append(" session parameter has username as "+ (String) session.getAttribute("savedUserName"));
		response.getWriter().append(" context parameter has username as "+ (String) context.getAttribute("savedUserName"));
		response.getWriter().append(" Init parameter has default username as "+ this.getServletConfig().getInitParameter("defaultUser"));
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	

}
