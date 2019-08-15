<%-- 
    Document   : SessionLogin
    Created on : 16 Jul, 2019, 12:08:47 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Welcome to Login Details</h2>
        <a href="SessionLogin.jsp">Login</a> |  
 <a href="LogoutServlet">Logout</a> |  
 <a href="ProfileServlet">Profile</a>  
   <form action="LoginServlet" method="post">  
Name:<input type="text" name="name"><br>  
Password:<input type="password" name="password"><br>  
<input type="submit" value="login">  
</form>  
    </body>
</html>
