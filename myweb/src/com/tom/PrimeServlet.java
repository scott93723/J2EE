package com.tom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeServlet
 */
@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String s = req.getParameter("n");
		if (s != null) {
			int n = Integer.parseInt(s);
		
			
			// 質數是除了1與該數本身外..不被該數之前的任何數整除
			for (int i = 2; i <= n; i++) // 從2到輸入值範圍的迴圈..
			{
				boolean isPrime = true; // 判斷是否為質數的布林變數
				for (int j = 2; j < i; j++) // 做除法運算的內迴圈..由2開始到小於輸入的值..每一個去作除法運算
				{
					if (i % j == 0) // 餘數為0表示可以整除
					{
						isPrime = false; // 就不是質數..break跳出迴圈
						break;
					}
				}
				if (isPrime) // 若是質數..印出該數值..
				{
					out.print(i + "</br> ");
				}
			}
		}

		out.println("<html>");
		out.println("<body>");

		out.println("</body>");
		out.println("</html>");
	}
}
