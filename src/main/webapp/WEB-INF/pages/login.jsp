<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/17 0017
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>登录页</title>
    <style type="text/css">
        #box1{
            width: 500px;
            height: 400px;
            text-align: center;
        }
    </style>
</head>
<body>
<div id="box1">

        <c:if test="${msg.error!= null}">
            <p style="color: red">${msg.error}</p>
        </c:if>
    <form action="${pageContext.request.contextPath}/user/checkUser" method="post">
        账号:<input type="text" name="account" required />
        <br>
        密码:<input type="password" name="password" required/>
        <br>
        <input type="submit" value="登录"/>
    </form>
</div>
</body>
</html>
