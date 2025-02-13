<!-- src/main/webapp/WEB-INF/jsp/form.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Form</title>
</head>
<body style="font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 20px;">

<h1 style="text-align: center; color: #333;">Employee Information ${api}</h1>

<form action="/submit" method="POST" style="max-width: 400px; margin: 0 auto; background: #fff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);">
    <div style="margin-bottom: 15px;">
        <label for="emp_id" style="font-weight: bold;">EMP_ID:</label>
        <input type="text" id="emp_id" name="emp_id" required
               style="width: 100%; padding: 8px; margin-top: 5px; border: 1px solid #ccc; border-radius: 4px;">
    </div>

    <div style="margin-bottom: 15px;">
        <label for="first_name" style="font-weight: bold;">FIRST NAME:</label>
        <input type="text" id="first_name" name="first_name" required
               style="width: 100%; padding: 8px; margin-top: 5px; border: 1px solid #ccc; border-radius: 4px;">
    </div>

    <div style="margin-bottom: 15px;">
        <label for="last_name" style="font-weight: bold;">LAST NAME:</label>
        <input type="text" id="last_name" name="last_name" required
               style="width: 100%; padding: 8px; margin-top: 5px; border: 1px solid #ccc; border-radius: 4px;">
    </div>

    <div style="margin-bottom: 15px;">
        <label for="email" style="font-weight: bold;">EMAIL:</label>
        <input type="email" id="email" name="email" required
               style="width: 100%; padding: 8px; margin-top: 5px; border: 1px solid #ccc; border-radius: 4px;">
    </div>

    <div style="margin-bottom: 15px;">
        <label for="salary" style="font-weight: bold;">SALARY:</label>
        <input type="number" id="salary" name="salary" required
               style="width: 100%; padding: 8px; margin-top: 5px; border: 1px solid #ccc; border-radius: 4px;">
    </div>

    <div style="text-align: center;">
        <button type="submit"
                style="background-color: #28a745; color: white; padding: 10px 15px; border: none; border-radius: 4px; cursor: pointer;">
            Submit
        </button>
    </div>
</form>

</body>
</html>
