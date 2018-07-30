<%--
  Created by IntelliJ IDEA.
  User: ingma
  Date: 15/1/2018
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
    <%@include file="/WEB-INF/view/sheredFiles/librery.jsp" %>
</head>
<body>
<%@include file="/WEB-INF/view/sheredFiles/navbar.jsp" %>

<div class="container">
    <h2>Details</h2>

    <div>
        <h4>Person</h4>
        <hr />
        <dl class="dl-horizontal">
            <dt>
                <label>Id</label>
            </dt>

            <dd>
                ${persona.id}
            </dd>

            <dt>
                <label>Nombre</label>
            </dt>

            <dd>
                ${persona.nombre}
            </dd>

            <dt>
                <label>Apellido</label>
            </dt>

            <dd>
                ${persona.apellido}
            </dd>

            <dt>
                <label>Cedula</label>
            </dt>

            <dd>
                ${persona.cedula}
            </dd>

        </dl>
    </div>
    <p>
        <a href="/personas/edit/${persona.id}">Edit |</a>
        <a href="/personas">Back to List</a>
    </p>

</div>

<%@include file="/WEB-INF/view/sheredFiles/footer.jsp" %>

</body>
</html>
