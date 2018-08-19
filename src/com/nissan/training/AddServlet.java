package com.nissan.training;

import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.nissan.training.AddNumber;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n1, n2, res;
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		
		n1 = Integer.parseInt(num1);
		n2 = Integer.parseInt(num2);
		AddNumber obj = new AddNumber();
		res = obj.add(n1, n2);		
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<h1>The result is " + res + "</h1>");
		writer.close();
	}
}
