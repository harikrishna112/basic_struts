<jsp:include page="index.jsp"></jsp:include>  
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring-Struts Integration</title>
</head>
<body>
Welcome, <s:property value="fname"/><br/>
<s:property value="lname"/><br/>    
${message}  

</body>
</html>