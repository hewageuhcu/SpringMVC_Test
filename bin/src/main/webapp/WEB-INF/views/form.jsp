<!-- src/main/webapp/WEB-INF/jsp/form.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Form</title>
</head>
<body>
<h1>Employee Information</h1>
<form action="/submit" method="POST">
    <div>
        <label for="emp_id">EMP_ID:</label>
        <input type="text" id="emp_id" name="emp_id" required>
    </div>
    <div>
        <label for="first_name">FIRST_NAME:</label>
        <input type="text" id="first_name" name="first_name" required>
    </div>
    <div>
        <label for="last_name">LAST_NAME:</label>
        <input type="text" id="last_name" name="last_name" required>
    </div>
    <div>
        <label for="email">EMAIL:</label>
        <input type="email" id="email" name="email" required>
    </div>
    <div>
        <label for="salary">SALARY:</label>
        <input type="number" id="salary" name="salary" required>
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>
</body>
</html>
