<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Question</title>
<link rel="stylesheet" href="styleEx.css">
</head>
<body>

	<%
		String qid = request.getParameter("qid");
		String pid = request.getParameter("pid");
		String sid = request.getParameter("sid");
		String question = request.getParameter("question");
		String option1 = request.getParameter("option1");
		String option2 = request.getParameter("option2");
		String option3 = request.getParameter("option3");
		String option4 = request.getParameter("option4");
		String answer = request.getParameter("answer");
	%>
	
	<div class="box">
	<h1>Delete Question</h1><br><br>
	
	<form action="deleteServlet" method="post">
		Question ID<input type="text" name="qid" value="<%= qid%>" readonly><br><br><br><br>
		Paper ID<input type="text" name="pid" value="<%= pid%>"readonly><br><br><br><br>
		Subject Code<input type="text" name="sid" value="<%= sid%>"readonly><br><br><br><br>
		Question<input type="text" name="question" value="<%= question%>"readonly><br><br><br><br>
		Option 1<input type="text" name="option1" value="<%= option1%>"readonly><br><br><br><br>
		Option 2<input type="text" name="option2" value="<%= option2%>"readonly><br><br><br><br>
		Option 3<input type="text" name="option3" value="<%= option3%>"readonly><br><br><br><br>
		Option 4<input type="text" name="option4" value="<%= option4%>"readonly><br><br><br><br>
		Answer<input type="text" name="answer" value="<%= answer%>"readonly><br><br><br><br>
	
		<input type="submit" name="submit" value="Confirm Delete">
	</form>
	</div>
	
</body>
</html>