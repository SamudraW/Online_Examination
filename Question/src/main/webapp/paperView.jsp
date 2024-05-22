<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question Interface</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	
	<div class="app"> 
		
	<c:forEach var="q" items="${qtDetails}">
	
	<c:set var="qid" value="${q.getQID()}"/>
	<c:set var="pid" value="${q.getPaperID()}"/>
	<c:set var="sid" value="${q.getSubjectCode()}"/>
	<c:set var="question" value="${q.getQuestion()}"/>
	<c:set var="option1" value="${q.getOption1()}"/>
	<c:set var="option2" value="${q.getOption2()}"/>
	<c:set var="option3" value="${q.getOption3()}"/>
	<c:set var="option4" value="${q.getOption4()}"/>
	<c:set var="answer" value="${q.getAnswer()}"/>
	
	<h1>${q.getPaperID()}
	${q.getSubjectCode()}</h1>
	<div class ="quiz"><h2>${q.getQID()} .${q.getQuestion()}</h2> </div>
	<div id="answer-buttons">
	<div class="btn">${q.getOption1()} </div>
	<div class="btn">${q.getOption2()} </div> 
	<div class="btn">${q.getOption3()} </div>
	<div class="btn">${q.getOption4()} </div>
	</div>
	<div class="btn">Answer: ${q.getAnswer()}</div>
	</c:forEach>
	
	
	
	<c:url value="updateQuestion.jsp" var="qupdate">
		<c:param name="qid" value="${qid}"/>
		<c:param name="pid" value="${pid}"/>
		<c:param name="sid" value="${sid}"/>
		<c:param name="question" value="${question}"/>
		<c:param name="option1" value="${option1}"/>
		<c:param name="option2" value="${option2}"/>
		<c:param name="option3" value="${option3}"/>
		<c:param name="option4" value="${option4}"/>
		<c:param name="answer" value="${answer}"/>
	</c:url><br>
	<a href="${qupdate}" >
	<input type ="button" name="update" value="Edit Question" id="next-btn">
	</a> <br>
	
	
	<c:url value="deleteQuestion.jsp" var="qdelete">
		<c:param name="qid" value="${qid}"/>
		<c:param name="pid" value="${pid}"/>
		<c:param name="sid" value="${sid}"/>
		<c:param name="question" value="${question}"/>
		<c:param name="option1" value="${option1}"/>
		<c:param name="option2" value="${option2}"/>
		<c:param name="option3" value="${option3}"/>
		<c:param name="option4" value="${option4}"/>
		<c:param name="answer" value="${answer}"/>
	</c:url>
	
	<a href="${qdelete}">
	<input type="button" name="delete" value="Delete Question"id="next-btn">
	</a>
	</div>
</body>
</html>