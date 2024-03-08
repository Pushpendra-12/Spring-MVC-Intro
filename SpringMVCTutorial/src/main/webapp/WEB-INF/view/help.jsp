<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home page</title>
</head>
<body>
    <h1>This is home page</h1>
    <h1>Called by home controller</h1>

    <!-- <%
       String Name = (String) request.getAttribute("name");
       Integer rollNo =  (Integer) request.getAttribute("roll");
       LocalDateTime time = (LocalDateTime)request.getAttribute("time");
       
    %> -->
    <!-- <h1>Name is <%= Name %></h1> -->
    <!-- <h1>Roll Number is <%= rollNo %></h1>
    <h1>Date and time is <%= time %></h1> -->

    <!-- This is Jsp Expression tag -->
    <h1>My name is ${name} </h1>  
        
    <h1>Roll number is  ${roll } </h1>
       
    <h1>Date is ${time} </h1>
    <hr>
    <!-- <h1>List is ${list}</h1> -->

    <c:forEach var="item" items="${list}">
        <h1>${item}</h1>
    </c:forEach>
        
   
</body>
</html>
