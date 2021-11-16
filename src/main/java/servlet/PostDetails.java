
  package servlet;
  
  
  
  import java.io.IOException; import java.io.PrintWriter; import
  java.util.Iterator; import java.util.List;
  
  import Model.Post; import Model.User; import
  jakarta.servlet.ServletException; import jakarta.servlet.ServletOutputStream;
  import jakarta.servlet.annotation.WebInitParam; import
  jakarta.servlet.annotation.WebServlet; import
  jakarta.servlet.http.HttpServlet; import
  jakarta.servlet.http.HttpServletRequest; import
  jakarta.servlet.http.HttpServletResponse; import
  jakarta.servlet.http.HttpSession;
  
  @WebServlet (urlPatterns= {"/post-details"} )
  
  
  public class PostDetails extends HttpServlet{
  
  
  @Override protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException{ 
  
  
  
    String UID = req.getParameter("id");
  
  
  
  
  HttpSession session = req.getSession(); // recupére objet qui a UID :
  
  List<Post> postList = (List<Post>) session.getAttribute("postSession") ;

  
  Post postDetail =null;
  
  for (int i = 0; i < postList.size(); i++) {
	  
	  if(postList.get(i).getUID() == UID ) {
  
	  	postDetail = postList.get(i);
	  	break; 
  		}
  }
  
  
  
  
	/*
	 * if(postDetail==null) {
	 * 
	 * res.sendRedirect(this.getServletContext().getContextPath() + "/");
	 * 
	 * return ; }
	 */
  
  req.setAttribute("UID", postDetail.getUID());
  
  // forward à la vue objet en question .
  
  req.getServletContext().getRequestDispatcher("/WEB-INF/postDetail.jsp").forward(req,res);
  
  }
  
  
  }
 