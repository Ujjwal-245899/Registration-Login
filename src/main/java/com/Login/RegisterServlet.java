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
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String pass= request.getParameter("password");
		String cnfrmpass=request.getParameter("cnfrm");
		
		
		//db connection with the help of hibernate
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		
		//buikding session 
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		
		Register rgstr= new Register();
		rgstr.setName(name);
		rgstr.setEmail(email);
		rgstr.setPass(pass);
		
		// saving the object to db
		if(pass.equalsIgnoreCase(cnfrmpass))
		{
			session.save(rgstr);
			
			tx.commit();
		}
		else 
		{
           
			
	            request.getRequestDispatcher("registration.jsp").forward(request, response);
	        
        }

		
		
		
		
		session.close();
		
		
		doGet(request, response);
	}

}
