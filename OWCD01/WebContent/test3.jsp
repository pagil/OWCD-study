<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java"
 contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Questin 27</title>
</head>
<body>
<% 
String colors = "red, green, blue, yellow";
//String[] colors = {"red", "green", "blue", "yellow"};
pageContext.setAttribute("colors", colors);
%>

<table border="1">
	<c:forEach var="colors" varStatus="status" items="${colors}">
	<tr>
		<td><c:out value="${status.index }"></c:out></td>
		<td><c:out value="${status.current }"></c:out></td>
	</tr>
	</c:forEach>
</table>
<hr>
<%=exception%>
</body>
</html>