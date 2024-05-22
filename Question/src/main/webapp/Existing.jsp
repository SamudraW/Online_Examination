<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Existing Question</title>
<link rel="stylesheet" href="styleEx.css">
</head>
<body>
	
	<div class="box">
		<h1>Enter Question Details</h1>
	<form action="ExistingServlet" method="post">
	<br><br>
	<p>Enter Subject Code</p><input type="text" name="cid2"><br><br>
	<p>Enter Paper ID<p><input type="text" name="pid">
	
	<input type="submit" name=" submit" value="Enter">
	
	</form>
	</div>
	
</body>
</html>