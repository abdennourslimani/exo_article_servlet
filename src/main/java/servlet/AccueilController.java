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

@WebServlet (urlPatterns= {"/home"}  )


public class  AccueilController extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException{
			//1) ServletOutputStream out = response.getOutputStream() ; 
		
		// creer un user :
		HttpSession session = req.getSession(); 
		User user = new User("ID1234ZE","abdennour",88,1,"user1@test.fr",true) ; 		
		
		// valoriser les champs de la session
		session.setAttribute("UID", user.getUID());		
		session.setAttribute("name", user.getUserName());
		session.setAttribute("nbPost", user.getNbPost());
		session.setAttribute("email", user.getEmail());
		session.setAttribute("isAdmin", user.isAdmin());

		// realiser un forward � index jsp
		req.getServletContext().getRequestDispatcher("/index.jsp").forward(req,res);

	}			

	
}