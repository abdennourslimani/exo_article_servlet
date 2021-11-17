package filters;

import java.io.IOException;
import java.util.Date;

import Model.User;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebFilter(filterName="AdminFilters")
		

public class AdminFilters implements Filter {
	User user = new User("ID1234ZE","abdennour",88,1,"user1@test.fr",true) ; 		

			
	public AdminFilters() {
	}

	@Override
	public void init(FilterConfig fConfig) throws ServletException {

	
	}

	@Override
	public void destroy() {
		System.out.println("LogFilter destroy!");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) request).getSession(); 

	
		
		String user = (String)session.getAttribute("isAdmin");
		
		if(user.equals("user")) {
			
			chain.doFilter(request, response);	
			
		}else {
			
			HttpServletResponse resp = (HttpServletResponse) response;

			resp.sendRedirect(((HttpServletRequest) request).getContextPath() +"/home-admin" );
			
		}
		
	}

}