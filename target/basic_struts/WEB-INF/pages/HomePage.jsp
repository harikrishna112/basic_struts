<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"      
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Validate Login</title>
</head>
<body>
<s:form action="login" method="execute">
<s:textfield name="username" key="Username" size="20" />
<s:password name="password" key="Password" size="20" />
<s:submit />
</s:form>
</body>
</html>