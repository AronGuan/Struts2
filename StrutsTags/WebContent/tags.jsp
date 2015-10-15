<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Login</title>
	</head>

	<body>
	<ol>
		<li>property:<s:property value="username"/> </li>
		<li>property字符串:<s:property value="'username'"/> </li>
		<li>property默认值:<s:property value="admin" default="管理员"/> </li>
		<li>property设定HTML:<s:property value="<hr/>" escape="false"/></li>
		<hr/>
		<li>set设定adiminName值(默认为request和ActionContext):<s:set var="adminName" value="username"></s:set> </li>
		<li>set 从request:<s:property value="#request.adminName"/> </li>debug看不到因为在向request放值得时候  debug数据就已经生成了。
		<li>set 从ActionContext:<s:property value="#adminName"/> </li>
		<li>set设定范围:<s:set var="adminPassword" value="password" scope="session"></s:set> </li>
		<li>set范围内取值:<s:property value="#session.adminPassword"/></li>
	</ol>
		<s:debug/>
	</body>
	
</html>
