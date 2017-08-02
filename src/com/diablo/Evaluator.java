package com.diablo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Evaluator
 */
@WebServlet("/Evaluator")
public class Evaluator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String ss = request.getParameter("byname");
		int i = Integer.parseInt(request.getParameter("byage"));
		PrintWriter pp = response.getWriter();
		if (i>65)
			pp.println("hi "+ss+" the movie ticket for you is for $7.00");
		else if (i<10)
			pp.println("hi "+ss+" the movie ticket for you is for $5.00");
		else
			pp.println("hi "+ss+" the movie ticket for you is for $9.00");
			
			
	}

}
