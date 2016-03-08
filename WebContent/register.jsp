<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新用户注册</title>
</head>
<body>
	<s:form action="">
	
		<s:textfield name="username" label="用户名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:textfield name="mobile" label="联系电话"></s:textfield>
		<s:textfield name="email" label="邮箱"></s:textfield>
	
		<s:submit value="注册"></s:submit>
		<s:set/>
	</s:form>
	
	
	
	
	
	
	
	
	
</body>
</html>