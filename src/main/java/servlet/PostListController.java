package servlet;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import Model.Post;
import Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet (urlPatterns= {"/post-list"}  )


public class  PostListController extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException{
			//1) ServletOutputStream out = response.getOutputStream() ; 
			
		User user1 = new User("AZER13","user1",35,1,"user1@test.fr",true);
		User user2 = new User("AZER52","user2",10,1,"user1@test.fr",false);
		User user3 = new User("AZER56","user3",15,1,"user1@test.fr",false);
		User user4 = new User("AZER132","user4",10,1,"user1@test.fr",true);
		User user5 = new User("AZER53","user5",20,1,"user1@test.fr",false);

		Post post1 = new Post("345FDG","title-Iposum1" ,"content  post 1 " ,user1 );
		Post post2 = new Post("123FDG","title-Iposum2" ,"content  post 2 " ,user2 );
		Post post3 = new Post("345ZER","title-Iposum3" ,"content  post 3 " ,user3 );
		Post post4 = new Post("1234DZ","title-Iposum4" ,"content  post 4 " ,user4 );
		Post post5 = new Post("1234ER","title-Iposum5" ,"content  post 5 " ,user5 );

		List<Post> post = new ArrayList<>(); 
		
		post.add(post1);
		post.add(post2);
		post.add(post3);
		post.add(post4);
		post.add(post5);

		
			req.setAttribute("postsData", post);

			
			  HttpSession session = req.getSession(); 
			  session.setAttribute("postSession",post);
			 
		
		
		
		
		req.getServletContext().getRequestDispatcher("/WEB-INF/posts.jsp").forward(req,res);

	}			
			
	
	
	

}