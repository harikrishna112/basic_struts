<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>  
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>User Registration</title>
  </head>
<body>

<h1>User  Registration</h1>
<s:form action="Register" method="POST"  validate="true">
<s:textfield name="fname" key="user.fname" size="20" value=""/>
<s:textfield name="lname" key="user.lname" size="20" value=""/>
<s:textfield name="age" key="user.age" size="20" value=""/>
<s:textfield name="bGroup" key="user.bGroup" size="20" />
<s:textfield name="sex" key="user.sex" size="20" />
<s:textfield name="salary" key="user.salary" size="20" />
<s:textfield name="id" key="user.id" size="20" />
<s:submit />
<s:fielderror>   </s:fielderror>
</s:form>

</body>
</html>