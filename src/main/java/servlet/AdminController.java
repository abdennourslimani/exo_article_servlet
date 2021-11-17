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

@WebServlet (urlPatterns= {"/home-admin" }  )


public class  AdminController extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException{
	

		// realiser un forward à index jsp
		req.getServletContext().getRequestDispatcher("/WEB-INF/index-admin.jsp").forward(req,res);

	}			

	
}