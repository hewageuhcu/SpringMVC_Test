<!-- src/main/webapp/WEB-INF/jsp/hello.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Hello Spring MVC</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css">
</head>
<body style="font-family: Arial, sans-serif; background-color: #f4f4f9; margin: 0; padding: 0;">
<div class="container">
  <div class="card">
    <h1 style="color: #4CAF50; text-align: center; margin-top: 50px;">${message}</h1>
    <p style="color: #555; font-size: 18px; text-align: center;">Welcome, ${name}!</p>

    <!-- External Image -->
    <img src="https://th.bing.com/th/id/OIP.xM0qDQOpdAsa_5mmSSL2KAHaDl?w=1024&h=495&rs=1&pid=ImgDetMain" alt="Spring MVC Logo" style="display: block; margin: 0 auto; max-width: 300px;"/>
  </div>
</div>
</body>
</html>
