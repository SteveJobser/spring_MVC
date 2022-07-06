<%--
  Created by IntelliJ IDEA.
  User: BCC
  Date: 07.07.2022
  Time: 0:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SHOW</title>
</head>
<body>
<h2>Dear employee</h2>
<br>
<%--Your name ${param.employeeName}--%>

Your name ${employee.name}
<br>
Your surname ${employee.surname}
<br>
Your salary ${employee.salary}
<br>
Your department ${employee.department}
<br>
<br>
<a href="/">MAIN</a>
</body>
</html>
