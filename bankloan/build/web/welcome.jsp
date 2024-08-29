<%-- 
    Document   : welcome
    Created on : 06-Sep-2022, 9:35:04 AM
    Author     : shoaib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>

<!DOCTYPE html>
<html>
    <head>
         <link href="blm.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <ul>
            <%--
        <%
        String s="lucknow junction";
        String []sa=s.split(" ");
        for(int i=0;i<sa.length;i++){
            %>
           <li> <%=sa[i]%></li>
          <%
           }
        %>
            <%
            <%--    int a=10;
               out.println("<h2>"+a+"</h2>");
                %>
                <%
                    int count=1;
                    out.println(count);
                    count++;
                     %>
                 
                <%!
                    int count=1;
                    %>
                    <%
                  out.println(count);
                      this.count++;
                  %>
                   
                    <%
                        request.setAttribute("name","mukesh");
                        request.getRequestDispatcher("nnjsp").forward(request,response);
                    %>
                    <%page session="false" %>
                    <%
                       
                        session.setAttribute("name","mukesh");
                        response.sendRedirect("nnjsp");
                        
                    %>
                    <@page info="this is my page">
                    <%@include file="header.jspf" %>
                    <%@include file="sidepane.jspf" %>
                    <%@include file="footer.jspf" %>
                    --%>
                    <%
                            ArrayList al =new ArrayList();
                            al.add(20);
                            al.add("lucknow");
                    %>
                    <%=al.get(0)%>
                     <%=al.get(1)%>
        </ul>
    </body>
</html>
