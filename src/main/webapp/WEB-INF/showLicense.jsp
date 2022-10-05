<%--
  Created by IntelliJ IDEA.
  User: nisrinekane
  Date: 10/5/22
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
    <title>show license</title>
</head>
<body>
<h1>License Details</h1>
  <div class="card">
    <div class="card-body">
      <p>License number: <c:out value="${license.number}"/> </p>
      <p>Expiration date: <fmt:formatDate pattern = "yyyy-MM-dd" value="${license.expirationDate}" /></p>
      <p>License State: <c:out value="${license.state}" /></p>
      <p>License owner: <c:out value="${license.person.firstName} ${license.person.lastName}" /></p>
    </div>
  </div>
</body>
</html>
