<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="employee" class="owcd.EmployeeBean" scope="session">
<jsp:setProperty property="name" name="employee" value="Viktor"/>
</jsp:useBean>

<jsp:include page="another.jsp"/>
<!-- %@include file="another.jsp" %-->

<hr>
<%
String[] directions = {"North","East","West","South"};
pageContext.setAttribute("directions", directions);
%>

<c:out value="${directions['1']}"/>
</body>
</html>
