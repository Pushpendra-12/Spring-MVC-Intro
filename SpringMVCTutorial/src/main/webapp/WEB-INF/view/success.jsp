<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ page import="com.spring.mvc.model.User" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your data</title>
</head>
<body>
    <h1 style="color: green;"> ${userCreated}</h1>
    <hr>
    <h1 style="color: green;">Welcome, ${user.name}</h1>
    <h1>Your email is ${user.email}</h1>
    <h1>Your password is ${user.password} try to secure it</h1>
</body>
</html>