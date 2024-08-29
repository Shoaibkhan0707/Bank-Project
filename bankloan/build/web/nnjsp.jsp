<%-- 
    Document   : nnjsp
    Created on : 08-Sep-2022, 9:55:02 AM
    Author     : shoaib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello good smorning!</h1>
        <%
            out.println(page.hashCode());
            %>
        <%
            //String name=session.getAttribute("name").toString();
            //out.println(name);
            String co=config.getInitParameter("country").toString();
            out.println(co);
        %>
    </body>
</html>
