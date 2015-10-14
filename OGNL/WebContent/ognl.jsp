<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Login</title>
	</head>

	<body>
		username:<s:property value="username"/>
		user:<s:property value="user.age"/><br/>
		user1:<s:property value="user1.age"/><br/>
		投影(过滤)
		<s:property value="user2.{?#this.age == 1}[0]"/><br/>
		<s:property value="user2.{^#this.age>1}.{age}"/><br/>
		<s:property value="user2.{$#this.age > 1}.{age}"/><br/>
		<s:debug></s:debug>
	</body>
	
</html>
