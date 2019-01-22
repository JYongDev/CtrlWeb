<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/14
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a> login page </a>

<form action="${pageContext.request.contextPath}/login" method="post">
    <input type="text" name="username">
    <br>
    <br>
    <input type="password" name="password"/>
    <br/>
    <br>
    <input type="submit" name="login" value="login">
</form>
</body>
</html>
