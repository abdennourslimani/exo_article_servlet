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
		
		if(user == null) {

			HttpServletResponse resp = (HttpServletResponse) response;

			resp.sendRedirect(((HttpServletRequest) request).getContextPath() +"/login.jsp" );
			
		}else {
			
			if(user.equals("user")) {
				
				HttpServletResponse resp = (HttpServletResponse) response;
				resp.sendRedirect(((HttpServletRequest) request).getContextPath() +"/home" );
				return;
			}
			
			chain.doFilter(request, response);	

		}

	
		
	}

}