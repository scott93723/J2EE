package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SquareServlet
 */
@WebServlet("/SquareServlet")
public class SquareServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// super.doGet(req, resp);
		PrintWriter out = resp.getWriter();
		String s = req.getParameter("width");

		if (s != null) {
			int width = Integer.parseInt(s);
			System.out.println(width);

			out.println("<html>");
			out.println("<body>");

			 for(int i = 1 ; i< width ; i++){
			      for(int j = 1 ; j <width ; j++)
			         System.out.print("*"+"\t");
			      System.out.println();
			   }

			}

			out.println("</body>");
			out.println("</html>");
		}
	}


