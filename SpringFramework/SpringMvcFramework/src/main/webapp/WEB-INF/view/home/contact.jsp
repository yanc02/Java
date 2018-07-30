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
    <title>Contact</title>
    <%@include file="/WEB-INF/view/sheredFiles/librery.jsp" %>

</head>
<body>
<div class="container">
    <%@include file="/WEB-INF/view/sheredFiles/navbar.jsp" %>

    <h2>${messages[0]}</h2>
    <h3>${messages[1]}</h3>

    <address>
        One Oracle Way<br />
        Redmond, WA 98052-6399<br />
        <abbr title="Phone">P:</abbr>
        425.555.0100
    </address>

    <address>
        <strong>Support:</strong>   <a href="mailto:Support@example.com">Support@example.com</a><br />
        <strong>Marketing:</strong> <a href="mailto:Marketing@example.com">Marketing@example.com</a>
    </address>

</div>
<%@include file="/WEB-INF/view/sheredFiles/footer.jsp" %>

</body>
</html>
