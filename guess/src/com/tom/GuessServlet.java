package com.tom;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuessServlet
 */
@WebServlet("/GuessServlet")
public class GuessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SECRET = "secret";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GuessServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String n = request.getParameter("number");
		if (n != null) {

			int number = Integer.parseInt(n);

			if (request.getSession().getAttribute(SECRET) == null) {
				int seret = new Random().nextInt(10) + 1;
				Object secret = null;
				request.getSession().setAttribute(SECRET, secret);
				System.out.println(SECRET + ":" + secret);

			}
			String msg = null;
			int secret = (int) request.getSession().getAttribute(SECRET);
			if (number > secret) {
				msg="小一點吧";
			}else if(number<secret){
				msg="大一點吧";
						
			}else{
				msg="猜對了,數字是:"+secret;
				request.getSession().invalidate();
			}

			request.getSession().setAttribute("message", msg);
			response.sendRedirect("guess.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
