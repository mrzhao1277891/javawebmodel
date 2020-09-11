
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>whatschool</title>
</head>
<body>
    <h3 align="center">学校搜索</h3>
    <form action="/school/query" method="get" role="form">
        <table border="0" align="center" width="40%" style="margin-left: 100px">
            <tr>
                <td width="100px">学校名称</td>
                <td width="40%">
                    <input type="text" name="schoolName">
                </td>
                <td>

                    <input type="submit" value="搜索"/>
                    <input type="reset" value="重置"/>
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
