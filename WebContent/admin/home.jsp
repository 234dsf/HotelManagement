<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员页面</title>
</head>
<body>
	<h1><font color="green">操作菜单</font></h1>
	<s:form>
		<s:a href="admin/add.jsp">添加管理员</s:a><br>
		<s:a href="admin/list.jsp">用户列表</s:a><br>
		<s:a href="admin/update.jsp">修改用户信息</s:a><br>
		
	</s:form>
	
	
	
	
</body>
</html>