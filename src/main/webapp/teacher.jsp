<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/11 0011
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- el表达式，如果不加则当成字符串处理--%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>老师主页</title>
</head>
<body>
    <a href="/add.jsp">新增老师</a>
    <table border="2">
        <tr>
            <th>工号</th>
            <th>名称</th>
            <th>年龄</th>
            <th>住址</th>
            <th colspan="2">操作</th>
        </tr>
        <c:forEach var="teacher" items="${teacherList}">
            <tr>
                <th>${teacher.tid}</th>
                <th>${teacher.teacherName}</th>
                <th>${teacher.age}</th>
                <th>${teacher.address}</th>
                <th><a href="/findById?tid=${teacher.tid}">修改</a></th>
                <th><a href="/delete?tid=${teacher.tid}">删除</a></th>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
