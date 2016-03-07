<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>

	<script type="text/javascript">
		function del () {
			if(confirm("确定要删除该客户吗?")) {
				return true;
				}
			return false;

			}
	</script>

</head>
<body>
	
	<%@include file="/info/admininfo.jsp" %>
	<h1>
		<font color="red">
			<center>客户列表</center>
		</font>
	</h1>
	
	<table border="1" width="80%" align="center">
		<tr>
			<td>序号</td>
			<td>姓名</td>
			<td>电话</td>
			<td>邮箱</td>
			<td>删除</td>
			<td>更新</td>
		</tr>
	
		<s:iterator value="#request.list" id="us">
			<tr>
				<td><s:property value="#us.userid"/></td>
				<td><s:property value="#us.username"/></td>
				<td><s:property value="#us.mobile"/></td>
				<td><s:property value="#us.email"/></td>
				<td><s:a href="deleteUser.action?user.userid=%{#us.userid}" onclick="return del ();">delete</s:a></td>
				<td><s:a href="updatePUser.action?user.userid=%{#us.userid}" onclick="return del ();">update</s:a></td>
			</tr>
		
		</s:iterator>
	</table>

</body>
</html>