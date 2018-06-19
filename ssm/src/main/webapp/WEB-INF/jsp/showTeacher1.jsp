<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>showTeacher</title>
</head>
<body>
	<h3>showTeacher</h3>
	<table border="1">
	<c:forEach var="list" items="${teacher}">
		<tr>
			<td>${list.tid}</td>
			<td>${list.tname}</td>
			<td>${list.taddress}</td>
			<td><a href="teacher/addTeacher">添加</a> <a href="teacher/delTeacher/${list.tid}">删除</a> <a href="#">修改</a> 
				</td>
		</tr>
		
		</c:forEach>
	</table>
</body>
</html>