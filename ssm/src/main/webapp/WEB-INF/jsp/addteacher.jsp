<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/ssm/teacher/doaddTeacher" method="post" >
	<table>
	<tr>
	<td>姓名</td>
	<td><input type="text" name="tname"></td>
	</tr>
	<tr>
	<td>地址</td>
	<td><input type="text" name="taddress"></td>
	</tr>
	<input type="submit" value="提交"/>
	</table>	
	</form>
</body>
</html>