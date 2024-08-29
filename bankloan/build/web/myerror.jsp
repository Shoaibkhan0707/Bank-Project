<%-- 
    Document   : myerror
    Created on : 13-Sep-2022, 8:59:15 AM
    Author     : shoaib
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>this is error page!</h1>
        <%--
        <%--<%@ page isErrorPage="true"%> 
         <%@ page buffer="8kb"%>
          <%@ page autoFlush="true"%>
          <%
              HashMap<Integer,String>hm=new HashMap<Integer,String>();
              hm.put(1,"india");
              hm.put(2,"usa");
              hm.put(3,"Nepal");
              request.setAttribute("country",hm);            
          %>
          <select name="country">
              <c:forEach var="x" items="${requestScope.country}">
                  <option value=${x.key}>${x.value}</option>
              </c:forEach>
              </select>
              <%
                  String cities="lucknow-kanpur-Allahabad-varansi";
                  request.setAttribute("cities",cities);
              %>
              <select name="country">
              <c:forTokens var="x" items="${requestScope.cities}" delims="-">
                  <option value=${x}>${x}</option>
              </c:forTokens>
              </select>
              <%
                  int x=10;
                  request.setAttribute("x",x);
              %>
              <c:choose>
                  <c:when test="${requetScope.x<10}">
                      <h1> x is less than 10</h1>
                   </c:when>
                   <c:when test="${requestScope.x<20}">
                      <h1> x is less than 20</h1>
                   </c:when>      
                   <c:otherwise>
                       <h1>no match found</h1>
                   </c:otherwise>
              </c:choose>
               <c:set var="x" value="10" scope="request" />
               <h1>${requestScope.x}</h1>
               <c:remove var="x" scope="request" />
               <h1>${requestScope.x}remove data</h1>
               --%>
               <c:url var="x" value="http://facebook.com" scope="session">
               <c:param name="fn" value="shoaib"/>
               </c:url> 
               <a href="${sessionScope.x}"> click me</a>
    </body>
</html>
