<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Question</title>
<link rel="stylesheet" href="styleEx.css">
</head>
<body>

	<div class="box">
	<h1>Add new Question</h1>
	
	<form action="InsertQServlet" method="post">
		<br><br>
	    <p>PaperID</p><input type="text" name="pid" required><br><br>
	    <p>SubjectCode</p><input type="text" name="scd" required><br><br>
		<p>Question</p><input type="text" name="question" required><br><br>
		<p>Option 1</p><input type="text" name="option1" required><br><br>
		<p>Option 2</p><input type="text" name="option2" required><br><br>
		<p>Option 3</p><input type="text" name="option3" required><br><br>
		<p>Option 4</p><input type="text" name="option4" required><br><br>
		<p>Answer</p><input type="text" name="answer" required><br><br>
		
		
		<input type="submit" name="submit" value="Submit">
			
	</form>
	</div>
</body>
</html>