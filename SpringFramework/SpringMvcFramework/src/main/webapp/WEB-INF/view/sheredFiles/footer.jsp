<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 14/1/2018
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<hr />
<footer>
    <div class="container">
        <p>
            <jsp:useBean id="now" class="java.util.Date"/>
            <%--<fmt:formatDate value="${now}" dateStyle="long"/>--%>
            <%--<fmt:formatDate value="${now}" pattern="dd-MM-yyyy HH:mm:ss a z" />--%>
            &copy;<fmt:formatDate value="${now}" pattern="yyyy" /> - My Spring Application

        </p>
    </div>
</footer>
