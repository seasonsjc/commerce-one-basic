package com.commerceone.identity.authentication;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.commerceone.identity.Login;

/**
 * Servlet implementation class AuthService
 */
@WebServlet( "/AuthService")
public class AuthService extends HttpServlet {
	       
	private static final long serialVersionUID = -5417404638032003031L;

	
	
	public AuthService() {
        super();
    }

	protected void doGet(HttpServletRequest request
						, HttpServletResponse response) throws ServletException, IOException {

		
		UserService service = new UserService();
		
		Login login = new Login();
		
		login.setUsername( request.getParameter("username") );
		login.setPassword( request.getParameter("password")  ) ;
		
		
		if ( service.isValid(login) ) {
			
			// vai para a welcome page ;)	
			System.out.println("is Valid");
			
			response.sendRedirect("index.jsp");
		
		} else {
			
			request.setAttribute("message", "Oia foi nao ... viu");
			
			RequestDispatcher dispacher 
				= request.getRequestDispatcher("login.jsp");
			
			dispacher.forward(request, response);
			
			// volta para o form de authenticacao
			System.out.println("Not valid");

		
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
