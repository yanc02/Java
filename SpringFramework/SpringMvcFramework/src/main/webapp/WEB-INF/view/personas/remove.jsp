<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 15/1/2018
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
    <%@include file="/WEB-INF/view/sheredFiles/librery.jsp" %>

</head>
<body>
<%@include file="/WEB-INF/view/sheredFiles/navbar.jsp" %>

<div class="container">
    <h2>Delete</h2>

    <h3>Are you sure you want to delete this?</h3>
    <form:form method="POST" action="/personas/removeConfirmed" modelAttribute="persona">


    <h4>Person</h4>
    <hr/>
    <dl class="dl-horizontal">
        <form:input path="id" value="${persona.id}" type="hidden"/>
        <form:input path="nombre" value="${persona.nombre}" type="hidden"/>
        <form:input path="apellido" value="${persona.apellido}" type="hidden"/>
        <form:input path="cedula" value="${persona.cedula}" type="hidden"/>

        <dt>
            <form:label class="control-label col-md-2" path="id">Id</form:label>
        </dt>

        <dd>
            ${persona.id}
        </dd>

        <dt>
            <form:label class="control-label col-md-2" path="nombre">Nombre</form:label>
        </dt>

        <dd>
            ${persona.nombre}
        </dd>

        <dt>
            <form:label class="control-label col-md-2" path="apellido">Apellido</form:label>
        </dt>

        <dd>
            ${persona.apellido}
        </dd>

        <dt>
            <form:label class="control-label col-md-2" path="cedula">Cedula</form:label>
        </dt>

        <dd>
            ${persona.cedula}
        </dd>

    </dl>
    <div class="form-actions no-color">
        <input type="submit" value="Delete" class="btn btn-default"/>
        <a href="/personas">| Back to List</a>
    </div>
    </form:form>


    <%@include file="/WEB-INF/view/sheredFiles/footer.jsp" %>


</body>
</html>
