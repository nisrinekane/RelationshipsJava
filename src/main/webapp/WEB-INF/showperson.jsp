<%--
  Created by IntelliJ IDEA.
  User: nisrinekane
  Date: 10/4/22
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--- ... --->
<h1>Person Details:></h1>
<table class="table">
  <thead class="thead-dark">
  <tr>
    <th>Name</th>
    <th>License Number</th>
    <th>State</th>
    <th>Exp Date</th>
  </tr>
  </thead>
  <tbody>
  <tr>
    <td>
      <c:out value="${person.firstName}"/>
      <c:out value="${person.lastName}"/>
    </td>
    <td><c:out value="${person.license.number}"/></td>
    <td><c:out value="${person.license.state}"/></td>
    <td>
      <c:out value="${person.license.expirationDate}"/>
    </td>
  </tr>
  </tbody>
</table>
<!--- ... --->
</body>
</html>
