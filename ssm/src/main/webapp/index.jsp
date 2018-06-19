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
<title>Insert title here</title>
</head>
<body>
	<a href="teacher/test?id=1">teacher/test?id=1</a>
	<br />
	<a href="teacher/showTeacher?id=2">teacher/showTeacher?id=2</a>
	<br />
	<a href="teacher/showTeacher2?id=4">teacher/showTeacher2?id=4</a>
	<br />
	<a href="teacher/showTeacher3/3">teacher/showTeacher3/3</a>
	<br />
	<table border="1">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>地址</td>
			<td>操作</td>
		</tr>
		<tr>
			<td>${teacher.tid}</td>
			<td>${teacher.tname}</td>
			<td>${teacher.taddress}</td>
			<td><a href="teacher/addTeacher">添加</a> <a href="#">删除</a> <a href="#">修改</a> <a
				href="teacher/showTeacher4">详细</a></td>
		</tr>
	</table>
</body>
</html>