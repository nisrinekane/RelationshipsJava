<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nisrinekane
  Date: 10/5/22
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
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
    <title>New License</title>
</head>
<body>
<h1>New License</h1>
<form:form action="/licenses" method="POST" modelAttribute="license">
  <div class="form-group">
    <form:label path="number">license number</form:label>
    <form:input path="number" />
  </div>
  <div><form:errors path="number" class="text-danger" /></div>
  <div class="form-group">
    <form:label path="expirationDate">expiration date</form:label>
    <form:input type="date" path="expirationDate" />
  </div>
  <div><form:errors path="expirationDate" class="text-danger" /></div>
  <div class="form-group">
    <form:label path="state">state</form:label>
    <form:input type="text" path="state" />
  </div>
  <div><form:errors path="state" class="text-danger" /></div>
  <form:select path="person">
    <c:forEach var="onePerson" items="${persons}">
      <!--- Each option VALUE is the id of the person --->
      <form:option value="${onePerson.id}">
        <!--- This is what shows to the user as the option --->
        <c:out value="${onePerson.firstName}"/>
        <c:out value="${onePerson.lastName}"/>
      </form:option>
    </c:forEach>
  </form:select>
  <input type="submit" value="Submit" class="btn btn-dark" />
</form:form>
</body>
</html>
