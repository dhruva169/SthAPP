<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
    <title>STH - All Suppliers</title>

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
<a href="/supplier" class="button">Back</a>
<a href="/home" class="button">Home</a>

<h1><caption>All Suppliers</caption></h1>

<table width="50%">
    <tr>
        <th>Supplier ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Phone Number</th>
        <th>E-Mail</th>
        <th>Address</th>

    </tr>
    <c:forEach items="${allSupplier}" var="credit">
        <tr>
            <td>${credit.getSuppId()}</td>
            <td>${credit.getfName()}</td>
            <td>${credit.getLname()}</td>
            <td>${credit.getPhoneNo()}</td>
            <td>${credit.getEmail()}</td>
            <td>${credit.getAddress()}</td>

                <%--            <td><a href=""></a></td>--%>
                <%--           adding link to RUD operations--%>
                <%--            <td><a href="/dbms/login">Add to cart</a></td>--%>
        </tr>
    </c:forEach>
</table>
</center>



</body>
</html>