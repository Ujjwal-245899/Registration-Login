<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<!-- Coding By CodingNepal - codingnepalweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Registration </title> 
    <link rel="stylesheet" href="styleregistration.css">
   </head>
<body>
  <div class="wrapper">
    <h2>Registration</h2>
    <form action="RegisterServlet" method="post">
      <div class="input-box">
        <input type="text" id="name" name="name" placeholder="Enter your name" required>
      </div>
      <div class="input-box">
        <input type="text" id="email" name="email" placeholder="Enter your email" required>
      </div>
      <div class="input-box">
        <input type="password" id="password" name="password" placeholder="Create password" required>
      </div>
      <div class="input-box">
        <input type="password" name="cnfrm" placeholder="Confirm password" required>
         <div id="error-message" class="error-message">
    
</div>
         
      </div>
      <div class="policy">
        <input type="checkbox">
        <h3>I accept all terms & condition</h3>
      </div>
      <div class="input-box button">
        <input type="Submit" value="Register Now">
      </div>
      <div class="text">
        <h3>Already have an account? <a href="login.html">Login now</a></h3>
      </div>
      
    </form>
  </div>
   
  
</body>
</html>