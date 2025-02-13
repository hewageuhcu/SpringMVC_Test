<!-- src/main/webapp/WEB-INF/jsp/table.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Employee Table</title>
  <style>
    table {
      width: 100%;
      border-collapse: collapse;
    }
    table, th, td {
      border: 1px solid black;
    }
    th, td {
      padding: 8px;
      text-align: left;
    }
    th {
      background-color: #f2f2f2;
    }
  </style>
</head>
<body>
<h1>Employee Information</h1>

<!-- Sample Table -->
<table>
  <thead>
  <tr>
    <th>EMP_ID</th>
    <th>FIRST_NAME</th>
    <th>LAST_NAME</th>
    <th>EMAIL</th>
    <th>SALARY</th>
  </tr>
  </thead>
  <tbody>
  <!-- Sample Row 1 -->
  <tr>
    <td>101</td>
    <td>John</td>
    <td>Doe</td>
    <td>john.doe@example.com</td>
    <td>$50,000</td>
  </tr>
  <!-- Sample Row 2 -->
  <tr>
    <td>102</td>
    <td>Jane</td>
    <td>Smith</td>
    <td>jane.smith@example.com</td>
    <td>$55,000</td>
  </tr>
  <!-- Sample Row 3 -->
  <tr>
    <td>103</td>
    <td>Michael</td>
    <td>Johnson</td>
    <td>michael.johnson@example.com</td>
    <td>$60,000</td>
  </tr>
  </tbody>
</table>
</body>
</html>
