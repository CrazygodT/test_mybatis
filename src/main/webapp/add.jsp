<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/11 0011
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<div>
    <form action="/insert" method="post">
        姓名：<input type="text" name="teacherName">
        年龄：<input type="text" name="age">
        住址：<input type="text" name="address">
        <input type="submit" value="确认修改">
    </form>
</body>
</html>
