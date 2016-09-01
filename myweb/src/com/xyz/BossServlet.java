package com.xyz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BossServlet
 */
@WebServlet("/BossServlet")
public class BossServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		String s= req.getParameter("name");
		
	if(s!=null){
		
		System.out.println("name");
		out.println("<html>");
		out.println("<body>");

	//	Object name = null;
		if(s.equals("Jack")){
			out.println("Hello,BOSS");
			
		}else {
			
			out.println("Hello");
			
		}
		
	}
		out.println("</body>");
		out.println("</html>");
		}
	}


