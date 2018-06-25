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
<title>index</title>
<script type="text/javascript"
	src="<%=basePath%>js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/json2.js"></script>

</head>
<body>
	<h3>index</h3>
	<table>
		<tr>
			<td>${attendance.aid}</td>
			<td>${attendance.aname}</td>
			<td>${attendance.areason}</td>
			<td>${attendance.adate}</td>
		</tr>
	</table>

	<table border="1">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>地址</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${alist}" var="attendance">
			<tr>
				<td>${attendance.aid}</td>
				<td>${attendance.aname}</td>
				<td>${attendance.areason}</td>
				<td>${attendance.adate}</td>
				
			</tr>
		</c:forEach>
	</table>
	<br />
	<br />
	<br />
	<br />
	
</body>
</html>