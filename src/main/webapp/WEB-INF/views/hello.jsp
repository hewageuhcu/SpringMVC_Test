<!-- src/main/webapp/WEB-INF/jsp/hello.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Hello Spring MVC</title>
  <link href="<c:url value="/css/style.css"/>" rel="stylesheet" >
</head>
<body >
<div class="container">
  <div class="card">
    <h1 >${message}</h1>
    <p >Welcome, ${name}!</p>

    <!-- External Image -->
    <img src="https://th.bing.com/th/id/OIP.xM0qDQOpdAsa_5mmSSL2KAHaDl?w=1024&h=495&rs=1&pid=ImgDetMain" alt="Spring MVC Logo" style="display: block; margin: 0 auto; max-width: 300px;"/>
  </div>
</div>
</body>
</html>
