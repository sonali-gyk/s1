<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
    <%@taglib prefix="sc" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
i am in home
<%-- <sc:forEach items="${list }" var="f">
<sc:out value="${f }"></sc:out>
</sc:forEach> --%>
<%
List<String> list=(List<String>)request.getAttribute("list");
for(String a:list)
{
	

%>
<h1 ><%=a %></h1>
<%} %>


</body>
</html>