package com.apro.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		String mailId = request.getParameter("mailId");
		String password = request.getParameter("password");
		
		if(!mailId.equals("devanshkaria36@gmail.com") || !password.equals("12345")) {
			writer.print("<h1><b>Enter valid credentails<b></h1>");
			if(!mailId.equals("devanshkaria36@gmail.com")) {
				writer.print("<b>Invalid MailId<b>");
				return;
			}
			writer.print("<b>Invalid Password<b>");
			return;
		}
		writer.print("<b>Login Successful <br>Welcome Devansh!<b>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
