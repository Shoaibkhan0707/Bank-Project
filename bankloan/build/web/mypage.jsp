<%-- 
    Document   : mypage
    Created on : 13-Sep-2022, 8:59:41 AM
    Author     : shoaib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%@page errorPage="myerror.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            int x=10;
            int y=0;
        %>
        <%=x/y %>
    </body>
</html>
