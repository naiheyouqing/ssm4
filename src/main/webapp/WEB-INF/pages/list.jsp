<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/17 0017
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
    <h1>成功</h1>

    <c:forEach items="${users}" var="user">
        ${user.name}
        ${user.money}
        <br/>
    </c:forEach>

</body>
</html>
