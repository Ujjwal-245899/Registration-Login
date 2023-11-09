package com.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Servletlogin
 */
public class Servletlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletlogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String email=request.getParameter("email");
		String pass= request.getParameter("password");
		
		//Starting to talk with hibernate
		
		//step 1
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//step 2 
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	PrintWriter out = response.getWriter();
		
		Register user=(Register)session.load(Register.class, 3);
		
		if(user.getEmail().equalsIgnoreCase(email) && user.getPass().equalsIgnoreCase(pass))
		{
			out.println("<h1> "+user.getEmail()+"--> "+email+"</h1>");
			out.println("<h1>"+user.getPass()+"-->"+pass+"</h1>");
		}
		else 
		{
			request.getRequestDispatcher("login.html");
		}
		
		
			
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
