<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="test" uri="/WEB-INF/test.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
for (int i=0; i<2;i++)
{
%>
out.print("welcome"+k)
<%
}
%>

<hr>

<c:out value="${test:doMyStuff('Viktar')}"></c:out>
</body>
</html>