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

@WebServlet (urlPatterns= {"/user-info"}  )


public class  UserListController extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException ,IOException{
			//1) ServletOutputStream out = response.getOutputStream() ; 
			
		
		
			
			request.getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request,response);		
		
	}
	

	
}