<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Login</title>
	</head>

	<body>
		<h4>Enter your username and password to login to your portfolio.</h4> 
			<s:form action="/user.action">
    	  	<s:textfield name="username" label="Username"/>
    	  	<s:password name="password" label="Password"/>
    	  	<s:fielderror fieldName="global" theme="simple"></s:fielderror>
    	<s:submit/>
		</s:form>	
		<s:debug></s:debug>
	</body>
	
</html>
