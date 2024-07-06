<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>  
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Welcome To Struts 2!</h1>
    <hr/>  
		<!-- <a href="login">Login</a>|  --> 
		<a href="logout">Logout</a>|  
		<a href="profile">Profile</a> 
		<a href="signup">SignUp</a> 
<s:form action="login">  
<s:textfield name="userName" label="UserName" size="10" key="userName" value=""/> 
 <s:hidden name="userName" id="userName" />

<s:submit></s:submit>
</s:form>  
 </body>
</html>