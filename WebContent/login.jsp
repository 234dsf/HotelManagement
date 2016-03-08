<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
	
	<h1><font color="blue">用户登录</font></h1>
	<s:form action="" method="post">
		<s:a href="adminlogin.jsp">管理员登录</s:a>&nbsp;&nbsp;&nbsp;
		<s:a href="register.jsp">用户注册</s:a>
		
		<s:textfield name="username" label="用户名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
	
	</s:form>









</body>
</html>