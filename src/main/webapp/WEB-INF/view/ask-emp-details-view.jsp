<%--
  Created by IntelliJ IDEA.
  User: BCC
  Date: 06.07.2022
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>ASK</title>
</head>
<body>
<form:form action="showDetails" modelAttribute="employee">

    Name: <form:input path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
