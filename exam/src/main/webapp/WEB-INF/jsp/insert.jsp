<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>INSERT</h1>


<form action="/insert" method="post">
    <div class="mb-3">
        <p>Name:</p>
        <input type="text" class="form-control" name="name" id="name">
    </div>
    <div class="mb-3">
        <p>Wage:</p>
        <input type="text" class="form-control" name="wage" id="wage">
    </div>
    <input type="submit" class="btn btn-primary" value="Save">

</form>

</body>
</html>
