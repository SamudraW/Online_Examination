<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="index.css">
<meta charset="UTF-8">
<title>Online Exam System</title>
</head>
<body>
<header>
    <nav class="header__navegation">
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="about_us.jsp">About Us</a></li>
            <li><a href="faq.jsp">FAQ</a></li>
            <li><a href="Enter.jsp">Dashboard</a></li>
        </ul>
    </nav>

    <div class="header__content">
    <h1>Welcome to Edu Link</h1>
    <h2>Take or Create Exams Anytime, Anywhere</h2>
    
 <a href="login.jsp"><button>Get Started</button></a>
</div>

<div class="header__buttons">
    <a href="LoginServlet" class="loginbtn">Log In</a>
    <a href="RegisterServlet" class="registerbtn">Register</a>
</div>

</header>

<section class="landing-section">
    <div class="landing-content">
        <h2>Why Choose Our Online Exam System?</h2>
        <p>Our Online Exam System provides you with the opportunity to take exams and study various modules from the comfort of your own home. Here are some key benefits:</p>
        <ul>
            <li>Flexible Exam Scheduling</li>
            <li>Wide Range of Exam Modules</li>
            <li>Detailed Results and Feedback</li>
            <li>Accessible Anytime, Anywhere</li>
        </ul>
        <p>Join us today and start your journey to success!</p>
    </div>
</section>
<footer class="site-footer">
    <div class="container">
        <div class="footer-content">
            <div class="footer-logo">
                <img src="logo.png" alt="Your Logo">
            </div>
            <div class="footer-links">
                <h3>Quick Links</h3>
                <ul>
                    
                    <li><a href="services.jsp">Services</a></li>
                    <li><a href="faq.jsp">FAQ</a></li>
                    <li><a href="#">Contact Us</a></li>
                </ul>
            </div>
            <div class="footer-contact">
                <h3>Contact Us</h3>
                <p>Email: edulink@example.com</p>
                <p>Phone: +1-123-456-7890</p>
            </div>
        </div>
    </div>
    <div class="footer-bottom">
        &copy; Edulink. All rights reserved.
    </div>
</footer>



</body>
</html>