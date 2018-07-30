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
    <title>Index</title>
    <%@include file="/WEB-INF/view/sheredFiles/librery.jsp" %>

</head>
<body>
<%@include file="/WEB-INF/view/sheredFiles/navbar.jsp" %>

<div class="jumbotron">
    <div class="container">

        <h1>Spring Framework</h1>
        <p class="lead">Spring Framework is a free web framework for building great Web sites and Web applications using
            HTML, CSS and JavaScript.</p>
        <p><a href="" class="btn btn-primary btn-lg">Learn more &raquo;</a></p>
    </div>
</div>
<div class="container">

    <div class="row">
        <div class="col-md-4">
            <h2>Getting started</h2>
            <p>
                Spring Framework MVC gives you a powerful, patterns-based way to build dynamic websites that
                enables a clean separation of concerns and gives you full control over markup
                for enjoyable, agile development.
            </p>
            <p><a class="btn btn-default" href="">Learn more &raquo;</a>
            </p>
        </div>
        <div class="col-md-4">
            <h2>Get more libraries</h2>
            <p>Maven and grandle are a free Intellij extension that makes it easy to add, remove, and update libraries
                and tools in Intellij projects.</p>
            <p><a class="btn btn-default" href="">Learn more &raquo;</a>
            </p>
        </div>
        <div class="col-md-4">
            <h2>Web Hosting</h2>
            <p>You can easily find a web hosting company that offers the right mix of features and price for your
                applications.</p>
            <p><a class="btn btn-default" href="">Learn more &raquo;</a></p>
        </div>
    </div>
</div>
<%@include file="/WEB-INF/view/sheredFiles/footer.jsp" %>


</body>
</html>
