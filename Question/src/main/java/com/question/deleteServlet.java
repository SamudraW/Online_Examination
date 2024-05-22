package com.question;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String qid = request.getParameter("qid");
		boolean isTrue;
		
		isTrue = ExistingDButil.deleteQuestion(qid);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("Enter.jsp");
			dis.forward(request, response);
		}else {
			List<question> qtDetails = ExistingDButil.getUpdate(qid);
			request.setAttribute("qtDetails", qtDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("paperView.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
