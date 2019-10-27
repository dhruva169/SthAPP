<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - All Deposits</title>
    <center>
    <h1><caption>All Deposits</caption></center></h1>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            width: 50%;

        }
        th, td {
            padding: 15px;
            text-align: left;

        }
        tr:nth-child(even) {background-color: darkgray;}
        tr:hover {background-color:navajowhite;}
        tr:nth-child(even){background-color: #f2f2f2}

        table {
            border-spacing: 5px;
            background-color: rebeccapurple;
        }
        body{
           background-color: #8e92e8;;
        }

    </style>
</head>
<body>
<center>
<table width="50%">
    <tr>
        <th>Deposit Date</th>
        <th>Amount</th>
        <th>Done by Employee</th>
    </tr>
    <c:forEach items="${allDeposits}" var="bankDeposits">
        <tr>
            <td>${bankDeposits.getDepositDate()}</td>
            <td>${bankDeposits.getAmountDeposited()}</td>
            <td>${bankDeposits.getEmpID()}</td>
            <td><a href=""></a></td>
<%--           adding link to RUD operations--%>
<%--            <td><a href="/dbms/login">Add to cart</a></td>--%>
        </tr>
    </c:forEach>
</table>
</center>

</body>
</html>