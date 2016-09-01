package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BiggerServlet
 */
@WebServlet("/BiggerServlet")
public class BiggerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		String s= req.getParameter("a");
		String s2=req.getParameter("b");
		
		if(s!=null){
			int num=Integer.parseInt(s);
			System.out.println(num);
			
		out.println("<html>");
		out.println("<body>");
		
		int a;
		int b;
		
		
		
		
		
		
		
		
		out.println("</body>");
		out.println("</html>");
		}
	}

}
