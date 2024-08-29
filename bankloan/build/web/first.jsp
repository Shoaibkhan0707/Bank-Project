<%-- 
    Document   : first
    Created on : 12-Sep-2022, 9:23:56 AM
    Author     : shoaib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="blm.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="main_div">
      <%--   <h4>Hello World!</h4> --%>
         <div id ="header">
         <%@include file="header.jspf" %>
         </div>
         <div id="sidepane">
         <%@include file="sidepane.jspf" %>
         </div>
         <div id="footer">
         <%@include file="footer.jspf" %>
         <footer>
           </div><!-- end of main div -->
    </body>
</html>
