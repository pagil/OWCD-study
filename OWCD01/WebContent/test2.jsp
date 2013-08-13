<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Beans</title>
</head>
<body>

<%@ page import="owcd.EmployeeBean"%>
<%
EmployeeBean employee = new EmployeeBean();
employee.setName("Scott");
pageContext.setAttribute("employee", employee);
%>


<c:out value="${employee['name']}" />
<hr>
<c:out value='${employee["name"]}' />
<hr>
<c:out value='${employee.name}' />


</body>
</html>