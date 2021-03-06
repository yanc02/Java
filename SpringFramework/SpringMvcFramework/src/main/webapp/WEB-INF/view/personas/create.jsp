<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 14/1/2018
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
    <%@include file="/WEB-INF/view/sheredFiles/librery.jsp" %>
</head>
<body>
<%@include file="/WEB-INF/view/sheredFiles/navbar.jsp" %>

<div class="container">
    <h2>Create</h2>


    <div class="form-horizontal">
        <h4>Person</h4>
        <hr/>
        <form:form method="POST" action="/personas/create" modelAttribute="persona">
            <div class="form-group">
                <form:label class="control-label col-md-2" path="nombre">Nombre</form:label>
                <div class="col-md-3">
                    <form:input path="nombre"/>
                </div>
            </div>
            <div class="form-group">
                <form:label class="control-label col-md-2" path="apellido">Apellido</form:label>
                <div class="col-md-3">
                    <form:input path="apellido"/>
                </div>
            </div>
            <div class="form-group">
                <form:label class="control-label col-md-2" path="cedula">Cedula</form:label>
                <div class="col-md-3">
                    <form:input path="cedula"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-md-offset-2 col-md-10">
                    <input type="submit" value="Create" class="btn btn-default"/>
                </div>
            </div>
        </form:form>
    </div>
    <div>
        <a href="/personas">Back to List</a>
    </div>
</div>
<%@include file="/WEB-INF/view/sheredFiles/footer.jsp" %>


</body>
</html>
