<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/11 0011
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<div>
    <form action="/update" method="post">
        <input type="hidden" name="tid" value="${teacher.tid}">
        姓名：<input type="text" name="teacherName" value="${teacher.teacherName}">
        年龄：<input type="text" name="age" value="${teacher.age}">
        住址：<input type="text" name="address" value="${teacher.address}">
        <input type="submit" value="确认修改">
    </form>
</div>
</body>
</html>
