
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>whatschool</title>
</head>
<body>
<h3 align="center" >上海中小学校信息</h3>
<table border="1" width="70%" align="center">
    <tr>
        <th>校名</th>
        <th>学校介绍</th>
    </tr>
    <tr>
        <td>${school.name}</td>
        <td>${school.info}</td>
    </tr>
</table>
</body>
</html>
