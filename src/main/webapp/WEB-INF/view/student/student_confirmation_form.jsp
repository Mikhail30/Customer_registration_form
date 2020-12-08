<%--
  Created by IntelliJ IDEA.
  User: mihak
  Date: 11.09.2020
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Student confirmation page</title>
</head>
<body>
                            <%--using student.getLastName()--%>
Student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Student's country: ${student.country}

<br><br>
Student's favourite language: ${student.favouriteLanguage}

<br><br>

Student's favourite(s) operating systems:
<ul>
    <c:forEach var = "temp" items = "${student.operatingSystems}"/>
    <li>${temp}</li>
    <c:forEach/>
</ul>
</body>
</html>
