package com.question;

import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class InsertQServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paperid = request.getParameter("pid");
		String scode = request.getParameter("scd");
		String question = request.getParameter("question");
		String option1 = request.getParameter("option1");
		String option2 = request.getParameter("option2");
		String option3 = request.getParameter("option3");
		String option4 = request.getParameter("option4");
		String answer = request.getParameter("answer");
		
		boolean isTrue;
		
		isTrue = ExistingDButil.insert(paperid,scode, question, option1, option2, option3, option4, answer);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("Enter.jsp"); 
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp"); 
			dis2.forward(request, response);
		}
	}

}
