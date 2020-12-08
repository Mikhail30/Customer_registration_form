<%--
  Created by IntelliJ IDEA.
  User: mihak
  Date: 15.09.2020
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Confirmation Page</title>
</head>
<body>
<br><br>
The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br><br>
Free passes: ${customer.freePasses}
<br> <br>
Postal code: ${customer.postalCode}
<br> <br>
Course code: ${customer.courseCode}
</body>
</html>
