<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Help page</title>
</head>
<body>
    <h1>This is home page</h1>
    <h1>Called by modelAndViewTest controller</h1>

    <%
       String Name = (String) request.getAttribute("name");
       Integer id =  (Integer) request.getAttribute("Id");

       List<String> friends = (List<String>) request.getAttribute("f");
    %>
    <h1>Name is <%= Name %></h1>
    <h1>Id is <%= id %></h1>

    <%
        for(String friend : friends){
            out.println("<h3>" + friend + "<h3>");
        }
    %>
</body>
</html>
