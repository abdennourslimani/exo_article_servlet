package servlet;



import java.io.IOException;
import java.io.PrintWriter;

import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet (urlPatterns= {"/login" ,"/"}  )


public class  LoginServlet extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException{
			//1) ServletOutputStream out = response.getOutputStream() ; 
		
		// creer un user :
		HttpSession session = req.getSession(); 
		User user = new User("ID1234ZE","abdennour",88,1,"user1@test.fr",false) ; 		
		
		// valoriser les champs de la session
				session.setAttribute("UID", user.getUID());		
				session.setAttribute("name", user.getUserName());
				session.setAttribute("nbPost", user.getNbPost());
				session.setAttribute("email", user.getEmail());
				session.setAttribute("isAdmin", user.isAdmin());

		
	
				res.sendRedirect(req.getContextPath() +"/home");
	}			

	
}