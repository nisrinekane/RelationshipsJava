<%--
  Created by IntelliJ IDEA.
  User: nisrinekane
  Date: 10/5/22
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/styles.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Show people</title>
</head>
<body>
<c:forEach items="${persons}" var="person">
  <tr>
    <td><a href="/persons/${person.id}">FirstName: <c:out value="${person.firstName}" />"</a></td>
      <td>Last name: <c:out value="${person.lastName}" /></td>
      <td>License plate: <c:out value="${person.license.number}" /></td>
  </tr>
</c:forEach>
</body>
</html>
