<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - All Credits</title>
   <h1> <center><caption>All Credits</caption></center></h1>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
            width: 50%;

        }
        .button {
            color: white;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            /*margin-bottom: 25px;*/
            cursor: pointer;
            border: 4px solid peachpuff;
            padding: 14px 40px;
            border-radius: 34px;
            transition: 0.25s;
            background-color: #1c87c9;
            margin: 20px auto;
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
<a href="/credit" class="button">Credit</a>
<a href="/home" class="button">Home</a>
</center>

<div style="overflow-x:auto;">
    <center>
<table>
    <tr>
        <th>ID</th>
        <th>Amount</th>
        <th>Due Date</th>
        <th>Customer</th>
        <th>Update</th>
    </tr>
    <c:forEach items="${creditsAll}" var="credit">
        <tr>
            <td>${credit.getId()}</td>
            <td>${credit.getAmount()}</td>
            <td>${credit.getDueDate()}</td>
            <td>${credit.getCustID()}</td>
            <td></td>
<%--            <td><a href=""></a></td>--%>
                <%--           adding link to RUD operations--%>
                <%--            <td><a href="/dbms/login">Add to cart</a></td>--%>
        </tr>
    </c:forEach>
</table>
    </center>
</div>


</body>
</html>