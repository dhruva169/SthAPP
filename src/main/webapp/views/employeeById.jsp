<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <title>STH - Employee By ID</title>
    <caption>Employee By ID</caption>
    <style>
        /*body{*/
        /*    align-content:center;*/
        /*}*/
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 15px;
        }
        th {
            text-align: left;
        }
        table {
            border-spacing: 5px;
        }

    </style>
</head>
<body>

<table width="50%">
    <tr>
        <th>Employee ID</th>
        <th>Username</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Designation</th>
        <th>Joining Date</th>
        <th>Phone Number</th>
        <th>Salary</th>
        <th>Address</th>
    </tr>
    <tr>
        <td>${allEmployees.getEmpID()}</td>
        <td>${allEmployees.getUsername()}</td>
        <td>${allEmployees.getfName()}</td>
        <td>${allEmployees.getlName()}</td>
        <td>${allEmployees.getDesignation()}</td>
        <td>${allEmployees.getJoiningDate()}</td>
        <td>${allEmployees.getPhoneNo()}</td>
        <td>${allEmployees.getSalary()}</td>
        <td>${allEmployees.getAddress()}</td>
    </tr>

</table>

</body>
</html>