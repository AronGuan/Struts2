<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Login</title>
	</head>

	<body>
		User Success!
		from valueStack:<s:property value="t"/>
		from ActionContext:<s:property value="#parameters.t"/>
		<s:debug/>
	</body>
	
</html>
