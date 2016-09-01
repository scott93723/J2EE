package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StarServlet
 */
@WebServlet("/StarServlet")
public class StarServlet extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// super.doGet(req, resp);
		PrintWriter out = resp.getWriter();
		String s= req.getParameter("num");
		
		if(s!=null){
			int num=Integer.parseInt(s);
			System.out.println(num);
			
		out.println("<html>");
		out.println("<body>");
		
		for (int i = 1; i<=num ; i++) {
			
			out.print("*"+"</br>");
		
		}
		
	
		out.println("</body>");
		out.println("</html>");
		}
	}

}
