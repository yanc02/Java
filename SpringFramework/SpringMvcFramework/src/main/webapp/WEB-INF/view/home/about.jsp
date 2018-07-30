<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 13/1/2018
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>About</title>
    <%@include file="/WEB-INF/view/sheredFiles/librery.jsp" %>

</head>
<body>
<div class="container">
    <%@include file="/WEB-INF/view/sheredFiles/navbar.jsp" %>

    <h2>${messages[0]}</h2>
    <h3>${messages[1]}</h3>

    <p>Use this area to provide additional information.</p>

</div>
<%@include file="/WEB-INF/view/sheredFiles/footer.jsp" %>

</body>
</html>
