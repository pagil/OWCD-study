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

<hr>

<%
session.setAttribute("varCents", "30");
%>
$100.${varCents }

<hr>

<c:out value="${pageContext.request}"></c:out><br>
<c:out value="${pageContext.exception}"></c:out><br>
<c:out value="${pageContext}"></c:out><br>

<hr>

<c:out value="${var1 + var2}"></c:out><br>
<c:out value="${var3%2}"></c:out><br>
<c:out value="${0%2}"></c:out><br>

<hr>
<% String s = "1";
session.setAttribute("s1", s);
pageContext.setAttribute("s", s);
%>

<c:out value="${s1+4}"></c:out><br>

<hr>
<%! 
String str;
%>
The string is: <%=str %>


<c:out value="${s1+4}"></c:out><br>

</body>
</html>