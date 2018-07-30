<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 13/1/2018
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Personas</title>

    <%--href="<c:url value="/globalCSS.css" />"--%>
    <%--<link rel="stylesheet" href="<c:url value="/WEB-INF/content/bootstrap.css" />" type="text/css">--%>
    <%--<link rel="stylesheet" href="~/webapp/WEB-INF/content/bootstrap.min.css" type="text/css">--%>
    <%--<link rel="stylesheet" href="/WEB-INF/content/site.css" type="text/css">--%>
    <%--<script src="/WEB-INF/scripts/bootstrap.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>--%>

    <%--<style type="text/css">--%>
    <%--<%@include file="/WEB-INF/content/bootstrap.css" %>--%>
    <%--</style>--%>
    <%--<script type="text/javascript">--%>
    <%--<%@include file="/WEB-INF/scripts/bootstrap.js" %>--%>
    <%--</script>--%>
    <%--<link rel="stylesheet" href="/content/bootstrap.min.css" />--%>
    <%--<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">--%>
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">--%>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>--%>
    <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>
    <%@include file="/WEB-INF/view/sheredFiles/librery.jsp" %>

    <%--<style><%@include file="/WEB-INF/content/bootstrap.min.css"%></style>--%>


</head>
<body>
<%@include file="/WEB-INF/view/sheredFiles/navbar.jsp" %>

<div class="container">

    <h2>Users</h2>

    <p>
        <%--@Html.ActionLink("Create New", "Create")--%>
        <a href="/personas/create">Create New</a>
    </p>
    <table class="table">
        <tr>
            <th>
                <label>Id</label>
            </th>
            <th>
                <label>Nombres</label>
            </th>
            <th>
                <label>Apellidos</label>
            </th>
            <th>
                <label>Cedulas</label>
            </th>

            <th></th>
        </tr>

        <c:forEach var="item" items="${personas}">
             <tr>
                <td>
                        ${item.id}
                </td>
                <td>
                        ${item.nombre}
                </td>
                <td>
                        ${item.apellido}
                </td>
                <td>
                        ${item.cedula}
                </td>

                <td>
                    <a href="/personas/edit/${item.id}">Edit |</a>
                    <a href="/personas/details/${item.id}">Details |</a>
                    <a href="/personas/remove/${item.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>

    </table>

    <a href="/">Back</a>

</div>


<%@include file="/WEB-INF/view/sheredFiles/footer.jsp" %>


</body>
</html>
