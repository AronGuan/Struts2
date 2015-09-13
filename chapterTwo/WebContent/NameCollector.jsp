<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<hr>
		<h4>Enter your name so that we can customize a greeting just for you!</h4> 	
		<s:form action="chapterTwo/HelloWorld">
    	<s:textfield name="name" label="Your name"/>
    	<s:submit/>
		</s:form>
	    <hr>
	
</body>
</html>