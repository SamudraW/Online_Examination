package com.question;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String qid = request.getParameter("qid");
		String pid = request.getParameter("pid");
		String sid = request.getParameter("sid");
		String question = request.getParameter("question");
		String option1 = request.getParameter("option1");
		String option2 = request.getParameter("option2");
		String option3 = request.getParameter("option3");
		String option4 = request.getParameter("option4");
		String answer = request.getParameter("answer");
		
		boolean isTrue;
		
		isTrue=ExistingDButil.updateQuestion(qid, pid, sid, question, option1, option2, option3, option4, answer);
		
		if(isTrue == true) {
			
			List<question> qtDetails = ExistingDButil.getUpdate(qid);
			request.setAttribute("qtDetails", qtDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("paperView.jsp");
			dis.forward(request, response);
		}else {
			List<question> qtDetails = ExistingDButil.getUpdate(qid);
			request.setAttribute("qtDetails", qtDetails);
			
			RequestDispatcher dis1 = request.getRequestDispatcher("paperView.jsp");
			dis1.forward(request, response);
		}
		
	}

}
