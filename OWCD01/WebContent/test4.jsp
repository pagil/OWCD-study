<%@page import="owcd.beans.MyBean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Double myVar = new Double(5);
	pageContext.setAttribute("myVar", myVar);
%>

<c:if test="${myVar == 5}" var="variable" scope="page">
The result is ${myVar }<br>
The result is ${variable }
</c:if>
<hr>
<jsp:useBean id="thebean" beanName="123" type="owcd.beans.MyBean" scope="session"></jsp:useBean>
<jsp:setProperty name="thebean" property="title" param="name1"/>
<c:out value="${thebean.title }"></c:out>



</body>
</html>