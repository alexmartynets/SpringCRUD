<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Users Manage</title>
</head>
<body>
<div align="center">
    <h2>Users Manage</h2>
    <h3><a href="/new">New User</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>E-mail</th>
            <th>Password</th>
        </tr>
        <c:forEach items="${listUser}" var="user">
            <tr>
                <td>${user.id}}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.password}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/edit?id=${user.id}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/delete?id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>