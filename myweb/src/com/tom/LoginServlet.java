package com.tom;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("password");

		Member m = new Member(userid, passwd);
		if (m.login()) {

			response.getWriter().println("success");

		} else {

			request.getSession().setAttribute("error", "login fail");
			request.getSession().setAttribute("userid", userid);
			request.getSession().setAttribute("passwd", passwd);

			response.sendRedirect("login.jsp");

			// request.getSession().setAttribute("member", m);
			// response.sendRedirect("login.jsp");
		}

		// Statement stmt = conn.createStatement();
		// ResultSet rs = stmt
		// .executeQuery("select * from users where userid='" + userid + "' and
		// passwd='" + passwd + "'");
		// if (rs.next()) {
		// response.getWriter().println("Login Success");
		// } else {
		// request.getSession().setAttribute("error", "您登入失敗");
		// request.getSession().setAttribute("userid", userid);
		// request.getSession().setAttribute("passwd", passwd);
		// response.sendRedirect("login.jsp");
		// }

	}

}